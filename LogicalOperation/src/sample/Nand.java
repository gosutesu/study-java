package sample;

/**
 * 否定論理積
 */
public class Nand {

	public static void main(String[] args) {
		System.out.println(!(true && true));
		System.out.println(!(true && false));
		System.out.println(!(false && true));
		System.out.println(!(false && false));
	}
}
