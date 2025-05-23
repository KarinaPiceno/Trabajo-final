package cliente;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MenuPrincipal implements ActionListener{
    JComboBox acciones;
    public MenuPrincipal (){
        JFrame marco = new JFrame("Menú principal");
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setSize(300, 300);

        JPanel contenedorMax = new JPanel(new GridLayout(2,1));
        JPanel contenedor1 = new JPanel(new GridLayout(2,1));

        JLabel seleccion = new JLabel("Seleccione la acción que desea realizar");
        seleccion.setSize(100, 50);

        String[] listaAcciones = {"Entrar","Salir", "Borrar invitado", "Agregar invitado", "Agragar usuario","borrar usuario"};
        acciones = new JComboBox<>(listaAcciones);
        acciones.addActionListener(this);

        contenedor1.add(seleccion);
        contenedor1.add(acciones);
        contenedorMax.add(contenedor1);
        marco.add(new JPanel(), BorderLayout.WEST);
        marco.add(new JPanel(), BorderLayout.NORTH);
        marco.add(new JPanel(), BorderLayout.SOUTH);
        marco.add(new JPanel(), BorderLayout.EAST);
        marco.add(contenedorMax, BorderLayout.CENTER);
        marco.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
