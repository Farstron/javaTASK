package HW2;

public class hw2 {
    static String findSubString(String str, String pat)
    {
        int len1 = str.length();
        int len2 = pat.length();
 
        if (len1 < len2) {
            System.out.println("Таких нет!");
            return "";
        }
 
        int hash_pat[] = new int[256];
        int hash_str[] = new int[256];
 
        for (int i = 0; i < len2; i++)
            hash_pat[pat.charAt(i)]++;
 
        int start = 0, start_index = -1,
            min_len = Integer.MAX_VALUE;
        int count = 0;
        for (int j = 0; j < len1; j++) {
           
            hash_str[str.charAt(j)]++;
 
            if (hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)])
                count++;
 
            if (count == len2) {
                while (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)] || hash_pat[str.charAt(start)]== 0) {
                    if (hash_str[str.charAt(start)]
                        > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }
 
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
 
        if (start_index == -1) {
            System.out.println("Таких нет!");
            return "";
        }
 
        return str.substring(start_index, start_index + min_len);
    }
    
    static boolean Rotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
    
    static String reverse(String str){
        if ((str == null)||(str.isEmpty())){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args)
    {
        // Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
        String str = "fgsajglkueglkjsbfkjlbkheuhgfrkjbskjlb";
        String pat = "kghs";
        System.out.println(findSubString(str, pat));

        // Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
        String str1 = "AACD";
        String str2 = "ACDA";
        if (Rotations(str1, str2))
            System.out.println("Строка перевертышь");
        else
            System.out.printf("Строка не перевертышь");
        
        // *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        String fstr = "String";
        String rev = reverse(fstr);
        System.out.println(rev);

        // Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        int a = 3;
        int b = 56;
        StringBuilder sum = new StringBuilder();
        StringBuilder sub = new StringBuilder();
        StringBuilder mult = new StringBuilder();
        String lin = Integer.toString(a)+"+"+Integer.toString(b)+"="+Integer.toString(a+b)+" "
            +Integer.toString(a)+"-"+Integer.toString(b)+"="+Integer.toString(a-b)+" "
            +Integer.toString(a)+"*"+Integer.toString(b)+"="+Integer.toString(a*b);
        sum.append(lin,0,7);
        sub.append(lin,8,16);
        mult.append(lin,17,lin.length());
        System.out.println(sum+"\n"+sub+"\n"+mult);

        // Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        StringBuilder sum1 = sum;
        sum1.insert(4," равно ");
        sum1.deleteCharAt(11);
        StringBuilder sub1 = sub;
        sub1.insert(4," равно ");
        sub1.deleteCharAt(11);
        StringBuilder mult1 = mult;
        mult1.insert(4," равно ");
        mult1.deleteCharAt(11);
        System.out.println(sum1+"\n"+sub1+"\n"+mult1);
        
        
        // *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        StringBuilder sum2 = new StringBuilder();
        StringBuilder sub2 = new StringBuilder();
        StringBuilder mult2 = new StringBuilder();
        sum2.append(lin,0,7);
        sub2.append(lin,8,16);
        mult2.append(lin,17,lin.length());
        sum2.replace(4,5," равно ");
        sub2.replace(4,5," равно ");
        mult2.replace(4,5," равно ");
        System.out.println(sum2+"\n"+sub2+"\n"+mult2);
    }
}