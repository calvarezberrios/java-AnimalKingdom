package species;

abstract class AbstractAnimal
{
    private static int maxId = 0;

    protected int id;

    public AbstractAnimal()
    {
        id = ++maxId;
    }

    abstract String getName();
    abstract int getYear_Named();
    abstract String move();
    abstract String breathe();
    abstract String reproduce();

    public int getId()
    {
        return id;
    }
}