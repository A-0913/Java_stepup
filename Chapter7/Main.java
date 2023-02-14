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

		// 在庫数が10個以下に絞り込まれた要素を入れるfilteredリストを作る
		List<Fruit> filtered = new ArrayList<>();
		// 拡張for文でfruitsをループ
		for (Fruit fruit : fruits) {
		  // if文で10個以下に絞る
		  // getQuantity():Fruit.javaで設定されたメソッド。在庫数を返す。
		  if (fruit.getQuantity() <= 10) {
		    // 絞り込まれたリストに追加
		    filtered.add(fruit);
		  }
		}
		// 20個ずつ追加する
		List<Fruit> ordered = new ArrayList<>();
		for (Fruit fruit : filtered) {
		  ordered.add(fruit.order(20));
		}
		// 個数が少ない順に並べ替える
		ordered.sort(new Comparator<Fruit>() {
		  @Override
		  public int compare(Fruit f1, Fruit f2) {
		    return f1.getQuantity() - f2.getQuantity();
		  }
		});

		// 絞り込んで並べ替えたリストを拡張for文でループしながら出力する
		for (Fruit fruit : ordered) {
		  // 標準出力
		  System.out.println(fruit);
		}

	}
}
