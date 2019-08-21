package frc.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import frc.controllers.PS4Gamepad;
import frc.robot.commands.ActuateArm;
import frc.robot.commands.GetCargo;
import frc.robot.commands.Shoot;
import frc.robot.commands.TriggerHatch;

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
		Button operatorR2 = operatorPad.getR1();
		Button operatorTriangle = operatorPad.getButtonSquare();
		Button operatorL1 = operatorPad.getL1();
		Button operatorL2 = operatorPad.getL2();
		



       // myButton.whenPressed(new exCmd())
		//Driver Controls		

		//Operator Controls	
		operatorL1.whileHeld(new Shoot());
		operatorL2.whileHeld(new GetCargo());
		operatorR2.toggleWhenPressed(new TriggerHatch());
	    operatorTriangle.toggleWhenPressed(new ActuateArm());
		


	}
} 