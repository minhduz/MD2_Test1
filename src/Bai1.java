import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Phần tử thứ %d là: ",i+1);
            array[i] = scanner.nextInt();
        }
        do {
            System.out.println("*******************MENU*******************");
            System.out.println("1. Hiển thị giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("3. In giá trị max, min các phần tử trong mảng");
            System.out.println("4. Sắp xếp mảng giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("\nCác phần tử trong mảng là: ");
                    for (int j : array) {
                        System.out.printf("%5d", j);
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("\nCác số nguyên tố có trong mảng là: ");
                    for (int k : array) {
                        int check = checkPrime(k);
                        if (check == 0) {
                            System.out.printf("%5d", k);
                        }
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    int min = array[0], max = array[0];
                    for (int k : array) {
                        if (k < min) {
                            min = k;
                        }
                        if (k > max) {
                            max = k;
                        }
                    }
                    System.out.printf("\nPhần tử nhỏ nhất của mảng là: %d\n",min);
                    System.out.printf("Phần tử lớn nhất của mảng là: %d\n",max);
                    System.out.println("\n");
                    break;
                case 4:

                    System.out.print("\nMảng sau khi sắp xếp là: ");
                    for (int i = 0; i < array.length-1; i++) {
                        for (int j = i+1; j < array.length; j++) {
                            if(array[i] < array[j]){
                                int x = array[i];
                                array[i] = array[j];
                                array[j] = x;
                            }
                        }
                    }
                    for (int j : array) {
                        System.out.printf("%5d", j);
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại (1-6)");
                    System.out.println("");
            }
        }while (true);

    }

    static int checkPrime(int n){
        int k = 0;
        if (n<2){
            k = 1;
        }
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                k = 1;
            }
        }
        return k;
    }
}