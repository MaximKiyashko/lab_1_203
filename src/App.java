import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.task_4_v2();
    }

    public void task_1_v2() {
        int[] mas1 = { 1, 2, 3, 4, 5 };
        int[] mas2 = { 3, 4, 1, 2, 5 };
        Arrays.sort(mas1);
        Arrays.sort(mas2);
        System.out.println(Arrays.compare(mas1, mas2));
    }

    public void task_2_v2() {
        int[] mas1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int indexToRemove = 1;
        int[] res = new int[mas1.length - 1];
        System.arraycopy(mas1, 0, res, 0, indexToRemove);
        System.arraycopy(mas1, indexToRemove + 1, res, indexToRemove, mas1.length - indexToRemove - 1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public void task_3_v2() {
        char[] alpha = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] d = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        StringBuilder s = new StringBuilder("1C5");
        int pow = s.length() - 1;
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < alpha.length; j++) {
                if (s.charAt(i) == alpha[j]) {
                    res += d[j] * Math.pow(16, pow);
                    pow--;
                    break;
                }
            }
        }
        System.out.println(res);
    }

    public void task_4_v2() {
        int max_number = 100;
        int current_number = 0;
        int prev_number = 1;
        int prev_prev_number = 1;
        do{
            System.out.println(current_number);
            current_number = prev_number + prev_prev_number;
            prev_prev_number = prev_number;
            prev_number = current_number;
        }while(current_number <= max_number);
    }



    //

    public void task_4() {
        int[] mas = { 2, 4, 6, 8, 9, 11, 121, 131, 141, 151 };
        for(int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 != 0 || mas[i] == 2)
            {
                double s = Math.sqrt(mas[i]);
                boolean simple = true;
                for (int j = 2; j <= s; j++) {
                  if (mas[i] % j == 0) {
                    simple = false;
                    break;
                  }
                }
                if (simple)
                {
                    System.out.println(mas[i] + " просте число");
                    simple = true;
                }
            }

        }
    }

    public void task_3() {
        int digit = 571;
        int temp = digit;
        int temp_1 = 0;
        StringBuilder res = new StringBuilder();
        do {
            temp_1 = temp;
            temp /= 8;
            res.append((temp_1 - temp * 8));
        }while(temp >= 8);
        res.append(temp);
        System.out.println(res.reverse());
    }

    public void task_2() {
        double[] mas = { 1.2, 2.5, 3.7, 4.9, 5.1, 6.3 };
        int index = 2;
        double digit = 10.9;
        double[] resultMas = new double[mas.length + 1];
        System.arraycopy(mas, 0, resultMas, 0, index);
        resultMas[index] = digit;
        System.arraycopy(mas, index, resultMas, index + 1, mas.length - index);
        for (int i = 0; i < resultMas.length; i++) {
            System.out.println(resultMas[i]);
        }
    }

    public void task_1() {
        int[] mas1 = { 1, 2, 3, 4, 5 };
        int[] mas2 = { 3, 4, 5, 6, 7 };
        int[] masresult = new int[5];
        boolean match = false;
        int elem = 0;
        for(int i = 0; i < mas1.length; i++)
        {
            for(int j = 0; j < mas2.length; j++)
            {
                if (mas1[i] == mas2[j]) {
                    match = true;
                    break;
                }
            }
            if (!match)
            {
                masresult[elem] = mas1[i];
                elem++;
                match = false;
            }
        }
        
        for(int i = 0; i < masresult.length; i++) {
            System.out.println(masresult[i]);
        }
    }

    
}
