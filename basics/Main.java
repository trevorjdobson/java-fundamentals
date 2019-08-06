import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
  public static void main(String[] args){
    System.out.println(pluralize("Dog",5));
    System.out.println(pluralize("Cat",1));
    System.out.println(pluralize("Turtle",0));
    flipNHeads(4);
    clock();
  }
  public static String pluralize(String str, int num){
    String output = str;
    if(num > 1 || num == 0){
      str = str.concat("s");
    }
    return str;
  }
  public static void flipNHeads(int num){
    String lastToss = "";
    int tally = 0;
    int totalFlips = 0;
    double rand = (double)Math.round(Math.random() * 10) / 10.0;

    while(tally != num){
      rand = (double)Math.round(Math.random() * 10) / 10.0;
      if(rand <=0.5){
        System.out.println("Tails");
        tally = 0;
        lastToss = "Tails";
      }else{
        System.out.println("Heads");
        tally++;
        lastToss = "Heads";
      }
      totalFlips++;
    }
    System.out.println("It took " + totalFlips + " to get " + num + " Heads in a row.");
  }
  public static void clock(){
    Timer timer =  new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
      public void run(){
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
      }
      
    }, 1000, 1000);
  }
  
}