package takahara;

public abstract class Character extends Life {

	private int lv;
	private String name;
	private Weapon wp;

	abstract void attack();

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon getWp() {
		return wp;
	}

	public void setWeapon(Weapon wp) {
		this.wp = wp;
	}

}