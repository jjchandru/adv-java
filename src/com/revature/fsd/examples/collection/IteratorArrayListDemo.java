package com.revature.fsd.examples.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayListDemo {
	
	public static void main(String args[]) {
		ArrayList<String> superHeroes = new ArrayList<>();
		superHeroes.add("Batman");
		superHeroes.add("Spiderman");
		superHeroes.add("Superman");
		superHeroes.add("Iron Man");
		superHeroes.add("Captain America");
		
		Iterator<String> iterator = superHeroes.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
