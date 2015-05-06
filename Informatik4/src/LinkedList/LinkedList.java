package LinkedList;

import java.util.Iterator;

public class LinkedList<E extends Comparable<E>> implements List<E> {
	private Zelle<E> anker;
	private Cursor cursor;
	private int size;

	public LinkedList() {
		this.anker = new Zelle<E>(null, null);
		this.cursor = new Cursor(anker);
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.anker.next == null;
	}

	public boolean contains(E e) {
		Cursor cursor1 = new Cursor(anker);
		cursor1.goToFirst();
		while (!cursor1.atEnd()) {
			if (cursor1.get().compareTo(e) == 0) {
				return true;
			}
			cursor1.goToNext();
		}
		return false;

	}

	public boolean add(E e) {
		this.cursor.add(e);
		this.size += 1;
		return true;
	}

	public boolean remove() {
		if (this.atEnd())
			return false;
		else {
			this.cursor.remove();
			return true;
		}
	}

	public boolean remove(E e) {
		if (this.isEmpty())
			return false;
		if (this.contains(e)) {
			this.cursor.goTo(e);
			this.cursor.remove();
			return true;
		}
		return false;
	}

	public void clear() {
		this.cursor.goToFirst();
		this.anker.next=null;
		this.size = 0;

	}

	public E getMatch(E e) {
		if (!contains(e))
			return null;
		else
			return e;
	}

	public Iterator<E> iterator() {
		return new Cursor(anker);
	}

	public E get() {
		if (this.cursor.atEnd()) {
			return null;
		} else {
			return this.cursor.get();
		}
	}

	public void goToFirst() {
		this.cursor.goToFirst();

	}

	public void goToNext() {
		this.cursor.goToNext();

	}


	public boolean atEnd() {
		return this.cursor.atEnd();
	}

	public String toString() {
		String string = "";
		int count = 0;
		Cursor cursor = new Cursor(anker);
		while (!cursor.atEnd()) {
			string += "" + count + ":" + cursor.get() + "\n";
			cursor.goToNext();
			count++;
		}

		return string;
	}

	private class Cursor implements Iterator<E> {

		private Zelle<E> z;

		private Cursor(Zelle<E> z) {
			this.z = z;
		}

		public void remove() {
			if (!this.atEnd()) {
				this.z.next = this.z.next.next;
			}
		}

		private void add(E e) {
			this.z.next = new Zelle<E>(e, this.z.next);
			this.goToNext();
		}

		private E get() {
			return this.z.next.inhalt;
		}

		private void goToFirst() {
			this.z = anker;
		}

		private void goToNext() {
			if (!this.atEnd()) {
				this.z = this.z.next;
			}
		}

		private boolean atEnd() {
			return this.z.next == null;
		}

		private void goTo(E e) {
			this.goToFirst();
			while (!this.atEnd() && e.compareTo(this.get()) != 0) {
				this.goToNext();
			}
		}

		public boolean hasNext() {
			return !this.atEnd();
		}

		public E next() {
			E e = this.get();
			this.goToNext();
			return e;
		}

	}

}
