package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
    return String("Hello Dff");
  }

 /**
   * This is a method.
   */
  public final String greet(final String someone) {
    return String.format("Hello Dff, %s!", someone);
  }
}