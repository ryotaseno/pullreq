package takahara;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Yatagarasu yatagarasuA = new Yatagarasu("八咫烏A");
		Yatagarasu yatagarasuB = new Yatagarasu("八咫烏B");
		Zombie zombieA = new Zombie("ぞんび");


		zombieA.attack(yatagarasuB);
		zombieA.attack(yatagarasuB);
		zombieA.attack(yatagarasuB);
	}

}
