import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;

public class Factura2App{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      NumberFormat numero = NumberFormat.getNumberInstance();
      numero.setMinimumFractionDigits(2);
      numero.setMaximumFractionDigits(2);
      
      NumberFormat porc = NumberFormat.getPercentInstance();
      final BigDecimal DESCUENTO = new BigDecimal(0.1), IGV = new BigDecimal(0.18);
      
      String articulo;
      int cantidad;
      BigDecimal precio, soles, descuento, igv;
      
      System.out.println("Compra");
      System.out.print("\tIngrese nombre del articulo: ");
      articulo = sc.next();
      System.out.print("\tIngrese el precio: ");
      precio = new BigDecimal(sc.nextDouble());
      System.out.print("\tIngrese la cantidad: ");
      cantidad = sc.nextInt();
      
      System.out.println("\nFactura");
      System.out.println("\tPrecio  Cantidad   Soles");
      soles = precio.multiply(new BigDecimal(cantidad));
      System.out.printf("\t%5s\t   %4d%11s\n", numero.format(precio), cantidad, numero.format(soles));
      
      System.out.printf("\n\tDescuento es de un %s", porc.format(DESCUENTO));
      descuento = DESCUENTO.multiply(soles);
      System.out.printf(" : %11s\n", numero.format(descuento));
      soles = soles.multiply(descuento);
      System.out.printf("\tTotal de compra: %11s\n", numero.format(soles));
      
      System.out.printf("\tIGV: %s  : ", porc.format(IGV));
      igv = IGV.multiply(soles);
      System.out.printf("%11s\n", numero.format(igv));
      
      soles = soles.add(igv);
      System.out.printf("\tTotal de Factura: %11s\n", numero.format(soles));
   }
}