package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.subsystems.Tail;

import edu.wpi.first.wpilibj.command.Command;

public class WagTail extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Tail.tailMotor.set(0.1);
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		while(Tail.tailMotor.isFwdLimitSwitchClosed()) {
			Tail.tailMotor.set(-0.1);
		}
		while(Tail.tailMotor.isRevLimitSwitchClosed()) {
			Tail.tailMotor.set(0.1);
		}
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Tail.tailMotor.set(0);
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
