

public class miga {
    public static void main(String[] args) {

      
      Scanner s = new Scanner(System.in);
      
      
      System.out.println("Escriba la cantidad de canciones");
      int cantidad = s.nextInt();
      int maslarga = 0;
      int mascorta = Integer.MAX_VALUE;
      int contador = 0;
      int tiempo = 0;
      System.out.println("Escriba la duracion de las canciones (una por una) en segundos:");
      while(contador<cantidad){
        int duracion = s.nextInt();
        if(duracion<160 || duracion>220){
          System.out.println("Duracion invalida");
        }

        else{
          contador+=1;
          tiempo+=duracion;
          if(duracion>maslarga){
            maslarga=duracion;
          }
          if(duracion<mascorta){
            mascorta = duracion;
          }
        }
      }
      
      System.out.println("Tiempo total de musica escuchada en el dia:"+" "+tiempo+"(s)");
      System.out.println("Cancion mas larga:"+ " "+maslarga);
      System.out.println("Cancion mas corta:"+ " "+mascorta);
    }
}
        
          
          
        
        
      
