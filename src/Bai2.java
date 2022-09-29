import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số hàng,cột: ");
        int rows = scanner.nextInt();

        int[][] arr = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("Phần tử thứ [%d][%d]",i,j);
                arr[i][j] = scanner.nextInt();
            }
        }
        do {
            System.out.println("*********************MENU*********************");
            System.out.println("1. In giá trị các phần tử của mảng theo ma trận");
            System.out.println("2. In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng");
            System.out.println("3. Sắp xếp mảng tăng dần theo cột");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("\nIn mảng theo ma trận là: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < rows; j++) {
                            System.out.printf("%5d",arr[i][j]);
                        }
                        System.out.println("");
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    int sum1=0;
                    int sum2=0;
                    System.out.print("\nCác phần tử nằm trên đường chéo chính là: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < rows; j++) {
                            if (i==j){
                                System.out.printf("%5d",arr[i][j]);
                                sum1+=arr[i][j];
                            }
                        }
                    }
                    System.out.printf("\n Tổng của các phần tử nằm trên đường chéo chính là: %d\n",sum1);

                    System.out.print("\nCác phần tử nằm trên đường chéo phụ là: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < rows; j++) {
                            if (i+j==rows-1){
                                System.out.printf("%5d",arr[i][j]);
                                sum2+=arr[i][j];
                            }
                        }
                    }
                    System.out.printf("\n Tổng của các phần tử nằm trên đường chéo chính là: %d\n",sum2);
                    break;
                case 3:
//                    for (int i = 0; i < rows ; i++) {
//                        for (int j = 0; j < rows; j++) {
//
//                        }
//                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn lại (1-4)");
                    System.out.println("");
            }
        }while (true);
    }
}
