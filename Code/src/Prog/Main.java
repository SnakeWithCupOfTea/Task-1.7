//Ввести с клавиатуры строку. Затем ввести строку-разделитель и образовать массив строк,
// разделив исходную строку на подстроки с помощью разделителя.
// в случае отсутствия разделителя внутри исходной строки вывести сообщение
// о невозможности разделения строки на подстроки. Вывести на экран получившиеся подстроки.
package Prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter line");
        String str1 = in.nextLine();
        System.out.println("Enter line to line");
        String str2 = in.nextLine();
        if (str1.contains(str2)) {
            String Astr1[] = str1.split(str2);
            for (int i=0; i<Astr1.length; i++){
                System.out.println(Astr1[i]+str2);
            }
        } else {
            System.out.println("It's not possible to split a string. Missing specified sequence!");

        }
    }
}
