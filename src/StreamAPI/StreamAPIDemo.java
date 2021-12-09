package StreamAPI;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    private static Set<StudentDTO> java8StreamAPIDemo(){
        final Set<Student> students= new HashSet<>();
        students.add(new Student(132,"Long", 20, Gender.MALE));
        students.add(new Student(322,"Khanh", 18, Gender.FEMALE));
        students.add(new Student(542,"Luy", 26, Gender.MALE));
        students.add(new Student(252,"Cuong", 33, Gender.FEMALE));
        students.add(new Student(572,"Nhan", 19, Gender.MALE));
        students.add(new Student(213,"Trong", 38, Gender.FEMALE));
        students.add(new Student(112,"Tuan", 20, Gender.MALE));
        students.add(new Student(752,"Vinh", 22, Gender.FEMALE));
        students.add(new Student(432,"Ngoc", 27, Gender.MALE));

        final Set<StudentDTO> studentDTOS= students.stream().map(c -> {
            final StudentDTO studentDTO= new StudentDTO(c.getId(),c.getName(),c.getAge(),c.getGender());
            return studentDTO;
        }).collect(Collectors.toSet());

        studentDTOS.forEach(c -> System.out.println(c.getId()));
        return studentDTOS;
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
