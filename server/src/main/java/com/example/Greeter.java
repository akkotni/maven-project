package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * some one the name of the person
   * geeting string
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
