package org.usfirst.frc.team4590.utils.CTRE;

import java.util.Vector;

public class TalonManager {
	
	private static final Vector<SmartTalon> m_talons = new Vector<SmartTalon>();
	
	private TalonManager() {}
	
	public static final void addTalon(SmartTalon talon) {
		m_talons.add(talon);
	}
	
	public static final void stupidShitThatCTREMakesMeDo() {
		for (SmartTalon smartTalon : m_talons) {
			if (!smartTalon.wasSet())
				smartTalon.set(smartTalon.getLastValue());
			smartTalon.newIterration();
		}
	}
	
	public static final void setAllTalons(double power) {
		for (SmartTalon smartTalon : m_talons)
			smartTalon.set(power);
	}
}