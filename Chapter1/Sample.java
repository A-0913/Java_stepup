public class Sample {

	public static void main(String[] args) {
		Sample1 sample1 = new Sample1();
		Sample1.Sample2 sample2 = sample1.new Sample2();

		System.out.println(sample2.str2);
		sample2.innerExe();

		// System.out.println(sample2.str1);  これは実行出来ない
		// sample2.outerExe(); これも実行出来ない
	}
}

class Sample1 {
	String str1 = "外部クラスのフィールドです。";

	public void outerExe() {
		System.out.println("外部クラスのメソッドを実行しました。");
	}

	class Sample2 {
		String str2 = "内部クラスのフィールドです。";
		public void innerExe() {
			System.out.println("内部クラスのメソッドを実行しました。");
			System.out.println(str1);
			outerExe();
		}
	}
}