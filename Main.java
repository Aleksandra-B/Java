
public class Main {
    public static void main(String[] args) {
        Message stri = new Message("Паспортные данные:  СеРия 5678  №54231 Выдан 20 июня 1988 года рождения.");
        System.out.println(stri.reverse());
        System.out.println(stri.countWords());
        System.out.println(stri.count('а'));
        System.out.println(stri.number());
        System.out.println(stri.seria());
    }
}
