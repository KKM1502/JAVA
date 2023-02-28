package com.test.question;


class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	   //getter, setter ����

	public void info() {
		
		
		System.out.printf("[%s]\n",this.name);
		System.out.printf("- �μ�: %s\n",this.department);
		System.out.printf("- ����: %s\n",this.position);
		System.out.printf("- ����ó: %s\n",this.tel);	
		
		
		if(this.boss!=null) {
			System.out.printf("- ���ӻ��: %s(%s %s)\n", this.boss.getName(),this.boss.getDepartment(),this.boss.getPosition());
		}
		else {
			System.out.printf("- ���ӻ��: ����\n");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<2||name.length()>5) {
			return;

		}
		for (int i = 0; i <name.length(); i++) {
			if(name.charAt(i)<'��'||name.charAt(i)>'�R') {
				return;
			}
		}
		this.name = name;
	
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		
		if(!department.equals("������")&& !department.equals("��ȹ��")&&!department.equals("�ѹ���")&& !department.equals("���ߺ�")&& !department.equals("ȫ����")){
			return;
		}
		
		this.department = department;
		
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if(!position.equals("����")&&!position.equals("����")&&!position.equals("�븮")&&!position.equals("���")) {
			return;	
		}
		this.position = position;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		
		if(tel.indexOf("-")!=3||tel.lastIndexOf("-")!=tel.length()-5) {
			return;
		}
		String temp = tel.replace("-", "");
		for (int i = 0; i < temp.length(); i++) {
			char c = temp.charAt(i);
			if (c<'0' || c>'9') {
				return;	
			}
		}
		
		
		this.tel = tel;
		
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		if(boss==null) {
			return;
		}
		if(this.name.equals(boss.getName())&&this.department.equals(boss.getDepartment())&&this.tel.equals(boss.getTel())){
			return;
		}
		if(!this.department.equals(boss.getDepartment())){
			return;
		}
		this.boss = boss;
		
		
	}
	
}