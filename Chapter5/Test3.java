public class Test3 {
	public static void main(String[] args) {

		new Color1() {
			public void write2() {
				System.out.println("黄");
			}
		}.write2(); //黄

		Color1 c1 = new Color1() {
			public void write2() {
				System.out.println("黄");
			}
		};
//		c1.write2(); //この場合だとエラーになる
	}
}