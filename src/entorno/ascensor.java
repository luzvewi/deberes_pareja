package entorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ascensor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ascensor frame = new ascensor();
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
	public ascensor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel numPiso = new JLabel("4");
		numPiso.setFont(new Font("Tahoma", Font.BOLD, 15));
		numPiso.setBounds(278, 22, 46, 14);
		contentPane.add(numPiso);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel direccion = new JLabel("Dirección");
		direccion.setFont(new Font("Tahoma", Font.BOLD, 22));
		direccion.setBounds(163, 84, 109, 27);
		contentPane.add(direccion);
		
		JLabel botonGuion = new JLabel("----------");
		botonGuion.setFont(new Font("Tahoma", Font.BOLD, 27));
		botonGuion.setBounds(163, 132, 241, 88);
		contentPane.add(botonGuion);
		
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual= Integer.parseInt(numPiso.getText());
				
				if (pisoactual==1) 
					botonGuion.setText("Estas en ese piso");
				
				else if (pisoactual<1) {
				botonGuion.setText("Subir");
				pisoactual=1;
				numPiso.setText("1");
				
				}
				else {
					botonGuion.setText("Bajar");
				pisoactual=1;
				numPiso.setText("1");
			}
			}
		});
		boton1.setBounds(20, 164, 62, 40);
		contentPane.add(boton1);
		
		
		
		JLabel piso = new JLabel("Piso");
		piso.setFont(new Font("Tahoma", Font.BOLD, 22));
		piso.setBounds(173, 13, 62, 27);
		contentPane.add(piso);
		
		JButton boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual= Integer.parseInt(numPiso.getText());
				
				if (pisoactual==4) 
					botonGuion.setText("Estas en ese piso");
				
				else if (pisoactual<4) {
				botonGuion.setText("Subir");
				pisoactual=4;
				numPiso.setText("4");
				
				}
				
				else {
					botonGuion.setText("Bajar");
					pisoactual=4;
					numPiso.setText("4");
				}
			}
		});
		boton4.setBounds(20, 11, 62, 40);
		contentPane.add(boton4);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual= Integer.parseInt(numPiso.getText());
				
				if (pisoactual==3) 
					botonGuion.setText("Estas en ese piso");
				
				else if (pisoactual<3) {
				botonGuion.setText("Subir");
				pisoactual=3;
				numPiso.setText("3");
				}
				else {
					botonGuion.setText("Bajar");
				pisoactual=3;
				numPiso.setText("3");
			}
			}
			
		});
		boton3.setBounds(20, 62, 62, 40);
		contentPane.add(boton3);
		
		
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
		
				public void actionPerformed(ActionEvent e) {
						int pisoactual= Integer.parseInt(numPiso.getText());
						
						if (pisoactual==2) 
							botonGuion.setText("Estas en ese piso");
						
						else if (pisoactual<2) {
						botonGuion.setText("Subir");
						pisoactual=2;
						numPiso.setText("2");
						}
						
						else { 
							botonGuion.setText("Bajar");
							
							pisoactual=2;
							numPiso.setText("2");
						}
					}
				
		});
		boton2.setBounds(20, 113, 62, 40);
		contentPane.add(boton2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
