package Guitar.model;

public class BlackWBear extends Bear{
  public BlackWBear() {
	// TODO Auto-generated constructor stub
	    colorBehavior=new BlackWColor();
	    eatBehavior=new Eatgrass();
  }
  public void display() {
	  System.out.println("����ǣ�I'm a BlackWBear");
}
}
