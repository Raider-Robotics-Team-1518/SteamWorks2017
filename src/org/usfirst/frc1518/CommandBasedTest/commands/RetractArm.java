package org.usfirst.frc1518.CommandBasedTest.commands;
import edu.wpi.first.wpilibj.command.*;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Lifter;
public class RetractArm extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Lifter.armMotor.set(-0.4);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Lifter.armMotor.set(0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Lifter.armMotor.set(0);
		
	}

}
