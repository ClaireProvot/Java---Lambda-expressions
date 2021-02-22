package org.predicate;

@FunctionalInterface
public interface Predicate<T> {

    //only 1 abstract method for functional interface
    public boolean test(T t);

    public default Predicate<T> and(Predicate<T> other) {
        return t -> test(t) && other.test(t);
    }

    public default Predicate<T> or(Predicate<T> other) {
        return t -> test(t) || other.test(t);
    }

    public static <U> Predicate<U> isEqualsTo(U u) {
        return s -> s.equals(u);
    }
}
