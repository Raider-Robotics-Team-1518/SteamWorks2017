// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1518.CommandBasedTest;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.NamedSendable;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc1518.CommandBasedTest.commands.*;
import org.usfirst.frc1518.CommandBasedTest.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveTrain driveTrain;
    public static Servos servos;
    public static Pneumatics pneumatics;
    public static Launcher launcher;
    public static Feeder feeder;
	public static double feedSpeed;
	public static boolean isReversed = true;
	public static boolean isTestBot = true;
	public static String alliance = "";
	public static UsbCamera cam0;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrain = new DriveTrain();
        servos = new Servos();
        RobotMap.dio8.set(true);
        RobotMap.dio9.set(true);
        cam0 = CameraServer.getInstance().startAutomaticCapture();
        cam0.setResolution(640, 480);
        
        oi = new OI();
        alliance = DriverStation.getInstance().getAlliance().toString();
        SmartDashboard.putString("Alliance", alliance);
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

        autonomousCommand = new AutonomousCommand();

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
    }

    /**
     * This function is called when the disabled button is hit and first time thru Init().
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){
    	RobotMap.dio8.set(true);
    	RobotMap.dio9.set(true);
		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
    	isReversed = true;
    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
        setLights();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
    	Servos.servo1.set(Servos.lowPosition);
        Servos.servo2.set(1 - Servos.lowPosition);
        if (autonomousCommand != null) autonomousCommand.cancel();
        setLights();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
//        RobotMap.dio8.pulse(1);
//        RobotMap.dio9.pulse(0);
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
    
    public void setLights() {
        alliance = DriverStation.getInstance().getAlliance().toString();
    	if (alliance == "Red") {
    		RobotMap.dio8.set(true);
    		RobotMap.dio9.set(false);
       	}
    	else if (alliance == "Blue"){
    		RobotMap.dio8.set(false);
    		RobotMap.dio9.set(true);
    	}
    	else {
    		RobotMap.dio8.set(false);
    		RobotMap.dio9.set(false);
       	}
    }
}
