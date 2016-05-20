import java.util.*;
public class zoo{
  
  public static void main(String[] args){

    
    Scanner in = new Scanner(System.in); 
    System.out.println("typing user Name");
    String user = in.nextLine();
    System.out.println("Hello "+user);
    
    Scanner amount = new Scanner(System.in);
    System.out.println("How many animal want " + user+"?");
    int animal_amount = amount.nextInt();
    animal[] zoo = new animal[animal_amount];
    
    for (int i=0; i<zoo.length; i++){
      
      Scanner fox = new Scanner(System.in);
      System.out.println((i+1)+" animal name");
      String an = fox.nextLine();
      
      Scanner fox2 = new Scanner(System.in);
      System.out.println((i+1)+" animal sound");
      String abn = fox2.nextLine();
      zoo[i]= new animal(an,abn);
      
      
      
      
      
    }
    all_sounds(zoo);
  }

    
    public static void all_sounds(animal[] zoo){
      for(int i=0; i<zoo.length; i++){
      System.out.println("This " + zoo[i].user+" goes "+zoo[i].sound);
      }
    }
}