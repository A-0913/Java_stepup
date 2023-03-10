import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class Main {
	  public static void main(String[] args) throws Exception {
		    List<MyList> list = new ArrayList<>();
		    list.add(new MyList(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
		    list.add(new MyList(LocalDate.of(2021, 9, 15), "○○社面接", false));
		    list.add(new MyList(LocalDate.of(2021, 12, 4), "手帳を買う", true));
		    list.add(new MyList(LocalDate.of(2021, 8, 10), "散髪に行く", false));
		    list.add(new MyList(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

		    // 未完了のタスクの個数を出力
		    long count = list.stream()
		        .filter(t -> !t.isDone())
		        .count();
		    System.out.println(count);

		    // 日付順に並び替えたタスクのリストを生成
		    List<MyList> newList = list.stream()
		        .sorted()
		        .collect(Collectors.toList());
		    newList.forEach(System.out::println);
		  }
}
