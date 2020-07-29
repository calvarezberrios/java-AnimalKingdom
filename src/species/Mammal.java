package species;

public class Mammal extends AbstractAnimal
{
    private String name;
    private int year_named;

    public Mammal(String name, int year_named)
    {
        this.name = name;
        this.year_named = year_named;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getYear_Named()
    {
        return year_named;
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }

    @Override
    public String toString()
    {
        return "Animals{id= " + id + ", name= '" + name + "', yearNamed= " + year_named + "}";
    }
}