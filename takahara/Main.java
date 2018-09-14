

package takahara;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Yatagarasu yatagarasuA = new Yatagarasu("八咫烏A");
		Yatagarasu yatagarasuB = new Yatagarasu("八咫烏B");
		Zombie zombieA = new Zombie("ゾンビA");

		Hero huji = new Hero("藤井先生",1,100);
		Wizard ito = new Wizard("伊藤先生",1,100);

		huji.attack(yatagarasuB);
		//hujiが剣を装備する処理を書く
		Sword sword = new Sword();
		huji.setWeapon(sword);

		//藤井先生が八咫烏を殴る
		huji.attack(yatagarasuB);

		//伊藤先生がゾンビが死ぬまで殴る
		while(true) {
		if(ito.attack(zombieA))break;
		}
		//レベルアップの関数を呼び出す

		SuperHero hujiwara = new SuperHero("藤原",1,100);

		hujiwara.attack(huji);


	}

