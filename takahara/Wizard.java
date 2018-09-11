package takahara;

public class Wizard extends Character implements Human{

	public void attack(Monster monster) {

		System.out.println("魔法使いは素手で攻撃を行った");

		monster.setHp(monster.getHp() - 800);
		if(monster.getHp() <= 0) {
			super.dead(monster.getName());
		}else {
			System.out.println(monster.getName() + "の残りHPは" + monster.getHp() + "です。");
		}
	}


	public void run() {
		System.out.println("魔法使いは走った");
	}

}
