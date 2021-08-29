package JustRunJava;
	//switch 선택문, switch(변수) {case1 변수의 값이 case1이면 수행}....default 지정한 값이 모두 충족하지 않을경우...break }
	//switch 선택문은 변수값과 같은 case로 바로 분기하기에 처리속도가 훨씬 빠르다.
	//산출하고자 하는 값이 정확할경우 사용하는것이 좋을것같다.
public class Code024 {

	public static void main(String[] args) {
		int score = 80;
		char grade;
		
		switch(score) {
		case 90:
			grade = 'A';
			break;	//break문을 넣지않으면 충족 값 이후 모든 코드를 수행해버리기에 반드시 필수조건이다.
		case 80:
			grade = 'B';
			break;
		case 70:
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
		}
		System.out.println("grade : "+grade);
		
	}
}
