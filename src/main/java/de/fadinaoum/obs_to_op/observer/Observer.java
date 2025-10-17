package de.fadinaoum.obs_to_op.observer;

public interface Observer<T> {
    void onNext(T value);
    void onError(Throwable e);
    void onComplete();
}
