package entorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	String nom=" ";
	String descripzao=" ";
	pokedex poronga2= new pokedex(); 
	private JTextField descripcion;

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
		
		descripcion = new JTextField();
		descripcion.setBounds(104, 120, 260, 111);
		contentPane.add(descripcion);
		descripcion.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(81, 85, 283, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Añadir Pokemon");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 25));
		lblNewLabel.setBounds(226, 11, 243, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setBounds(451, 85, 243, 146);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("insertar imagen");
		btnNewButton.setBounds(439, 394, 211, 30);
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads"));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnNewButton) {
                    JFileChooser chooser = new JFileChooser();
                    chooser.showOpenDialog(null);
                    File file = chooser.getSelectedFile();
                    String filename = file.getAbsolutePath();
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_DEFAULT));
                    lblNewLabel_1.setIcon(imageIcon);
                }
            }
        });
        contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Light", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 81, 106, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Imagen:");
		lblNewLabel_1_1.setFont(new Font("Source Serif Pro Light", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(385, 81, 106, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Descripción:");
		lblNewLabel_1_2.setFont(new Font("Source Serif Pro Light", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(10, 116, 106, 24);
		contentPane.add(lblNewLabel_1_2);
		
		
		
		JButton btnNewButton2 = new JButton("");
		btnNewButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stats b= new stats();
				b.setVisible(true);
				setVisible(false);
				pokedex d= new pokedex();
				nom= nombre.getText();
				descripzao= descripcion.getText();
				
				d.nombreP=nom;
				d.descripcionP=descripzao;
			}
		});
		btnNewButton2.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\absiu.png"));
		btnNewButton2.setBounds(46, 244, 604, 139);
		contentPane.add(btnNewButton2);
		
		JButton btnNewButton_1 = new JButton("No me se los stats :(");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pokedex c= new pokedex();
				c.setVisible(true);
				setVisible(false);
				nom= nombre.getText();
				descripzao= descripcion.getText();
				
				c.nombreP=nom;
				c.descripcionP=descripzao;
				
			}
		});
		btnNewButton_1.setBounds(46, 394, 383, 30);
		contentPane.add(btnNewButton_1);
		
		
	}
}
