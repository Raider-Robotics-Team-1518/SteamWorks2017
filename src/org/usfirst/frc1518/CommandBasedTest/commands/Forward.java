package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.command.Command;

public class Forward extends Command {
	boolean isCompleted = false;

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		//DriveTrain.rearLeftDrive.set(5000);
		isCompleted = true;

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isCompleted;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
