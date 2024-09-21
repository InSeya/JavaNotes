package Games;
import Games.Indoor;
import Games.Outdoor;
class Players
{
    public static void main(String args[])
    {
        Indoor In[] = new Indoor[4];
        In[0] = new Indoor("Aaisha");
        In[1] = new Indoor("Qazi");
        In[2] = new Indoor("Abc");
        In[3] = new Indoor("Xyz");
        System.out.println("Indoor Players...");
        for(int i=0;i<In.length;i++){
            In[i].display();
        }
        System.out.println("Outdoor Players...");
        Outdoor Out[] = new Outdoor[4];
        Out[0] = new Outdoor("Ayesha");
        Out[1] = new Outdoor("Kazi");
        Out[2] = new Outdoor("PQR");
        Out[3] = new Outdoor("EFG");
        for(int i=0;i<Out.length;i++){
            Out[i].display();
        }
    }
}