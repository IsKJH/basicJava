package api.lang;

public class Owner {
	String name;
	String cellPhone;

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null | getClass() != obj.getClass()) {
			return false;
		}

		if (obj instanceof Owner) {
			Owner o = (Owner) obj;
			if (this.name.equals(o.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "이름은 " + name + "이고, 핸드폰 번호는 " + cellPhone + "입니다.";
	}

	public Owner() {
		super();
	}

	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

}
