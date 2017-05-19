package Guitar.model;

public class PlayBear extends Bear{
	public  PlayBear() {
		 colorBehavior=new AllColor();
		 eatBehavior=new Eatnot();
	}   
	public void display(){
		System.out.println("I'm a PlayBear");
	}
}
