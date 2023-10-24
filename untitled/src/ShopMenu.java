import java.util.Scanner;

public class ShopMenu {
    public static void menu() {
        Visitors cocacola = new Visitors("Coca Clasic", "CocaCola", 70, 691, "22", 80);
        Revision lastre = new Revision("11.09.2023", 0, +4200);
        final Employees emp1 = new Employees("John", "Nolan", 30, 400, 54, 1);
        final Employees emp2 = new Employees("Sky", "Walker", 20, 200, 15, 2);
        final Employees emp3 = new Employees("Oskar", "Morrison", 22, 350, 20, 3);
        int a = cocacola.getAmount();
            System.out.println("Ви попали до меню. Оберіть що бажаєте дізнатись: ");
            System.out.println("1 - Інформацію про працівника.");
            System.out.println("2 - Інформацію про товар.");
            System.out.println("3 - Інфорацію про останню ревізію.");
            System.out.println("4 - Оформити замовлення.");
            System.out.println("5 - Вийти з меню");
            System.out.println("Введіть про що бажаєте дізнатись(лише цифру): ");
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Введіть номер працівника(emp№)");
                    int number = sc.nextInt();
                    if (emp1.getCode() == number) {
                        emp1.recursivePrint("Загальна інформація про працівника:", 1);
                        emp1.info();
                        emp1.getSalary();
                    } else if (emp2.getCode() == number) {
                        emp2.recursivePrint("Загальна інформація про працівника:", 1);
                        emp2.info();
                        emp2.getSalary();
                    } else if (emp3.getCode() == number) {
                        emp3.recursivePrint("Загальна інформація про працівника:", 1);
                        emp3.info();
                        emp3.getSalary();
                    } else {
                        System.out.println("Такого працівника не існує");
                    }
                    menu();
                case 2:
                    System.out.println("Оберіть що бажаєте: ");
                    System.out.println("1 - Інформація про товар");
                    System.out.println("2 - Замовлення товару");
                    int com = sc.nextInt();
                    switch (com) {
                        case 1:
                            System.out.println("Введіть код товару: ");
                            int com2 = sc.nextInt();
                            if (com2 == cocacola.getCode()) {
                                cocacola.info();
                            }
                            menu();
                        case 2:
                            System.out.println("Введіть код товару: ");
                            int com3 = sc.nextInt();
                            if (com3 == cocacola.getCode()) {
                                System.out.println("Зараз товару на складі: ");
                                System.out.println(a);
                                a = a + cocacola.order();
                                System.out.println("Товару на складі після замовлення: ");
                                System.out.println(a);
                            } else {
                                System.out.println("Товару з таким кодом немає в базі даних.");
                            }
                            menu();}
                    case 3:
                      lastre.info();
                      System.out.println("Наступна ревізія:");
                      System.out.println(lastre.nextRevision());
                      menu();
                case 4:
                    cocacola.orderv();
                    menu();
                case 5:
                        System.out.println("Stop");
                      break;
            }
     }
}
