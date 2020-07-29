package species;

public class Fish extends AbstractAnimal
{
    private String name;
    private int year_named;

    public Fish(String name, int year_named)
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
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
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