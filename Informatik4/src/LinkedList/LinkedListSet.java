package LinkedList;


import java.util.Iterator;

public class LinkedListSet<E extends Comparable<E>> implements Set<E>{

	private int size;
	private Zelle<E> anker;
	private Cursor cursor;
	
	public LinkedListSet() {
		anker = new Zelle<E>(null,null);
		size=0;
		cursor = new Cursor(anker);
	}
	
	public void goTo(E e){
		cursor.goTo(e);
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public boolean contains(E e) {
		Cursor cursor1=new Cursor(anker);
		cursor1.goToFirst();
		while(!cursor1.atEnd()){
			if(cursor1.get().compareTo(e)==0){
				return true;
			}
			cursor1.goToNext();
		}
		return false;
	}
	
	

	@Override
	public boolean add(E e) {
		if(this.contains(e)) return false;
		else {
		cursor.add(e);
		size+=1;
		return true;
		}
	}

	@Override
	public boolean remove(E e) {
		if(cursor.atEnd()) return false;
		else{
			cursor.remove();
			size-=1;
			return true;
		}
	}
	

	@Override
	public void clear() {
		cursor.goToFirst();
		cursor.z.next=null;
		size=0;
		
	}

	@Override
	public E getMatch(E e) {
		if(!this.contains(e)) return null;
		else return e;
	}

	@Override
	public Iterator<E> iterator() {
		return new Cursor(anker);
	}

	@Override
	public E get() {
		if(cursor.atEnd()) return null;
		else{
			return cursor.get();
		}
	}

	@Override
	public void goToFirst() {
		cursor.goToFirst();
		
	}

	@Override
	public void goToNext() {
		cursor.goToNext();
		
	}

	@Override
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
