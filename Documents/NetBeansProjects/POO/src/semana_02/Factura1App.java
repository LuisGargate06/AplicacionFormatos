import java.util.Scanner;
public class Factura1App{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      final double DESCUENTO = 0.1 , IGV = 0.18;
      String articulo;
      int cantidad;
      double precio, soles;
      
      System.out.println("Compra");
      System.out.print("\tIngrese el nombre del articulo: ");
      articulo = sc.next();
      System.out.print("\tIngrese el precio: ");
      precio = sc.nextDouble();
      System.out.print("\tIngrese la cantidad: ");
      cantidad = sc.nextInt();
      
      System.out.println("\nFactura");
      System.out.println("\tPrecio  Cantidad       Soles");
      soles = cantidad * precio;
      System.out.printf("\t%6.2f\t  %6d\t%s\n", precio, cantidad, soles);
      System.out.println("\n\tDescuento de un "+ DESCUENTO*100 + "%: "+ DESCUENTO*soles);
      soles *= (1-DESCUENTO);
      System.out.println("\tTotal compra: "+ soles);
      System.out.println("\tIGV : " + IGV*100 + "%: " + (double)soles*IGV);
      soles *= (1+IGV);
      System.out.println("\tTotal de Factura: "+ (double)soles);
   }
}