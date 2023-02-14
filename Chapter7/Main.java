import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {

		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));

		// 10個以下に絞り込まれたリストを作る
		List<Fruit> filtered = new ArrayList<>();
		// 拡張for文でfruitsをループ
		for (Fruit fruit : fruits) {
		  // if文で10個以下に絞る
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
