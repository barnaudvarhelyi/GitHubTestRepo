public class Main {
  
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static void greet(String name, String name2) {
    System.out.println("Greetings for the" + name2);
  }

  public static void horoscope(String scorpion, Integer age) {
    System.out.println(scorpion + age + "");
  }

  public static void cheer() {
    String cheerMessage = "Long live the ";
    String greetingMessage = "FoxBuy!!!";
    System.out.println(cheerMessage + greetingMessage);

    System.out.println("Cheer for the" + greetingMessage);
  }


  public static void count(int age, String developerName) {
    System.out.println(age + " years");
    System.out.println(developerName + age);
  }
}