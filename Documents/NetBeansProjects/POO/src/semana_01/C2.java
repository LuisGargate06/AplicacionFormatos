import java.util.Scanner;
class C2{
   static  Scanner sc = new Scanner(System.in);
   public static void main (String[] args){
      int m,n;
      m = LeerNum();
      n = LeerNum();
      operaciones(m,n);
   }
   
   static int LeerNum(){
      int m;
      System.out.printf("Ingrese un numero entero: ");
      m = sc.nextInt();
      return m;
   }
   
   static int menu(){
      int op;
      System.out.printf("\n Operaciones: \n");
      System.out.printf("1) Suma: m + n\n");
      System.out.printf("2) Resta: m - n\n");
      System.out.printf("3) Multiplicación: m x n\n");
      System.out.printf("4) Divición: m / n\n");
      System.out.printf("5) Salir:\n");
      do{
         System.out.printf("Elija su opción: ");   op = sc.nextInt();
      } while(op < 1 || op > 5);
      return op;
   }
   
   static void operaciones(int m,int n){
      int op;
      do{
         op = menu();
         switch (op){
            case 1: suma(m,n); break;
            case 2: resta(m,n); break;
            case 3: multiplicar(m,n); break;
            case 4: dividir(m,n); break;
            default: System.out.printf("Gracias por su visita :)");
         }
      }while (op != 5);
   }
   
   static void suma(int m, int n){ System.out.printf("Suma : %d \n", m + n);}
   static void resta(int m, int n){ System.out.printf("Resta: %d\n", m - n);}
   static void multiplicar(int m, int n) { System.out.printf("Multiplicación: %d", m*n);}
   static void dividir(int m, int n){
      if(n == 0)  System.out.printf("No se puede dividir :(");
      else System.out.printf("División: %.2f", (float)m/n);
   }
}