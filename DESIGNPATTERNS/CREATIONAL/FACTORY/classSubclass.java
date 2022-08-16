// If you want to represent any object as a string, toString() method comes into existence.

// The toString() method returns the String representation of the object.

// If you print any object, Java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depending on your implementation.

// Advantage of Java toString() method
// By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.

package FACTORY;

abstract class Vehicle {
    public abstract int getWheel();
    
    public String toString() {
      return "Wheel: " + this.getWheel();
    }
  }
  
  class Car extends Vehicle {
    int wheel;
    
    Car(int wheel) {
      this.wheel = wheel;
    }
  
    @Override
    public int getWheel() {
      return this.wheel;
    }
  }
  
  class Bike extends Vehicle {
    int wheel;
    
    Bike(int wheel) {
      this.wheel = wheel;
    }
    
    @Override
    public int getWheel() {
      return this.wheel;
    }
  }
