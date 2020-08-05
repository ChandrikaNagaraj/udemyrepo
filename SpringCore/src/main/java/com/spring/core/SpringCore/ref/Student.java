package com.spring.core.SpringCore.ref;

public class Student {
	private String name;
	Scores score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Scores getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	public void setScore(Scores score) {
		this.score = score;
	}

}
