package Ecosystem;

public class Animal extends Organism {
    public Animal(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "theEcosystem=" + theEcosystem +
                "} " + super.toString();
    }
}