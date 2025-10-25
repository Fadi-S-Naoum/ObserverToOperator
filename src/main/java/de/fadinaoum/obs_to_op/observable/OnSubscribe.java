package de.fadinaoum.obs_to_op.observable;

import de.fadinaoum.obs_to_op.Subscription;
import de.fadinaoum.obs_to_op.observer.Observer;

@FunctionalInterface
public interface OnSubscribe<T> {
	Subscription call(Observer<? super T> observer);
}
