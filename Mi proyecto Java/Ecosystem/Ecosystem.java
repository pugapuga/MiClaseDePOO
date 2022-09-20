package Ecosystem;

import java.util.*;

public class Ecosystem {

	private String name;
	private Life theLife;
	private Vector<Organism> theOrganisms = new Vector<>();
	private Vector organisms;

	public Ecosystem(String name) {
		this.name = name;
		this.theLife = theLife;
	}

	public Vector<Organism> getTheOrganisms() {
		return theOrganisms;
	}

	public void setTheOrganisms(Vector<Organism> theOrganisms) {
		this.theOrganisms = theOrganisms;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Vector getOrganisms() {
		return this.organisms;
	}

	/**
	 * 
	 * @param organisms
	 */
	public void setOrganisms(Vector organisms) {
		this.organisms = organisms;
	}

	@Override
	public String toString() {
		return "Ecosystem{" +
				"name='" + name + '\'' +
				", theLife=" + theLife +
				", theOrganisms=" + theOrganisms +
				", organisms=" + organisms +
				'}';
	}
}