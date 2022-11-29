package com.edocode.dp.creational.prototype;

//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Generals cannot be clone.");
	}
	

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset is not supported.");
	}
	
}
