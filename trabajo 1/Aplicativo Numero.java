 //Blanca Chanataxi//
//Sistemas Nocturno//
 
 public class aplicativo Numero {

    public static void main(String[] args){
  
        int n1, n2;
        Scanner lee = new Scanner(System.in);
         
        System.out.println("ingrese el número.int : "); 
        n1 =lee.nextInt(); 
       
        System.out.println("ingreses otro número.int: "); 
        n2 = lee.nextInt();      
        
        System.out.println("a ingresado los números: " + n1 + " y " + n2);
          Numeros obj=newNumeros(n1,n2);
          obj.imprimirDatos();
    }
}