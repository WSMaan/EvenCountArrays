class EvenCount {
    public static void main(String[] args) {
        int[] number1 = {2, 1, 2, 3, 4};
        int[] number2 = {2, 2, 0};
        int[] number3 = {1, 3, 5};
        System.out.println(evenIntCount(number1));
//        System.out.println(evenIntCount(number2));
//        System.out.println(evenIntCount(number3));
    }

    public static int evenIntCount(int[] numbers) {
        int evenCount = 0;
        for (int number : numbers) {
            evenCount += (number % 2 == 0) ? 1 : 0;
        }

        return evenCount;
    }
}