/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

/**
 *
 * @author Hlch1
 */
import java.io.IOException; 
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileAndDirectoryInfo
{
    public FileAndDirectoryInfo()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter file or directory name:");
        
        Path path = Paths.get(input.nextLine());
        
        if (Files.exists(path))
        {
            try {
                System.out.printf("%n%s exists%n", path.getFileName());
                System.out.printf("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not");
                System.out.printf("%s an aboslute path%n",path.isAbsolute() ? "Is" : "Is not");
                System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
                System.out.printf("Size: %s%n", Files.size(path));
                System.out.printf("Path: %s%n", path);
                System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
                
                if (Files.isDirectory(path))
                {
                    System.out.printf("%nDirectory contents:%n");
                    
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                    
                    for (Path p : directoryStream)
                        System.out.println(p);
                }
            } catch (IOException ex) {
                Logger.getLogger(FileAndDirectoryInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            System.out.printf("%s does not exist%n", path);
        }
    }
}
