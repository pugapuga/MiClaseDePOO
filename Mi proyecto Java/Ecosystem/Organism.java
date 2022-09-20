package Ecosystem;

public class Organism {

	Ecosystem theEcosystem;
	private String name;


	public Organism(String name) {
		this.theEcosystem = theEcosystem;
		this.name = name;
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

	@Override
	public String toString() {
		return "Organism{" +
				"theEcosystem=" + theEcosystem +
				", name='" + name + '\'' +
				'}';
	}
}