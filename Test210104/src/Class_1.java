
public class Class_1 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.email = "hong@naver.com";
		s.tel = "010-1234-1123";
		
		System.out.println("이름: "+ s.name);
		System.out.println("이메일: "+ s.email);
		System.out.println("전화: "+s.tel);
		System.out.println("과정: "+ Student.category);
		
		Student ss = new Student();
		ss.name = "최길동";
		ss.email = "choi@naver.com";
		ss.tel = "010-1234-2223";
		System.out.println("이름: "+ ss.name);
		System.out.println("이메일: "+ ss.email);
		System.out.println("전화: "+ ss.tel);
		System.out.println("과정: "+ Student.category);
	}	
	

}

// 주소록 클래스 정의
class Student {
	//클래스 변수
	static String category = "통합응용SW과정";
	
	// public: 외부 클래스에서 접근 가능
	// private : 외부 클래스에서 접근 불가
	//인스턴스 변수 
	String name;
	String tel;
	String email;
}