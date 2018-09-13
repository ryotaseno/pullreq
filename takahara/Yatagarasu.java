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

		//生存判定
		if(monster.getHp() <= 0) {
			super.dead(monster.getName());
		}else {
			System.out.println(this.name + "の残りHPは" + monster.getHp() + "です。");
		}
	}

	@Override
	//八咫烏ががキャラクターに攻撃する
	void attack(Character character) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("八咫烏が攻撃しています");
		character.setHp(character.getHp() - 1500);

		//生存判定
		if( character.getHp() <= 0 ) {
			super.dead(this.getName());
		} else {
			System.out.println(character.getName() + "ののこりHPは" + character.getHp() + "です。");
		}
	}

	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ

	}


}
