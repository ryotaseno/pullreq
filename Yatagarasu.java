package takahara;

public class Yatagarasu extends Monster implements Bird {

	public void run(){
		System.out.println("八咫烏が走っています。");
	}

	public void attack() {
		System.out.println("八咫烏がつついています。");
	}

}
