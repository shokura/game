package game;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//part24~
public class part18jFrame {

	public static void main(String[] args) {

		// ウィンドウフレームを作成、表示
		JFrame jf= new JFrame();
		//位置、幅、高さを設定
		jf.setBounds(50,100,300,200);
		jf.setVisible(true);
		//ウィンドウ×ボタンを押すと終了させる
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// パネルを作成し、フレームに貼り付け
		JPanel jp = new JPanel();
		jp.setBackground(Color.BLACK);
		jf.add(jp);

		// ラベルを作成し、パネルを貼り付け
		JLabel jl = new JLabel("魔王が世界を滅ぼそうとしています");
		Font f = new Font(Font.SERIF,Font.BOLD | Font.ITALIC,40);
		jl.setFont(f);
		jl.setForeground(new Color(255,128,0));
		jp.add(jl);

		// パネルを作成し、親パネルに貼り付け
		JPanel jpChild = new JPanel();
		jpChild.setBackground(Color.RED);
		jp.add(jpChild);

		// ラベルを作成し、子パネルに貼り付け
		JLabel jlChild = new JLabel("トンヌラ Lv99 HP999/999");
		jlChild.setFont(f);
		jlChild.setForeground(Color.WHITE);
		jpChild.add(jlChild);

		// 画像つきラベルを作成し、親パネルに貼り付け
		JLabel jlImage = new JLabel(new javax.swing.ImageIcon("img/chibi.png"));
		jlImage.setBounds(0, 0, 24, 36);
		jp.add(jlImage);
	}

}
