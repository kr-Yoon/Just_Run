
package JustRunJava;

public class Code179 {
  
  // name과 같은 강제연결은 해당 Interface를 구현한 클래스에서 정의한 이름을 찾는다 ( @Service("member2") )
  
  @Autowired
  @Qualifier("member1")
  private Member member;
  
  @Resource(name="member2")
  private Member member;
  
  @Inject
  private Member member;


}
