public class Main {
    public static void main(String[] args) {
        // Task 1:
        // Объявите три массива:
        // 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        // 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        // 3. Произвольный массив – тип и количество данных определите сами.
        //    Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        // 1.
        int [] intArray = new int [3];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        // 2.
        double [] fracArray = {1.57, 7.654, 9.986};

        // 3.
        boolean [] boolArray = {true, true, false, false};

        // Task 2:
        // Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива
        // и первым элементом следующего не нужна.
        // На одной строчке расположены элементы только одного массива.

        // распечатка intArray
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.println(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }

        // распечатка fracArray
        for (int i = 0; i < fracArray.length; i++) {
            if (i == fracArray.length - 1) {
                System.out.println(fracArray[i]);
            } else {
                System.out.print(fracArray[i] + ", ");
            }
        }

        // распечатка boolArray
        for (int i = 0; i < boolArray.length; i++) {
            if (i == boolArray.length - 1) {
                System.out.println(boolArray[i]);
            } else {
                System.out.print(boolArray[i] + ", ");
            }
        }

        // Task 3:
        // Теперь ваша задача – распечатать все элементы всех трех массивов,
        // но начинать нужно не с первого элемента массива, а с последнего.
        // Элементы должны быть распечатаны через запятую, при этом элементы одного массива
        // располагаются на одной строчке, а элементы другого массива – на другой.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        // распечатка в обратном порядке intArray
        for (int i = 1; i <= intArray.length; i++) {
            if (i == intArray.length) {
                System.out.println(intArray[intArray.length - i]);
            } else {
                System.out.print(intArray[intArray.length - i] + ", ");
            }
        }

        // распечатка в обратном порядке fracArray
        for (int i = 1; i <= fracArray.length; i++) {
            if (i == fracArray.length) {
                System.out.println(fracArray[fracArray.length - i]);
            } else {
                System.out.print(fracArray[fracArray.length - i] + ", ");
            }
        }

        // распечатка в обратном порядке boolArray
        for (int i = 1; i <= boolArray.length; i++) {
            if (i == boolArray.length) {
                System.out.println(boolArray[boolArray.length - i]);
            } else {
                System.out.print(boolArray[boolArray.length - i] + ", ");
            }
        }

        // Task 4:
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        // Важно: код должен работать с любым целочисленным массивом,
        // поэтому для решения задания вам нужно использовать циклы.
        // Распечатайте результат преобразования в консоль. В консоли распечатан только целочисленный массив.

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
            System.out.println(intArray[i]);
        }
    }
}