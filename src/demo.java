import java.util.Scanner;

public class demo {
    static int[][] arr(Scanner scanner){
        int i;
        int j;
        System.out.println("Mời nhập độ dài mảng arr[][]!!");
        i = scanner.nextInt();
        int arr[][]=new int[i][];
        for (int n=0; n<i;n++){
            System.out.println("Mời nhập độ dài mảng con tại"+n);
            j = scanner.nextInt();
            arr[n]= new int[j];
        }
        for (int n=0; n<arr.length;n++){
            for (int m=0;m<arr[n].length;m++){
                System.out.println("Mời nhập phần tử lại arr["+n+"]["+m+"]:");
                arr[n][m] = scanner.nextInt();
            }
        }
        return arr;
    }
    static void MaxArr2Chieu(int arr[][]){
        int max = arr[0][0];
        int index1=0;
        int index2=0;
        for (int n=0; n<arr.length;n++){
            for (int m=0;m<arr[n].length;m++){
                if(arr[n][m]>max){
                    max = arr[n][m];
                    index1=n;
                    index2=m;
                }
            }
        }
        System.out.println("max là: "+max+" tại vị trí arr["+index1+"]["+index2+"]");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][]=arr(scanner);
        MaxArr2Chieu(arr);
//        int max=arr[0][0];
//        for (int n=0; n<arr.length;n++) {
//            for (int m = 0; m < arr[n].length; m++) {
//                if(arr[n][m]>max){
//                    max = arr[n][m];
//                }
//            }
//        }
//        System.out.println(max);
    }
}

