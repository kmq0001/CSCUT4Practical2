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

    public static void main(String[] args) {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.
        File output = new File("formatted.txt");
        FileWriter fr = new FileWriter(output, true);
        Scanner input = new Scanner("inputm.txt");
        System.out.println(input);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String dob = line.substring(line.length()-8, line.length()-1);
            char[] dobArray = dob.toCharArray();
            dob = dobArray[0] + dobArray[1] + "/" + dobArray[2] + dobArray[3] + "/" + dobArray[4] + dobArray[5] + dobArray[6] + dobArray[7];
            line = line.substring(0, line.length()-9);
            String[] splitLine = line.split("\s");
            if (splitLine.length() == 3) {
                splitLine[0] = splitLine[0].substring(0, 1).toUpperCase();
                splitLine[1] = splitLine[1].toUpperCase() + ".";
                splitLine[2] = splitLine[2].substring(0, 1).toUpperCase();
                fr.write(splitLine[0] + " " + splitLine[1] + " " + splitLine[2] + " " + dob + "\n");
            }
            else if (splitLine.length() == 2) {
                splitLine[0] = splitLine[0].substring(0, 1).toUpperCase();
                splitLine[1] = splitLine[1].substring(0, 1).toUpperCase();
                fr.write(splitLine[0] + " " + splitLine[1] + " " + dob + "\n");
            }
        }
        fr.close();
        // Set up a new Scanner to read the input file.
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        System.out.println("You need to add your own code to do anything");



    } // main

} // FilesInOut
