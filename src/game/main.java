/**
 *
 */
package game;

import java.util.Scanner;
/*
 * 次はpart18
 *
 * */
/**
 * @author zeru
 *
 */
public class main {

	static String name = "勇者";// 名前
	static int lv = 30;// プレイヤーレベル
	static int hp = 30;// プレイヤーＨＰ
	static double gold = 50.0; // プレイヤー所持金

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console.putJyosyou();// 序章

		putCommand();// 入力

		if (hp <= 0) {
			return;// ここでプログラムが終了する
		}

		// 魔王を倒しにいく
		if (lv < 40) {
			Console.putGameOver();
		} else {
			Console.putGameClear();
		}
	}

	// コマンド選択
	public static void putCommand() {
		Console.put("1,魔王を倒しにいく");
		Console.put("2.修行する");
		Console.put("3.宿屋に泊まる");
		int c = inputCommand();
		switch (c) {
		case 1:
			Console.put("魔王が現れた！！");
			break;
		case 2:
			syugyou();
			break;
		case 3:
			if (gold >= 10) {
				hp = lv;
				gold -= 10;
			}
			Console.putStatus();
			putCommand();
			break;
		}
	}

	// コンソール入力
	public static int inputCommand() {
		// コンソールに入力
		Scanner s = new Scanner(System.in);
		// 入力値をint型で格納
		int addLv = s.nextInt();

		if (addLv < 1 && addLv > 3) {
			Console.put("正しい値を入力してください=" + addLv);
			putCommand();
		}
		return addLv;
	}

	// 修行
	public static void syugyou() {
		java.util.Random r = new java.util.Random();

		// 敵出現
		int exp = r.nextInt(5) + 1;
		Console.put("敵が" + exp + "匹、現れた");

		String enemy = "  щ(｀ω´щ)";
		String s = "";

		for (int i = 0; i < exp; i++) {
			s = s + enemy;
		}
		Console.put(s);

		// HPを減らす
		int damage = r.nextInt(8);
		hp -= damage;
		Console.putStatus();
		if (hp < 0) {
			hp = 0;
		}
		// レベル上昇
		lv += exp;
		Console.put(name + "は、" + damage + "ポイントのダメージを受けた");
		Console.put("レベルが" + lv + "になった");
		Console.putStatus();
		if (hp == 0) {
			Console.put("GAME OVER");
		} else {
			putCommand();
		}
	}


}
