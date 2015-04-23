package LinkedList;

public class Zelle<E>{
		public E inhalt;
		public Zelle <E> next;
		
		public Zelle(E e,Zelle<E> rest){
			inhalt=e;
			next=rest;
		}
	}