package strategy;
import strategy.interfaces.normalStrategy;
public class motorbike extends vehicle {
    public motorbike(){
        super(new normalStrategy());
    }
}
