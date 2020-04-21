package hackerank;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FrequencyCountUsingJava8 {
			//java 8 code to count frequency of each element
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("a","a","d","r","t","r");
		System.out.println(ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(ls.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())));
		Predicate<List<String>> p;

////////////
		
		 //Get count, min, max, sum, and average for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                                           .mapToInt((x) -> x)
                                           .summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
	
	}

}
