import java.util.ArrayList;
import java.util.List;

public class Chapter14 {
    public static void main(String[] args) {
        // List型の「party」変数を生成
        // ListやArrayListの後ろに記述されてる「<クラス名>」を「ジェネリクス（総称型）」と呼ぶ
        List<Character> party = new ArrayList<Character>();
        // 「party」コレクションのリストに「add」メソッドで「Soldier」と「Playboy」のインスタンスを追加
        party.add(new Soldier());
        party.add(new Playboy());

        Chapter14.partyAttack(party);
    }

    public static void partyAttack(List<Character> party) {
        // 拡張forループで「party」変数の要素を「Character character」変数に代入
        for (Character character : party) {
            // 「character」変数の「attack」を呼び出す
            int hp = character.attack();
            System.out.println("ヒットポイント：" + hp);
        }
    }
}
