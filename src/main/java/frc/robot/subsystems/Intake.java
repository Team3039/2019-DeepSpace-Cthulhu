package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Intake extends Subsystem {

  public Talon leftIntake = new Talon(RobotMap.leftIntake);
  public Talon rightIntake = new Talon(RobotMap.rightIntake);
  public Solenoid expander = new Solenoid(RobotMap.expander);
  
  public void openIntake() {
    expander.set(true);
  }

  public void closeIntake() {
    expander.set(false);
  }

  public void get() {
    leftIntake.set(.8);
    rightIntake.set(-.8);
  }
  public void expel() {
    leftIntake.set(-.8);
    rightIntake.set(.8);
  }

  public void stopIntake() {
    leftIntake.set( 0);
    rightIntake.set( 0);
  }
  
  @Override
  public void initDefaultCommand() {
  }
}
