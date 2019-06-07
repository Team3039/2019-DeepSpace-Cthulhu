package frc.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import frc.robot.commands.ActuateIntake;
import frc.robot.commands.Aim;
import frc.robot.commands.CargoFalseTrigger;
import frc.robot.commands.ChangeElevatorPosition;
import frc.robot.commands.LiftBack;
import frc.robot.commands.LiftFront;
import frc.robot.commands.ShootCargo;
import frc.robot.commands.Sequences.CollectCargoSequence;
import frc.robot.commands.Sequences.ShootHatchSequence;
import frc.util.PS4Copad;
import frc.util.PS4Gamepad;

public class OI {
    private PS4Gamepad driverPad = new PS4Gamepad(Robotmap.driver);
    private PS4Copad operatotPad = new PS4Copad(Robotmap.operator);

    public PS4Gamepad getGamepad() {
        return driverPad;
    }

    public PS4Copad getCopad() {
        return operatorPad;
    }

    public OI() {
        Button driverSquare = driverPad.getButtonSquare();
        Button driverX = driverPad.getButtonCircle();
        Button driverTriangle = driverPad.getButtonTriangle();

        //Operator Buttons
        Button operatorCircle = operatorPad.getButtonCircle();
        Button operatorX = operatorPad.getButtonX();
        Button operatorTriangle = operatorPad.getButtonTriangle();
        Button operatorSquare = operatorPad.getButtonSquare();
        Button operatorShare = operatorPad.getButtonShare();
        Button operatorOptions = operatorPad.getButtonOptions();
        Button operatorL1 = operatorPad.getButtonL1();
        Button operatorL2 = operatorPad.getButtonL2();
        Button operatorR1 = operatorPad.getButtonR1();
        Button operatorR2 = operatorPad.getButtonR2();

        //Driver Controls
        driver




        //Operator Controls
        operator












    }
}