package Ecosystem;

import java.util.*;

public class Life {

	private Vector<Ecosystem> theEcosystems = new Vector<>();
	private Ecosystem ecosystem;

	public Life() {
	}

	public Vector<Ecosystem> getTheEcosystems() {

		return theEcosystems;
	}

	public void setTheEcosystems(Vector<Ecosystem> theEcosystems) {

		this.theEcosystems = theEcosystems;
	}

	public Ecosystem getEcosystem() {

		return this.ecosystem;
	}

	/**
	 * 
	 * @param ecosystem
	 */
	public void setEcosystem(Ecosystem ecosystem) {

		this.ecosystem = ecosystem;
	}

	@Override
	public String toString() {
		return "Life{" +
				"theEcosystems=" + theEcosystems +
				", ecosystem=" + ecosystem +
				'}';
	}
}