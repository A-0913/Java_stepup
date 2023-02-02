import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1); // OK
		set.add("Two"); // ()内の型がIntegerではないためコンパイルエラー

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro"); // OK
		map.put(2, "Hanako"); // OK
		int value = map.get(0); // ()内の型がInteger, Stringではないためコンパイルエラー
	}
}

// Javaのジェネリクス（Generics・総称型）とは?
// 宣言時に<〜>で囲むことで型を指定できる機能を「ジェネリクス」と呼ぶ
// ジェネリクスとして<〜>で囲んだ指定部分（この場合はIntegerやString）を型パラメータと呼ぶ
// なお、慣習的に、型パラメータにはT（Type）・E（Element）・K（Key）、V（Value）など、大文字の英字1文字を用いることが多い

// ジェネリクスを使うメリット
// 1.さまざまな型を入れられるものに対して型を限定できる
// 2.何の型を扱っているのかがわかりやすい
// 3.データ型の不一致による実行時エラーを防げる