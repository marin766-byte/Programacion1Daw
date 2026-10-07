public class Actividad{
    //Variables globales
    static int valorJ=3;
    final static double PI=3.14159;

    //Ejemplo de procedimineto para imprimrir mensajes con una variable
    public static void imprimir(String cadena, int variable){
        System.out.println(cadena+variable);
    }

    //Ejemplo de función de función para realizar la usma de 2 números enteros
    public static int suma(int a, int b){
        return a+b;
    }

    //Ejemplo de polimorfismo, una función se puede llamar igual si tiene diferente número de parámetros o devuelve diferentes 
    public static int suma(int a, int b, int c){
        return c;
    }
    public static void actividadTonta(){
        int a=3;
        int b=4;
        System.out.println(maximo(a,b));
    }

    //El orden de las funciones da igual, tienen que estar definidas antes o después del main
    public static int maximo(int valor1,int valor2){
        // int maximo;
        // if(valor1>=valor2){
        //     maximo=valor1;
        // }
        // else{
        //     maximo=valor2;
        // }
        // return maximo;
        return valor1>=valor2? valor1:valor2;
        
    }
    public static void Actividad1(){
        /*
            Actividad: Realiza un programa que genera 2 números(a,b)
            y nos diga el cociente (a/b), la media ((a+b)/2), la potencia (a^b)
            y la raíz cuadrada de cada uno
        */
       //Generar dos números de manera aleatoria
       int min=1;
       int max=10;
       int aleatorio1=(int)(Math.random()*(max-min+1)+1);
       double aleatorio2=(int)(Math.random()*(max-min+1)+min);

       double division=aleatorio1/aleatorio2;
       double media=(aleatorio1+aleatorio2)/2.0;
       //Realizar las operaciones
       System.out.println("Los números generados son: "+aleatorio1+ " y " +aleatorio2);
       System.out.println("La división es: "+division);
       System.out.println("La media es: "+media);
       System.out.println("La potencia vale: "+Math.pow(aleatorio1, aleatorio2));
       System.out.println("Las raíces cuadrados son: "+Math.sqrt(aleatorio1)+ "y"+Math.sqrt(aleatorio2));
    }

}
