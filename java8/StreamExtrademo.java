package Example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExtrademo {

	public static void main(String args[]) throws IOException
	{
	//IntStream.range(1, 10)
	//.forEach(System.out::print);
	//IntStream.range(1,10)
	//.skip(3)
	//.forEach(x->System.out.print(x));
		/*System.out.println(
						IntStream
							.range(1, 5)   // 1+2+3+4
							.sum());
						System.out.println(); */
	Stream.of("suma","sumna","sushmitha","suhas")
	.sorted()
	.findFirst()
    .ifPresent(System.out::print);
	
	List<String> people = Arrays.asList("Al", "Ankit", 
							"Brent", "Sarika", "amanda", "Hans", 
						"Shivika", "Sarah");
				people
						.stream()
						.filter(x -> x.startsWith("A"))
						.map(String::toUpperCase)
						.forEach(System.out::println);
				Set<String> bands2 = Files.lines(Paths.get("src/data.txt"))
						.filter(x -> x.contains("jit"))
					.collect(Collectors.toSet());
			bands2.forEach(x -> System.out.println(x));
		
	}
}
