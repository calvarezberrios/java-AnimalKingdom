package species;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<AbstractAnimal> filterAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal condition)
    {
        ArrayList<AbstractAnimal> filtered = new ArrayList<>();

        for (AbstractAnimal a : animals)
        {
            if(condition.check(a))
            {
                filtered.add(a);
            }
        }
        return filtered;
    }

    public static void main (String args[])
    {
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        System.out.println("*** MVP ***");
        System.out.println("\n*** List all the animals in descending order by year named ***");
        animals.sort((a1, a2) -> a2.getYear_Named() - a1.getYear_Named());
        animals.forEach((a) -> System.out.println(a));

        System.out.println("\n*** List all the animals alphabetically ***");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animals.forEach((a) -> System.out.println(a));

        System.out.println("\n*** List all the animals order by how they move ***");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animals.forEach((a) -> System.out.println(a));

        System.out.println("\n*** List only those animals the breath with lungs ***");
        ArrayList<AbstractAnimal> breatheWithLungs = filterAnimals(animals, a -> a.breathe() == "lungs");
        breatheWithLungs.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear_Named()));

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        // ArrayList<AbstractAnimal> useLungsNamedIn1758 = filterAnimals(animals, a -> (a.breathe() == "lungs") && (a.getYear_Named() == 1758));
        ArrayList<AbstractAnimal> useLungsNamedIn1758 = filterAnimals(breatheWithLungs, a -> a.getYear_Named() == 1758);
        useLungsNamedIn1758.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear_Named()));

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        ArrayList<AbstractAnimal> useLungsLayEggs = filterAnimals(breatheWithLungs, a -> a.reproduce() == "eggs");
        useLungsLayEggs.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear_Named()));

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        ArrayList<AbstractAnimal> namedIn1758 = filterAnimals(animals, a -> a.getYear_Named() == 1758);
        namedIn1758.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        namedIn1758.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear_Named()));

        System.out.println("\n\n*** Stretch Goal ***");
        System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
        ArrayList<AbstractAnimal> mammals = filterAnimals(animals, a -> a instanceof Mammal);
        mammals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        mammals.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear_Named()));
    }
}