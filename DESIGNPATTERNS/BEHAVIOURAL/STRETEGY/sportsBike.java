package strategy;
import strategy.interfaces.fastStrategy;

// import interfaces.normalStrategy;
public class sportsBike extends vehicle {
    sportsBike(){
        super(new fastStrategy());
    }
}
