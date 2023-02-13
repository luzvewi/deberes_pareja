package entorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class maquinaExprendedora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maquinaExprendedora frame = new maquinaExprendedora();
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
	public maquinaExprendedora() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Precio = new JLabel("0");
		Precio.setFont(new Font("Tahoma", Font.BOLD, 60));
		Precio.setBounds(420, 28, 238, 58);
		contentPane.add(Precio);
		
		JLabel Mensaje = new JLabel("0");
		Mensaje.setFont(new Font("Tahoma", Font.BOLD, 40));
		Mensaje.setBounds(253, 118, 545, 73);
		contentPane.add(Mensaje);
		
		JLabel simbolo = new JLabel("€");
		simbolo.setFont(new Font("Tahoma", Font.BOLD, 50));
		simbolo.setBounds(583, 32, 75, 58);
		contentPane.add(simbolo);
		
		JButton moneda2 = new JButton("2€");
		moneda2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Float precioactual= Float.parseFloat(Precio.getText());
				
				double b= precioactual-(2);
				
				String a =String.valueOf(b);

				Precio.setText(a);
				
				if(b>=0.5)
					Mensaje.setText("te falta dinero  ");
				else if(b==0)
					Mensaje.setText("esta todo pagado  ");
				else
					Mensaje.setText("te has pasado de dinero ");
			}
		});
		moneda2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		moneda2.setBounds(707, 296, 115, 45);
		contentPane.add(moneda2);
		
		JButton moneda1 = new JButton("1€");
		moneda1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Float precioactual= Float.parseFloat(Precio.getText());
				
				double b= precioactual-(1);
				
				String a =String.valueOf(b);

				Precio.setText(a);
				
				if(b>=0.5)
					Mensaje.setText("te falta dinero  ");
				else if(b==0)
					Mensaje.setText("esta todo pagado  ");
				else
					Mensaje.setText("te has pasado de dinero  ");
			}
		});
		moneda1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		moneda1.setBounds(707, 352, 115, 45);
		contentPane.add(moneda1);
		
		JButton moneda5cents = new JButton("0,5€");
		moneda5cents.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Float precioactual= Float.parseFloat(Precio.getText());
				
				double b= precioactual-(0.5);
				
				String a =String.valueOf(b);

				Precio.setText(a);
				
				if(b>=0.5)
					Mensaje.setText("te falta dinero ");
				else if(b==0)
					Mensaje.setText("esta todo pagado ");
				else
					Mensaje.setText("te has pasado de dinero");
			}
		});
		moneda5cents.setFont(new Font("Tahoma", Font.PLAIN, 30));
		moneda5cents.setBounds(707, 408, 115, 45);
		contentPane.add(moneda5cents);
		
		JLabel salito = new JLabel("salito");
		salito.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				Float precioactual= Float.parseFloat(Precio.getText());
				
				double b= precioactual+(1.5);
				
				String a =String.valueOf(b);

				Precio.setText(a);
				
			}
		});
		salito.setIcon(new ImageIcon("C:\\Users\\1ASIR\\Desktop\\1dam\\entornos de desarrolo\\imagen\\salitos (1) (1) (1) (1).jpg"));
		salito.setBounds(10, 251, 182, 202);
		contentPane.add(salito);
		
		JLabel power = new JLabel("New label");
		power.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Float precioactual= Float.parseFloat(Precio.getText());
				
				double b= precioactual+(0.5);
				
				String a =String.valueOf(b);

				Precio.setText(a);
				
			}
		});
		power.setIcon(new ImageIcon("C:\\Users\\1ASIR\\Desktop\\1dam\\entornos de desarrolo\\imagen\\powerking-250ml.jpg"));
		power.setBounds(237, 251, 153, 202);
		contentPane.add(power);
		
		JLabel sunny = new JLabel("New label");
		sunny.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Float precioactual= Float.parseFloat(Precio.getText());
				
				double b= precioactual+(2.5);
				
				String a =String.valueOf(b);

				Precio.setText(a);
			}
		});
		sunny.setIcon(new ImageIcon("C:\\Users\\1ASIR\\Desktop\\1dam\\entornos de desarrolo\\imagen\\sunny.jpg"));
		sunny.setBounds(452, 251, 153, 216);
		contentPane.add(sunny);
		
		JLabel lblNewLabel = new JLabel("Tienes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(33, 101, 182, 101);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrecioTotal = new JLabel("Precio total");
		lblPrecioTotal.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblPrecioTotal.setBounds(33, 11, 342, 101);
		contentPane.add(lblPrecioTotal);
	}
}
