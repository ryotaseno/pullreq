package takahara;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Yatagarasu yatagarasuA = new Yatagarasu("八咫烏A");
		Yatagarasu yatagarasuB = new Yatagarasu("八咫烏B");
		Zombie zombieA = new Zombie("ゾンビA");

		Hero huji = new Hero("藤井先生");
		Wizard ito = new Wizard("伊藤先生");

		huji.attack(yatagarasuB);
		//hujiが剣を装備する処理を書く
		Sword sword = new Sword();
		huji.setWeapon(sword);
		if(huji.getWp == null) {
			//武器を装備できた場合
			System.out.println("藤井先生は武器を装備できませんでした");
		}else {
			//武器を装備できなかった場合
			System.out.println("藤井先生は武器を装備できました。");
		}
		//伊藤先生が死ぬまで攻撃する処理を書く
		while(true) {
			if(huji.getWp == null) {
				//素手で殴る
				huji.attack(yatagarasuB);
			}else {
				//剣で殴る
				huji.attack(yatagarasuB.getHp());
			}

			//ゾンビが伊藤先生を殴る
			zombieA.attack(ito);
			if(ito.getHp <= 0) {
				System.out.println("伊藤先生が死にました。");
				break;
			}
		}

		//zombieA.attack(yatagarasuB);
		//zombieA.attack(yatagarasuB);
		//zombieA.attack(yatagarasuB);
	}

}