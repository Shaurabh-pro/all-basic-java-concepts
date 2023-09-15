package Collection;

import java.util.LinkedList;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		/*
		 * list.add(100); list.add(200); list.add(500); list.add(800); list.add(300); //
		 * System.out.println(list); Iterator<Integer> itr = list.iterator(); while
		 * (itr.hasNext()) { System.out.println(itr.next());
		 * 
		 * }
		 */
		
		list.add(100);
		list.add(200);
		list.add(500);
		list.add(800);
		list.add(300);
		list.add(300);
		list.add(null);
		list.add(null);


//		System.out.println(list);
		list.forEach(e->System.out.println(e));


	}

}
