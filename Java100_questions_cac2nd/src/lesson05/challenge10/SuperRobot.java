package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperRobot {
	double humthin;

	int humsheet;

	/**
	 * 
	 */
	public SuperRobot() {
		System.out.println("生ハムを使ってブルスケッタを作ります。");
		System.out.println("\nお好みの生ハムを教えてください。");
	}

	void getData(double humthin, int humsheet) {
		this.humthin = humthin;
		this.humsheet = humsheet;
	}

	void humCuter() {
		System.out.println("\n" + humthin + "mmの生ハムを" + humsheet + "枚切りました。");
	}

	void finish() {
		System.out.println("\nブルスケッタが" + humsheet + "個できました。");
	}

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		SuperRobot robot = new SuperRobot();

		System.out.print("\n生ハムは何ｍｍにスライスしますか？＞");
		String str = reader.readLine();
		double humthin = Double.parseDouble(str);

		System.out.print("\n生ハムは何枚スライスしますか？＞");
		String num = reader.readLine();
		int humsheet = Integer.parseInt(num);

		robot.getData(humthin, humsheet);
		robot.humCuter();

	}

}
