/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Sequences;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Constants;
import frc.robot.commands.GetCargo;
import frc.robot.commands.SetArmPosition;

public class CargoIntakeSequence extends CommandGroup {

  public CargoIntakeSequence() {
    addSequential(new SetArmPosition(Constants.cargoIntakeLevel), .5);
    addSequential(new GetCargo());
    
  }
}
