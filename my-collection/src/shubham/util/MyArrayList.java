package shubham.util;

import java.util.Arrays;

public class MyArrayList {
	
	private static final int DEFAULT_CAPACITY = 10;
	
	private int size;
	
	private Object[] arr = {};
	
	public MyArrayList() {
		arr = new Object[DEFAULT_CAPACITY];
	}
	
	public MyArrayList(int initialCapacity) {
		if (initialCapacity > 0) {
			arr = new Object[initialCapacity];
		} else {
			throw new IllegalArgumentException("Cannot initialize the List with negative size");
		}
	}
	
	//Ensures that the array is always half empty. If not increase the size.
	private void ensureCapacity() { 
		if (size >= arr.length/2) {
			arr = Arrays.copyOf(arr, (arr.length*2-arr.length/2));
		}
	}
	
	public boolean add(Object obj) {
		ensureCapacity();
		arr[size] = obj;
		size++;
		return true;
	}
	
	public void add(int index, Object obj) {
		if (index > (size-1) || index < 0) {
			throw new IndexOutOfBoundsException(index);
		} else {
			if (arr[index].equals(null)) {
				arr[index] = obj;
				size++;
			} else { //Element already present
				ensureCapacity();
				int pointer = index;
				while(arr[pointer] != null) {
					pointer++;
				}
				while(pointer != index) {
					arr[pointer] = arr[pointer-1];
					pointer--;
				}
				arr[index] = obj;
				size++;
			}
		}

	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
	public int size() {
		return size;
	}
	
	
}
