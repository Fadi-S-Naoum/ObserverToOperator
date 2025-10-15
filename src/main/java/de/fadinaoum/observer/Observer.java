package de.fadinaoum.observer;

public interface Observer<T> {
    void onNext(T value);
    void onError(Throwable e);
    void onComplete();
}
