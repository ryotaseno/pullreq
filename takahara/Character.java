package takahara;

public abstract class Character extends Life {

	private int lv;
	private String name;
	private Weapon wp;
	private int exp;

	abstract void attack();

	public void levelUp() {
		this.setLv(this.getLv() + 1);
		this.setHp(100);
	};

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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}