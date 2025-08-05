package org.shark.IoC.chap03_component;

public class Multiplier {
  
  public int multiply(int...args) {
    if (args == null) {
      return 0;
    }
    
    int result = 1;
    for (int i = 0; i < args.length; i++) {
      result *= args[i];
    }
    return result;
    
    
  }
}
