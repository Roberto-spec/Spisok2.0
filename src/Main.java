import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Element a=new Element(5);
//        Element b=new Element(3);
//        a.setNext(b);
//        b.setValue(7);
//        System.out.println(a.getNext().getValue());
//        a.show();\
        Scanner scanner = new Scanner(System.in);
        Spisok spisok;
        System.out.println("Введите знасение первого элемента списка:");
        System.out.print(">_");
        spisok=new Spisok(scanner.nextInt());

        int c=1;
        while (c!=0){
            System.out.println("МЕНЮ");
            System.out.println("[1] Добавить елемент");
            System.out.println("[2] Удалить елемент");
            System.out.println("[3] Показать список");
            System.out.println("[0] Выход");
            System.out.print(">_");
            c=scanner.nextInt();
            switch (c){
                case 1:{
                    System.out.println("Введите значение нового элемента");
                    System.out.print(">_");
                    spisok.add(scanner.nextInt());
                    break;
                }
                case 2:{
                    System.out.println("Введите значение удаляемого элемента");
                    System.out.print(">_");
                    spisok.remove(scanner.nextInt());

                    System.out.println("Элемент был успешно удлален!");
                    break;
                }
                case 3:{
                    System.out.println("Список:");
                    spisok.getHead().show();
                    System.out.println();
                    break;
                }
            }
        }
    }
}
