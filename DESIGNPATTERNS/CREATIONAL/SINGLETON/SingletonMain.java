package SINGLETON;
public class SingletonMain {
  
    public static void main(String[] args) {
      SingletonSynchronized instance = SingletonSynchronized.getInstance();
      
      System.out.println(instance);
      
      SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
      
      System.out.println(instance1);
    }
  }