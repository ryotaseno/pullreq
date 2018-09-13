package takahara;

public abstract class Monster extends Life {
	abstract void attack(Monster monster);

	abstract void attack(Character character);


	private String name;
	private int hp;
	private int lv;
	private int power;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getLv() {
		return hp;
	}

	public void setLv(int lv) {
		this.lv = lv;
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;

}
