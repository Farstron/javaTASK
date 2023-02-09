import java.util.Random;
public class l {
public static void main(String[] args) {
    // дан массив чисел, нужно сформировать новую выборку 
    // из только четных чисел
    // 2 147 483 647
    // 531_103_740
    int[] m1 = new int[100];
    int ch = 0;
    for (int c = 0; c < m1.length; c++){
        m1[c]= new Random().nextInt(-1000,1000);
        System.out.print(m1[c] + " ");
        if (m1[c] % 2 == 0){
        ch=ch+1;}
        }
    int j = 0;
    System.out.println("");
    System.out.println("______");
    int[] m2 = new int[ch];
    for (int c = 0; c < m1.length; c++){
        if (m1[c] % 2 == 0){
            m2[j] = m1[c];
            System.out.print(m1[c] + " ");
            j++;
        }
    }
    }
    // int j = 0;
    // int[] m1 = new int[100];
    // int[] m2 = new int[100];
    // for (int c = 0; c < m1.length; c++){
    //     m1[c]= new Random().nextInt(-1000,1000);
    //     if (m1[c] % 2 == 0){
    //             m2[j] = m1[c];
    //             System.out.print(m1[c] + " ");
    //             j++;
    //         }
        
    //     }
    // for (int c = 0; c < m1.length; c++){
    //     System.out.print(m1[c] + " ");
    // }
    // System.out.println("___________");
    // for (int c = 0; c < m2.length; c++){
    //     System.out.print(m2[c] + " ");
    // }
    
}
    

/**
 * Innerl
 */
