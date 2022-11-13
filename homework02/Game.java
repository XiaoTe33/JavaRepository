package homework02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*主程序*/
public class Game {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("小兵属性：");//感觉已经调好属性比自己输入更合理一些，就没按题目来了
            System.out.println(new Melee().toString2());
            System.out.println(new DistantSoldiers().toString2());
            System.out.println(new GunCarriage().toString2());
            System.out.println(new SuperSoldiers().toString2());
            System.out.println("--------------------------------------------");
        }//小兵属性列表
        System.out.println("请输入英雄属性(名字  生命值  攻击力  防御力)：");
        {
            System.out.println("例如(可cv):");
            System.out.println("影流之主 639 200 50");
            System.out.println("重邮校霸 888 250 50");
            System.out.println("重邮不知名高手 6666 120 20");
            System.out.println("打不死的小强 100000 50 999999");
            System.out.println("RedRocker 999999 999999 999999");
            System.out.println("--------------------------------------------");
        }//示例
        Hero hero = new Hero(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());//输入英雄属性
        {
            System.out.println("1.普通模式(每个兵种一个)");
            System.out.println("2.购物+普通模式");
            System.out.println("3.兵种数量");
            System.out.println("4.购物+兵种数量");
            System.out.println("------------------");
            System.out.print("请选择模式：");
        }//模式列表
        switch (sc.nextInt()) {
            case 1:
                mode01(hero);//普通模式(每个兵种一个)
                break;
            case 2:
                mode01(shop(hero));//购物+普通模式
                break;
            case 3:
                mode02(hero);//兵种数量
                break;
            case 4:
                mode02(shop(hero));//购物模式+兵种数量
                break;
        }
    }

    /*普通模式*/
    public static void mode01(Role hero) {
        ArrayList<Role> soldiers = new ArrayList<>();//小兵集合
        ArrayList<Role> heroes = new ArrayList<>();//英雄集合
        heroes.add(hero);//添加英雄
        int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
        Scanner scanner = new Scanner(System.in);
        soldiers.add(new DistantSoldiers());//添加兵种
        soldiers.add(new SuperSoldiers());//添加兵种
        soldiers.add(new GunCarriage());//添加兵种
        soldiers.add(new Melee());//添加兵种
        ArrayList<ArrayList<Role>> fighters = new ArrayList<>();//存储进攻方和防守方
        fighters.add(heroes);//同上
        fighters.add(soldiers);//同上
        round(fighters);//开干
    }

    /*兵种数量设置模式*/
    public static void mode02(Role hero) {
        ArrayList<Role> soldiers = new ArrayList<>();//小兵集合
        ArrayList<Role> heroes = new ArrayList<>();//英雄集合
        heroes.add(hero);//添加英雄
        int t1 = 0, t2 = 0, t3 = 0, t4 = 0, t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入各种士兵的数量");
        System.out.print("近战小兵：");
        t = scanner.nextInt();//设置添加数量
        while (t1++ < t) {
            soldiers.add(new Melee());//添加兵种
        }
        System.out.print("远程小兵：");
        t = scanner.nextInt();//设置添加数量
        while (t2++ < t) {
            soldiers.add(new DistantSoldiers());//添加兵种
        }
        System.out.print("炮车：");
        t = scanner.nextInt();//设置添加数量
        while (t3++ < t) {
            soldiers.add(new GunCarriage());//添加兵种
        }
        System.out.print("超级兵：");
        t = scanner.nextInt();//设置添加数量
        while (t4++ < t) {
            soldiers.add(new SuperSoldiers());//添加兵种
        }
        ArrayList<ArrayList<Role>> fighters = new ArrayList<>();//存储进攻方和防守方
        fighters.add(heroes);//同上
        fighters.add(soldiers);//同上
        round(fighters);//开干
    }

    public static void round(ArrayList<ArrayList<Role>> fighters) {
        while (fighters != null) {//用来控制结束
            fighters = fight(fighters);
        }
    }

    public static int r = 1;//记录回合数

    public static ArrayList<ArrayList<Role>> fight(ArrayList<ArrayList<Role>> a) {
//        System.out.println("fight");//调试代码

        /*提取出进攻方和防守方两个数组*/
        ArrayList<Role>[] aArray = new ArrayList[a.size()];
        a.toArray(aArray);
        Role[] att = new Role[aArray[0].size()];
        Role[] def = new Role[aArray[1].size()];
        aArray[0].toArray(att);//存放进攻方Arraylist
        aArray[1].toArray(def);//存放防守方Arraylist

        if (!aArray[0].isEmpty() && !aArray[1].isEmpty()) {
            return fightRole(aArray[0], aArray[1]);
        } else {
            return null;//配合前面while控制程序结束
        }

    }

    public static ArrayList<ArrayList<Role>> fightRole(ArrayList<Role> a1, ArrayList<Role> a2) {
//        System.out.println("fightRole");//调试代码
        System.out.println("_________________________________________________");
        System.out.println("round:" + r++);
        System.out.println();
        int target = new Random().nextInt(a2.size());//挑选被攻击的小兵
        Role[] a1Array = new Role[a1.size()];
        Role[] a2Array = new Role[a2.size()];
        a1.toArray(a1Array);//取出英雄对象
        a2.toArray(a2Array);//取出受击小兵对象
        System.out.println("【战前信息】");
        System.out.println(a1Array[0].toString());
        System.out.println(a2Array[target].toString());
        System.out.println("---------------------");

        a2Array[target].beAttacked(a1Array[0]);
        System.out.println("【战斗情况】");
        System.out.println(a1Array[0].getName() + "---->" + a2Array[target].getName());//默认英雄先攻击
        if (a2Array[target].getHp() > 0) {//小兵没死就反击
            a1Array[0].beAttacked(a2Array[target]);
            System.out.println(a1Array[0].getName() + "<----" + a2Array[target].getName());
        }
        System.out.println("---------------------");

        ArrayList<Role> b1 = new ArrayList<>();//用来存英雄战斗结果
        ArrayList<Role> b2 = new ArrayList<>();//用来存小兵战斗结果
        b1.add(a1Array[0]);
        for (Role role : a2Array) {
            b2.add(role);
        }//把小兵战斗结果一个一个存进去
        System.out.println("【战斗结果】");
        return clear(combine(b1, b2));//清除死亡的小兵和英雄

    }

    /*外层清除*/
    public static ArrayList<ArrayList<Role>> clear(ArrayList<ArrayList<Role>> arrayList1) {
//        System.out.println("clear");//调试代码
        ArrayList<Role>[] bArray = new ArrayList[arrayList1.size()];
        arrayList1.toArray(bArray);//提取进攻方和防守方
        return combine(clearRoles(bArray[0]), clearRoles(bArray[1]));//内层清除
    }


    /*内层清除*/
    public static ArrayList<Role> clearRoles(ArrayList<Role> a) {
//        System.out.println("clearRoles");//调试代码
        ArrayList<Role> b = new ArrayList<>();
        Role[] aArray = new Role[a.size()];
        a.toArray(aArray);
        for (Role role : aArray) {
            if (role.getHp() > 0) {
                b.add(role);
            }
            if (role.getHp() <= 0) {
                role.died();
            }
        }
        return b;
    }


    /*合并*/
    public static ArrayList<ArrayList<Role>> combine(ArrayList<Role> a1, ArrayList<Role> a2) {
//        System.out.println("combine");//调试代码
        ArrayList<ArrayList<Role>> b = new ArrayList<>();
        b.add(a1);
        b.add(a2);
        return b;
    }//将两个Arraylist合成一个Arraylist<Arraylist>


    /*道具商店*/
    public static Role shop(Hero hero) {
        System.out.println("商店：");
        Equipment e1 = new Equipment("短剑", 0, 50, 0);
        Equipment e2 = new Equipment("圆盾", 0, 0, 10);
        Equipment e3 = new Equipment("红宝石", 100, 0, 0);
        Equipment e4 = new Equipment("长剑", 0, 100, 0);
        Equipment e5 = new Equipment("大盾", 0, 0, 20);
        System.out.println("序号[1]  " + e1);
        System.out.println("序号[2]  " + e2);
        System.out.println("序号[3]  " + e3);
        System.out.println("序号[4]  " + e4);
        System.out.println("序号[5]  " + e5);//创建一些装备并且输出信息
        System.out.println("请输入您要购买的装备的序号(输入0退出商店):");
        boolean t = true;
        while (t)//购买
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    hero.purchase(e1);
                    break;
                case 2:
                    hero.purchase(e2);
                    break;
                case 3:
                    hero.purchase(e3);
                    break;
                case 4:
                    hero.purchase(e4);
                    break;
                case 5:
                    hero.purchase(e5);
                    break;
                default:
                    t = false;
                    break;
            }
        return hero;//买完东西返回
    }
}