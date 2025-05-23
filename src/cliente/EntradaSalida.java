package cliente;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EntradaSalida implements ActionListener{
    JButton aceptar;
    JComboBox proceso;
    JTextField contraseña;
    JTextField pin;

    public EntradaSalida (){
        JFrame marco = new JFrame("Menú principal");
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setSize(300, 300);
        marco.setLayout(new GridLayout(4,1));
        
        JPanel c1 = new JPanel();
        JPanel c2  new JPanel();
        JPanel c3 = new JPanel();
        JPanel c4 = new JPanel();

        pin = new JTextField();
        contraseña= new JTextField();
        aceptar = new JButton("Aceptar");
        
        
        String[] lisProcesos ={"Entrar","Salir"};
        proceso = new JComboBox<>(lisProcesos);
        
        c1.add(new JLabel("Contraseña"));
        c1.add(contraseña, BorderLayout.AFTER_LAST_LINE);
        c2.add(new JLabel("Pin:"));
        c2.add(pin, BorderLayout.AFTER_LAST_LINE);
        c3.add(new JLabel("Seleccione la operación que desea realizar"))
        c3.add(proceso, BorderLayout.AFTER_LAST_LINE);
        c4.add(aceptar);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
