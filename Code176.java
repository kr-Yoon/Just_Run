package JustRunJava;

import java.util.function.Consumer;

// 람다식 내 사용되는 지역변수는 final이 붙지않아도 상수로 간주된다.
// 람다식으로 선언된 변수명은 중복될 수 없다.

// 

import java.util.function.Function;
import java.util.function.Supplier;

public class Code176 {

    // Supplier<T> : 매개변수 없이 반환값만 갖는 인터페이스.
    // T get();
    Supplier<String> supplier = () -> "Hello World";
    System.out.println(supplier.get());

    // Consumer<T> : 객체 T를 매개변수로 받아 사용하며, 반환값은 없는 인터페이스.
    // void accept(T t);
    Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
    consumer.andThen(System.out::println).accept("Hello World");

   
    // Function<T, R> : 객체 T를 매개변수로 받아, 함수수행 후 R로 반환하는 인터페이스.
    Function<String, Integer> function = str ->  str.length();
    function.apply("Hello World");
    
    



}
