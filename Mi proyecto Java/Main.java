import Ecosystem.Ecosystem;
import Ecosystem.Life;
import Ecosystem.Organism;

public class Main {
    public static void main(String[] args) {
        Life miLife = new Life();

        Ecosystem theEcosystem = new Ecosystem("MiEcosistema");
        miLife.getTheEcosystems().add(theEcosystem);

        Organism miOrganismo = new Organism("Hormiga");
        theEcosystem.getTheOrganisms().add(miOrganismo);

        Organism miOrganismo2 = new Organism("Ratón");
        theEcosystem.getTheOrganisms().add(miOrganismo2);

        System.out.println(miLife);

        System.out.println(((Ecosystem)miLife.getTheEcosystems().get(0)).getName());
        
    }
}