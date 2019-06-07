package frc.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import frc.controllers.PS4Gamepad;
import frc.robot.commands.Shoot;

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

		//Operator Buttons
		Button operatorR1 = operatorPad.getR1();

            //myButton.whenPressed(new exCmd())
		//Driver Controls		

		//Operator Controls	
		operatorR1.whileHeld(new Shoot());
	}
}