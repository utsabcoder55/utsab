import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("The Game Starts!! \n Player 1 needs to make the number given divisible by 3 in 10 attempts \n Player 2 tries best to make p1 lose!!");
        // p1 and p2 are given number n .
        //Both can either n-1 or n+1 in their turn.
        // if p2 retrieves n % 3 == 0 ; p2 WINS.
        //if p2 can't get it in 10 attempts; p1 WINS.
        boolean win = true;
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int n = ran.nextInt(100);
        int count = 0;
        System.out.println("Your number is: "+n);
        while(count != 5){
            //p2 turn
            System.out.println("Player-2 turn! What you want to do? \n 1.Increase the number by 1\n2.Decrease the number by 1");
           int choice = sc.nextInt();
            switch (choice){
                case 1:
                    n = n+1;
                    break;

                case 2:
                    n = n-1;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.println("Now number 'n' becomes: "+ n );
            count++;

         //p2 turn
            System.out.println("Player-1 turn! What you want to do? \n 1.Increase the number by 1\n2.Decrease the number by 1");
             choice = sc.nextInt();
            switch (choice){
                case 1:
                    n = n+1;
                    break;

                case 2:
                    n = n-1;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.println("Now number 'n' becomes: "+ n );
            if(n % 3 == 0){
                int three = n / 3;
                System.out.println(n +" is divided by 3 perfectly : "+"3 x " +n+" = "+ three);
                System.out.println("Player 1 wins !!!");
                win = false;

                break;
            }


        }
        if(win == false){


        }
        else{
            System.out.println("10 Attempts reached!!\n Player 2 wins !!!");



    }
    }

}
