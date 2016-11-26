package Servidor;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import javafx.stage.Stage;
/**
 * 
 * @author Esteban's
 */
public class Servidor {
    Stage ventana;
    Socket cliente;
 
    
    public Servidor(Stage padre){
        this.ventana = padre;//Referencia a la ventana
    }
    
    public void runServer(int cantidadJugadores){
        try{
            ServerSocket servidor = new ServerSocket(8081);
            cliente = servidor.accept();
            //Se ha conectado un jugador
            HiloServidor hServer = new HiloServidor (cliente, this);
            hServer.start();
            
            //Ciclo necesario para que el servidor no se cierre
            while (true){
                
            }
        } catch (IOException e){
            System.out.println("Ha ocurrido un error con el servidor");
        }
    }
}
