package frc.robot;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Robotmap {
    //HID
    public final static int driverPad = 0;
    public final static int operatorPad = 1;

//CAN
    //Drive Motors
    public final static int frontleftmotor = 0;
    public final static int frontrightmotor = 0;
    public final static int rearleftmotor = 0;
    public final static int rearrightmotor = 0;

    //Gamepiece Motors
    public final static int intake = 0;
    public final static int leftCargoShoot = 0;
    public final static int rightCargoShooter = 0;

    //Arm Motors
    public final static int armRaise = 0; //three different degree positions
    public final static int armOpen = 0; //while held

//SOLENOID
    public final static int X = 0;
    public final static int Y = 0;
    public final static int Z = 0;
    public final static int cameraPivot = 0;

//DIO

//Motor Types
    public final static MotorType driveMotorType = MotorType.kBrushless;
    public final static MotorType armMotorType = MotorType.kBrushless;
}