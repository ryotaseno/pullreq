package takahara;

public class Sword extends Weapon{
	public Sword() {
		super.setName("銅の剣");
		super.setPower(10000);
	}

	public Sword(String name, int power) {
		super.setName(name);
		super.setPower(power);
	}

	public int attack(int hp) {
		hp -= super.getPower() ;
		System.out.println("slash");
		return hp;
	}

	@Override
	void attack() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
