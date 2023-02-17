package entorno;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;


import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import java.awt.Button;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Panel;

public class pokedex extends JFrame {

	private JPanel ventana;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pokedex frame = new pokedex();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public pokedex() {
		setTitle("pokedex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1341, 911);
		ventana = new JPanel();
		ventana.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ventana);
		ventana.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pokedex");
		lblNewLabel.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD, 32));
		lblNewLabel.setBounds(555, 11, 141, 74);
		ventana.add(lblNewLabel);
		
		
		
		JButton lupa = new JButton("");
		lupa.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\LUPA (4).jpg"));
		lupa.setBounds(10, 40, 58, 45);
		ventana.add(lupa);
		
		JButton lupa_1 = new JButton("");
		lupa_1.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\mas (3).png"));
		lupa_1.setBounds(78, 40, 58, 45);
		ventana.add(lupa_1);
		JScrollPane scrollpane=new JScrollPane();
		scrollpane.setViewportBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollpane.setBounds(20,96,629,963);
		ventana.add(scrollpane);
		
		String [] values = new String[] {"charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu"};
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\menu pokedex.png"));
		scrollpane.setColumnHeaderView(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\borde pokemon.png"));
		scrollpane.setRowHeaderView(lblNewLabel_2);
		
		Panel panel = new Panel();
		scrollpane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\Bulbasaur (1).png"));
		lblNewLabel_3.setBounds(10, 5, 47, 72);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("BULBASUR");
		btnNewButton.setBounds(67, 11, 433, 51);
		panel.add(btnNewButton);
		
		JButton btnIvasaur = new JButton("IVYSAUR");
		btnIvasaur.setBounds(67, 94, 433, 51);
		panel.add(btnIvasaur);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\110px-Ivysaur (1).png"));
		lblNewLabel_3_1.setBounds(10, 88, 47, 72);
		panel.add(lblNewLabel_3_1);
		
		JButton btnPokemon = new JButton("POKEMON");
		btnPokemon.setBounds(67, 177, 433, 51);
		panel.add(btnPokemon);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setBounds(10, 171, 47, 72);
		panel.add(lblNewLabel_3_2);
		
		JButton btnPokemon_1 = new JButton("POKEMON");
		btnPokemon_1.setBounds(67, 260, 433, 51);
		panel.add(btnPokemon_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setBounds(10, 254, 47, 72);
		panel.add(lblNewLabel_3_3);
		
		JButton btnPokemon_2 = new JButton("POKEMON");
		btnPokemon_2.setBounds(67, 343, 433, 51);
		panel.add(btnPokemon_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setBounds(10, 337, 47, 72);
		panel.add(lblNewLabel_3_4);
		
		JButton btnPokemon_3 = new JButton("POKEMON");
		btnPokemon_3.setBounds(67, 426, 433, 51);
		panel.add(btnPokemon_3);
		
		JLabel lblNewLabel_3_5 = new JLabel("");
		lblNewLabel_3_5.setBounds(10, 420, 47, 72);
		panel.add(lblNewLabel_3_5);
		
		JList list_1 = new JList();
		list_1.setBounds(648, 99, 498, 962);
		ventana.add(list_1);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
