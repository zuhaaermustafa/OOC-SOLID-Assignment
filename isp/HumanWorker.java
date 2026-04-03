//needs all 3 interfaces
package isp;
public class HumanWorker implements Workable, Eatable, Sleepable {
    public void work()  { System.out.println("Human works."); }
    public void eat()   { System.out.println("Human eats."); }
    public void sleep() { System.out.println("Human sleeps."); }
}
