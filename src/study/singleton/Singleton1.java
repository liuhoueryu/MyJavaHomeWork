package study.singleton;
//����ʽ
public class Singleton1 {
	private static Singleton1 single = new Singleton1();

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		return single;
	}
}
