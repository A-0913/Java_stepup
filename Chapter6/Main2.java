import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
		// 数値のリスト Arraysを生成し、配列をリストに変換する
		/* Arrays.asList()メソッド:
		→　asListの()の中に配列を指定することで、指定した配列からリストを作成して返すメソッド
		　[基本構文] Arrays.asList(配列);	*/

		Collections.sort(
		    numbers,
		    (Integer x, Integer y) -> {
		      return Integer.compare(x, y);
		    });

		System.out.println(numbers);
	}
}

/*
《ラムダ式の基本形》
	(引数) -> {処理}

《使用例》
【元のコード】
  public int compare(Integer x, Integer y) {
    return Integer.compare(x, y);
  }

【ラムダ式】
  (Integer x, Integer y) -> {
  	return Integer.compare(x, y);
	};
*/