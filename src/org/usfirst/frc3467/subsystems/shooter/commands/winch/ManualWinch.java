package org.usfirst.frc3467.subsystems.shooter.commands.winch;

import org.usfirst.frc3467.OI;
import org.usfirst.frc3467.commands.CommandBase;

public class ManualWinch extends CommandBase {
	
	public ManualWinch() {
		requires(winch);
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		if (Math.abs(OI.opGamepadManu.getY()) > 0.2)
			winch.motor.set(OI.opGamepadManu.getY());
		else
			winch.motor.set(0.0);
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		
	}
	
	protected void interrupted() {
		
	}
	
}
