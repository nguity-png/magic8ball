import java.util.Scanner;

public class magic {

    public static void main(String[] args){
        Magic();
    }
    public static void Magic(){
        int rand = (int) (Math.random() * 8)+1;

       
        Scanner input = new Scanner(System.in); 
        System.out.println("Ask any question: ");
        String question = input.nextLine();
        System.out.println(rand);
        if( rand == 1){
             System.out.println("Try Again");
        }
            
        else if (rand == 2){
            System.out.println("yes");
        }
        else if (rand == 3){
            System.out.println("Absolutely");
        }
        else if (rand == 4){
            System.out.println("Not today");
        }
        else if (rand == 5){
            System.out.println("Nope");
        }
        else if (rand == 6){
            System.out.println("Never");
        }
        else if (rand == 7){
            System.out.println("Always");
        }
        else {
            System.out.println("Just wait");
        }
            
        }

        



    }

