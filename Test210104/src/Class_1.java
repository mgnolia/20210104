
public class Class_1 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.email = "hong@naver.com";
		s.tel = "010-1234-1123";
		
		System.out.println("�̸�: "+ s.name);
		System.out.println("�̸���: "+ s.email);
		System.out.println("��ȭ: "+s.tel);
		System.out.println("����: "+ Student.category);
		
		Student ss = new Student();
		ss.name = "�ֱ浿";
		ss.email = "choi@naver.com";
		ss.tel = "010-1234-2223";
		System.out.println("�̸�: "+ ss.name);
		System.out.println("�̸���: "+ ss.email);
		System.out.println("��ȭ: "+ ss.tel);
		System.out.println("����: "+ Student.category);
	}	
	

}

// �ּҷ� Ŭ���� ����
class Student {
	//Ŭ���� ����
	static String category = "��������SW����";
	
	// public: �ܺ� Ŭ�������� ���� ����
	// private : �ܺ� Ŭ�������� ���� �Ұ�
	//�ν��Ͻ� ���� 
	String name;
	String tel;
	String email;
}