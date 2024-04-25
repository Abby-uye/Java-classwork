import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaFunctions {
    public static int countCharactersInAListOfStrings(List<String> listOfStrings){
        int numberOfCharacters = listOfStrings.stream().mapToInt(word -> word.length()).sum();
        return numberOfCharacters;
    }

    public static List<User> createUsers(List<String> listOfNames){
        List<User> listOfUser = new ArrayList<>();
        listOfNames.stream().forEach(name->{
            listOfUser.add(new User(name,name.length()));
        });
        return listOfUser;
    }
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Abby");
        listOfStrings.add("uye");
        System.out.println(countCharactersInAListOfStrings(listOfStrings));

       List<User> listOfUser = createUsers(listOfStrings);
        for (User user:listOfUser){
            System.out.println(user.getAge());
            System.out.println(user.getName());
        }

    }


}
