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
		System.out.println(super.getName() + "の攻撃");
		monster.setHp(monster.getHp() - 1500);
		if (monster instanceof Zombie){
			//攻撃対象がZombie
			if(monster.getHp() <= -100) {
				monster.dead(monster.getName());
			}else {
				System.out.println(monster.getName() + "の残りHPは" + monster.getHp() + "です。");
			}
		}
		else {
			if(monster.getHp() <= 0) {
				monster.dead(monster.getName());
			}else {
				System.out.println(monster.getName() + "の残りHPは" + monster.getHp() + "です。");
			}
		}
	}

	@Override
	void attack(Character character) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(super.getName() + "の攻撃");
		character.setHp(character.getHp() - 800);

		if(character.getHp() <= 0) {
			super.dead(character.getName());

		}else {
			System.out.println(character.getName() + "の残りHPは" + character.getHp() + "です。");
		}

	}


}
