package takahara;

public abstract class Monster extends Life {
	abstract void attack(Monster monster);

	abstract void attack(Character character);


	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
