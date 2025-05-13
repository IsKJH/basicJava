package api.lang;

public abstract class Factory {
	int openHour;
	int closeHour;
	String name;

	public String getFactoryName() {
		return name;
	}

	public int getWorkingTime() {
		return closeHour - openHour;
	}

	public abstract int makeProducts(char skill);

	public Factory(int openHour, int closeHour, String name) {
		super();
		this.openHour = openHour;
		this.closeHour = closeHour;
		this.name = name;
	}

	public int getOpenHour() {
		return openHour;
	}

	public void setOpenHour(int openHour) {
		this.openHour = openHour;
	}

	public int getCloseHour() {
		return closeHour;
	}

	public void setCloseHour(int closeHour) {
		this.closeHour = closeHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
