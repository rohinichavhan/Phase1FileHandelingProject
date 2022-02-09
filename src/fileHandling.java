//As a developer, write a program to read, write, and append to a file.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class fileHandling {
//Scanner s=new Scanner(System.in);
public static void main(String[] args) {
Scanner str = new Scanner(System.in);
       String choice,cont = "y";        
       
       while( cont.equalsIgnoreCase("y") ) {        
        System.out.println();
          System.out.println("You can Read, Write and Append to a file");
          System.out.println("*********************************************\n");
       
       System.out.println("1 ===> Write in file ");
       System.out.println("2 ===> Read file ");
       System.out.println("3 ===> Append in file ");        
   
       System.out.print("\n\n");
       System.out.println("Enter your choice: ");
       choice = str.nextLine();
       
       if( choice.equals("1") ) {
        try {
writeinfile();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
       } else if( choice.equals("2") ) {
        try {
readFile();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
       } else if( choice.equals("3") ) {
        try {
appendRecord();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
       }
       else{
        System.out.println("Invalid choice!!");
       }
     
     
       System.out.println("Do you want to continue? Y/N");
       cont = str.nextLine();
     
       }

}

 public static void writeinfile() throws IOException {
 
 try {  
 Scanner s=new Scanner(System.in);
       FileWriter fwrite = new FileWriter("FileOperationExample.txt");  
       // writing the content into the FileOperationExample.txt file  
       System.out.println("You can write in file: ");
       String input=s.nextLine();
       fwrite.write(input);  
 
       // Closing the stream  
       fwrite.close();  
       System.out.println("Content is successfully wrote to the file.");  
   } catch (IOException e) {  
       System.out.println("Unexpected error occurred");  
       e.printStackTrace();  
       }  
 
  }
 
 

   

public static void readFile() throws IOException {
try {  
           // Create f1 object of the file to read data  
           File f1 = new File("FileOperationExample.txt");    
           Scanner dataReader = new Scanner(f1);  
           while (dataReader.hasNextLine()) {  
               String fileData = dataReader.nextLine();  
               System.out.println(fileData);  
           }  
           dataReader.close();  
       } catch (FileNotFoundException exception) {  
           System.out.println("Unexcpected error occurred!");  
           exception.printStackTrace();  
       }  
   
   }

public static void appendRecord() throws IOException {
String filePath = "FileOperationExample.txt";
//String text=" Append to file";
System.out.println("You can append in existing file: ");
Scanner s=new Scanner(System.in);
String text=s.nextLine();
File file = new File(filePath);
FileWriter fr = null;
try {
// Below constructor argument decides whether to append or override
fr = new FileWriter(file, true);
fr.write(text);
System.out.println("File updated successfully");

} catch (IOException e) {
e.printStackTrace();
} finally {
try {
fr.close();
} catch (IOException e) {
e.printStackTrace();
}
}
   }
 

}