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

        //Students with age >20
        long age20= people.stream()
                .filter(person -> person.getAge()>20)
                .count();
        System.out.println("Students with age >20: "+age20);
    }
    private static List<Student> getStudent(){
        return List.of(
                new Student(132,"Long", 20, Gender.MALE),
                new Student(322,"Khanh", 18, Gender.FEMALE),
                new Student(542,"Luy", 26, Gender.MALE),
                new Student(252,"Cuong", 33, Gender.FEMALE),
                new Student(572,"Nhan", 19, Gender.MALE),
                new Student(213,"Trong", 38, Gender.FEMALE),
                new Student(112,"Tuan", 20, Gender.MALE),
                new Student(752,"Vinh", 22, Gender.FEMALE),
                new Student(432,"Ngoc", 27, Gender.MALE)
        );
    }
}
