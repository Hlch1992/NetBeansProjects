/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author Hlch1
 */
import java.util.Scanner;

public class Validate
{
    public Validate()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter state:");
        String state = scanner.nextLine();
        System.out.println("Please enter zip:");
        String zip = scanner.nextLine();
        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();
        
        System.out.printf("%nValidate Result:%n");
        
        if (!ValidateInput.validateFirstname(firstName))
            System.out.println("Invalid first name");
        else if (!ValidateInput.validateLastname(lastName))
            System.out.println("Invalid last name");
        else if(!ValidateInput.validateAddress(address))
            System.out.println("Invalid address");
        else if(!ValidateInput.validateCity(city))
            System.out.println("Invalid city");
        else if(!ValidateInput.validateState(state))
            System.out.println("Invalid state");
        else if(!ValidateInput.validateZip(zip))
            System.out.println("Invalid zip");
        else if(!ValidateInput.validatePhone(phone))
            System.out.println("Invalid phone number");
        else
            System.out.println("Valid input.  Thank you.");
    }
}
