public class MatricesDinamicas{
public static void main(String args[]){

int filas = 0,columnas =0;contador= 1;
Scanner entrada =new Scanner(System.in);

System.out.println("cuantas filas desea");
filas = entrada.nextlnt();

System.out.println("cuantas columnas desea");
columnas = entrada.nextlnt();

int numeros [][] = new int[filas][columnas];

for(int a = 0;a<filas; a++){
for(int b = 0;<columnas b++){
numeros[a][b] =contador;
contador++;
System.out.print("[" + numeros[a][b] +"]");
}
System.out.println("");
  }
 }
 }