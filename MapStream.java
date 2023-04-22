/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.stream.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Map<Integer,Integer> map =new HashMap<Integer,Integer>();
		map.put(1,4);
		map.put(3,8);
		map.put(5,3);
		map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue()).forEach(System.out::println);
// 		res.forEach(System.out::println);
	}
}
