package takahara;

public class Yatagarasu extends Monster implements Bird {

	String name;

	public Yatagarasu(String name) {
		super.setName(name);
		super.setHp(2000);
	}

	public void run(){
		System.out.println("八咫烏が走っています。");
	}

	public void attack(Monster monster) {
		System.out.println("八咫烏が噛みついています。");
		monster.setHp(monster.getHp() - 1500);
		if(monster.getHp() <= 0) {
			super.dead(monster.getName());
		}else {
			System.out.println(monster.getName() + "の残りHPは" + monster.getHp() + "です。");
		}
	}


}
