import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        //Detyra 1:

        int[] vargu = {1, 2, 3, 4, 5};

        //Detyra 2:

        String[] vargu2 = new String[4];

        //Detyra 3:

        //E shtyp vargun
        for(int i = 0; i < vargu.length; i++){
            System.out.println(vargu[i]);
        }

        //Detyra 4:

        //Vargu
        int[] vargu3 = new int[10];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < vargu3.length; i++){
            System.out.println("Shtype numrin: ");
            int nr = in.nextInt();
            vargu3[i] = nr;
        }

        for(int i = 0; i < vargu3.length; i++){
            System.out.println(vargu3[i]);
        }

        //Detyra 5:
        //E shtyp vargun pa numrin e pare
        for(int i = 0; i < vargu.length; i++){
            if(i != 0){
                System.out.println(vargu[i]);
            }
        }

        //Detyra 6:

        int[] vargu4 = {1, 2, 3, 4, 5};
        int[] vargu5 = {1, 2, 3, 4, 5};

        //Vargu qe i mbledh
        int[] mbledhja = new int[vargu4.length];

        for(int i = 0; i < mbledhja.length; i++){
            int mbledh = vargu4[i] + vargu5[i];
            System.out.println("Mbledhja: " + vargu4[i] + " Edhe: " + vargu5[i] + " Eshte: " + mbledh);
            mbledhja[i] = mbledh;
        }

        //Detyra 7:

        //Mbledhja pa kusht

        //Vargu
        int[] arr = {1, 2, 3, 4, 5};

        //Variabla qe mbledhet:
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = arr[i] + sum;
        }

        System.out.println("Mbledhja: " + sum);

        //Mbledhja me kusht qe te mbledhen krejt elementet veq te fundit

        //Vargu
        int[] arr2 = {1, 2, 3, 4, 5};

        //Variabla qe mbledhet:
        int sum2 = 0;
        for(int i = 0; i < arr2.length; i++){
            if(i < arr2.length - 1){
                sum2 = arr[i] + sum2;
            }
        }

        System.out.println("Mbledhja: " + sum2);

        //Detyra 8:

        //Shumzimi pa kusht

        //Vargu
        int[] arr3 = {1, 2, 3, 4, 5};

        //Variabla qe shumzon:
        int mult = 1;
        for(int i = 0; i < arr3.length; i++){
            mult = arr[i] * mult;
        }

        System.out.println("Shumzimi: " + mult);

        //Shumzimi me kusht qe te shumzohen krejt elementet veq te fundit

        //Vargu
        int[] arr4 = {1, 2, 3, 4, 5};

        //Variabla qe mbledhet:
        int mult2 = 1;
        for(int i = 0; i < arr4.length; i++){
            if(i < arr4.length - 1){
                mult2 = arr[i] * mult2;
            }
        }

        System.out.println("Shumzimi: " + mult2);

        //DETYRA 9 QYSH MI THIRR METODAT
        System.out.println(numri());
        System.out.println(mbledhja(1, 2));
        pershedetje();
        log("Pershendetje");
    }

    //Detyra 9:

    //Metoda qe kthen vler pa parameter (int qyty)
    public static int numri(){
        return 1;
    }

    //Metoda qe nuk kthen pa parameter (E SHKRUNI ME VOID)
    public static void pershedetje(){
        System.out.println("Pershendetje");
    }

    //Metoda qe kthen vler me parameter
    public static int mbledhja(int a, int b){
        return a + b;
    }

    //Metoda qe nuk kthen vler me parameter
    public static void log(String text){
        System.out.println(text);
    }
}
