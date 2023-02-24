package entorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField descripcion;
	String nom=" ";
	String descripzao=" ";
	pokedex poronga2= new pokedex(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Añadir Pokemon");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 25));
		lblNewLabel.setBounds(248, 11, 243, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Light", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 81, 106, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Imagen:");
		lblNewLabel_1_1.setFont(new Font("Source Serif Pro Light", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(385, 81, 106, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Descripción:");
		lblNewLabel_1_2.setFont(new Font("Source Serif Pro Light", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(10, 116, 106, 24);
		contentPane.add(lblNewLabel_1_2);
		
		nombre = new JTextField();
		nombre.setBounds(81, 85, 283, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		descripcion = new JTextField();
		descripcion.setBounds(108, 120, 256, 113);
		contentPane.add(descripcion);
		descripcion.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stats b= new stats();
				b.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\absiu.png"));
		btnNewButton.setBounds(46, 244, 604, 139);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No me se los stats :(");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pokedex c= new pokedex();
				c.setVisible(true);
				setVisible(false);
				nom= nombre.getText();
				descripzao= descripcion.getText();
				
				poronga2.recibirEntero2(nom,descripzao);
				
			}
		});
		btnNewButton_1.setBounds(160, 394, 383, 30);
		contentPane.add(btnNewButton_1);
	}
	
}
