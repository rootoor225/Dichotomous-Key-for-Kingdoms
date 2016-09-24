import java.util.Scanner;

public class DichotomousKey{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Input 1 for YES and 0 for NO.");
      System.out.println("Is the kingdom Eukaryotic?");
      int a = in.nextInt();
      if (a == 1){
      System.out.println("Does the kingdom have chitin in its cell wall?");
      int c = in.nextInt();
      if(c==0){
      System.out.println("Does the kingdom have organs?");
      int d = in.nextInt();
      if (d==1){
         
            System.out.println("Is the kingdom autotrophic?");
            int e = in.nextInt();
            if (e==1){
                     System.out.println("The kingdom is PLANTAE!");
            }
            else if (e==0){
                     System.out.println("The kingdom is ANIMALIA!");
            }
      }
      else if(d==0){
            System.out.println("The kingdom is PROTISTA!");
}
}
      else if (c==1){
                        System.out.println("The kingdom is FUNGI!");
      }
      }
      if(a==0){
      System.out.println("Does the kingdom contain peptidoglycan in its cell wall?");
      int b = in.nextInt();
      if (b==1){
      System.out.println("The kingdom is EUBACTERIA!");
      }
      else if (b==0){
      System.out.println("The kingdom is ARCHAEABACTERIA!");
      }
      }
      }
      }
  

            
      
