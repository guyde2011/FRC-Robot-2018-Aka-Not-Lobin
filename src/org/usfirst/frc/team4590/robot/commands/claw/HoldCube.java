package org.usfirst.frc.team4590.robot.commands.claw;

import org.usfirst.frc.team4590.robot.subsystems.Claw;

class HoldCube extends ClosingClawCommand {

	HoldCube() {
		requires(Claw.getInstance());
	}
	
	@Override
	protected void initialize() {
		System.out.println("Holding claw");
	}
	
	@Override
	protected void executeCommand() {
		Claw.getInstance().setPower(1);
	}
	
	@Override
	protected boolean isFinished() {
//		return !Claw.getInstance().isClosed();
		return false;
	}
	
	@Override
	protected void end() {
		System.out.println("Stopped Holding claw");
		Claw.getInstance().stop();
	}
}