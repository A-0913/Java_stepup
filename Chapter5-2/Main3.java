// コレクションフレームワークのimport宣言
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
		// 数値のリスト Arraysを生成し、配列をリストに変換する

		/* Arrays.asList()メソッド:
				→asListの()の中に配列を指定することで、指定した配列からリストを作成して返すメソッド
			 [基本構文] Arrays.asList(配列);	*/

		Collections.sort(
	    numbers,
	    new Comparator<Integer>() {
	    // 「Collections.sort(リスト ,コンパレータ )」メソッドの第2引数として匿名クラス(new Comparator<String>()以降)を宣言
	      @Override
	      public int compare(Integer x, Integer y) {
	      	// 2つのint値を数値的に比較するメソッド。
	        return Integer.compare(x, y);
	      }
	    });

			System.out.println(numbers);
			//リストの内容を表示する
	}

}

/*
【Comparatorクラスとは】
  java.utilパッケージに存在するクラスでリストなどコレクションをソートする際にソートの定義を行うインターフェース
【Comparatorクラスの使い方】
  Comparator<T> 変数 = new Comparator<T>() {
    @Override
    public int compare(T o1, T o2) {
      return 戻り値;
    }
  };
  →compareメソッドの引数には比較対象の最初のオブジェクトと２番目のオブジェクトを設定し、戻り値には数値を返す
  →最初の引数が2番目の引数より小さい場合は負の整数、両方が等しい場合は0、最初の引数が2番目の引数より大きい場合は正の整数を戻す
*/