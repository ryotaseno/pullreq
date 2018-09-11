package takahara;

public class Sword extends Weapon{
	public Sword(String name, int power) {
		super(name, power);
	}

	public int attack(int hp) {
		hp -= this.power ;
		System.out.println("slash");
		return hp;
	}

}
