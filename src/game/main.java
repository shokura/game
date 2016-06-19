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
	static int lv;// プレイヤーレベル

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//コンソールに入力
		Scanner s = new Scanner(System.in);

		if (s.nextInt() == 0) {
			lv = 30;
		} else {
			lv= 100;
		}

		putJyosyou();// 序章

		if (lv < 40) {
			putGameOver();
		} else {
			putGameClear();
		}
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
