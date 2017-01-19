package org.usfirst.frc1518.CommandBasedTest.commands;

import javax.print.DocFlavor.STRING;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Launcher;

import edu.wpi.first.wpilibj.command.Command;

public class RabbitTail extends Command {
	public RabbitTail() {

	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		Launcher.rightMechanism.set(-1.00);

		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		return false;
		// TODO Auto-generated method stub
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		Launcher.rightMechanism.set(0);
		// TODO Auto-generated method stub

	}

}