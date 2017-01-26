package org.usfirst.frc1518.CANRobot.commands;

import org.usfirst.frc1518.CANRobot.subsystems.Servos;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class RetractServo extends InstantCommand{

	public RetractServo() {
		// TODO Auto-generated constructor stub
	}
	protected void execute(){
		if(Servos.servo1.getAngle() == 0){
			Servos.servo1.setAngle(45);
		}
		else if(Servos.servo1.getAngle() == 45){
			Servos.servo1.setAngle(90);
		}
		else if(Servos.servo1.getAngle() == 90){
			Servos.servo1.setAngle(180);
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
	
