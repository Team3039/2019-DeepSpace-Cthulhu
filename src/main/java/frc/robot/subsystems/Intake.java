package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Intake extends Subsystem {

  public Talon leftIntake = new Talon(RobotMap.leftIntake);
  public Talon rightIntake = new Talon(RobotMap.rightIntake);
  public Solenoid expander = new Solenoid(RobotMap.expander);
  public DigitalInput cargoSwitch = new DigitalInput(RobotMap.cargoSwitch);
  
  public void openHatch() {
    expander.set(false);
  }

  public void grabHatch() {
    expander.set(true);
  }

  public void getCargo() {
    leftIntake.set(.8);
    rightIntake.set(-.8);
  }
  
  public void shootCargo() {
    leftIntake.set(-.8);
    rightIntake.set(.8);
  }

  public void stopIntake() {
    leftIntake.set( 0);
    rightIntake.set( 0);
  }
  
  public boolean getCargoStatus() {
    return cargoSwitch.get();
  }

  @Override
  public void initDefaultCommand() {
  }
}
