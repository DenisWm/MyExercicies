package codewars.reversedstrings;
import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class SolutionTest {
    // Reference implementation for random tests
    public static String _solution(String str) {
      return new StringBuilder(str).reverse().toString();
    }
    
    @Test
    public void sampleTests() {
      assertEquals("dlrow", Kata.solution("world"));
      assertEquals("olleh", Kata.solution("hello"));
      assertEquals("", Kata.solution(""));
      assertEquals("h", Kata.solution("h"));
      assertEquals("selur srawedoC", Kata.solution("Codewars rules"));
    }
    
    @Test
    public void randomTests() {
      String chars = "abcdefghijklmnopqrstuvwxyz    ,./';123456789!?";
      Random random = new Random();
      
      for (int i = 0; i < 100; ++i) {
        String test = IntStream.range(1, random.nextInt(100))
          .mapToObj(x -> Character.toString(chars.charAt(random.nextInt(chars.length()))))
          .collect(Collectors.joining());
        
        String expected = _solution(test);
        String actual = Kata.solution(test);
        
        assertEquals(expected, actual);
        }
      }
    }