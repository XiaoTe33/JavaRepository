package homework03.lv2c;

import javax.xml.namespace.QName;

public class XueSheng extends People implements XieZuoYe, JiaoZuoYe {
    public XueSheng(String name) {
        super(name);
    }


    @Override
    public void jiao(ShouZuoYe shouZuoYe) {//
        System.out.println(this.name + "：交了作业");
        shouZuoYe.cha();
    }

    @Override
    public void xie() {//
        System.out.println(this.name + "：写了作业");
    }
}
