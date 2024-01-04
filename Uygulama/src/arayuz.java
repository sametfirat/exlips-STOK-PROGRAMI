import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class arayuz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel genel_panel;
	private JTextField text_ad;
	private JTextField text_pass;
	private dbbaglantı baglan = new  dbbaglantı();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arayuz frame = new arayuz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public arayuz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\samet\\Downloads\\packages.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(new Color(255, 255, 0));
		setResizable(false);
		setTitle("Stok Programı");
		setBounds(100, 100, 526, 426);
		genel_panel = new JPanel();
		genel_panel.setBackground(new Color(0, 0, 51));
		genel_panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(genel_panel);
		genel_panel.setLayout(null);
		
		JLabel lbl_gorsl = new JLabel("");
		lbl_gorsl.setIcon(new ImageIcon("C:\\Users\\samet\\Downloads\\Iconshock-Real-Vista-Security-Monitor.128.png"));
		lbl_gorsl.setBounds(183, 22, 128, 101);
		genel_panel.add(lbl_gorsl);
		
		JPanel panel_giris = new JPanel();
		panel_giris.setBackground(SystemColor.inactiveCaptionBorder);
		panel_giris.setBounds(0, 123, 510, 271);
		genel_panel.add(panel_giris);
		panel_giris.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kulanıcı Adı");
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		lblNewLabel.setBounds(102, 63, 117, 31);
		panel_giris.add(lblNewLabel);
		
		JLabel lblifre = new JLabel("Şifre");
		lblifre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblifre.setBounds(112, 105, 117, 31);
		panel_giris.add(lblifre);
		
		text_ad = new JTextField();
		text_ad.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		text_ad.setBounds(215, 63, 146, 28);
		panel_giris.add(text_ad);
		text_ad.setColumns(10);
		
		text_pass = new JTextField();
		text_pass.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		text_pass.setColumns(10);
		text_pass.setBounds(215, 108, 146, 28);
		panel_giris.add(text_pass);
		
		JButton btn_Giris = new JButton("Giriş Yap");
		btn_Giris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(text_ad.getText().length()==0 || text_pass.getText().length()==0)
				{
					JOptionPane.showMessageDialog(null, "LÜTFEN DOLDURMADAN GECMİYELİM  ","KİMSİN SEN ",JOptionPane.CLOSED_OPTION);
				}
				else
				{
					
					try {
						Connection bag = baglan.dbbaglan();
						Statement st = bag.createStatement();
						ResultSet rs =st.executeQuery("SELECT * FROM kulanıcı");
						while(rs.next())
						{
							if(text_ad.getText().equals(rs.getString("Ad"))&&text_pass.getText().equals(rs.getString("sifre"))) 
							{
								kulanıcı root1 = new kulanıcı();
								root1.setiD(rs.getInt("iD"));
								root1.setSifre(rs.getString("sifre"));
								root1.setKulanıcıAd(rs.getString("Ad"));
								System.out.print(root1.getKulanıcıAd());
							}
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btn_Giris.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn_Giris.setBounds(215, 156, 146, 37);
		panel_giris.add(btn_Giris);
		
		JButton btn_Giris_1 = new JButton("Kayıt Ol");
		btn_Giris_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn_Giris_1.setBounds(215, 211, 146, 37);
		panel_giris.add(btn_Giris_1);
	}
}
