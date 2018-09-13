package takahara;

public abstract class Weapon {

	private String name;

	private int power;

	public void Throw() {
		System.out.println("武器を投げつける");
	}

	abstract int attack(int hp);

	//name getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//power getter/setter
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}