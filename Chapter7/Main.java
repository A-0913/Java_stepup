// ラムダ式を使わずに処理を実装した場合

// java.utilパッケージをimport
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {

    // ArrayListを生成する
    // List<データ型名> オブジェクト名 = new ArrayList<データ型名>();
		List<Fruit> fruits = new ArrayList<>();

    // リストに要素を追加
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));

		// filteredリストを作る
		List<Fruit> filtered = new ArrayList<>();
		// 拡張for文でfruitsをループ
		for (Fruit fruit : fruits) {
		  // getQuantity():Fruit.javaで設定されたメソッド。
		  // if文で在庫数が10個以下のフルーツを絞る。
		  if (fruit.getQuantity() <= 10) {
		    // if文に該当するフルーツをリストに追加
		    filtered.add(fruit);
		  }
		}
		// orderedリストを作る
		List<Fruit> ordered = new ArrayList<>();
		// 拡張for文:配列やコレクションの全要素に対して、繰り返し処理を行なう制御文
		for (Fruit fruit : filtered) {
			// 在庫数を20個増やしたフルーツをリストに追加する
		  ordered.add(fruit.order(20));
		}
		// orderedリストをComparatorの戻り値の小さい順に並べ替える
		// sortメソッド:配列を昇順にソートする
		// 無名クラスでComparatorを作成
		ordered.sort(new Comparator<Fruit>() {
		  @Override
		  public int compare(Fruit f1, Fruit f2) {
		    return f1.getQuantity() - f2.getQuantity();
		    /* compareメソッド
		    	 順序付けのために2つの引数を比較する。
		    	 最初の引数が2番目の引数より小さい場合は負の整数、両方が等しい場合は0、
		    	 最初の引数が2番目の引数より大きい場合は正の整数を返す。*/
		  }
		});

		// 絞り込んで並べ替えたorderedリストを拡張for文でループしながら出力する
		for (Fruit fruit : ordered) {
		  // 標準出力
		  System.out.println(fruit);
		}

	}
}
