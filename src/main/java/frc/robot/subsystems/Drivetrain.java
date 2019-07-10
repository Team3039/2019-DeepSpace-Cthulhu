package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.controllers.PS4Gamepad;
import frc.robot.Constants;
import frc.robot.RobotMap;
import frc.robot.commands.TeleOpDrive;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  public Talon leftFrontDrive = new Talon(RobotMap.leftFrontDrive);
  public Talon rightFrontDrive = new Talon(RobotMap.rightFrontDrive);
  public Talon leftRearDrive = new Talon (RobotMap.leftRearDrive);
  public Talon rightRearDrive = new Talon(RobotMap.rightRearDrive);

  public void joystickControl(PS4Gamepad gp) {
    //Tele-Op Driving
    //Each Motor is Set to Brake Mode, the motor speeds are set in an Arcade Drive fashion
    double y = -gp.getLeftYAxis()* Constants.yGain;
    double rot = gp.getRightXAxis()* Constants.rotGain;

    //Calculated Outputs (Limits Output to 12V)
    double leftOutput = y + rot;
    double rightOutput = rot - y;

    //Assigns Each Motor's Power
    leftFrontDrive.set(leftOutput);
    rightFrontDrive.set(rightOutput);
    leftRearDrive.set(leftOutput);
    rightRearDrive.set(rightOutput);
  }


  public void stopDrive()  {
    leftFrontDrive.set(0);
    rightFrontDrive.set(0);
  }
  
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TeleOpDrive());
  }
}
