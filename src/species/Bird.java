package species;

public class Bird extends AbstractAnimal
{
    private String name;
    private int year_named;

    public Bird(String name, int year_named)
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
        return "fly";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Animals{id= " + id + ", name= '" + name + "', yearNamed= " + year_named + "}";
    }
}