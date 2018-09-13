package takahara;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeroTest {

	@Test
	public void testHeroString() {
		Hero hero = new Hero("みちこ");
		assertEquals("みちこ", hero.getName());
	}

	@Test
	public void testHero() {
		Hero hero = new Hero();
		assertEquals("ななしさん", hero.getName());
	}

}
