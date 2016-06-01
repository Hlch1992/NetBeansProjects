/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

/**
 *
 * @author Hlch1
 */
public class UsingExceptions
{
    public static void main(String[] args)
    {
        try
        {
//            throwException();
            method1();
        }
        catch (Exception exception)
        {
//            System.err.println("Exception handled in main");
/*            System.out.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();
            
            StackTraceElement[] traceElements = exception.getStackTrace();
            
            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");
 
            for (StackTraceElement element : traceElements)
            {
               System.out.printf("%s\t", element.getClassName());
               System.out.printf("%s\t", element.getFileName());
               System.out.printf("%s\t", element.getLineNumber());
               System.out.printf("%s%n", element.getMethodName());
            }*/
            
            exception.printStackTrace();
        }
        
//        doesNotThrowException();
    }
    
    public static void method1() throws Exception
      {
//         method2();
          try
         {
            method2();
         } // end try
         catch (Exception exception) // exception thrown from method2 
         {
            throw new Exception("Exception thrown in method1", exception);
         }
      }
 
      public static void method2() throws Exception
      {
//         method3();
          try
         {
            method3();
         }
         catch (Exception exception) // exception thrown from method3 
         {
            throw new Exception("Exception thrown in method2", exception);
         }
      }
 
      public static void method3() throws Exception
      {
         throw new Exception("Exception thrown in method3"); 
      }
  
    public static void throwException() throws Exception
    {
        try
        {
            System.out.println("Method throwException");
            throw new Exception();
        }
        catch (Exception exception)
        {
            System.err.println("Exception handled in method throwException");
            throw exception;
        }
        finally
        {
            System.err.println("Finally executed in throwException");
        }        
    }
    
    public static void doesNotThrowException()
    {
        try
        {
            System.out.println("Method doesNotThrowException");
        }
        catch (Exception exception)
        {
            System.err.println(exception);
        }
        finally
        {
            System.err.println("Finally executed in doesNotThrowException");
        }
        
        System.out.println("End of method doesNotThrowException");
    }
}
