

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.compare;
import static java.lang.System.out;

public class Lambdas {
    public static void main(String[] args) {
//        Supplier<Integer> supplier =()-> new Random().nextInt();
//        Consumer<Integer> consumer = (number) -> System.out.println(number);
//        consumer.accept(supplier.get());
//        BiPredicate<String, Integer> predicate = (word,number) -> word.length()==number;
//        System.out.println(predicate.test("word", 4));
//        Function<String ,Integer> function = String::length;
//        System.out.println(function.apply("Baby"));
//
//
//        BiFunction<String ,String,Boolean> biFunction = (word1,word2)-> word1.equals(word2);
//        System.out.println(biFunction.apply("Word", "Word"));

//        UnaryOperator<String> operator = (word)-> new StringBuilder(word).reverse().toString();
////        System.out.println(operator.apply("World"));
//        BinaryOperator<Integer> binaryOperator = (firstNumber,secondNumber) -> firstNumber.compareTo(secondNumber);
//        System.out.println(binaryOperator.apply(6, 8));
//
//        LongToDoubleFunction longLongToDoubleFunction = (number)-> number*12;
//        System.out.println(longLongToDoubleFunction.applyAsDouble(78643));
//

//        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
//        numbers.stream()
//                .filter((number)-> number%2 == 0)
//                .map((number) -> number*number)
//                .forEach(System.out::println);


//        Stream.of(1,3,4,5,6,7,8)
//                .map((number)-> number*2)1234
//                .forEach(System.out::println);

//        Integer[] numbers = {1,2,3,4,5};
//        Arrays.stream(numbers)
//                .map((number)->number*2)
//                .forEach(number-> System.out.println(number));


//        out.println(Stream.of(10, 20, 30, 40).map(String::valueOf)
//                .reduce("",String::concat));
        //reduce takes an entire element of the stream and turns it to one thing


//        Integer result = List.of(10,20,30,40)
//                .stream()
//                .mapToInt((num) ->num)
//                .sum();


//        List<List<Integer>> list = List.of(
//                List.of(10,20,30),
//                List.of(100,200,300),
//                List.of(1000,2000,3000)
//
//        );
//        list.stream().flatMap(Collection::stream).forEach(out::println);


//        int[] nums = {1,2,3,4};
//        out.println(Arrays.stream(nums).map(x -> x * 2).sum());


//
//        Stream.generate(()-> new Random().nextInt())
//                .limit(7)
//                .forEach(Lambdas::displayNumber);


//
//        List<String> phrases = List.of(
//                "1asq","ffdsnaj","hsfsds","sfsfadsf"
//        );
//        phrases.stream().flatMap((phrase)-> Arrays.asList()Stream.of(phrase.toCharArray()))
//
//
//
//    }

//
//        List<Integer> numbers = List.of(100, 2, 30, 45, 76);
//
//
//        Comparator<Integer> comparator = (a,b)-> compareDescending(a,b);
//
//        List<Integer> nums = numbers.stream().sorted(comparator).toList();
//        out.println(nums);




//        List<Integer> numbers = List.of(100, 2, 30, 45, 76,5,5,6,7,8,6,5,4,3);
//        List<Integer> nums = numbers.stream().distinct().sorted().toList();
//        out.println(nums);


//        List<Integer> numbers = List.of(100, 2, 30, 45, 76,5,5,6,7,8,6,5,4,3);
//        List<Integer> nums = numbers.stream()
//                .distinct()
//                .sorted()
//                .collect(Collectors
//                        .toList());
//        out.println(nums);

        List<Integer> numbers = List.of(100, 2, 30, 45, 76,5,5,6,7,8,6,5,4,3);
       List<Integer> nums = numbers.stream()
                .distinct()
               .sorted()
               .collect(Collectors
                       .toMap());
        out.println(nums);


        //private static void displayNumber(int number){
//        try {
//            var writter = new BufferedWriter(new OutputStreamWriter(out));
//            writter.write(Integer.toString(number));
//            writter.newLine();
//            writter.flush();
//        }catch (IOException exception){
//            exception.printStackTrace();
//        }
//}
    }
private static int compareDescending(Integer a, Integer b){
        if(b > a) return 1;
        else if (a > b) return -1;
        return 0;
}
}
