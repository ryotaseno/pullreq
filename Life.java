package takahara;

public abstract class Life {

	private int hp;

	public void dead() {
		System.out.println("あなたは死にました。");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
