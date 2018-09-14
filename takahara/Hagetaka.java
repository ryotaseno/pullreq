package takahara;

public class Hagetaka extends Monster implements Bird{

	String name;
	int hp;

	public Hagetaka() {
		super.setName("ななしさん");
		super.setHp(100);

	}

	public void run(){
		System.out.println("禿鷹が走っています。");
	}


	public void attack(Monster monster) {
		System.out.println("禿鷹が噛みついています。");
		monster.setHp(monster.getHp() - 2000);
		if(monster.getHp() <= 0) {
			super.dead(monster.getName());
		}else {
			System.out.println(this.name + "の残りHPは" + monster.getHp() + "です。");
		}
	}


	void attack(Character character){
		System.out.println("禿鷹が噛みついています。");
		character.setHp(character.getHp() - 2000);
		if(character.getHp() <= 0) {
			super.dead(character.getName());
		}else {
			System.out.println(this.name + "の残りHPは" + character.getHp() + "です。");
		}
	}

	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ

	}





















}