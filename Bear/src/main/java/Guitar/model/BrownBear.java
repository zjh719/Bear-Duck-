package Guitar.model;

public class BrownBear extends Bear{
   public BrownBear(){
	   colorBehavior=new BrownColor();
	   eatBehavior=new Eatmeat();
   }
   public void display(){
	   System.out.println("I'm a BrownBear");
   }
}
