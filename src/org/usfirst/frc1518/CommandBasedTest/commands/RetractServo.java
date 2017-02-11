package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.subsystems.Servos;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class RetractServo extends InstantCommand{

	public RetractServo() {
		// TODO Auto-generated constructor stub
	}
	protected void execute(){
		if(Servos.servo1.get() == Servos.highPosition){
			Servos.servo1.set(Servos.midPosition);
			Servos.servo2.set(Servos.midPosition);
		}
		else if(Servos.servo1.get() == Servos.midPosition){
			Servos.servo1.set(Servos.lowPosition);
			Servos.servo2.set(Servos.midPosition);
		}
		else if(Servos.servo1.get() == Servos.lowPosition){
			Servos.servo1.set(Servos.highPosition);
			Servos.servo2.set(Servos.highPosition);
		}
		else{
			Servos.servo1.setAngle(0);
		}
	}
	
	protected boolean isFinished(){
		return true;
	}
	
	protected void end(){
		
	}
	
	protected void interrupted(){
		
	}
}

	
