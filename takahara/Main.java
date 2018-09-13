package takahara;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Yatagarasu yatagarasuA = new Yatagarasu("八咫烏A");
		Yatagarasu yatagarasuB = new Yatagarasu("八咫烏B");
		Zombie zombieA = new Zombie("ゾンビA");

		Hero huji = new Hero("藤井先生", 1, 100);
		Wizard ito = new Wizard("伊藤先生");

		huji.attack(yatagarasuB);
		//hujiが剣を装備する処理を書く
		Sword sword = new Sword();
		huji.setWeapon(sword);

		boolean deadFlag = false;
		while(deadFlag == false) {
			deadFlag = huji.attack(yatagarasuA);

			//ゾンビが伊藤先生を殴る
			//zombieA.attack(ito);
			if(ito.getHp() <= 0) {
				System.out.println("伊藤先生が死にました。");
				break;
			}
		}
	}

}