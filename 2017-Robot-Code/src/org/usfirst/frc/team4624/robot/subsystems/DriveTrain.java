package org.usfirst.frc.team4624.robot.subsystems;

import org.usfirst.frc.team4624.robot.Robot;
import org.usfirst.frc.team4624.robot.RobotMap;
import org.usfirst.frc.team4624.robot.commands.Drive;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	final VictorSP fLMotor = new VictorSP(RobotMap.frontLeftMotor);
	final VictorSP fRMotor = new VictorSP(RobotMap.frontRightMotor);
	final VictorSP bLMotor = new VictorSP(RobotMap.backLeftMotor);
	final VictorSP bRMotor = new VictorSP(RobotMap.backRightMotor);

	public static double rotateToAngleRate;
	boolean rotateToAngle = false;

	RobotDrive driveTrain = new RobotDrive(fLMotor, bLMotor, fRMotor, bRMotor);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new Drive());
	}

	public void drive(double x, double y, double rotation) {
		double xmove = Math.pow(x, 3);
		double ymove = Math.pow(y, 3);
		double rmove = Math.pow(rotation, 3);
		driveTrain.mecanumDrive_Cartesian(xmove, ymove, rmove, 0);
	}

	public void driveJoy(double x, double y, double r) {
		double xMove = x * Math.abs(x);
		double yMove = y * Math.abs(y);
		double rMove = r * Math.abs(r);

//	double xMove = Math.abs((1.032235 / (1 + (62.33015 * Math.pow(Math.E, (-7.59 * x))))));
//	double yMove = Math.abs((1.032235 / (1 + (62.33015 * Math.pow(Math.E, (-7.59 * y))))));
//	double rMove = Math.abs((1.032235 / (1 + (62.33015 * Math.pow(Math.E, (-7.59 * r))))));

		double deadZone = .07;

		if (xMove < deadZone && xMove > -deadZone) {
			xMove = 0;
		}
		if (yMove < deadZone && yMove > -deadZone) {
			yMove = 0;
		}
		if (rMove < deadZone && rMove > -deadZone) {
			rMove = 0;
		}

		set(fLMotor, (xMove - yMove + (rMove / 2)));
		set(bLMotor, (-xMove - yMove + (rMove / 2)));
		set(fRMotor, (xMove + yMove + (rMove / 2)));
		set(bRMotor, (-xMove + yMove + (rMove / 2)));
	}

	public void driveRaw(double x, double y, double r) {
		double xMove = x;
		double yMove = y;
		double rMove = r;

		set(fLMotor, (xMove - yMove + (rMove / 2)));
		set(bLMotor, (-xMove - yMove + (rMove / 2)));
		set(fRMotor, (xMove + yMove + (rMove / 2)));
		set(bRMotor, (-xMove + yMove + (rMove / 2)));
	}

	public void driveXBox(double x1, double y1, double x2) {
		double x1move = Math.pow(x1, 2);
		double x2move = Math.pow(x2, 2);
		double y1move = Math.pow(y1, 2);

		//If exponential returns negative, reverse
		if (x1 < 0) {
			x1move *= -1;
		}

		if (x2 < 0) {
			x2move *= -1;
		}

		if (y1 < 0) {
			y1move *= -1;
		}

		double deadZone = .07;

		if (x1move < deadZone && x1move > -deadZone) {
			x1move = 0;
		}
		if (y1move < deadZone && y1move > -deadZone) {
			y1move = 0;
		}
		if (x2move < deadZone && x2move > -deadZone) {
			x2move = 0;
		}

		if (!(Robot.oi.joystick.getRawButton(1))) { // should invert controls
			set(fLMotor, (-x1move + y1move + (x2move / 2)));
			set(bLMotor, (x1move + y1move + (x2move / 2)));
			set(fRMotor, (-x1move - y1move + (x2move / 2)));
			set(bRMotor, (x1move - y1move + (x2move / 2)));
		} else {
			set(fLMotor, (x1move - y1move + (x2move / 2)));
			set(bLMotor, (-x1move - y1move + (x2move / 2)));
			set(fRMotor, (x1move + y1move + (x2move / 2)));
			set(bRMotor, (-x1move + y1move + (x2move / 2)));
		}
	}

	public void stop() {
		fLMotor.setDisabled();
		bLMotor.setDisabled();
		fRMotor.setDisabled();
		bRMotor.setDisabled();
	}

	public void set(VictorSP motor, double speed) {
		if (speed == 0) {
			motor.setDisabled();
		} else {
			motor.set(speed);
		}
	}
}
