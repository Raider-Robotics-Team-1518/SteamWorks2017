package org.usfirst.frc1518.CommandBasedTest.commands;
import java.awt.Robot;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Lifter;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class LiftArm extends Command{
	int timeout = 0;


	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute(){
		Lifter.armMotor.set(.75);
		// TODO Auto-generated method stub 
	}  

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		/*while(timeout < 200000) {
			RobotMap.liftMotor1.set(-0.3);
			timeout = timeout++;
		}
		*/Lifter.armMotor.set(0);
		
		
		
	}

}
