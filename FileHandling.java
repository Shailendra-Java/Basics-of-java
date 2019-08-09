import java.io.*;
import java.util.Scanner;

public class FileHandling {
    String line = null;
    String fileName = "D:\\Programs\\abc.txt";
    public void readData(){
        try(BufferedReader br = new 
            BufferedReader(new 
            FileReader(fileName))){
           while((line = br.readLine()) != null)
                System.out.println(line);
        }catch(IOException iex){
            System.err.println("Problem : "+iex.getMessage()); 
        }
    }
    
    public void writeData(){
        try(FileOutputStream fos = new FileOutputStream(fileName, true);
                Scanner scn = new Scanner(System.in)){
        
            System.out.println("Enter content to write");
            line = scn.nextLine();
            byte data[] = line.getBytes();
            fos.write(data);
        }catch(IOException iex){
            System.err.println("Problem : "+iex.getMessage()); 
        }
    }

    public void writeData2(){
        try(FileOutputStream fos = new FileOutputStream(fileName, true);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                Scanner scn = new Scanner(System.in)){
        
            System.out.println("Enter content to write");
            line = scn.nextLine();
            byte data[] = line.getBytes();
            bos.write(data);
        }catch(IOException iex){
            System.err.println("Problem : "+iex.getMessage()); 
        }
    
    }
    public void read1(){
        int data = 0;
        try(FileInputStream fis = new FileInputStream(fileName)){
            while((data = fis.read()) != -1)
            {
                System.out.print((char)data);
            }
        }catch(IOException iex){
            System.err.println(iex);
        }
    }
    
    public void read2(){
        byte[] data = new byte[100];
        try(FileInputStream fis = new FileInputStream(fileName);
                BufferedInputStream bis = new BufferedInputStream(fis)){
            bis.read(data);
            for(byte b : data)
                System.out.print((char)b);
        }catch(IOException iex){
            System.err.println(iex);
        }
    }
    
    public void read3(){
        char[] ch = new char[200];
        try(FileReader fr = new FileReader(new File(fileName))){
            fr.read(ch);
            for(char c : ch)
                System.out.print(c);
        }catch(IOException iex){
            System.err.println(iex);
        }
    }
    public void read4(){
        try(FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr)){
           while((line = br.readLine()) != null)
                System.out.println(line);
        }catch(IOException iex){
            System.err.println(iex);
        }
    }
    
    public void write1(){
        char[] ch = new char[200];
        try(FileReader fr = new FileReader(fileName);
                FileWriter fos = new FileWriter("D:\\programs\\Log.txt", false);
                BufferedWriter br = new BufferedWriter(fos)){
            fr.read(ch);
            br.write(ch);
            
        }catch(IOException iex){
            System.err.println(iex);
        }
    }
    
    public void write2(){
        File f = new File("D:\\programs\\Alph.txt");
        try(FileOutputStream fos = new FileOutputStream(f, false)){
            for(char c='A'; c<='Z'; c++){
                fos.write(c);
            }
        }catch(IOException iex){
            System.err.println(iex);
        }
    }
    
    public static void main(String[] args) {
        FileHandling rf = new FileHandling();
      //  rf.writeData();
//        rf.readData();
        //rf.read4();
        rf.write2();
    }
}
