package lesson13_14.challenge03.Nurserry.logic;

public class NurseySchoolChild {

	private String name;

	public NurseySchoolChild(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void Play() {
		System.out.println("遊ぶよ～。");
	}

}
