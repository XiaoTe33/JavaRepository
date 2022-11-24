package homework04.lv1;

import homework04.lv1.GirlFriendNotFoundException;

public class lv1 {

    public static void main(String[] args) throws Exception {
        makeAnAppointment();
    }

    public static void makeAnAppointment() throws Exception {
        if (true) {
            throw new GirlFriendNotFoundException("醒醒，你没有女朋友！");
        }

    }
}
