package oop.polymorphism.chap07;

public class Video extends Content {
	private String genre;

	@Override
	public void totalPrice() {
		if (genre.equals("new")) {
			setPrice(2000);
		} else if (genre.equals("comic")) {
			setPrice(1500);
		} else if (genre.equals("child")) {
			setPrice(1000);
		} else {
			setPrice(500);
		}
	}

	public Video() {
		super();
	}

	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
