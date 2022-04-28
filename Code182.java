@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SafeVarargs {
}

//@Target
// Annotaion의 적용 범위는 Target에 따라 달라지게 됩니다. 오직 메소드에서 사용될 수도 있고 생성자 및 필드 선언에 사용될 수 있습니다. Target annotation 종류는 8개 있습니다.

//@Retention
// Retention annotation을 사용하여 프로그램 lifecycle에서 annotation이 적용되는 위치를 지정합니다.
// 3가지 정책이 존재하고 각 구성에 대한 이해가 필요합니다.
// RetentionPolicy.SOURCE : 컴파일 이후 컴파일러에 의해 삭제됩니다.
// RetentionPolicy.CLASS : 컴파일러에 의해 클래스 파일에 기록되지만 런타임까지 유지되지 않기 때문에 리플렉션을 이용하여 어노테이션의 정보를 얻을 수 없습니다.
// RetentionPolicy.Runtime : 클래스 파일에도 어노테이션 정보가 기록되고 런타임 시에 리플렉션을 이용해서 어노테이션 정보를 얻을 수 있습니다.
// 참조(https://nesoy.github.io/articles/2018-04/Java-Annotation)

// @Documented
// 문서에 어노테이션 정보가 표기됩니다.


// @Inherited
// 자식 클래스가 어노테이션을 상속받도록 합니다.


// @Repeatable
// java8부터 지원하며, 동일한 선언에 annotation을 두번 이상 적용할 수 있도록 합니다.

@Inherited // 상속
@Documented // 문서화
@Retention(RetentionPolicy.RUNTIME)     // 런타임까지 유지
@Target({
        ElementType.PACKAGE,        // 패키지 선언 시
        ElementType.TYPE,       // 타입 선언 시
        ElementType.CONSTRUCTOR,        // 생성자 선언 시
        ElementType.FIELD,      // 클래스 멤버변수 선언 시
        ElementType.METHOD,     // 메소드 선언 시
        ElementType.ANNOTATION_TYPE,        // 어노테이션 타입 선언 시
        ElementType.LOCAL_VARIABLE,     // 지역변수 선언 시
        ElementType.PARAMETER,      // 매개변수 선언 시
        ElementType.TYPE_PARAMETER,     // 매개변수 타입 선언 시
        ElementType.TYPE_USE        // 타입 사용 시
})
public @interface TodayAnnotation {
    public enum DAY{
        MON, TUE, WED,TUR,FRI,SAT,SUN
    }

    String today() default "SUN";
    int count() default 7;
    DAY getday() default DAY.SUN;
}
