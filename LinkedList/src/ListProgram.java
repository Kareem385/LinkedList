import java.util.*;
public class ListProgram {
	
	public static void main(String [] args){
	
	String [] things = {"apples", "noobs", "bacon", "goats"}; //an array of random things
	List<String> list = new LinkedList<String>();
	
	for(String x: things)
		list.add(x);  //adding things String to list.
	
	String [] things2 = {"orranges", "bananas", "grapes", "oats"};
	List<String> list2 = new LinkedList<String>();
	
	for(String y: things2)
		list2.add(y);
	
	list.addAll(list2);
		
	
	
	printMe(list);
	removestuff(list, 2,5);
	printMe(list);
	reverseMe(list);
	}
	
//Methods below
	
private static void printMe(List<String> l){   //String list parameter
	for(String b: l)
		System.out.printf("%s ", b);
		System.out.println();
	} 
	
	private static void removestuff(List<String> l, int from, int to){
		l.subList(from, to).clear();
	}
	
	private static void reverseMe(List<String> l){
		ListIterator<String> list2 = l.listIterator(l.size());
		while(list2.hasPrevious())
			System.out.printf("%s ", list2.previous());
	}
	
}

	

