import java.util.Scanner;

public class main {
//implement the function to generate the random number
public static void guessingNumber(){
    Scanner sc=new Scanner(System.in);
    //generating the number
     int num=1+(int)(10*Math.random());
     //trial use N
    int N=5;
    int i,guess;
    System.out.println("Guess the number"
                        +"between 1 to 10"
                         + "to get random choice");
    //iteration use
      for(i=0;i<N;i++){
          System.out.println("guess the number");
          guess=sc.nextInt();
            if(num==guess){
                System.out.println("congratulation you guess is correct");
                break;

              } else if (num>guess && i!=N-1) {
                System.out.println("the number was greater than"+" "+ guess);

            }
            else if(num<guess && i!=N-1){
                System.out.println("The number was less then "+" "+guess);


            }


         }
    System.out.println("the number"+num);
      if(i==N){
               System.out.println("your trial is finish!try again");
                 }


    }
    public static void main(String[] args){
    guessingNumber();

    }

}