package entorno;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Agenda extends JFrame implements ActionListener {

    private ArrayList<Contacto> contactos;
    private DefaultListModel<String> modeloLista;
    private JList<String> listaContactos;
    private JButton botonAgregar;
    private JButton botonBorrar;
    private JButton botonEditar;
    private JButton botonBuscar;
    private JTextField campoNombre;
    private JTextField campoNumero;

    public Agenda() {
        super("Agenda");

        // Inicializar la lista de contactos
        contactos = new ArrayList<Contacto>();

        // Crear el modelo para la lista de contactos
        modeloLista = new DefaultListModel<String>();

        // Crear la lista de contactos
        listaContactos = new JList<String>(modeloLista);

        // Agregar la lista de contactos a un panel con barra de desplazamiento
        JScrollPane scrollLista = new JScrollPane(listaContactos);

        // Crear los botones
        botonAgregar = new JButton("Agregar");
        botonBorrar = new JButton("Borrar");
        botonEditar = new JButton("Editar");
        botonEditar.setEnabled(false); // El botón "Editar" está desactivado al inicio
        botonBuscar = new JButton("Buscar");

        // Crear los campos de texto para ingresar el nombre y las notas del contacto
        campoNombre = new JTextField(20);
        campoNumero = new JTextField(20);

        // Crear las etiquetas para los campos de texto
        JLabel etiquetaNombre = new JLabel("Nombre:");
        JLabel etiquetaNotas = new JLabel("Numero:");

        // Crear los paneles para los botones y los campos de texto
        JPanel panelBotones = new JPanel();
        JPanel panelCampos = new JPanel();

        // Agregar los botones y los campos de texto a sus respectivos paneles
        panelBotones.add(botonAgregar);
        panelBotones.add(botonBorrar);
        panelBotones.add(botonEditar);
        panelBotones.add(botonBuscar);
        panelCampos.add(etiquetaNombre);
        panelCampos.add(campoNombre);
        panelCampos.add(etiquetaNotas);
        panelCampos.add(campoNumero);

        // Agregar los paneles a la ventana
        getContentPane().add(panelBotones, BorderLayout.NORTH);
        getContentPane().add(scrollLista, BorderLayout.CENTER);
        getContentPane().add(panelCampos, BorderLayout.SOUTH);
        
        botonAgregar.addActionListener(this);
        botonBorrar.addActionListener(this);
        botonEditar.addActionListener(this);
        botonBuscar.addActionListener(this);
        listaContactos.addListSelectionListener(e -> {
            // Activar el botón "Editar" si se ha seleccionado un contacto de la lista
            botonEditar.setEnabled(!listaContactos.isSelectionEmpty());
        });

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(644, 375);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Agenda();
    }

    @Override
    public void actionPerformed(ActionEvent accion) {
        if (accion.getSource() == botonAgregar) {
            // Obtener el nombre y las notas del contacto
            String nombre = campoNombre.getText();
            String numero = campoNumero.getText();

            // Verificar que se haya ingresado un nombre
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre.");
                return;
            }

            // Agregar el contacto a la lista
            Contacto nuevoContacto = new Contacto(nombre, numero);
            contactos.add(nuevoContacto);

            // Actualizar la lista de contactos
            actualizarLista();

            // Limpiar los campos de texto
            campoNombre.setText("");
            campoNumero.setText("");
        } else if (accion.getSource() == botonBorrar) {
            // Obtener el índice del contacto seleccionado
            int indiceSeleccionado = listaContactos.getSelectedIndex();

            // Verificar que se haya seleccionado un contacto
            if (indiceSeleccionado == -1) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un contacto.");
                return;
            }

            // Borrar el contacto de la lista
            contactos.remove(indiceSeleccionado);

            // Actualizar la lista de contactos
            actualizarLista();
        } else if (accion.getSource() == botonEditar) {
            // Obtener el índice del contacto seleccionado
            int indiceSeleccionado = listaContactos.getSelectedIndex();

            // Obtener el contacto seleccionado
            Contacto contactoSeleccionado = contactos.get(indiceSeleccionado);

            // Crear una ventana emergente para editar el contacto seleccionado
            JTextField campoNombreEditar = new JTextField(contactoSeleccionado.getNombre());
            JTextField campoNotasEditar = new JTextField(contactoSeleccionado.getNotas());
            Object[] camposEditar = {
                    "Numero:", campoNombreEditar,
                    "Nombre:", campoNotasEditar
            };
            int resultado = JOptionPane.showConfirmDialog(this, camposEditar, "Editar contacto", JOptionPane.OK_CANCEL_OPTION);
            if (resultado == JOptionPane.OK_OPTION) {
                // Actualizar el nombre y las notas del contacto
                contactoSeleccionado.setNombre(campoNombreEditar.getText());
                contactoSeleccionado.setNotas(campoNotasEditar.getText());

                // Actualizar la lista de contactos
                actualizarLista();
            }
        } else if (accion.getSource() == botonBuscar) {
            // Obtener el nombre del contacto a buscar
            String nombreBuscar = campoNombre.getText();

            // Verificar que se haya ingresado un nombre
            if (nombreBuscar.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre.");
                return;
            }

            // Buscar el contacto en la lista
            int indiceEncontrado = -1;
            for (int i = 0; i < contactos.size(); i++) {
                if (contactos.get(i).getNombre().equals(nombreBuscar)) {
                    indiceEncontrado = i;
                    break;
                }
            }
         // Mostrar el resultado de la búsqueda
            if (indiceEncontrado != -1) {
                listaContactos.setSelectedIndex(indiceEncontrado);
                listaContactos.ensureIndexIsVisible(indiceEncontrado);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún contacto con el nombre especificado.");
            }
        }
    }

    private void actualizarLista() {
        // Obtener la lista de nombres de los contactos
        String[] nombres = new String[contactos.size()];
        for (int i = 0; i < contactos.size(); i++) {
            nombres[i] = contactos.get(i).getNombre();
        }

        // Actualizar la lista de contactos
        listaContactos.setListData(nombres);
    }

    private class Contacto {
        private String nombre;
        private String notas;

        public Contacto(String nombre, String notas) {
            this.nombre = nombre;
            this.notas = notas;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNotas() {
            return notas;
        }

        public void setNotas(String notas) {
            this.notas = notas;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }
}
