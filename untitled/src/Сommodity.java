import java.util.Scanner;

public class Сommodity {
 private String name;
 private String producer;
 private String expiration_date;
 private int cost;
 private int code;
 private int amount;
 private String newField;

 public Сommodity(String name, String producer, int cost, int code, String expiration_date, int amount) {
  this.name = name;
  this.producer = producer;
  this.cost = cost;
  this.code = code;
  this.expiration_date = expiration_date;
  this.amount = amount;
 }

 public Сommodity(String name, String producer, int cost, int code, String expiration_date, int amount, String newField) {
  this(name, producer, cost, code, expiration_date, amount);
  this.newField = newField;
 }

 public void info() {
  System.out.print("Код товару: ");
  System.out.println(code);
  System.out.print("Назва товару: ");
  System.out.println(name);
  System.out.print("Виробник товару: ");
  System.out.println(producer);
  System.out.print("Ціна за товар: ");
  System.out.println(cost);
  System.out.print("Кількість товару на складі: ");
  System.out.println(amount);
 }

 public int order() {
  System.out.println("Введіть кількість товару для замовлення: ");
  Scanner sc = new Scanner(System.in);
  int order = sc.nextInt();
  return order;
 }

 // Геттери для отримання значень полів
 public String getName() {
  return name;
 }

 public String getProducer() {
  return producer;
 }

 public String getExpirationDate() {
  return expiration_date;
 }

 public int getCost() {
  return cost;
 }

 public int getCode() {
  return code;
 }

 public int getAmount() {
  return amount;
 }

 public String getNewField() {
  return newField;
 }

 // Сеттери для встановлення значень полів
 public void setName(String name) {
  this.name = name;
 }

 public void setProducer(String producer) {
  this.producer = producer;
 }

 public void setExpirationDate(String expiration_date) {
  this.expiration_date = expiration_date;
 }

 public void setCost(int cost) {
  this.cost = cost;
 }

 public void setCode(int code) {
  this.code = code;
 }

 public void setAmount(int amount) {
  this.amount = amount;
 }

 public void setNewField(String newField) {
  this.newField = newField;
 }
}
