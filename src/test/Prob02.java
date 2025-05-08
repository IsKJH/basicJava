package test;

public class Prob02 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.print();
		t.power();
		t.print();
		t.channelUp();
		t.channelUp();
		t.print();

	}

}

class Tv {
	private String color;
	private boolean power;
	private int channel;

	public Tv() {
		this.color = "black";
		this.power = false;
		this.channel = 0;
	}

	public void power() {
		setPower(!isPower());
	}

	public void channelUp() {
		setChannel(getChannel() + 1);
	}

	public void channelDown() {
		setChannel(getChannel() - 1);
	}

	public void print() {
		System.out.println("color :" + getColor() + "\t power:" + isPower() + "\t channel:" + getChannel());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

}
