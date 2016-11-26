/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class Cliente {
   public static String IP_SERVER = "localhost"; //IP del Servidor
   Stage ventanaCliente; // Ventana del cliente
   ObjectOutputStream salida = null;//escribir comunicacion
   ObjectInputStream entrada = null;//leer comunicacion

   Socket cliente = null;//para la comunicacion
   /** Creates a new instance of Cliente */
   public Cliente(Stage vent) throws IOException
   {      
      this.ventanaCliente=vent;
   }
   
   public void conexion() throws IOException 
   {
      try {
          // se conecta con dos sockets al server, uno comunicacion otro msjes
         cliente = new Socket(Cliente.IP_SERVER, 8081);
         // inicializa las entradas-lectura y salidas-escritura
         salida = new ObjectOutputStream(cliente.getOutputStream());
         entrada = new ObjectInputStream(cliente.getInputStream());
      } catch (IOException e) {
         System.out.println("El servidor no esta levantado");
      }

      new HiloCliente(entrada, ventanaCliente).start();
   }
   
}
