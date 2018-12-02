
import java.util.*;
import java.lang.*;
import java.io.*;

class swapSum {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		while(sc.hasNext()) {
		    sc.nextLine();
		    int first[] = convert(sc.nextLine());
		    int second[] = convert(sc.nextLine());
		    System.out.println(test(first, second) ? 1 : -1);    
		}
	}
	
	static boolean test(int first[], int second[]) {
	    int sumFirst = sum(first);
	    int sumSecond = sum(second);
	    int delta = sumSecond - sumFirst;
	    
	    if (Math.abs(delta % 2) == 1) return false;
	    
	    for (int i = 0; i < first.length && i < second.length; i++) {
            if (second[i] - first[i] == delta/2) {
                return true;
            }
	    }
	    
	    return false;
	}
	
	static int sum(int numbers[]) {
	    int sum = 0;
	    for (int n : numbers) sum += n;
	    return sum;
	}
	
	static int[] convert(String input) {
	    String split[] = input.split(" ");
	    int numbers[] = new int[split.length];
	    for (int i = 0; i < split.length; i++) {
	        numbers[i] = Integer.valueOf(split[i]);
	    }
	    return numbers;
	}
}
