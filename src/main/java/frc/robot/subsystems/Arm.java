package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.ControlType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.controllers.PS4Gamepad;
import frc.robot.Constants;
import frc.robot.RobotMap;
import frc.robot.commands.ArmOverride;

public class Arm extends Subsystem {

  public CANSparkMax armMaster = new CANSparkMax(RobotMap.armMaster, MotorType.kBrushless);
  public CANSparkMax armSlave = new CANSparkMax(RobotMap.armSlave, MotorType.kBrushless);
  
  public CANPIDController pidctrl = armMaster.getPIDController();
  public CANEncoder encoder = armMaster.getEncoder();

  public boolean isClosedLoopControl = false;

  public void manualControl (PS4Gamepad gp) {
    double output = gp.getRightYAxis() * Constants.armGain;
    armMaster.set(output);
    armSlave.follow(armMaster);
    isClosedLoopControl = false;
  }

  public void stop() {
    armMaster.set(0);
    armSlave.follow(armMaster);
  }

  public void setArm(double setpoint) {
    pidctrl.setReference(setpoint, ControlType.kPosition);

    pidctrl.setP(Constants.armP);
    pidctrl.setI(Constants.armI);
    pidctrl.setD(Constants.armD);

    armSlave.follow(armMaster);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ArmOverride());
    
  }
}
