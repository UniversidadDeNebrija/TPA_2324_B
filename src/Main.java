// import ejemplos.Circunferencia;
// import ejemplos.PrimitivasVsEnvolventes;
// import ejemplos.NumeroPrimo;
import ejemplos.SerieFibonacci;

// Clase con el método main
public class Main {

    // Clase interna Foo
    public static class HelloWorld {
        // Método que imprime "Hello, world!"
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }

    public static void main(String[] args) {
        // Crea un objeto de la clase HelloWorld
        HelloWorld helloWorld = new HelloWorld();

        // Llama al método sayHello del objeto myFoo
        // helloWorld.sayHello();

        // System.out.print("\nCircunferencia\n\n");
        // Circunferencia.main(args);

        // System.out.print("\nPrimitivasVsEnvolventes\n\n");
        // PrimitivasVsEnvolventes.main(args);

        // System.out.print("\nNumeroPrimo\n\n");
        // NumeroPrimo.main(args);

        System.out.print("\nSerieFibonacci\n\n");
        SerieFibonacci.main(args);
    }
}
