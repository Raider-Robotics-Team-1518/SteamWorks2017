package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Fangs;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AutoMode4 extends Command{

	@Override
	protected void end() {
		RobotMap.launcherTopWheels.set(0);
		RobotMap.launcherBottomWheels.set(0);
		Fangs.rightServo.setAngle(Fangs.rightHomePosition);
    	Fangs.leftServo.setAngle(Fangs.leftHomePosition);
		// TODO Auto-generated method stub
		
	}
	int timeout = 0;
	@Override
	protected void execute() {
		timeout++;
		if(timeout > 100) {
			
			Fangs.rightServo.setAngle(Fangs.throwerPosition);
	    	Fangs.leftServo.setAngle(Fangs.throwerPosition);	
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		RobotMap.launcherTopWheels.set(1);
		RobotMap.launcherBottomWheels.set(-1);
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		RobotMap.launcherTopWheels.set(0);
		RobotMap.launcherBottomWheels.set(0);
		Fangs.rightServo.setAngle(Fangs.rightHomePosition);
    	Fangs.leftServo.setAngle(Fangs.leftHomePosition);
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
