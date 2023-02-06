// コレクションフレームワークのimport 宣言
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");

		Collections.sort(
			    animals,
			    new Comparator<String>() {
			    // 「Collections.sort(リスト ,コンパレータ )」メソッドの第2引数として匿名クラス(new Comparator<String>()以降)を宣言
			      @Override
			      public int compare(String x, String y) {
			        // 2つのIntegerオブジェクトを数値的に比較する
			        return x.compareTo(y);
			        // compareToメソッドの基本構文:変数1.compareTo(変数2)
			        /* 【実行結果】
			         負値 : 変数1 < 変数2
			         0 : 変数1と変数2が等しい
			         正値 : 変数1 > 変数2
			        */
			      }
			    });

		System.out.println(animals);
	}

}