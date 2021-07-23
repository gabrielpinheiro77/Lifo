import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===============LIFO===============");
		
		List<Integer> list = new ArrayList<>();
		
		for(Integer i=1; i<=10; i++) {
			System.out.println("Adicionando " + i);
			list.add(i);
		}
		
		System.out.println();
		System.out.println(list);
		System.out.println();
		
		for(Integer i=10; i>=1; i--) {
			System.out.println("Removendo " + i);
			list.remove(i);
		}
		
		System.out.println();
		System.out.println(list);

	}

}
