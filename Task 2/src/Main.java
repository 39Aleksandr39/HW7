public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников

//        for (int i = 1; i <= 100; i++) {  // мой вариант
//            if (i % 2 != 0) {
//                continue;
//            } else {
//                System.out.println("Уволен айтишник с id " + i);
//            }
//
//        }
        // for (int i = 1; i <= 100 ; i++) {  // вариант преподавателя (плохой) программа проходит все 100 выполнений
        //     if (i % 2 ==0) {
        //         System.out.println("Уволен айтишник с id: " + i);
        //     }
        // }

        // for (int i = 2; i <= 100 ; i = i + 2) {  // вариант преподавателя хороший!!!
        //    System.out.println("Уволен айтишник с id: " + i);
        // }


        int i = 2;

        while (i <= 100) {
            System.out.println("Уволен айтишник с id: " + i);
            i += 2; // i = i + 2
        }
    }
}
