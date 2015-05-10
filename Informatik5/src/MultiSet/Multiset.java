package MultiSet;

import java.util.Collection;

public interface Multiset<E> extends Collection<E> {
	int count(E e); 
	int distinct();
	String toString();
}
