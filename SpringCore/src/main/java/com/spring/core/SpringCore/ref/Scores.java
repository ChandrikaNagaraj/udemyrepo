package com.spring.core.SpringCore.ref;

public class Scores {
	private String maths;
	private String physics;
	private String chemistry;

	public String getMaths() {
		return maths;
	}

	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}

	public void setMaths(String maths) {
		this.maths = maths;
	}

	public String getPhysics() {
		return physics;
	}

	public void setPhysics(String physics) {
		this.physics = physics;
	}

	public String getChemistry() {
		return chemistry;
	}

	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

}
