
import java.util.Random;
public class HW1 {
    
    public static void main(String[] args) {
        // Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
        int i = new Random().nextInt(-1000,1000);
        int tempi = i;  
        System.out.printf("Случайное число: %d;\n",i);
        // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n;
        if (i>0){
            for (n = 0; tempi != 0; n++){ 
                tempi = tempi >> 1;
        } 
        }
        else n = 32;
        System.out.println(n);
        //  Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int j = 0;
        int[] m1 = new int[1000000];
        for (int c = i; c < Short.MAX_VALUE; c++){
            if (c % n == 0){
                m1[j] = c;
                j++;
            }
        }
        j = 0;
        System.out.printf("Первые элементы массива m1: %d %d %d;\n",m1[0],m1[1],m1[2]);
        // Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] m2 = new int[1000000];
        for (int c = Short.MIN_VALUE; c < i ; c++){
            if (c % n == 0){
                m2[j] = c;
                // System.out.println(m1[j]);
                j++;
            }
        }
        System.out.printf("Первые элементы массива m2: %d %d %d;\n",m2[0],m2[1],m2[2]);
    }
}