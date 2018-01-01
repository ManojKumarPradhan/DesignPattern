package com.bigob.observer;

public interface Mobile {
	
	void addObserver(Observe observe);
	void removeObserver(Observe observe);
	void notification();
}
