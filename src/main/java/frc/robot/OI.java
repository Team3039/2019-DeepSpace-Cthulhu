package frc.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import frc.controllers.PS4Gamepad;
import frc.robot.commands.CargoTrigger;
import frc.robot.commands.GetCargo;
import frc.robot.commands.SetArmPosition;
import frc.robot.commands.Shoot;
import frc.robot.commands.TriggerHatch;
import frc.robot.commands.Sequences.CargoIntakeSequence;

public class OI {
	//Calls the Gamepad Classes
	private PS4Gamepad driverPad = new PS4Gamepad(RobotMap.driver);
	private PS4Gamepad operatorPad = new PS4Gamepad(RobotMap.operator);
	
	//Returns Controller Data for use with certain Methods
	public PS4Gamepad getGamepad() {
		return driverPad;
	}
 	
	public PS4Gamepad getCopad() {
		return operatorPad;
	}

	public OI() {

			//Button myButton = driverPad.getButtonState();
			//Driver Buttons

			//Operator Button
		Button operatorR1 = operatorPad.getR1();
		Button operatorX = operatorPad.getButtonX();
		Button operatorCircle = operatorPad.getButtonCircle();
		Button operatorSquare = operatorPad.getButtonSquare();
		Button operatorTriangle = operatorPad.getButtonTriangle();
		Button operatorL1 = operatorPad.getL1();
		



       // myButton.whenPressed(new exCmd())
		//Driver Controls		

		//Operator Controls	
		operatorR1.whileHeld(new Shoot());
		operatorX.whenPressed(new SetArmPosition(0));
		operatorCircle.whenPressed(new CargoIntakeSequence());
		operatorSquare.toggleWhenPressed(new TriggerHatch());
		operatorL1.whileHeld(new GetCargo());
		operatorTriangle.whileHeld(new CargoTrigger());
		
		


	}
}