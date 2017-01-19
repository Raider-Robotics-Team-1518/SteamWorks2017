package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class auto1 extends Command {

	public auto1() {
		// TODO Auto-generated constructor stub
		requires(Robot.driveTrain);
		Robot.driveTrain.drive.arcadeDrive(.25,0);
	}

	public auto1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public auto1(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public auto1(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
