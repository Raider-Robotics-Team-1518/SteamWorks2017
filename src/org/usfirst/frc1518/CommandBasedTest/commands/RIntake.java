package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.subsystems.Feeder;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Launcher;

import edu.wpi.first.wpilibj.command.Command;

public class RIntake extends Command{

	public RIntake() {
		// TODO Auto-generated constructor stub
	}
	
	protected void execute() {
    	Feeder.feeder.set(-0.5);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Feeder.feeder.set(0);    
    	}

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Feeder.feeder.set(0);
    }

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}


