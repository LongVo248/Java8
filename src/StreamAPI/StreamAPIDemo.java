package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Student> people= getStudent();

        //Students with gender is male
        List<Student> males= people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        males.forEach(s -> System.out.println(s));

        //
//        List<Student> age20= people.stream()
//                .filter(person -> person.getAge()>20)

//        age20.forEach(s-> System.out.println(s));
    }
    private static List<Student> getStudent(){
        return List.of(
                new Student(132,"Antonio", 20, Gender.MALE),
                new Student(322,"Alina Smith", 18, Gender.FEMALE),
                new Student(542,"Alina Smith", 26, Gender.MALE),
                new Student(252,"Alina Smith", 33, Gender.FEMALE),
                new Student(572,"Alina Smith", 19, Gender.MALE),
                new Student(213,"Alina Smith", 38, Gender.FEMALE),
                new Student(112,"Alina Smith", 20, Gender.MALE),
                new Student(752,"Alina Smith", 22, Gender.FEMALE),
                new Student(432,"Alina Smith", 27, Gender.MALE)
        );
    }
}
