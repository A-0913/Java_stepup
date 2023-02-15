import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {

		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));

		fruits.stream() // Streamを生成
	    .filter(f -> f.getQuantity() <= 10) // 中間操作1: 個数が10個以下のものを抽出
	    .map(f -> f.order(20)) // 中間操作2: 20個ずつ発注
	    .sorted((f1, f2) -> f1.getQuantity() - f2.getQuantity()) // 中間操作3: 個数の少ない順に並び替え
	    .forEach(System.out::println); // 終端操作: 標準出力
	}

}
