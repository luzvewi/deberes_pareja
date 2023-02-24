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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import javax.swing.AbstractListModel;
import javax.swing.JSlider;

public class pokedex extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel ventana;
	private JTextField textField;   
	int ataque;
	int defensa;
	int defensaSp;
	int Velocidad;
	int ataqueSp;
	ArrayList<Integer> array = new ArrayList<Integer>();
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
	
	/*public void recibirEntero(int entero1,int entero2,int entero3,int entero4,int entero5) { //le digo que tiene que mandar estas variables, aqui es donde las recibe
        System.out.println("El entero recibido es: " + entero1+" El entero recibido es: " + entero2
        		+" El entero recibido es: " + entero3+" El entero recibido es: " + entero4+" El entero recibido es: " + entero5);
        
        // array.add(entero1);
        // array.add(entero2);
        // array.add(entero3);
        // array.add(entero4);
        // array.add(entero5);
    }
	*/
	public pokedex() {

		//ataque=array.get(1);ataqueSp=array.get(2);defensa=array.get(3);defensaSp=array.get(4);Velocidad=array.get(5);
		
		setTitle("pokedex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1341, 911);
		ventana = new JPanel();
		ventana.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ventana);
		ventana.setLayout(null);
		String [] values = new String[] {"charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu","flareon","mewto","raichu","charizard","pikachu","bulbasur","raiquaza","flareon","mewto","raichu"};
		
		JTextPane stats2 = new JTextPane();
		stats2.setFont(new Font("Source Code Pro ExtraLight", Font.PLAIN, 12));
		stats2.setEditable(false);
		stats2.setBounds(666, 417, 513, 418);
		ventana.add(stats2);
		
		
		JTextPane info = new JTextPane();
		info.setFont(new Font("Source Code Pro ExtraLight", Font.PLAIN, 12));
		info.setEditable(false);
		info.setBounds(666, 205, 513, 201);
		ventana.add(info);
		
		JLabel lblNewLabel = new JLabel("Pokedex");
		lblNewLabel.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD, 34));
		lblNewLabel.setBounds(555, 11, 154, 74);
		ventana.add(lblNewLabel);
		
		JScrollPane scrollpane=new JScrollPane();
		scrollpane.setViewportBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollpane.setBounds(20,154,636,681);
		ventana.add(scrollpane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\borde pokemon.png"));
		scrollpane.setRowHeaderView(lblNewLabel_2);
		
		ArrayList<Integer> pokemon = new ArrayList<Integer>();
		//pokemon.add(ataque,defensa,Velocidad,ataqueSp,defensaSp);
		
		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		scrollpane.setViewportView(toolBar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
		

			public void mouseClicked(MouseEvent e) {
				
				stats2.setText("El ataque es: "+ataque+ "\n"
				+"El ataque especial es: "+ataqueSp+ "\n"
				+"La defensa es: "+defensa+ "\n"
				+"La defensa especial es: "+defensaSp+ "\n"
				+"La velocidad es: "+Velocidad);
				
				info.setText("Bulbasaur is a small, quadrupedal amphibian Pokémon that has blue-green skin with darker patches. It has red eyes with white pupils, pointed, ear-like structures on top of its head, and a short, blunt snout with a wide mouth. A pair of small, pointed teeth are visible in the upper jaw when its mouth is open. Each of its thick legs ends with three sharp claws. On Bulbasaur's back is a green plant bulb that conceals two slender, tentacle-like vines, which is grown from a seed planted there at birth. The bulb also provides it with energy through photosynthesis as well as from the nutrient-rich seeds contained within.");
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\Bulbasaur.png"));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\Bulbasaur.png"));
		toolBar.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\menu pokedex.png"));
		scrollpane.setColumnHeaderView(lblNewLabel_1);
		
		JButton lupa = new JButton("");
		lupa.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\LUPA (4).jpg"));
		lupa.setBounds(598, 96, 58, 45);
		ventana.add(lupa);
		
		JButton lupa_1 = new JButton("");
		lupa_1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				ventana a= new ventana();
				a.setVisible(true);
				setVisible(false);
				
			}
		});
		lupa_1.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\mas (3).png"));
		lupa_1.setBounds(40, 98, 58, 45);
		ventana.add(lupa_1);
		
		
		textField = new JTextField();
		textField.setBounds(119, 108, 469, 35);
		ventana.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\luzvewi\\Downloads\\imagen_2023-02-22_205004229.png"));
		lblNewLabel_3.setBounds(663, 154, 516, 45);
		ventana.add(lblNewLabel_3);
		
		
		
		
		

		
	}

	public void recibirEntero2(String a,String b) { 
        System.out.println("El entero recibido es: " + a+" El entero recibido es: " + b);
        
        
    }
}

