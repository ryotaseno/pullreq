package takahara;

public class Zombie extends Monster implements Human {

	String name;

	public Zombie(String name) {
		super.setName(name);
		super.setHp(9999);
		spuer.setExp(60);
	}

	public void run(){
		System.out.println("ゾンビが走っています。");
	}


	//Characterへの攻撃
	public void attack(Character character) {
		System.out.println(super.getName() + "の攻撃");
		character.setHp(character.getHp() - 800);

		if(character.getHp() <= 0) {
			super.dead(character.getName());

		}else {
			System.out.println(character.getName() + "の残りHPは" + character.getHp() + "です。");
		}
	}

	//Monsterへの攻撃
	public void attack(Monster monster) {
		System.out.println(super.getName() + "の攻撃");
		monster.setHp(monster.getHp() - 800);
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

}
