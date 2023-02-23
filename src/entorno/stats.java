package entorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class stats extends JFrame {

	private JPanel contentPane;
	private JTextField ataque;
	private JTextField defensa;
	private JLabel lblNewLabel_2;
	private JTextField ataqueSp;
	private JLabel lblNewLabel_3;
	private JTextField defensaSp;
	private JLabel lblNewLabel_4;
	private JTextField Velocidad;
	private JLabel lblNewLabel_5;
	private JButton botonGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stats frame = new stats();
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
	public stats() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\absiu.png"));
		lblNewLabel.setBounds(10, 11, 598, 139);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ataque:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Light", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(29, 205, 68, 19);
		contentPane.add(lblNewLabel_1);
		
		ataque = new JTextField();
		ataque.setBounds(107, 206, 86, 20);
		contentPane.add(ataque);
		ataque.setColumns(10);
		
		defensa = new JTextField();
		defensa.setColumns(10);
		defensa.setBounds(107, 256, 86, 20);
		contentPane.add(defensa);
		
		lblNewLabel_2 = new JLabel("Defensa:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Light", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(29, 255, 77, 19);
		contentPane.add(lblNewLabel_2);
		
		ataqueSp = new JTextField();
		ataqueSp.setColumns(10);
		ataqueSp.setBounds(386, 206, 86, 20);
		contentPane.add(ataqueSp);
		
		lblNewLabel_3 = new JLabel("Ataque Especial:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro Light", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_3.setBounds(240, 205, 136, 19);
		contentPane.add(lblNewLabel_3);
		
		defensaSp = new JTextField();
		defensaSp.setColumns(10);
		defensaSp.setBounds(386, 256, 86, 20);
		contentPane.add(defensaSp);
		
		lblNewLabel_4 = new JLabel("Defensa Especial:");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Light", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_4.setBounds(240, 255, 136, 19);
		contentPane.add(lblNewLabel_4);
		
		Velocidad = new JTextField();
		Velocidad.setColumns(10);
		Velocidad.setBounds(222, 288, 86, 20);
		contentPane.add(Velocidad);
		
		lblNewLabel_5 = new JLabel("Velocidad:");
		lblNewLabel_5.setFont(new Font("Source Serif Pro Light", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_5.setBounds(117, 287, 95, 19);
		contentPane.add(lblNewLabel_5);
		
		botonGuardar = new JButton("Guardar");
		botonGuardar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ventana a= new ventana();
				a.setVisible(true);
				setVisible(false);
				
			}
		});
		botonGuardar.setBounds(179, 340, 89, 23);
		contentPane.add(botonGuardar);
	}

}
