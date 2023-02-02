import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1); // OK
		set.add("Two"); // コンパイルエラー

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro"); // OK
		map.put(2, "Hanako"); // OK
		int value = map.get(0); // コンパイルエラー
	}
}

// Javaのジェネリクス（Generics・総称型）とは?
// 宣言時に<〜>で囲むことで型を指定できる機能を「ジェネリクス」と呼ぶ
// ジェネリクスとして<〜>で囲んだ指定部分（この場合はString）を型パラメータと呼ぶ

