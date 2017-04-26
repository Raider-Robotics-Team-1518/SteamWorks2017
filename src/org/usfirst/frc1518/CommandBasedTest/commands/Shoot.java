package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.OI;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Launcher;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {

	public Shoot() {
	
	}

	public Shoot(String name) {
		super(name);
	}

	public Shoot(double timeout) {
		super(timeout);
	}

	public Shoot(String name, double timeout) {
		super(name, timeout);
	}

	protected void execute(){
		Launcher.shooter.set(1);
		RobotMap.feedSpare1.set(.7);
		if(OI.unstick.get() == true){
			RobotMap.feedMotor1.set(-.5);
			RobotMap.shootAgitator.set(-1);
		}
		else{
			RobotMap.feedMotor1.set(.5);
			RobotMap.shootAgitator.set(1);
		}
		//Launcher.shooter.set(-1);
		//Feeder.feeder.set(-0.8);
		
	}

    // Called once after isFinished returns true
    protected void end() {
    	Launcher.shooter.set(0);
    	RobotMap.feedSpare1.set(0);
    	RobotMap.feedMotor1.set(0);
    	RobotMap.shootAgitator.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Launcher.shooter.set(0);
    	RobotMap.feedSpare1.set(0);
    	RobotMap.feedMotor1.set(0);
    	RobotMap.shootAgitator.set(0);
    }

	@Override
	protected boolean isFinished() {
		return false;
	}

}
