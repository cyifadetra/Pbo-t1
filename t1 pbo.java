import java.util.Scanner;
class tugas1 {
    public static void main(String args[]) {
        char[] a = {'d','e','t','r','a'};
        int[][] x = {{2,3}, {4,5}, {6,7}};

        Scanner input = new Scanner(System.in);
        System.out.print("Nilai : ");
        int n = input.nextInt();                //Input
        System.out.println("Nilainya : " + n);  //output

        if (n % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }

        System.out.println("ARRAY 1D");
        for(int i=0; i<5; i++){        //perulangan For & array 1D
            System.out.println("Index " + i + " = " + a[i]);
        }
        int f = 0;
        while (f < 5) { //While
            System.out.println("Cyifa detra");
            f++;
        }
        int e = 0;
        do { //Do while
            System.out.println("Power Ranger");
            e++;
        }
        while (e < 5);

        System.out.println("ARRAY 2D");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}