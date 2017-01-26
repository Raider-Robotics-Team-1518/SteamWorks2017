package org.usfirst.frc1518.CANRobot.commands;

import org.usfirst.frc1518.CANRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

	public Drive() {
		// TODO Auto-generated constructor stub
		requires(Robot.driveTrain);
	}

	public Drive(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Drive(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public Drive(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	protected void execute(){
		Robot.driveTrain.drive(Robot.oi.mainstick);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
