package takahara;

public class Wand extends Weapon{
	public Wand() {
		super.setName("木の棒");
		super.setPower(10000);
	}

	public Wand(String name, int power) {
		super.setName(name);
		super.setPower(power);
	}

	public int attack(int hp) {
		hp -= super.getPower() ;
		System.out.println("fire");
		return hp;
	}

	@Override
	void attack() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
