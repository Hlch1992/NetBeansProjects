/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author Hlch1
 */
public class Chapter9
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
//        employee.commissionEmployeeTest();

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        employee.basePlusCommissionEmployeeTest();
    }
    
}
