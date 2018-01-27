package org.usfirst.frc.team4624.robot.subsystems;

import org.usfirst.frc.team4624.robot.RobotMap;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;


public class CameraPanTilt extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	Servo panCameraServo = new Servo(RobotMap.cameraPanServo);
	Servo tiltCameraServo = new Servo(RobotMap.cameraTiltServo);
	
	public void stop () {
		panCameraServo.setDisabled();
		tiltCameraServo.setDisabled();
	}
	
	public void adjustCamera (double panAngle, double tiltAngle) {
		panCameraServo.setAngle(panAngle);
		tiltCameraServo.setAngle(tiltAngle);
	}


	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
