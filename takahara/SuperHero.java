package takahara;

public class SuperHero extends Hero{

	public SuperHero(String name) {
		super.setName(name);
	}

	public boolean attack(Monster monster) {

		//武器を持っているかの判定
		if( super.getWp() != null ){
			//持っている武器のattack()を呼び出す
			monster.setHp(super.getWp().attack(monster.getHp()));
			System.out.println(super.getName() + "が一回目の武器攻撃しています");
			monster.setHp(super.getWp().attack(monster.getHp()));
			System.out.println(super.getName() + "が二回目の武器攻撃しています");
			//生存判定
			boolean deadFlag = super.checkDead(monster);
			return deadFlag;
		} else {
			//素手で殴る場合の処理
			System.out.println(super.getName() + "が一回目の素手で攻撃しています");
			this.setHp(this.getHp() - 1500);
			System.out.println(super.getName() + "が二回目の素手で攻撃しています");
			this.setHp(this.getHp() - 1500);
			//生存判定
			boolean deadFlag = super.checkDead(monster);
			return deadFlag;
		}

	}
}