


	

class Student_1 {
	//Ŭ���� ����
	static String category = "��������SW����";
	
	// public: �ܺ� Ŭ�������� ���� ����
	// private : �ܺ� Ŭ�������� ���� �Ұ�
	//�ν��Ͻ� ���� 
	private String name;
	private String tel;
	private String email;
	
	// �ν��Ͻ� �޽��
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// getter
	public String getName( ) {
		return name;
	}

	public String getTel( ) {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail( ) {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void showStudentInfo() {
		System.out.println("�̸�: "+ name);
		System.out.println("�̸���: "+ email);
		System.out.println("��ȭ: "+tel);
	}
	
}
