package s;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.xml.crypto.Data;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        try{

           Socket s =new Socket("localhost",3000);

           BufferedReader in =new BufferedReader(new InputStreamReader((s.getInputStream())));
           DataOutputStream out=new DataOutputStream(s.getOutputStream());
 
           out.writeBytes("Ciao a tuti "+"\n");
           String risposta =in.readLine();

           System.out.println("il server ha detto "+ risposta );
 
             s.close();
        }catch(Exception e ){

            System.out.println(e.getMessage());
        }
    }
}
