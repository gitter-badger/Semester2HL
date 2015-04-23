package LinkedList;

import java.util.Iterator;

public class LinkedList<E> implements List<E> {
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
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(E e) {
		return true;
	}

	
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	public E getMatch(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void goToFirst() {
		// TODO Auto-generated method stub
		
	}

	
	public void goToNext() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean atEnd() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private class Cursor{
		private Zelle<E> z;
		
		public Cursor(Zelle<E>z){
			this.z=z;
		}
		
		public void remove(){
			if(!atEnd()){
				z.next=z.next.next;
			}
		}
		
		public void add(E e){
			z.next = new Zelle<E>(e, z.next);
			goToNext();
		}
		
		public E get(){
			return z.next.inhalt;
		}
		
		public void goToFirst(){
			z= anker;
		}
		
		public void goToNext(){
			if(!atEnd()){
				z=z.next;
			}
		}
		
		public boolean atEnd(){
			return z.next==null;
		}
		
		
	}
	

}
