
package takahara;

public abstract class Character extends Life {

	private int lv;
	private String name;

	private Weapon wp;

	private int power;

	private int exp;


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
		System.out.println("武器を装備した");
	}


	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	//生存判定
	public boolean checkDead(Monster monster) {
		if( this.getHp() <= 0 ) {
			super.dead(monster.getName());
			setExp(monster.getExp() + getExp());
			if( getExp() >= 100 ){
				levelUp();
				setExp(0);
			}
			return true;
		} else {
			System.out.println(this.getName() + "ののこりHPは" + this.getHp() + "です。");
			return false;
		}
	}

	public void levelUp() {
		this.setLv(this.getLv() + 1);
		this.setHp(100);
	};

}
