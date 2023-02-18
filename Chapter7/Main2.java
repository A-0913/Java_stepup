// ラムダ式を使用して処理を実装した場合

// java.utilパッケージをimport
import java.util.ArrayList;
import java.util.List;

public class Main2 {
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

		fruits.stream() // Streamを生成
	    .filter(f -> f.getQuantity() <= 10)
	    // 中間操作1: 個数が10個以下のものを抽出
	    // filter: 要素を条件で絞り込む。絞り込みの条件として、ラムダ式に判定用の関数を渡している。
	    .map(f -> f.order(20))
	    // 中間操作2: 20個ずつ発注
	    // map: 要素を変換する（たとえばStringからDateへ変換など）
	    // 新たに生成された在庫数20が加算済みの Fruit オブジェクトがStreamの中身となる。
	    .sorted((f1, f2) -> f1.getQuantity() - f2.getQuantity())
	    // 中間操作3: 個数の少ない順に並び替え
	    // sorted: 要素を並び替える
	    // 負の値を返すと第1引数のf1が、正の値を返すと第2引数のf2がリストの先頭に来るので、フルーツ（Fruit）の値段（price）の引き算を返している。
	    .forEach(System.out::println);
	    // 終端操作: 標準出力
	    // forEach: 各要素に対し順に処理する
	    // forEachを用いて要素をひとつずつ標準出力する。
	}

}
