package frc.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoMode;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Lights;
import frc.robot.subsystems.Shooter;

public class Robot extends TimedRobot {

    //Subsystems
    public static Drivetrain drivetrain = new Drivetrain();
    public static Arm arm = new Arm();
    public static Climber climber = new Climber();

//Choosers
//   Command autoCommand;
//   SendableChooser<Command> autoChooser = new SendableChooser<>();

  //Vision Information
//   public static double targetValid; //Whether the limelight has any valid targets (0 or 1)
//   public static double targetX; //Horizontal Offset From Crosshair To Target (-27 degrees to 27 degrees)
//   public static double targetY; //Vertical Offset From Crosshair To Target (-20.5 degrees to 20.5 degrees)
//   public static double targetArea; //Target Area (0% of image to 100% of image)
//   public static double targetSkew; //Skew or rotation (-90 degrees to 0 degrees)

    @Override
    public void robotPeriodic() {
        //Light Code
        lights.runLights();
    if(SmartDashboard.getBoolean("Red Alliance", true)) {
      lights.setRedAlliance();
    }
    else {
        lights.setBlueAlliance();

    //     //Gather Vision Information
    // targetValid = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0);
    // targetX = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tx").getDouble(0);
    // targetY = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ty").getDouble(0);
    // targetArea = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ta").getDouble(0);
    // targetSkew = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ts").getDouble(0);
    }
//--INCOMPLETE--INCOMPLETE--INCOMPLETE--INCOMPLETE--INCOMPLETE--INCOMPLETE--INCOMPLETE--INCOMPLETE--INCOMPLETE--INCOMPLETE
}