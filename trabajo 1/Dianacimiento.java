import java.util.Scanner;

public classDianacimiento{

public static void main(String[] args) {
 int dia,mes,a�o;
 int b;
 int a = 0,m = 0,d = 0,suma,aux=0;

System.out.println("Ingrese su a�o de nacimiento:");
Scanner edad = new Scanner(System.in);

System.out.print("\n Dia:");

  dia = edad.nextInt();

System.out.print("\n Mes:");

 mes = edad.nextInt();

System.out.print("\na�o:");
  a�o = edad.nextInt();
  if(dia<32&&dia>0)

 d = dia;
 else 

   System.out.println("Error en la fecha");
      if(mes<13&&mes>0)

    m = mes;
    else 
  System.out.println("Error en la fecha");
    if(a�o<3000&&a�o>999)
   a = a�o;
   else
    System.out.println("Error en la fecha");
     suma = d + m + a;
     for(int i = 1;i<=4;i++)

{ 
b = suma%10;
aux = aux + b;
suma = suma/10;
}
System.out.println("El numero de la suerte = "+aux);
}

}