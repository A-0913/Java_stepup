import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1); // OK
		set.add("Two"); // ()内の型がIntegerではないためコンパイルエラー

    // Set：重複のない要素を管理するコレクション
    //      重複した要素を保持することができず、要素の順番も保証されない。

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro"); // OK
		map.put(2, "Hanako"); // OK
		int value = map.get(0); // ()内の型がInteger, Stringではないためコンパイルエラー

		// Map: 「キー」と「値」の組み合わせで要素を管理するコレクション
    //  1つの「キー」に対して、1つの「値」が存在するため、「キー」は重複して保持することができない。
    // 「値」は、重複して保持することができる。追加した要素の順番は保証されない。
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


