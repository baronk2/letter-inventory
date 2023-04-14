// Class ArrayIntList can be used to store a list of integers.

public class ArrayIntList {
   private int[] elementData; // list of integers
   private int size;          // current number of elements in the list
   public static final int DEFAULT_CAPACITY = 100;
   // post: constructs an empty list of default capacity
   public ArrayIntList() {
       this(DEFAULT_CAPACITY);
   }
   // pre : capacity >= 0
   // post: constructs an empty list with the given capacity
   public ArrayIntList(int capacity) {
       elementData = new int[capacity];
       size = 0;
   }
   // post: returns the current number of elements in the list
   public int size() {
       return size;
   }
   // pre : 0 <= index < size()
   // post: returns the integer at the given index in the list
   public int get(int index) {
       return elementData[index];
   }
   // post: creates a comma-separated, bracketed version of the list
   public String toString() {
       if (size == 0) {
           return "[]";
       } else {
           String result = "[" + elementData[0];
           for (int i = 1; i < size; i++)
               result += ", " + elementData[i];
           result += "]";
           return result;
       }
   }
   // post : returns the position of the first occurrence of the given
   //        value (-1 if not found)
   public int indexOf(int value) {
       for(int i = 0; i < size; i++)
           if (elementData[i] == value)
               return i;
       return -1;
   }
   // pre : size() < capacity (elementData.length)
   // post: appends the given value to the end of the list
   public void add(int value) {
        elementData[size] = value;
        size++;
   }

   // pre: size() < capacity (elementData.length) && 0 <= index <= size()
   // post: inserts the given value at the given index, shifting subsequent
   //       values right
   public void add(int index, int value) {
        for (int i = size; i > index; i--)
            elementData[i] = elementData[i - 1];
        elementData[index] = value;
        size++;
   }

   // pre : 0 <= index < size()
   // post: removes value at the given index, shifting subsequent values left
   public void remove(int index) {
        for (int i = index; i < size - 1; i++)
            elementData[i] = elementData[i + 1];
        size--;
   }
	 
	public void removeAll(int value) {
	 	for (int i = size - 1; i >= 0; i--) {
			if (elementData[i] == value)
				remove(i);
		}//eo for
	}//eo removeAll
	
	
	//pre: n is greater than or equal to 0
	public void stretch(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		int newSize = n * size;
		int[] newElementData = new int[newSize];
		for (int i = 0; i < newSize; i++)
			newElementData[i] = elementData[i / n];
		elementData = newElementData;
		size = newSize;
	}//eo stretch
	
	public int longestSortedSequence() {
		if (size == 0)
			return 0;
		int longest = 1;
		int count = 1;
		for (int i = 0; i < size - 1; i++) {
			if (elementData[i] < elementData[i + 1]) {
				count++;
				if (count > longest)
					longest = count;
			} else
				count = 1;
		}//eo for
		return longest;
	}//eo longestSortedSequence
}