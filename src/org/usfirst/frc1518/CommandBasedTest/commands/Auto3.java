package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class Auto3 extends Command {

	public Auto3() {
		// TODO Auto-generated constructor stub
	}

	protected void execute(){
		//Drive forward 48 inches
		//Robot.driveTrain.gyroDrive(48);
		//Turn 90 degrees
		Robot.driveTrain.gyroTurn(90);
		//Drive forward 48 inches
		Robot.driveTrain.gyroDrive(48);
		//Turn 90 degrees
		Robot.driveTrain.gyroTurn(90);
		//Drive forward 48 inches
		Robot.driveTrain.gyroDrive(48);
		//Turn 90 degrees
		Robot.driveTrain.gyroTurn(90);
		//Drive forward 48 inches
		Robot.driveTrain.gyroDrive(48);
		//Turn 90 degrees
		Robot.driveTrain.gyroTurn(90);
		
		
	}
	
	protected void end(){
		
	}

	protected void interrupted(){
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
