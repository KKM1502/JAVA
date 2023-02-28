package com.test.question;


class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	   //getter, setter 备泅

	public void info() {
		
		
		System.out.printf("[%s]\n",this.name);
		System.out.printf("- 何辑: %s\n",this.department);
		System.out.printf("- 流困: %s\n",this.position);
		System.out.printf("- 楷遏贸: %s\n",this.tel);	
		
		
		if(this.boss!=null) {
			System.out.printf("- 流加惑荤: %s(%s %s)\n", this.boss.getName(),this.boss.getDepartment(),this.boss.getPosition());
		}
		else {
			System.out.printf("- 流加惑荤: 绝澜\n");
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
			if(name.charAt(i)<'啊'||name.charAt(i)>'芌') {
				return;
			}
		}
		this.name = name;
	
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		
		if(!department.equals("康诀何")&& !department.equals("扁裙何")&&!department.equals("醚公何")&& !department.equals("俺惯何")&& !department.equals("全焊何")){
			return;
		}
		
		this.department = department;
		
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if(!position.equals("何厘")&&!position.equals("苞厘")&&!position.equals("措府")&&!position.equals("荤盔")) {
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