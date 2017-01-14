package org.usfirst.frc1518.CommandBasedTest.subsystems;


import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.commands.USBCam;
import org.usfirst.frc1518.CommandBasedTest.Robot;


import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;
import com.ni.vision.NIVision.Point;
import com.ni.vision.NIVision.RGBValue;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.vision.AxisCamera;
import edu.wpi.first.wpilibj.vision.USBCamera;

public class Optics extends Subsystem {

	public static final Image frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_HSL, 0);
	public static Point origin;
	public static RGBValue textColor;

	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		/*String targetDistance = "Distance: " + Robot.leftButtCheek;
		origin = new Point(0,0);
		textColor = new RGBValue(255,255,255,255);
	if (Robot.camSelect2 == false) {
		RobotMap.axisCam1.getImage(frame); 
	}
	else {
		RobotMap.axisCam1.getImage(frame);
	}
	//NIVision.imaqOverlayText(frame, origin, targetDistance, textColor, null, "");*/
		setDefaultCommand(new USBCam());
	}

}

