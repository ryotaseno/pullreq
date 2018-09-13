package takahara;

public class Hagetaka extends Monster implements Bird{

	String name;
	int hp;
	int lv;
	int power;
	
	public Hagetaka() {
		super.setName("ななしさん");
		super.setHp(100);
		super.setLv(1);
		super.setPower(10);
	}

	public void run(){
		System.out.println("禿鷹が走っています。");
	}
	
	
	public void attack(Monster monster) {
		System.out.println("禿鷹が噛みついています。");
		monster.setHp(monster.getHp() - power);
		if(monster.getHp() <= 0) {
			super.dead(monster.getName());
		}else {
			System.out.println(this.name + "の残りHPは" + monster.getHp() + "です。");
		}
	}

	@Override
	void attack(Character character) {
		// TODO 自動生成されたメソッド・スタブ

	}





















}