package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.subsystems.Servos;

import edu.wpi.first.wpilibj.command.Command;

public class ExtendFangs extends Command{

	public ExtendFangs() {
		// TODO Auto-generated constructor stub
	}

	protected void execute() {
		Servos.servo1.setAngle(90);
		Servos.servo2.setAngle(90);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void interrupted(){
		Servos.servo1.set(Servos.lowPosition);
		Servos.servo2.set(1 - Servos.lowPosition);
	}
	
	protected void end(){
		
	}
	
}
