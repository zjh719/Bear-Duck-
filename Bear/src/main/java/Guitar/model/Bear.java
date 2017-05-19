package Guitar.model;


public abstract class Bear {
     ColorBehavior colorBehavior;
     EatBehavior eatBehavior;
     public Bear(){ 
     }
     public abstract void display();
     public void performColor() {
		colorBehavior.performColor();
	}
     public void performEat() {
 		eatBehavior.performEat();
 	}
     public void setColorBehavior(ColorBehavior cB) {
		colorBehavior=cB;
	}
     public void setEatBehavior(EatBehavior eB) {
 		eatBehavior=eB;
 	}
}
