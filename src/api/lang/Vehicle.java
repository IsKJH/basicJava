package api.lang;

public class Vehicle {
	Owner owner;
	int price;

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null | getClass() != obj.getClass()) {
			return false;
		}
		if (obj instanceof Vehicle) {
			Vehicle v = (Vehicle) obj;
			if (this.owner.equals(v.owner)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "소유주정보 : " + owner + "\n차량정보 : 가격은 " + price + "입니다.";
	}

	public Vehicle() {
		super();
	}

	public Vehicle(Owner owner, int price) {
		super();
		this.owner = owner;
		this.price = price;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
