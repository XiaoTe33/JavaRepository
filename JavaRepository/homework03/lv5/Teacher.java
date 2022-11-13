package homework03.lv5;

public class Teacher {
    void doStrategy(Strategy strategy,int avg){
        if (strategy!=null){
            strategy.doSomething(avg);
        }else {
            System.out.println("null");
        }
    }

}
