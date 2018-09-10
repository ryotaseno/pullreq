package takahara;

public abstract class Life {

	private int hp;

	public void dead(String name) {
		System.out.println("あなたのペット(" + name + ")が死亡");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
