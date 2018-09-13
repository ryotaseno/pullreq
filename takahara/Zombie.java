package takahara;

public class Zombie extends Monster implements Human {

	String name;

	public Zombie(String name) {
		super.setName(name);
		super.setHp(9999);
	}

	public void run(){
		System.out.println("ゾンビが走っています。");
	}

	public void attack(Monster monster) {
		System.out.println("ゾンビが噛みついています。");
		monster.setHp(monster.getHp() - 800);

		if(monster.getHp() <= 0) {
			super.dead(monster.getName());
		}else {
			System.out.println(monster.getName() + "の残りHPは" + monster.getHp() + "です。");
		}
	}

	@Override
	void attack(Character character) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
