package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Intake extends Subsystem {

  public TalonSRX leftIntake = new TalonSRX(RobotMap.leftIntake);
  public TalonSRX rightIntake = new TalonSRX(RobotMap.rightIntake);
  public Solenoid expander = new Solenoid(RobotMap.expander);
  
  public void openIntake() {
    expander.set(true);
  }

  public void closeIntake() {
    expander.set(false);
  }

  public void get() {
    leftIntake.set(ControlMode.PercentOutput,.8);
    rightIntake.set(ControlMode.PercentOutput,-.8);
  }

  public void expel() {
    leftIntake.set(ControlMode.PercentOutput,-.8);
    rightIntake.set(ControlMode.PercentOutput,.8);
  }

  public void stopIntake() {
    leftIntake.set(ControlMode.PercentOutput, 0);
    rightIntake.set(ControlMode.PercentOutput, 0);
  }
  
  @Override
  public void initDefaultCommand() {
  }
}
