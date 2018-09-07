package takahara;

public class Yatagarasu extends Monster implements Bird {

	public Yatagarasu() {
		Life life = new Life();
		life.setHp(2000);
	}

	public void run(){
		System.out.println("八咫烏が走っています。");
	}

	public void attack(Monster monster) {
		System.out.println("八咫烏が噛みついています。");
		monster.setHp(monster.getHp() - 1500);
		if(monster.getHp() <= 0) {
			life.dead();
		}else {
			system.out.println(this.name + "の残りHPは" + monster.getHp() + "です。");
		}
	}

}
