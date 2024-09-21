package Games;

public class Outdoor
{
    protected String players;

    public Outdoor()
    {
    }

    public Outdoor(String p)
    {
        players = p;
    }
    public void display()
    {
        System.out.println(players);
    }
    protected void finalize()
    {
        System.out.println("Terminating Indoor...");
    }
}