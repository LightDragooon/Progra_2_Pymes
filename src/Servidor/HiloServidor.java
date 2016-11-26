package Servidor;
import java.io.*;
import java.net.*;
/**
 *
 * @author Esteban
 */
public class HiloServidor extends Thread{
    Socket cliente = null;
    
    ObjectOutputStream salida = null;
    ObjectInputStream entrada = null;
    
    String nombreUsuario;
    Servidor servidor;
    String mensaje;
    
    

    
    public HiloServidor (Socket jugador, Servidor servidor){
        this.cliente = jugador;
        this.servidor = servidor;
        nombreUsuario = "";
    }
    @Override
    public void run(){
        try{
            //Primero va el output
            salida = new ObjectOutputStream(cliente.getOutputStream());
            entrada = new ObjectInputStream(cliente.getInputStream());

        }catch (IOException e){
            
        }
        
        //Variables a utilizar en el hilo
        int opcion;
        while (true){
            try{
                opcion = entrada.readInt();
                switch (opcion){
                    case 1:
                        //Opcion 1
                        break;
                    case 2:
                        //Opcion 2
                        break;
                    
                }
            }catch (IOException e) {
              System.out.println("El cliente termino la conexion");
              break;//Salgo del true
            }
        }
        //Si llega acá es porque se desconecto un usuario
    	try
    	{
          cliente.close();
    	}	
        catch(IOException e){
        }
    }
}