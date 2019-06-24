package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.controllers.PS4Gamepad;
import frc.robot.Constants;
import frc.robot.RobotMap;
import frc.robot.commands.ArmOverride;

public class Arm extends Subsystem {

  public TalonSRX armMaster = new TalonSRX(RobotMap.armMaster);
  public TalonSRX armSlave = new TalonSRX(RobotMap.armSlave);

  public void manualControl (PS4Gamepad gp) {
    double output = gp.getRightYAxis() * Constants.armGain;
    armMaster.set(ControlMode.PercentOutput, output);
    armSlave.follow(armMaster);
  }

  public void stop() {
    armMaster.set(ControlMode.PercentOutput, 0);
    armSlave.follow(armMaster);
  }

  public void setArm(double setpoint) {
    armMaster.config_kP(0, Constants.armP);
    armMaster.config_kI(0, Constants.armI);
    armMaster.config_kD(0, Constants.armD);

    armMaster.set(ControlMode.Position, setpoint);
    armSlave.follow(armMaster);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ArmOverride());
    
  }
}
