// 内部クラスと外部クラスの関係性
// 内部クラスは、外部クラスのフィールドを直接参照することができる

public class Outer {

  // 外部クラスに定義したフィールドgreeting
  private String greeting = "こんにちは";

  public class Inner {

    public String hello() {
      // 内部クラスInnerから、外部クラスOuterのフィールドgreetingを参照
      // private なフィールドも内側からであれば参照参照することができる
      return greeting;
    }
  }
}