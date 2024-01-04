import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class urunler extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					urunler frame = new urunler();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public urunler() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\samet\\Downloads\\packages.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_buton = new JPanel();
		panel_buton.setBounds(10, 11, 98, 239);
		contentPane.add(panel_buton);
		
		JButton btnNewButton_1 = new JButton("Ürün Lİistele");
		panel_buton.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Stoktaki ürünler");
		panel_buton.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Tükenmiş Ürünler");
		panel_buton.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("");
		panel_buton.add(btnNewButton);
		
		JScrollPane scrollPane_urun = new JScrollPane();
		scrollPane_urun.setBounds(118, 11, 306, 239);
		contentPane.add(scrollPane_urun);
		
		JTabbedPane tabbedPane_urun = new JTabbedPane(JTabbedPane.TOP);
		scrollPane_urun.setViewportView(tabbedPane_urun);
	}
}
