import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class hangout {
//    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer = new StringBuffer(scanner.nextLine());
//        StringBuffer data = new StringBuffer(scanner.nextLine());
//        //System.out.print(data + " ");
//        int number = Integer.valueOf(stringBuffer.toString()); //number of building
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        for (int i = 0; i < number; i++) {
//            arrayList.add(Integer.valueOf(data.toString().split(" ")[i]));
//            //System.out.print(Integer.valueOf(data.toString().split(" ")[i]));
//        }
//
//        for (int i = 0; i < number; i++) {
//            int tempResult = 0;
//            int frontResult = 0;
//            int backResult = 0;
//            int tempHigh = 0;
//            int tempLow = 0;
//            int index = 0;
//            int flag = 0;
//            for (int j = 0; j < number; j++) {
//                if (j < i) {
//                    //向前看
//                    if (arrayList.get(j) <= tempHigh) {
//                        if(flag > 0){
//                            flag = 0;
//                        }
//                        frontResult++;
//                        index = j;
//                        while (index >= 1) {
//                            if (arrayList.get(j) >= arrayList.get(index - 1)) {
//                                if(j - index == 2){
//                                    frontResult = flag + frontResult;
//                                }
//                                index = index - 1;
//                                frontResult--;
//                                if(j - index >= 2) {
//                                    flag++;
//                                }
//                            } else {
//                                break;
//                            }
//                        }
//
//                    } else {
//
//                        frontResult = 1;
//                        tempHigh = arrayList.get(j);
//
//                    }
//                } else if (j == i) {
//                    //刚好等于自己
//                    tempResult++;
//                } else {
//                    //向后看
//                    if (arrayList.get(j) <= tempLow) {
//                        continue;
//                    } else {
//                        tempLow = arrayList.get(j);
//                        backResult++;
//                    }
//                }
//            }
//            System.out.print(frontResult + tempResult + backResult + " ");
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        // stack中要保存的是 能看见的楼的 index
        int[] rightLook = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = len - 1; i >= 0; i--) {
            rightLook[i] = stack.size();
            while ((!stack.isEmpty()) && (arr[i] >= arr[stack.peek()])) {
                stack.pop();
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = 0; i < len; i++) {
            int total = rightLook[i] + 1 + stack.size();
            while ((!stack.isEmpty()) && (arr[i] >= arr[stack.peek()])) {
                stack.pop();
            }
            System.out.print(total + " ");
            stack.push(i);
        }
    }
}
