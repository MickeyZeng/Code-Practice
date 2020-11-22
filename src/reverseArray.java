import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class reverseArray {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int flag = sc.nextInt();
//        int[] array = new int[number];
//        int symbol = 1;
//        boolean symbolReverse = true;
//
//        for (int i = 0; i < number; i++) {
//            if (symbolReverse) {
//                array[i] = (i + 1) * (-1);
//            } else {
//                array[i] = i + 1;
//            }
//
//            ++symbol;
//            if(symbol > flag){
//                symbol = 1;
//                symbolReverse = !(symbolReverse);
//            }
//        }
//
//        int result = 0;
//        for (int i = 0 ; i < array.length ; i++){
//            result = result + array[i];
//        }
//
//        System.out.println(result);
//    }


//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int days = sc.nextInt();
//        int chocolate = sc.nextInt();
//        double result = 0;
//
//        result = test(days, chocolate);
//
//        System.out.print(result);
//    }
//
//    public static double test(int days, int chocolate) {
//        int firstDay = 2;
//        double tempResult = 0;
//        while (true) {
//            tempResult = 0;
//            for (int i = 0; i < days; i++) {
//                tempResult = tempResult + Math.pow(firstDay, i);
//            }
//            if (2 * tempResult < chocolate) {
//                firstDay = firstDay + 1;
//            } else {
//                break;
//            }
//        }
//
//        System.out.println(firstDay);
//        return Math.pow(firstDay, (days - 1));
//    }


//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int totalNumber = sc.nextInt();
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//
//        for (int i = 0; i < totalNumber; i++) {
//            arrayList.add(sc.nextInt());
//        }
//
//        ArrayList<Integer> tempList = new ArrayList<Integer>();
//        for (int i = 0; i < arrayList.size(); i++) {
//            tempList.add(arrayList.get(i));
//        }
//
//        Collections.sort(tempList);
//        int temp = -1;
//        int index = -1;
//        for (int i = 0; i < arrayList.size(); i++) {
//            temp = arrayList.get(i);
//            for (int j = 0; j < tempList.size(); j++) {
//                if (tempList.get(j) == temp) {
//                    index = j;
//                    break;
//                }
//            }
//            tempList.remove(index);
//            System.out.println(tempList.get((int) (tempList.size() / 2)));
//            tempList.add(index, temp);
//        }
//
//    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int totalNumber = sc.nextInt(); // 4
        int resultNumber = sc.nextInt(); // 2
        ArrayList<String> arrayList = new ArrayList<String>();
        sc.nextLine();
        for (int i = 0; i < totalNumber; i++) {
            arrayList.add(sc.nextLine());
        }
        int[][] times = new int[totalNumber][2];

        ArrayList<String> tempList = new ArrayList<String>();
        for (int i = 0; i < arrayList.size(); i++) {
            tempList.add(arrayList.get(i));
        }

        Collections.sort(arrayList);
        String last = "";

        for (int i = 0; i < arrayList.size(); i++) {
            times[i][0] = i;
            if (arrayList.get(i).equals(last)) {
                times[i][1] = times[i - 1][1] + 1;
                times[i - 1][1] = times[i][1];
            } else {
                times[i][1] = 1;
                last = arrayList.get(i);
            }
        }

        int[] temp = new int[2];
        for (int i = 0; i < times.length; i++) {
            for (int j = i; j < times.length; j++) {
                if (times[i][1] > times[j][1]) {
                    temp[0] = times[i][0];
                    temp[1] = times[1][1];
                }else if(times[i][1] == times[j][1]){
                    
                }
            }
        }

        for (int i = 0; i <= resultNumber; i++) {
            System.out.print(tempList.get(times[i][0]) + " " + times[i][1]);
            System.out.println();
        }


        for (int i = 0; i < resultNumber; i++) {
            System.out.print(tempList.get(times[totalNumber - 1 - i][0]) + " " + times[totalNumber - 1 - i][1]);
            System.out.println();
        }


    }


}
