package home_work_02_data_types_variables_operators;

public class HomeWork1 {

    public static void main(String[] args) {
        //1. Вывести последнюю цифру числа

        int myInt = 123456;
        int lastNum = 0;
        lastNum = myInt % 10;

        System.out.println("1. Последняя цифра числа: "+myInt+" ровна: "+lastNum);

        //---------------------------------------------------------------
        //2. найти сумму цифр ab+cd числа abcd

        int myIntABCD = 1234;
        int summABCD = 0;
        int intAB = 0;
        int intCD = 0;
        intCD = myIntABCD % 100;
        intAB = myIntABCD / 100;
        summABCD = intAB+intCD;

        System.out.println("2. Сумма цифр AB+CD числа: "+myIntABCD+" ровна: "+summABCD);

        //---------------------------------------------------------------
        //3. Вывести третью цифру пятизначного числа

        int myInt5 = 78945;
        int int3th = 0;

        int3th = myInt5 / 100;
        int3th = int3th % 10;

        System.out.println("3. Третья цифра пятизначного числа : "+myInt5+" ровна: "+int3th);

        //---------------------------------------------------------------
        //4. Оперделить длину отрезка проходящего через две точки
        double x1 = 2;
        double y1 = 3;
        double x2 = 7;
        double y2 = 6;
        double len= 0;

        len = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        System.out.println("4. Координаты первой точки ("+x1+","+y1+ ") "
                +"второй точки ("+x2+","+y2+") длина отрезка ровна: "+len);

        //---------------------------------------------------------------
        //5. Имеется прямоугольное отверстие размера a на b.
        // Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r

        int sizeA = 6;
        int sizeB = 8;
        int radius = 5;
        double diagonal = 0;
        double diametr = 0;
        String result = "не закрывает";

        diagonal = Math.sqrt((sizeA*sizeA+sizeB*sizeB));
        diametr = radius*2;

        if (diametr >= diagonal) {
            result = "закрывает";
        }



        System.out.println("5. Круглая кортонка, диаметром "+radius+" "+result
                +" прямоугольник со сторонами "+sizeA+" и "+sizeB);
        System.out.println("Диагональ прямоугольника "+diagonal);
        System.out.println("Диаметр круга "+diametr);


        //---------------------------------------------------------------
        //6. Вывести уравнение прямой, проходящей через две точки
        //уравнение прямой y=kx+b, координаты точек взяты с задачи номер 4
        double k;
        double b;

        k = ((y1 - y2)/(x1 - x2));//+((y1 - y2)%(x1 - x2));//тут ошибка
        b = y2 - k * x2;

        System.out.println("6. Координаты первой точки ("+x1+","+y1+ ") "
                +"второй точки ("+x2+","+y2+"), уравнение прямой: y = "+k+"x + "+b);

    }


}
