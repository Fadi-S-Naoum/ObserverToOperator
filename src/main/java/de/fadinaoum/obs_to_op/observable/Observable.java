package de.fadinaoum.obs_to_op.observable;

import java.util.ArrayList;
import java.util.List;

import de.fadinaoum.obs_to_op.Subscription;
import de.fadinaoum.obs_to_op.observer.Observer;

public class Observable<T> {
	private final OnSubscribe<T> onSubscribe;

	private Observable(OnSubscribe<T> onSubscribe) {
		this.onSubscribe = onSubscribe;
	}

	public static <T> Observable<T> create(OnSubscribe<T> onSubscribe) {
		return new Observable<T>(onSubscribe);
	}

	public Subscription subscribe(Observer<? super T> observer) {
		return onSubscribe.call(observer);
	}
}
