public class practice {

	public static void main(String[] args) {
    Human human = new Human();
    Human.HumanLeg leg = human.new HumanLeg();
    leg.kick();
	}

	 public static class Human {

    public class HumanLeg {
      public void kick() {
        System.out.println("蹴る");
      }
    }
  }

}