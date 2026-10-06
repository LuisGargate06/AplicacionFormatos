import java.util.Scanner;
class C1{
   static void prin(int mon, int denom){
      int n = mon / denom;
      
      if(n == 0)  return;
      if(denom > 5){
         if (n == 1) System.out.printf(" 1 billete de %d soles.\n", denom);
         else  System.out.printf(" %d billetes de %d soles.\n", n, denom);
         return;
      }
      if(denom == 5)  {System.out.printf("1 moneda de 5 soles.\n"); return;}
      if(denom == 1){
         if(n == 1)  System.out.printf("1 moneda de 1 sol.\n");
         else  System.out.printf(" %d monedas de 1 sol.\n", n);
         return;
      }
   }
   
   //Ponemos el main
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int mon;
      System.out.printf("Ponga el monto a retirar: ");
      mon = sc.nextInt();
      
      if(mon == 0) {System.out.printf("No esta poniendo ningún monto.\n"); return;}
      System.out.printf("Usted recibirá:\n");
      prin(mon, 200);   mon %= 200;
      prin(mon, 100);   mon %= 100;
      prin(mon, 50);    mon %= 50;
      prin(mon, 20);    mon %= 20;
      prin(mon, 10);    mon %= 10;
      prin(mon, 5);     mon %= 5;
      prin(mon, 1);
   }
}