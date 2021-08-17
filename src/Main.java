
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    
    public static void dosyaKopyala(){
        
        try {
            FileInputStream fis = new FileInputStream("Mars.mp3");
            
            int sayi;
            
            while((sayi = fis.read())!=-1){
                
                list.add(sayi);
                
            }
            
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamama hatası...");
        } catch (IOException ex) {
            System.out.println("Dosya okuma hatası.....");
        }

        
    }
    public static void dosyaYapistir(String name){
        
        
        try {
            FileOutputStream fos = new FileOutputStream(name);
            
            for(Integer s : list){
                
                fos.write(s);
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı hatasi...");
        } catch (IOException ex) {
            System.out.println("Dosya yazılamadı hatası...");
        }
        
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        dosyaKopyala();
        dosyaYapistir("Mars2.mp3");
        
        
        
        
    }
}
