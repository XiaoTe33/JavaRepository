package homework03.lv5;

public class Process {
    public static void main(String[] args) {
        Strategy strategy = new Strategy.Builder()
                .add(new Strategy() {
                    @Override
                    void doSomething(int avgScore) {
                        if (avgScore > 90) {
                            System.out.println("大家做的都非常好");
                        } else {
                            getNext().doSomething(avgScore);
                        }
                    }
                }).add(new Strategy() {
                    @Override
                    void doSomething(int avgScore) {
                        if (avgScore > 80) {
                            System.out.println("大家还要继续努力呀");
                        } else {
                            getNext().doSomething(avgScore);
                        }
                    }
                }).build();
        new Teacher().doStrategy(strategy, 81);

    }

}
