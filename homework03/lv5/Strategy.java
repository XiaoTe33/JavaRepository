package homework03.lv5;

public abstract class Strategy {

    Strategy next; // 下一个准备执行的策略

    abstract void doSomething(int avgScore); //具体的策略，根据年纪平均成绩来执行

    public Strategy getNext() {
        return this.next;
    }

    public static class Builder {
        Strategy strategy;

        public Builder add(Strategy strategy) {
            if (this.strategy == null) {
                this.strategy = strategy;
            } else {
                Strategy cur = this.strategy;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = strategy;
            }


            return this;
        }

        public Strategy build() {
            return this.strategy;
        }
    }


}
