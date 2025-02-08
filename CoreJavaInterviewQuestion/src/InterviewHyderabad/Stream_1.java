package InterviewHyderabad;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_1
{
	public static void main(String[] args) {
		
//		Ques->Print sum of All Element
		
		List<Integer> al=Arrays.asList(1, 2, 4, 5, 2, 7);
		Optional<Integer> sum= al.stream().reduce((a, b)->a+b);
//		Reduce method gives optional integer
		System.out.println(sum.get());
		
//		Explain
//		eh lambda expression (a, b) -> a + b do integers a aur b 
//		ko leta hai aur unka sum return karta hai. reduce method yeh
//		operation stream ke har element par lagata hai aur final result 
//		nikalta hai, jo ki iss case mein list ke sabhi elements ka sum hai.
		
//		Yahan sum ek Optional<Integer> hai. .get() method value ko return 
//		karta hai agar woh present ho.
		

	}
}
