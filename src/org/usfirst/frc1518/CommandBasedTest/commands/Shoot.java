package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.OI;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Feeder;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Launcher;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {

	public Shoot() {
		// TODO Auto-generated constructor stub
	}

	public Shoot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Shoot(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public Shoot(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	protected void execute(){
		Launcher.shooter.set(OI.mainstick.getThrottle());
		Feeder.feeder.set(-1);
	}

    // Called once after isFinished returns true
    protected void end() {
    	Launcher.shooter.set(0);
    	Feeder.feeder.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Launcher.shooter.set(0);
    	Feeder.feeder.set(0);
    }

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
