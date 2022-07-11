package src.com.katsup.iterator;

public interface Iterator {
  boolean hasNext();

  Product current();

  void next();
}
