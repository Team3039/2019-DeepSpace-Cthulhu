package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.controllers.PS4Gamepad;
import frc.robot.RobotMap;
import frc.robot.commands.TeleOpDrive;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  public TalonSRX leftFrontDrive = new TalonSRX(RobotMap.leftFrontDrive);
  public TalonSRX rightFrontDrive = new TalonSRX(RobotMap.rightFrontDrive);
  public TalonSRX leftRearDrive = new TalonSRX(RobotMap.leftRearDrive);
  public TalonSRX rightRearDrive = new TalonSRX(RobotMap.rightRearDrive);

  public void joystickControl(PS4Gamepad gp) {
    //Tele-Op Driving
    //Each Motor is Set to Brake Mode, the motor speeds are set in an Arcade Drive fashion
    double y = gp.getLeftYAxis()*-.9;
    double rot = gp.getRightXAxis()*.8;

    //Calculated Outputs (Limits Output to 12V)
    double leftOutput = y + rot;
    double rightOutput = rot - y;


    //Set Motor's Neutral/Idle Mode to Brake
    leftFrontDrive.setNeutralMode(NeutralMode.Brake);
    rightFrontDrive.setNeutralMode(NeutralMode.Brake);
    leftRearDrive.setNeutralMode(NeutralMode.Brake);
    rightRearDrive.setNeutralMode(NeutralMode.Brake); 

    //Assigns Each Motor's Power
    leftFrontDrive.set(ControlMode.PercentOutput, leftOutput);
    rightFrontDrive.set(ControlMode.PercentOutput, rightOutput);
    leftRearDrive.follow(leftFrontDrive);
    rightRearDrive.follow(rightFrontDrive);
  }


  public void stopDrive()  {
    leftFrontDrive.set(ControlMode.PercentOutput, 0);
    rightFrontDrive.set(ControlMode.PercentOutput, 0);
  }
  
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TeleOpDrive());
  }
}
