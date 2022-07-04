package serviciospublicos;

import java.util.Scanner;

public class ServiciosPublicos {

    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new  Scanner(System.in);
        do{
            Factura servicio = new Factura();
            float valorUnidad = 0;
            int estrato,consumo;
            System.out.println("");
            System.out.println("PAGO DE SERVICIOS PUBLICOS");
            System.out.println("Seleccione el servicio público:");
            System.out.println("1. Energia");
            System.out.println("2. Acueducto");
            System.out.println("3. Gas Natural");
            System.out.println("4. Salir");
            System.out.println("Opcion");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Pago de Servicio de Energia");
                    valorUnidad = 6200;
                    break;
                case 2:
                    valorUnidad = 9256;
                    System.out.println("Pago de Servicio de Acueducto");
                    break;
                case 3:
                    valorUnidad = 5234;
                    System.out.println("Pago de Servicio de Gas Natural");
                    break;
            }
            
            if (opcion!=4){
                System.out.println("Estrato del inmueble:");
                estrato = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Consumo del inmueble:");
                consumo = teclado.nextInt();
                teclado.nextLine();

                servicio.estrato = estrato;
                servicio.valorUnidad = valorUnidad;
                servicio.consumo = consumo;
                
                servicio.calcularTotal();
                
                System.out.println("El consumo fue: "+servicio.consumo);
                System.out.println("Valor unidad: "+valorUnidad);
                System.out.println("Estrato del inmueble "+servicio.estrato);
                System.out.println("Costo total: "+servicio.costo);
                System.out.println("Descuento o sobrecosto: "+(servicio.sobrecosto-servicio.descuento));
                System.out.println("Impuesto por infraestructura: "+servicio.impuesto);
                System.out.println("TOTAL A PAGAR:"+servicio.total);
                
                System.out.println("");
            }
        }while(opcion!=4);
        System.out.println("Hasta pronto");
    }
    
}
