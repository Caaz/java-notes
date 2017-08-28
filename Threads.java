import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threads {
  public static void main(String[] args){
    // Create new Objects which implement the runnable interface.
    Incrementer a = new Incrementer(0,2);
    Incrementer b = new Incrementer(1,2);
    // Create a new Service for holding our two threads
    ExecutorService executor = Executors.newFixedThreadPool(2);
    // place the threads in the executor service, and execute them.
    executor.execute(a);
    executor.execute(b);
    try {
      // Every 200 milliseconds check if the threads are still running
      // this halts execution and disables adding any new threads
      executor.awaitTermination(200,TimeUnit.MILLISECONDS);
      // close the threads that were opened
      executor.shutdown();
    } catch(Exception e) {
      // this happens if the program was ever interrupted
      System.out.println(e);
    }
    System.out.println("Finished all threads");
    return;
  }
}
//
class Incrementer implements Runnable {
  private int addBy = 1;
  private int startsAt = 0;
  Incrementer(int startsAt, int addBy) {
    this.addBy = addBy;
    this.startsAt = startsAt;
  }
  public void run() {
    for(int i = startsAt; i<20; i+= addBy) {
      System.out.println(i);
    }
  }
}
