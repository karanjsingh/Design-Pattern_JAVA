package strategy;
import strategy.interfaces.driveStrategy;

class vehicle{
    driveStrategy variab;
    vehicle(driveStrategy obj){
        this.variab = obj;
    }

    public void drive() {
        variab.drive();
    }
}


