package takahara;

public class Zombie extends Monster implements Human {

	String name;

	public Yatagarasu(String name) {
		this.name = name;
		Life life = new Life();
		life.setHp(9999);
	}

	public void run(){
		System.out.println("ゾンビが走っています。");
	}

	public void attack(Monster monster) {
		System.out.println("ゾンビが噛みついています。");
		monster.setHp(monster.getHp() - 800);
		if(monster.getHp() <= 0) {
			life.dead();
		}else {
			system.out.println(this.name + "の残りHPは" + monster.getHp() + "です。");
		}
	}

}
