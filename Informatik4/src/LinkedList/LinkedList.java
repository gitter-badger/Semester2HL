package LinkedList;

import java.util.Iterator;

public class LinkedList<E extends Comparable<E>> implements List<E> {
	private Zelle<E> anker;
	private Cursor cursor;
	private int size;
	
	
	public LinkedList() {
		anker= new Zelle<E>(null, null);
		cursor = new Cursor(anker);
		size=0;
	}
	
	
	public int size() {
		return size;
	}

	
	public boolean isEmpty() {
		return size==0;
	}

	
	public boolean contains(E e) {
		E save = cursor.get();
		cursor.goToFirst();
		while(!cursor.atEnd()){
			if(cursor.next().compareTo(e)==0){
				cursor.goTo(save);
				return true;
			}
		}
		cursor.goTo(save);
		return false;
		
	}

	
	public boolean add(E e) {
		cursor.add(e);
		size+=1;
		return true;
	}

	public boolean remove(E e) {
		if(cursor.atEnd()) return true;
		else{
			cursor.remove();
			size-=1;
			return true;
		}
	}

	
	public void clear() {
		cursor.goToFirst();
		cursor.z.next=null;
		size=0;
		
	}

	
	public E getMatch(E e) {
		if(!contains(e)) return null;
		else return e;
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

		public boolean hasNext() {
			return !atEnd();
		}

		
		public E next() {
			E e = get();
			goToNext();
			return e;
		}
		
		
		
		
	}
	

}
