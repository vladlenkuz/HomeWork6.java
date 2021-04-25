package HomeWork6;

public abstract class Animal implements AnimalAction  {

   private String name;
   protected int lOng;
   protected static int countDog;
   protected static int countCat;
   protected static int countAnimal;

   public Animal (String name){

       this.name = name;
       countAnimal++;
   }



}
