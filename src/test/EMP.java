package test;

public class EMP {
	private String id;
	private String name;
	private int baseSalary;

	public EMP() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalry(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getSalary(double bonus) {
		return getBaseSalary() + (double) getBaseSalary() * bonus;

	}

	public String toString() {
		return getName() + "(" + getId() + ")" + " 사원의 기본급은 " + getBaseSalary() + "원 입니다.";
	}
}
