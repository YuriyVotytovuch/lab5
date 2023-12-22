import java.util.Scanner;

public class Visitors extends Сommodity{
    Сommodity cocacola = new Сommodity("Coca Clasic", "CocaCola", 70, 691, "22", 80);
    ShopMenu shop = new ShopMenu();
    int amountvis;
    int countz;
    int price = cocacola.getCost();
    Scanner sc = new Scanner(System.in);

    public Visitors(String name, String producer, int cost, int code, String expiration_date, int amount) {
        super(name, producer, cost, code, expiration_date, amount);
    }

    public String order(){
        System.out.println("Введіть продукт який замовили: ");
        System.out.println("1 - Кокакола");
        int check = sc.nextInt();
        if(check==1){
            System.out.println("Введіть кількість: ");
            amountvis=sc.nextInt();
            System.out.println("Ціна замовлення:" + price*amountvis);
        }
        return "";
    }
}
