package takahara;

public class Hero extends Character implements Human{

	public boolean attack(Monster monster) {

		//武器を持っているかの判定
		if( super.getWp() != null ){
			//持っている武器のattack()を呼び出す
			monster.setHp(super.getWp().attack(monster.getHp()));
			//生存判定
			boolean deadFlag = super.checkDead(monster);
			return deadFlag;
		} else {
			//素手で殴る場合の処理
			System.out.println(super.getName() + "が素手で攻撃しています");
			this.setHp(this.getHp() - 1500);
			//生存判定
			boolean deadFlag = super.checkDead(monster);
			return deadFlag;
		}

	}

	public void run(){
		System.out.println("勇者は走っています");
	}
	//入力がある場合のコンストラクタ
	public Hero(String name, int lv, int hp) {
		super.setHp(hp);
		super.setLv(lv);
		super.setName(name);
	}

	//入力がない場合のコンストラクタ
	public Hero() {
		super.setName("ななしさん");
		super.setHp(100);
		super.setLv(1);
	}

	@Override
	void attack() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
