package FACTORY;

class VehicleFactory {
    public static Vehicle getInstance(String type, int wheel) {  // static is very important and return type is parent class as its vehicle factory
      if(type == "car") {
        return new Car(wheel);
      } else if(type == "bike") {
        return new Bike(wheel);
      }
      
      return null;
    }
  }
