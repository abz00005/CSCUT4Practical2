import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {
	// Replace this with statements to set the file name (input) and file name (output).
    // Initially it will be easier to hardcode suitable file names.

    // Set up a new Scanner to read the input file.
    // Processing line by line would be sensible here.
    // Initially, echo the text to System. out to check you are reading correctly.
    // Then add code to modify the text to the output format.

    // Set up a new PrintWriter to write the output file.
    // Add suitable code into the above processing (because you need to do this line by line also.
    // That is, read a line, write a line, loop.

    // Finally, add code to read the filenames as arguments from the command line.
    public static void main(String[] args) throws IOException {  	
    	File inputFile = new File("C:\\Users\\abbas\\git\\CSCUT4Practical2\\input.txt");
    	File outputFile = new File("C:\\Users\\abbas\\git\\CSCUT4Practical2\\output.txt");   	
            Scanner rd = new Scanner(inputFile);
            PrintWriter printWriter = new PrintWriter (outputFile);
            String details ="";
            
            ArrayList<String> detailsList = new ArrayList<>();
    	
    	


        
        while(rd.hasNext()) {
        String firstName =  rd.next();
        String secondName = rd.next();
        String dob = rd.next();
        details = capitals(firstName)+" "+capitals(secondName)+" "+dobFormat(dob);
        detailsList.add(details);
        System.out.println(details);
        }
        
       for(int i=0; i<detailsList.size();i++) {
        printWriter.write(detailsList.get(i)+"\n"); 
        rd.close();
        
       }
       printWriter.close();
    } // main
    public static String capitals (String name) {
    	return name.substring(0, 1).toUpperCase()+ name.substring(1);
    }// capital first letter of name
    public static String dobFormat (String dob) {
    	return dob.substring(0, 2)+ "/"+dob.substring(2, 4)+"/"+dob.substring(4);
    } // formatting date of birth (DD/MM/YYYY)

} // FilesInOut
