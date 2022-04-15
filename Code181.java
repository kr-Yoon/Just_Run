package JustRunJava;

public class Code181 {
  
 public void variableFinal() {

    final int value = 2;
    final Person person = new Person("yoon", 30);

    System.out.println("value = " + value);
    System.out.println("person_1 = " + person);

    // value = 2; // 컴파일 에러
    person.setAge(31);
    person.setName("yoon92kr");

    System.out.println("person_2 = " + person);
    // person = new Person("yoonkr", 100); // 컴파일 에러
  }
  
  class Person {
    
    private String name;
    private int age;

    Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
    
    @Override
    public String toString() {
      return "name : " + name + " age : " + age;
    }
    
    public final void speach() {
      System.out.println("나는" + name + "입니다");
    }
         
    public void setName(String name) {
      this.name = name;
    }
    
    public void setAge(int age) {
      this.age = age;
    }
    
  }
  
}
