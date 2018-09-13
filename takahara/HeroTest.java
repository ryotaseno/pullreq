package takahara;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeroTest {

	@Test
<<<<<<< HEAD
	public void testHeroString() {
		Hero hero = new Hero("みちこ");
		assertEquals("みちこ", hero.getName());
	}

	@Test
	public void testHero() {
		Hero hero = new Hero();
		assertEquals("ななしさん", hero.getName());
=======
	public void test() {
		Hero hero = new Hero();
		assertEquals("ななし",hero.getName());
>>>>>>> seno3
	}

}
