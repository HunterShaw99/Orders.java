//Hunter M Shaw
//CS Lab 9am
//3/20/2020
//give price of items from quantity

import java.util.Scanner;

public class Orders{

  public static void main(String[] args){
    getOrders();
  }

  static void getOrders(){
    Scanner in = new Scanner(System.in);
    final double A105_PRICE = 13.67f;
    final double A207_PRICE = 21.65f;
    final double D671_PRICE = 20.55f;
    final double X111_PRICE = 39.99f;
    final double X902_PRICE = 4.56f;
    String productCode = "";
    int productQty = 0;
    int a105Qty = 0;
    int a207Qty = 0;
    int d671Qty = 0;
    int x111Qty = 0;
    int x902Qty = 0;
    boolean productCheck = true;
    boolean errorCheck = true;
    System.out.print("Enter Product code and Quantity: ");
    productCode = in.next();
    productQty = in.nextInt();
    do{
      switch(productCode.toUpperCase()){
        case "A105":
        if (productQty >= 0){
          a105Qty += productQty;
          errorCheck = true;
        }
        else{
          errorCheck = false;
        }
          break;
        case "A207":
        if (productQty >= 0){
          a207Qty += productQty;
          errorCheck = true;
        }
        else{
          errorCheck = false;
        }
          break;
        case "D671":
        if (productQty >= 0){
          d671Qty += productQty;
          errorCheck = true;
        }
        else{
          errorCheck = false;
        }
          break;
        case "X111":
        if (productQty >= 0){
          x111Qty += productQty;
          errorCheck = true;
        }
        else{
          errorCheck = false;
        }
          break;
        case "X902":
        if (productQty >= 0){
          x902Qty += productQty;
          errorCheck = true;
        }
        else{
          errorCheck = false;
        }
          break;
        case "ZZZZ":
          if (productQty == 0){
            productCheck = false;
          }
          errorCheck = false;
          break;
        default:
          errorCheck = false;
          break;
      }
      if (productCheck){
        if (errorCheck){
          System.out.print("Enter Product code and Quantity: ");
          productCode = in.next();
          productQty = in.nextInt();
        }
        else {
          System.out.print("ERROR!! Re-Enter Product code and Quantity: ");
          productCode = in.next();
          productQty = in.nextInt();
        }
      }

    }while(productCheck);
    double a105Total = getPrice(a105Qty, A105_PRICE);
    double a207Total = getPrice(a207Qty, A207_PRICE);
    double d671Total = getPrice(d671Qty, D671_PRICE);
    double x111Total = getPrice(x111Qty, X111_PRICE);
    double x902Total = getPrice(x902Qty, X902_PRICE);
    System.out.printf("A105: %1d items  Price = $%.2f\n"
        + "A207: %1d items  Price = $%.2f\n"
        + "D671: %1d items  Price = $%.2f\n"
        + "X111: %1d items  Price = $%.2f\n"
        + "X902: %1d items  Price = $%.2f\n"
        + "Total Price: $%.2f", a105Qty, a105Total,
        a207Qty, a207Total, d671Qty, d671Total,
        x111Qty, x111Total, x902Qty, x902Total,
        calcTotalPrice(a105Total, a207Total, d671Total, x111Total, x902Total));
        in.close();
  }

  static double getPrice(int qty, final double PRICE){
    return qty * PRICE;
  }
  static double calcTotalPrice (double x, double y, double z, double a, double b ){
    return x + y + z + a + b;
  }

}
