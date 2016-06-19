/**
 *
 */
package game;

import java.util.Scanner;

/**
 * @author zeru
 *
 */
public class main {

	static String name = "勇者";// 名前
	static int lv = 30;// プレイヤーレベル

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		putJyosyou();// 序章

		putCommand();// 入力

		if (lv < 40) {
			putGameOver();
		} else {
			putGameClear();
		}
	}

	public static void putCommand() {
		System.out.println("1,魔王を倒しにいく");
		System.out.println("2.修行する");
		int c = inputCommand();
		if (c == 1) {
			System.out.println("魔王が現れた！！");
		} else if (c == 2) {
			lv += 5;
			System.out.println("レベルが" + lv + "になった");
			putCommand();
		}
	}

	public static int inputCommand() {
		// コンソールに入力
		Scanner s = new Scanner(System.in);
		//	入力値をint型で格納
		int addLv = s.nextInt();

		if (addLv != 2 && addLv != 1) {
			System.out.println("正しい値を入力してください=" + addLv);
			putCommand();
		}
		return addLv;
	}

	public static void putJyosyou() {
		put("魔王が" + "世界を滅ぼそうとしています");
		put(name + "はレベル" + lv + "のツワモノです");
	}

	public static void putGameOver() {
		put(name + "は魔王をやぶれました");
		put("GAME OVER");
	}

	public static void putGameClear() {

		System.out.println(name + "は魔王を倒しました");
		if (lv > 200) {
			put("レベル" + lv + "なので魔王はゴミでした");
		} else if (lv > 120) {
			put("レベル" + lv + "なので魔王は弱すぎでした");
		} else if (lv > 80) {
			put("レベル" + lv + "なので余裕でした");
		} else if (lv > 50) {
			put("レベル" + lv + "でしたが倒せました");
		} else {
			put("レベル" + lv + "でしたので苦戦しました");
		}
		put("GAME CLEAR");
	}

	/*
	 * 引数で指定された文字列を表示します。
	 *
	 * @param str 表示対象の文字列
	 */
	public static void put(String str) {

		System.out.println(str);
	}
}
