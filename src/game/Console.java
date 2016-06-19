package game;

public class Console {
	// 序章
	public static void putJyosyou() {
		put("魔王が" + "世界を滅ぼそうとしています");
		putStatus();
	}

	// ステータス
	public static void putStatus() {
		put("------------------------------");
		put("　" + main.name + "　Ｌｖ" + main.lv + "　ＨＰ" + main.hp + "　" + main.gold + "Ｇ");
		put("------------------------------");
	}

	// ゲームオーバー
	public static void putGameOver() {
		put(main.name + "は魔王にやぶれました");
		put("GAME OVER");
	}

	// ゲームクリア
	public static void putGameClear() {

		put(main.name + "は魔王を倒しました");
		if (main.lv > 200) {
			put("レベル" + main.lv + "なので魔王はゴミでした");
		} else if (main.lv > 120) {
			put("レベル" + main.lv + "なので魔王は弱すぎでした");
		} else if (main.lv > 80) {
			put("レベル" + main.lv + "なので余裕でした");
		} else if (main.lv > 50) {
			put("レベル" + main.lv + "でしたが倒せました");
		} else {
			put("レベル" + main.lv + "でしたので苦戦しました");
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
