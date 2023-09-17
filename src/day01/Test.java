package day01;

public class Test {
    public static void main(String[] args) {
        // 1.构造一个存储空间的顺序表，将字符a~s存入顺序表
        SqListClass<Character> sql = new SqListClass<Character>();

        Character[] c = new Character['s' - 'a' + 1];
        for (int i = 0; i < 's' - 'a' + 1; i++) {
            c[i] = (char) ('a' + i);
        }
        sql.CreateList(c);
        System.out.println("顺序表中插入字母 a ~ s");
        System.out.println(sql);




        // 2.查找字母h所在位置，显示i的直接后继元素，s的前驱元素
        int h = sql.GetNo('h');
        int i = sql.GetNo('i');
        int s = sql.GetNo('s');


        Character jn = sql.GetElem(i + 1);
        Character qn = sql.GetElem(s - 1);

        System.out.println("h所在的位置为：" + h);
        System.out.println("i的后继元素为：" + jn);
        System.out.println("s的前驱元素为：" + qn);





        // 3.在字母f前插入y
        Character y = 'y';
        Character f = 'f';
        int no = sql.GetNo(f);
        sql.Insert(no - 0, y);

        System.out.println(sql);



        // 4.删除第一、第三位置的字符
        int a = 1;
        int b = 3;
        int count = 0;
        for (int j = 0; j < sql.size; j++) {
            if (j == a && count == 0) {
                sql.Delete(a);
                count++;
            }
            if (j == b && count == 1) {
                sql.Delete(b);
                count++;
            }
        }
        System.out.println("删除完第1和第3位序号后的顺序表为：");
        System.out.println(sql);



        // 5.输出顺序表的长度
        System.out.println("顺序表当前长度为" + sql.size);

        System.out.println("===============22及软工2班  冼智勇=============");
    }

}
