import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class wpmtest {
    public static void main(String[] args) throws InterruptedException {

        String[] word = {"welcome" , "hello" , "the" , "traffic" , "light" , "ciecle" 
        , "pretty" , "beautiful" , "interresting" , "earache" , "ferver"  , "nauseous"};
        
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for(int i = 0; i < 10; i++){
        System.out.print(word[rand.nextInt(11)] + " ");
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typer = scan.nextLine();
        System.out.println(typer);

        double end = LocalTime.now().toNanoOfDay();
        double elaspsedTime = end - start;
        double seconds = elaspsedTime / 1000000000.0;
        int numChars = typer.length();
        int wpm = (int)((((double) numChars / 5 ) / seconds) * 60);
        System.out.print("your wpm is " + wpm + "!");
    }
}
