package takahara;

public class Wand extends Weapon{
	public Wand(String name, int power) {
		super(name, power);
	}

	public int attack(int hp) {
		hp -= this.power ;
		System.out.println("d—¢€–S");
		return hp;
	}

}
