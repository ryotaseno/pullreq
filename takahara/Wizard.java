

package takahara;

public class Wizard extends Character implements Human{

  	public Wizard(String name,int hp,int lv) {
		super.setName(name);
		super.setHp(hp);
		super.setLv(lv);
	}

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

	public void run() {
		System.out.println("魔法使いは走った");
	}

	public Wizard(String name) {
		super.setName(name);
	}

	@Override
	void attack() {
		// TODO 自動生成されたメソッド・スタブ

	}

}

