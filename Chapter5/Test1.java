public class Test1 {
	public static void main(String[] args) {

		new Color1() {
		}.write1(); //赤

		Color1 c1 = new Color1() {
		};
		c1.write1(); //赤

	}
}