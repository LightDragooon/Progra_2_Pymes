/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
import java.io.*;
import javafx.stage.Stage;
/**
 *
 * @author Esteban
 */
public class HiloCliente extends Thread{
    //solo de lectura

   ObjectInputStream entrada;
   Stage ventanaCliente; //referencia acliente
   public HiloCliente (ObjectInputStream entrada,Stage ventanaCliente) throws IOException {
      this.entrada=entrada;
      this.ventanaCliente = ventanaCliente;
   }
   
   @Override
   public void run(){
       int opcion;
        while(true){
            try{
                // esta leyendo siempre la instruccion, un int
                opcion = entrada.readInt();
                switch(opcion){
                    case 1:
                        //Opcion 1
                        break;
                    case 2:
                        //Opcion 2
                        break;
                }
            }catch (IOException e){
                System.out.println("Error en la comunicación "+"Información para el usuario");
                break;
            }
            System.out.println("se desconecto el servidor");
        }
    }
}
