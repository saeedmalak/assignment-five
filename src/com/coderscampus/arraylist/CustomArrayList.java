package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Integer size = 0;

	@Override
	public boolean add(T item) {
		// double the size of our Object if the array is full
		if (size == items.length) {
			Object[] newSizeArray = new Object[size * 2];
			for (int i = 0; i < size; i++) {
				newSizeArray[i] = items[i];
			}
			
			// overwrite the current items arrayList
			items = newSizeArray;
		}
		items[size++] = item;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	// not sure what this is "@***", but was necessary to get rid of the warnings
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

}
