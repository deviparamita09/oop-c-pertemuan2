
package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Devi Paramita
 * TGL: 15 Maret 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mhs = "Devi Paramita";
        long nim = 2301010349L;
        String kelas = "A";
        
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Input Nama Mahasiswa:");
            mhs = dtIN.readLine();
            
            System.out.print("Input NIM:");
//            nim = dtIN.readLine();
            nim = Long.parseLong( dtIN.readLine());

        }catch(IOException e){
           System.out.println("Telah Terjadi Error");
        }
        
        kelas = JOptionPane.showInputDialog("Input Kelas: ");
        
 //         System.out.println("Data "+mhs+" dengan NIM "+ nim);
          System.out.println("Data "+mhs+" dengan NIM "+ nim+ " Berada di Kelas " +kelas);
    }
    
}