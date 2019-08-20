package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.ControlType;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.controllers.PS4Gamepad;
import frc.robot.Constants;
import frc.robot.RobotMap;
import frc.robot.commands.DriveArm;


public class Arm extends Subsystem {

  public Solenoid armMaster = new Solenoid (RobotMap.armMaster);
  public Solenoid armSlave = new Solenoid (RobotMap.armSlave);
  
  /*public CANPIDController pidctrl = armMaster.getPIDController();
  public CANEncoder encoder = armMaster.getEncoder();*/

  public boolean isClosedLoopControl = false;
  public double targetSetPoint = 0.0;

  public void manualControl (PS4Gamepad gp) {
    double output = gp.getRightYAxis() * Constants.armGain;
    armMaster.set(true);
    armSlave.set(true);
    isClosedLoopControl = false;
  }

  public void stop() {
    armMaster.set(false);
    armSlave.set(false);
  }

  /*public void closedLoopMode() {
    pidctrl.setReference( targetSetPoint, ControlType.kPosition);

    pidctrl.setP(Constants.armP);
    pidctrl.setI(Constants.armI);
    pidctrl.setD(Constants.armD);

  }

  public double getPosition() {
    return encoder.getPosition();
  }

  public double getVelocity() {
    return encoder.getVelocity();
  }*/

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveArm());
    
  }
}
