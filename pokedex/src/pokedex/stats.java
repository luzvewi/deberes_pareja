package pokedex;

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
import javax.swing.JTextPane;
import java.awt.Color;

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
	public int datoataque,datoataqueSp,datodefensa,datodefensaSp,datovelocidad;
	String nombreS=" ";
	String descripcionS=" ";
	private JTextPane descripcionStats;
	private JTextField nombreStats;
	

	
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

	public stats() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Descripcion:");
		lblNewLabel_6.setBounds(364, 342, 77, 19);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Nombre:");
		lblNewLabel_7.setBounds(361, 317, 46, 14);
		contentPane.add(lblNewLabel_7);
		
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
		
		nombreStats = new JTextField();
		nombreStats.setBackground(new Color(255, 255, 255));
		nombreStats.setEditable(false);
		nombreStats.setColumns(10);
		nombreStats.setBounds(422, 314, 203, 20);
		contentPane.add(nombreStats);
		
		descripcionStats = new JTextPane();
		descripcionStats.setEditable(false);
		descripcionStats.setFont(new Font("Source Code Pro ExtraLight", Font.PLAIN, 12));
		descripcionStats.setBounds(364, 360, 261, 119);
		contentPane.add(descripcionStats);
		
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
				pokedex a= new pokedex();
				
				
				a.setVisible(true);
				setVisible(false);
			datoataque= Integer.parseInt(ataque.getText());
			datoataqueSp= Integer.parseInt(ataqueSp.getText());
			datodefensa= Integer.parseInt(defensa.getText());
			datodefensaSp= Integer.parseInt(defensaSp.getText());
			datovelocidad= Integer.parseInt(Velocidad.getText());
			
			a.Velocidad=datovelocidad;
			a.ataque=datoataque;
			a.defensa=datodefensa;
			a.defensaSp=datodefensaSp;
			a.ataqueSp=datoataqueSp;
			a.nombreP=nombreS;
			a.descripcionP=descripcionS;
			
			
			}
		});
		botonGuardar.setBounds(219, 340, 89, 23);
		contentPane.add(botonGuardar);
		
		JButton Actualizar = new JButton("Actualizar");
		Actualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				descripcionStats.setText(descripcionS);
				nombreStats.setText(nombreS);
			}
		});
		Actualizar.setBounds(448, 480, 112, 23);
		contentPane.add(Actualizar);
		
		
		
		
		
		
		
		
		
	}
	

	public int getDatoataque() {
		return datoataque;
	}

	public void setDatoataque(int datoataque) {
		this.datoataque = datoataque;
	}

	public int getDatoataqueSp() {
		return datoataqueSp;
	}

	public void setDatoataqueSp(int datoataqueSp) {
		this.datoataqueSp = datoataqueSp;
	}

	public int getDatodefensa() {
		return datodefensa;
	}

	public void setDatodefensa(int datodefensa) {
		this.datodefensa = datodefensa;
	}

	public int getDatodefensaSp() {
		return datodefensaSp;
	}

	public void setDatodefensaSp(int datodefensaSp) {
		this.datodefensaSp = datodefensaSp;
	}

	public int getDatovelocidad() {
		return datovelocidad;
	}

	public void setDatovelocidad(int datovelocidad) {
		this.datovelocidad = datovelocidad;
	}	
}
