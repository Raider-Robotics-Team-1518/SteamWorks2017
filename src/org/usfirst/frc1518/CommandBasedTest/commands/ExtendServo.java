package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Servos;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class ExtendServo extends InstantCommand{
	
	public ExtendServo() {
		// TODO Auto-generated constructor stub
	}

	protected void execute(){
		if(Servos.servo1.get() == Servos.lowPosition){
			Servos.servo1.set(Servos.midPosition);
			Servos.servo2.set(1 - Servos.midPosition);
		}
		else if(Servos.servo1.get() == Servos.midPosition){
			Servos.servo1.set(Servos.highPosition);
			Servos.servo2.set(1 - Servos.highPosition);
		}
		else if(Servos.servo1.get() == Servos.highPosition){
			Servos.servo1.set(Servos.lowPosition);
			Servos.servo2.set(1 - Servos.lowPosition);
		}
		
	}

	
	protected void end() {
	
	}
	
	protected void interrupted(){
	
	}

}
