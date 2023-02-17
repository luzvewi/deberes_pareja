package deberes_pareja;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class agenda extends JFrame {

    private JPanel contentPane;
    private JTextField nombre;
    private JTextField edad;
    private JTextField telefono;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    agenda frame = new agenda();
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
    public agenda() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 641, 402);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		nombre.setText("a");
        	}
        });
        btnGuardar.setBounds(232, 305, 99, 35);
        contentPane.add(btnGuardar);
        
        nombre = new JTextField();
        nombre.setBounds(54, 176, 440, 20);
        contentPane.add(nombre);
        nombre.setColumns(10);
        
        edad = new JTextField();
        edad.setColumns(10);
        edad.setBounds(54, 217, 71, 20);
        contentPane.add(edad);
        
        telefono = new JTextField();
        telefono.setColumns(10);
        telefono.setBounds(205, 217, 309, 20);
        contentPane.add(telefono);
        
        JLabel lblNewLabel = new JLabel("nombre");
        lblNewLabel.setBounds(10, 179, 46, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblEdad = new JLabel("edad");
        lblEdad.setBounds(10, 220, 46, 14);
        contentPane.add(lblEdad);
        
        JLabel lblTelefono = new JLabel("telefono");
        lblTelefono.setBounds(135, 220, 46, 14);
        contentPane.add(lblTelefono);
        
        JLabel foto = new JLabel("New label");
        foto.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\carne1 (1) (1).jpg"));
        foto.setBounds(250, 45, 77, 120);
        contentPane.add(foto);
        
        JLabel titulo = new JLabel("Agenda");
        titulo.setFont(new Font("Sitka Text", Font.BOLD, 29));
        titulo.setBounds(232, 11, 127, 45);
        contentPane.add(titulo);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(512, 99, -94, -71);
        contentPane.add(scrollPane);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(405, 75, 46, 14);
        contentPane.add(lblNewLabel_1);
    }
}
