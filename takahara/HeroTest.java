package takahara;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeroTest {

	@Test
	public void test() {
		Hero hero = new Hero();
		assertEquals("ななし",hero.getName());
	}

}
