
public class Cajero {

	// Campos
	// visibilidad | tipo de dato | nombre;
       private       int            nro;
       
       private       double         saldo;
       
    // Métodos
    // visibilidad | tipo de ret | nombre (Arg1, ...) { ... }
	   public        double        extraer (double cant) {
		   // sentencias
		   // ...
		   saldo = saldo - cant;
		   return cant;
	   }
	   
	   public         void         consultar() {
		   System.out.println(saldo);
	   }

}
