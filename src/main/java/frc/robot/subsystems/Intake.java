package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Intake extends Subsystem {

  public Talon intake = new Talon(RobotMap.leftIntake);
  public Solenoid expander = new Solenoid(RobotMap.expander);
  public DigitalInput cargoSwitch = new DigitalInput(RobotMap.cargoSwitch);
  
  public boolean hasCargo = false;

  public void openHatch() {
    expander.set(false);
  }

  public void grabHatch() {
    expander.set(true);
  }

  public void getCargo() {
    intake.set(.8);
  }
  
  public void shootCargo() {
    intake.set(-.8);
  }

  public void stopIntake() {
    intake.set( 0);
  }
  
  public boolean getCargoStatus() {
    return cargoSwitch.get();
  }

  public void setCargoState(boolean state) {
    hasCargo = state;
  }
  
  @Override
  public void initDefaultCommand() {
  }
}
