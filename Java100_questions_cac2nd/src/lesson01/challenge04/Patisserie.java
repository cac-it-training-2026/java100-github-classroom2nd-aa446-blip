/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン       >");
		String citcountstr = br.readLine();
		int citcount = Integer.parseInt(citcountstr);

		System.out.print("ショコラ       >");
		String chocountstr = br.readLine();
		int chocount = Integer.parseInt(chocountstr);

		System.out.print("ピスターシュ   >");
		String piscountstr = br.readLine();
		int piscount = Integer.parseInt(piscountstr);

		System.out.println("\nシトロン     " + citcount + "個");
		System.out.println("ショコラ	 " + chocount + "個");
		System.out.println("ピスターシュ " + piscount + "個");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");
	}

}
