class C0{
   public static void main(String[] args){
      //Asignamos valores en las areas estaticas y dinamicas
      String r1 = "111";
      String r2 = new String("222");
      System.out.println("a) Valores de r1 y r2");
      System.out.println("r1: " + r1);
      System.out.println("r2: "+ r2);
      
      //Verificar si s1 y s2 tienen las mismas direcciones que r1 y r2
      String s1 = "111";
      String s2 = new String("222");
      System.out.println("\nb) Valores de s1 y s2");
      System.out.println("s1: " + s1);
      System.out.println("s2: "+ s2);
      if(s1 == r1)     System.out.println("s1 y r1 tienen la misma diercción");
      else             System.out.println("s1 y r1 NO tiene la misma dirección");
      if(s2 == r2)     System.out.println("s2 y r2 tienen la misma dirección");
      else             System.out.println("s2 y r2 NO tienen la misma dirección");
      
      //Reasignar valor a otra variable: Verificar si s1 y s2 tienen los mismos valores y direcciones que r1 y r2
      s1 = r1;
      s2 = r2;
      System.out.println("\nc) s1 = r1, s2 = r2");
      if(s1.equals(r1)) System.out.println("s1 y r1 tienen el mismo valor");
      else              System.out.println("s1 y r1 NO tienen el mismo valor");
      if(s2.equals(r2)) System.out.println("s2 y r2 tienen el mismo valor");
      else              System.out.println("s2 y r2 NO tienen el mismo valor");
      if(s1 == r1)      System.out.println("s1 y r1 tienen la misma dirección");
      else              System.out.println("s1 y r1 NO tienen la misma dirección");
      if(s2 == r2)      System.out.println("s2 y r2 tienen la misma dirección");
      else              System.out.println("s2 y r2 NO tiene la misma dirección");
      
      //Verificar si se puede reasignar valores literales
      r1 = "111a";
      r2 = new String("222a");
      System.out.println("\nd) Reasignar a valores literales");
      System.out.println(r1 + "     " + r2);
      System.out.println("Si se puede reasignar valores literales en el área estática");
      System.out.println("Si se puede reasignar valores literales en el área dinámica");
      
      //Verificar si se puede intercambiar valores de r1 y r2
      System.out.println("\ne) Intercambiar valores de r1 y r2");
      System.out.println("r1 = "+ r1 + ", r2 = " + r2);
      String r3 = r1;
      r1 = r2;
      r2 = r3;
      System.out.println("r1 = "+ r1 +", r2 = "+ r2);
   }
}