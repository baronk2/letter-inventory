public class AIL_Tester {
	
	public static void main(String[] args) {
		ArrayIntList list = new ArrayIntList();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(8);
		list.add(122);
		list.add(-1);
		System.out.println(list.longestSortedSequence());
	}//eo main
	
}//eo AIL_Tester