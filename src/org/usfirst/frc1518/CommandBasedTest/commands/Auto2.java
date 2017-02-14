package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class Auto2 extends InstantCommand {

	public Auto2() {
		// TODO Auto-generated constructor stub
	}

	protected void execute(){
		Robot.driveTrain.drive.arcadeDrive(-0.5, 0);
		Timer.delay(2);
		Robot.driveTrain.drive.arcadeDrive(0, 0);
	}
	
	protected void end(){
		
	}

	protected void interrupted(){
		
	}
}
