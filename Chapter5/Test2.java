public class Test2 {
	public static void main(String[] args) {

		new Color1() {
			@Override
			public void write1() {
				System.out.println("黄");
			}
		}.write1(); //黄
	}
}