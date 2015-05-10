package LinkedListSet;



import java.util.Iterator;

import LinkedList.LinkedList;


@SuppressWarnings("")
public class LinkedListSet<E extends Comparable<E>> implements Set<E> {
	private LinkedList<E> list;
	
	public LinkedListSet() {
		list = new LinkedList<E>();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean contains(E e) {
		return list.contains(e);
	}

	
	@Override
	public boolean add(E e) {
		if(this.list.contains(e)) return false;
		else{
			list.add(e);
			return true;
		}
	}

	@Override
	public boolean remove(E e) {
		return list.remove(e);
	}

	@Override
	public boolean remove() {
		return list.remove();
	}

	@Override
	public void clear() {
		list.clear();
		
	}

	@Override
	public E getMatch(E e) {
		return (E) list.getMatch(e);
	}

	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}
	
	
	

}
