package entorno;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;


import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

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
		setTitle("suu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 453);
		ventana = new JPanel();
		ventana.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ventana);
		ventana.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(334, 11, 46, 14);
		ventana.add(lblNewLabel);
		
		JButton lupa = new JButton("");
		lupa.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\LUPA (4).jpg"));
		lupa.setBounds(10, 40, 58, 45);
		ventana.add(lupa);
		
		JButton lupa_1 = new JButton("");
		lupa_1.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\mas (3).png"));
		lupa_1.setBounds(78, 40, 58, 45);
		ventana.add(lupa_1);
	
		JPanel panel = new JPanel();
		panel.setBounds(1, 1, 716, 187);
		ventana.add(panel);
		
		JScrollPane scrollPane = new JScrollPane(panel);
		scroll
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		scrollPane.setSize(240, 240);
		scrollPane.setLocation(240, 240);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		ventana.add(scrollPane,BorderLayout.CENTER);
		
	}
}
