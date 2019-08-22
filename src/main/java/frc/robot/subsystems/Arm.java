package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class Arm extends Subsystem {

  public Solenoid arm = new Solenoid (RobotMap.armMaster);
  
  /*public CANPIDController pidctrl = armMaster.getPIDController();
  public CANEncoder encoder = armMaster.getEncoder();*/

  public boolean isClosedLoopControl = false;
  public double targetSetPoint = 0.0;

  public void raiseArm() {
    arm.set(true);
  }
  public void lowerArm() {
    arm.set(false);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.    
  }
}
