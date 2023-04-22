/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.stream.*;

class Student{
    String name;
    int age;
    public Student(String n,int a){
        this.name = n;
        this.age =a;
    }
    
    public int getAge(){
        return age;
    }
}

public class Main
{
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("pradeep",23));
		list.add(new Student("kumar",21));
		list.add(new Student("Dummy",35));
		
		List<String> res = list.stream().sorted(Comparator.comparing(Student::getAge,(s1,s2)-> s1.compareTo(s2))).map(x -> x.name).collect(Collectors.toList());
		res.forEach(System.out::println);
	}
}
