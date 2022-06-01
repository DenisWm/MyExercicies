package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite a quantidade de notas: ");
		
		int qtdeNotas = entrada.nextInt();
		
		double[] notasAlunos = new double[qtdeNotas];
		
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.print("digite a nota " + (i + 1) + ":");
			notasAlunos[i] = entrada.nextDouble();
		}
		
		double totalNotas = 0;
		for(double nota: notasAlunos) {
			totalNotas += nota;
		}
		
		System.out.println(totalNotas / notasAlunos.length);
		
		entrada.close();
	}
}

class Solution {
    public static String whoLikesIt(String... names) {
        if(names.length == 0){
          return "no one likes this";
        } else if(names.length == 1) {
          return names[0] + " likes this";
        } else if(names.length == 2) {
          return names[0] + " and " + names[1] + " like this";
        } else if(names.length == 3) {
          return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else if(names.length > 3) {
          return names[0] + ", " + names[1] + " and " + (names.length - 2)  + " like this";
    }
        return "";
    }
}

class JadenCase {

	public String toJadenCase(String phrase) {
		if(phrase.equals("") || phrase == null) return null;
		
			String[] splited = phrase.split(" ");
			StringBuilder jadenCasedPhrase = new StringBuilder();
			
			for (String g: splited) {
				String firstLetter = g.substring(0, 1).toUpperCase();
				String lastLetters = g.substring(1, g.length());
				jadenCasedPhrase.append(firstLetter + lastLetters);
				jadenCasedPhrase.append(" ");
				
			}
			jadenCasedPhrase.deleteCharAt(jadenCasedPhrase.length() - 1);
			return jadenCasedPhrase.toString();
		}
	}

class DnaStrand {
	  public static String makeComplement(String dna) {
	    char[] array = dna.toCharArray();
	    if(dna.toCharArray().length == 0) return new String(array);
	    
	    for (int i = 0; i < array.length; i++) {
			switch(array[i]) {
			case 'T': array[i] = 'A';
			break;
			case 'A': array[i] = 'T';
			break;
			case 'G': array[i] = 'C';
			break;
			case 'C': array[i] = 'G';
			break;
			}
		}
	    return new String(array);
	  }
	}

class Kata {


	public static int[] sortArray(int[] array) {
		
	    Map<Integer, Integer> maping = new HashMap<>();
	    for (int i = 0; i < array.length; i++) {
				maping.put(i, array[i]);
		}
	    
	    for (int i = 0; i < maping.size(); i++) {
			if(maping.get(i) % 2 ==0 || maping.get(i) != 0) {
				int aux;
				int aux2;
				
				if(maping.get(i) > maping.get(i + 1) && maping.get(i + 1) != 0 || maping.get(i + 1) % 2 != 0) {
					aux = maping.get(i + 1);
					aux2 = maping.get(i);
					maping.put(i, aux);
					maping.put(i + 1, aux2);
					
				} else if(maping.get(i + 1) != 0 || maping.get(i + 1) % 2 != 0 && maping.get(i) > maping.get(i + 2)) {
					aux = maping.get(i + 2);
					aux2 = maping.get(i);
					maping.put(i, aux);
					maping.put(i + 2, aux2);
				}
			}
		}
	    
	    int[] arrayd = {};
	   for (int i = 0; i < array.length; i++) {
		   arrayd[i] = maping.get(i);
	}
	return arrayd;
	    
	  }
	
	class Solution {

		  public int solution(int number) {
			  if(number < 0) return 0;
			  int sum = 0;
			  for (int i = 0; i < number; i++) {
				if(i % 3 == 0 || i % 3 == 0 ) {
					sum += i;
				}
			}
			  return sum;
		  }
		}
		
	}