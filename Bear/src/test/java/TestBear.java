import static org.junit.Assert.*;

import org.junit.Test;

import Guitar.model.Bear;
import Guitar.model.BlackWBear;
import Guitar.model.BrownColor;
import Guitar.model.Eatmeat;

public class TestBear {

	@Test
	public void test() {
		
		      Bear blackwBear = new BlackWBear();
		      blackwBear.performColor();
		      blackwBear.performEat();
		      blackwBear.display();
} 
}