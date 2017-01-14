package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.subsystems.Launcher;

import edu.wpi.first.wpilibj.command.*; 

public class UnJam extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
	Launcher.topWheels.set(.3);
	
	}

	@Override
	protected boolean isFinished() {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		Launcher.topWheels.set(0);
		// TODO Auto-generated method stub
		
	}

} 
