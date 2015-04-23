package LinkedList;

import java.util.Iterator;

public class LinkedList<E extends Comparable<E>> implements List<E> {
	private Zelle<E> anker;
	private Cursor cursor;
	
	
	public LinkedList() {
		anker= new Zelle<E>(null, null);
		cursor= new Cursor(anker);
	}
	
	
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean add(E e) {
		cursor.add(e);
		return true;
	}

	public boolean remove(E e) {
		if(cursor.atEnd()) return true;
		else{
			cursor.remove();
			return true;
		}
	}

	
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	public E getMatch(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator<E> iterator(){
		return new Cursor(anker);
	}

	public E get() {
		if(cursor.atEnd()){
			return null;
		}
		else{
			return cursor.get();
		}
	}

	
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void goToFirst() {
		cursor.goToFirst();
		
	}

	
	public void goToNext() {
		cursor.goToNext();
		
	}
	
	public void goTo(E e){
		cursor.goTo(e);
	}

	
	public boolean atEnd() {
		return cursor.atEnd();
	}
	
	private class Cursor implements Iterator<E>{
		private Zelle<E> z;
		
		private Cursor(Zelle<E>z){
			this.z=z;
		}
		
		public void remove(){
			if(!atEnd()){
				z.next=z.next.next;
			}
		}
		
		private void add(E e){
			z.next = new Zelle<E>(e, z.next);
			goToNext();
		}
		
		private E get(){
			return z.next.inhalt;
		}
		
		private void goToFirst(){
			z= anker;
		}
		
		private void goToNext(){
			if(!atEnd()){
				z=z.next;
			}
		}
		
		private boolean atEnd(){
			return z.next==null;
		}
		
		private void goTo(E e){
			goToFirst();
			while(!atEnd() && e.compareTo(get())!=0){
				goToNext();
			}
		}

		@Override
		public boolean hasNext() {
			return atEnd();
		}

		@Override
		public E next() {
			E e = get();
			goToNext();
			return e;
		}
		
		
		
		
	}
	

}
