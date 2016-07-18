/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstiotest;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

/**
 *
 * @author Hlch1
 */
public class FirstIOTest
{

    private static Scanner input;
    private static Formatter output;
    private static BufferedReader br;

    public static void openFile()
    {
        try
        {
            input = new Scanner(Paths.get("C:\\Users\\Hlch1\\ReadInThisFile.txt"));
        } catch (IOException ioException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static BufferedReader readRecords()
    {
        try
        {
            String line = null;
            FileReader fr = new FileReader("C:\\Users\\Hlch1\\ReadInThisFile.txt");
            BufferedReader br = new BufferedReader(fr);
            return br;
            
        } catch (FileNotFoundException ex)
        {

        } catch (IOException ex)
        {
        }        
        return null;
    }

    public static void closeFile()
    {
        if (input != null)
        {
            input.close();
        }
    }

    public static void openWriteFile()
    {
        try
        {
            output = new Formatter("C:\\Users\\Hlch1\\WriteThisFile.txt");
        } catch (SecurityException securityException)
        {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords(BufferedReader br) throws IOException
    {
        String line=null;
        while ((line = br.readLine()) != null)
        {
            try
            {
                output.format("%s%n",line);
                System.out.println(line);
            } catch (FormatterClosedException formatterCloseException)
            {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException elementException)
            {
                System.err.println("Invalid input. Please try again.");
                input.nextLine();
            }            
        }
    }    
    public static void closeWriteFile()
    {
        if (output != null)
            output.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        openFile();
        br=readRecords();
        closeFile();        
        openWriteFile();
        addRecords(br);
        closeWriteFile();
    }
}