public class N1 {
    /**
     * В методе main объявить три переменные типа int и присвоить первой числовое значение,
     * вторая переменная равна первой переменной увеличенной на 3, а третья переменная равна сумме первых двух.
     * Вывести результат на консоль.
     */
    public static void main(String[] args) {
        int a = 7;
        int b = a + 3;
        int c = a + b;
        System.out.printf("a=%d\nb=%d\nc=%d", a, b, c);
    }
}
