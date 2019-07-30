import java.util.Scanner;
public class ComisionPorVentas{
private  int Trabajadores = 10;  
float ArregloA[] = new float[Trabajadores + 1];
int ArregloB[] = new int[Trabajadores + 1];
int ArregloC[] = new int[11];

public void ComisionPorVentas(){
Scanner entrada = new Scanner(System.in);
System.out.printf("\ningreses dato");
System.out.printf("\ncomision %d empleados.\n", Trabajadores);
float ventas;
  
for ( int j = 0; j < Trabajadores; j++ ){  
ArregloC[j] = 0;
}
for ( int i = 1; i <= Trabajadores; i++ ){ 
System.out.printf("\n\n\ningrese las ventas del empleado numero %d  ", i);
ventas = entrada.nextFloat();
ArregloA[i] = ((float)(9)/100)*ventas + 200;
System.out.printf("\nEl salario del empleado %d es: %.2f\n ", i, ArregloA[i]);
ArregloB[i] = (int)(ArregloA[i])/100;
} 
  
for (int k = 1; k <= Trabajadores; k++ ){
if (ArregloB[k] < 10)
ArregloC[ArregloB[k]]++;
else
ArregloC[Trabajadores]++;
}
for (int j = 2; j < Trabajadores; j++ )
{
System.out.printf("\nHay %d empleados que cobran entre %d", ArregloC[j], (j * 100));
System.out.printf(" y %d dolares.\n", (( j + 1 ) * 100 ) - 1 );
}

System.out.printf("Hay %d empleados que cobran 1000 o mas.\n\n", ArregloC[Trabajadores]);
  
}   

}  
