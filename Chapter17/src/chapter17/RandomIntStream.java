/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

/**
 *
 * @author Hlch1
 */
import java.security.SecureRandom;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class RandomIntStream
{
    public RandomIntStream()
    {
        SecureRandom random = new SecureRandom();
        
        System.out.printf("%-6s%s%n", "Face", "Frequency");
        random.ints(6_000_000, 1, 7).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((face, frequency) -> System.out.printf("%-6d%d%n", face, frequency));
    }
}
