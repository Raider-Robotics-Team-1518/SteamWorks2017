package org.usfirst.frc1518.CANRobot.subsystems;

import org.usfirst.frc1518.CANRobot.RobotMap;

import edu.wpi.first.wpilibj.CANSpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Launcher extends Subsystem {

    public static final CANSpeedController shooter = RobotMap.shooterMotor;

    public Launcher() {
		// TODO Auto-generated constructor stub

	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
