package cliente;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InicioSesion implements ActionListener {
    JButton bAceptar;
    public JFrame marco1;
    JTextField inUsuario;
    JTextField inContraseña;
    public InicioSesion(){
        JFrame marco = new JFrame("Inicio de sesión");
        marco.setSize(300, 300);
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JPanel contenedorP =new JPanel(new GridLayout(3,1));
        contenedorP.setLayout(new GridLayout(3, 1));


        JPanel etiquetas = new JPanel(new BorderLayout());
        JPanel etiquetas1 = new JPanel(new BorderLayout());
       
        JLabel usuario = new JLabel("Ingrese su usuario (ID)");
        etiquetas.add(usuario, BorderLayout.CENTER);
        JLabel contraseña =new JLabel("Ingrese su contraseña");
        etiquetas1.add(contraseña, BorderLayout.CENTER);
        
        JPanel campos = new JPanel(new GridLayout(3,1,10,5));
        JPanel campos1 = new JPanel(new GridLayout(3,1,10,5));
        inUsuario = new JTextField();
        inContraseña =new JTextField();
        campos.add(new JPanel(), 0);
        campos.add(inUsuario, 1);
        campos1.add(new JPanel());
        campos1.add(inContraseña);

        JPanel aceptar = new JPanel();
        aceptar.setPreferredSize(new Dimension(200, 100));
        bAceptar = new JButton("Aceptar");
        bAceptar.addActionListener(this);
        bAceptar.setSize(50, 20);
        aceptar.add(bAceptar, BorderLayout.CENTER);
       
        JPanel centro = new JPanel(new GridLayout(1,2));
        JPanel centro2 = new JPanel(new GridLayout(1,2));
        centro.setPreferredSize(new Dimension(300, 400));
        marco.add(contenedorP, BorderLayout.CENTER);
        marco.add(new JPanel(), BorderLayout.EAST);
        marco.add(new JPanel(), BorderLayout.NORTH);
        marco.add(new JPanel(), BorderLayout.WEST);
        marco.add(new JPanel(), BorderLayout.SOUTH);
        contenedorP.add(centro);
        contenedorP.add(centro2);
        contenedorP.add(aceptar);
        centro2.add(etiquetas1);
        centro2.add(campos1);
        centro.add(etiquetas);
        centro.add(campos);
         
        marco1=marco;
        }
        public void mostrarVentana() {
             marco1.setVisible(true);
        }
        public String getText (ActionEvent e){
             if (e.getSource() == bAceptar){
               return "i,"+inUsuario.getText().trim()+","+inContraseña.getText().trim();
            } else return "";
        }
        public static void setRespuesta (ServerCliente cliente){
            if (!respuesta.equals("")){
                cliente.setLine(respuesta);
            }
        }
        static String respuesta = "";
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bAceptar){
                respuesta=getText(e);
                //System.out.println(getText(e));
                marco1.setVisible(false);
                System.out.println(respuesta);
                ServerCliente cliente = new ServerCliente("192.168.100.9", 5000);
            }
        }
    }
