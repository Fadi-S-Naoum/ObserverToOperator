package de.fadinaoum.obs_to_op.observable;

import java.util.ArrayList;
import java.util.List;

import de.fadinaoum.obs_to_op.Subscription;
import de.fadinaoum.obs_to_op.observer.Observer;

public class Observable {
	private final OnSubscribe onSubscribe;
	private final List<Subscription>  subscriptions = new ArrayList<>();

	private Observable(OnSubscribe onSubscribe) {
		this.onSubscribe = onSubscribe;
	}

	public static Observable create(OnSubscribe onSubscribe) {
		return new Observable(onSubscribe);
	}

	public <T> Subscription subscribe(Observer<? super T> observer) {
		Subscription subscription = onSubscribe.call(observer);
		subscriptions.add(subscription);
		return subscription;
	}
}
