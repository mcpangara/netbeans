/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciospublicos;

/**
 *
 * @author mcpangara
 */
public class Factura {
    int estrato;
    int consumo;
    double valorUnidad;
    double costo;
    double descuento;
    double sobrecosto;
    double impuesto;
    double total;
    public void calcularCosto(){
        this.costo = this.consumo * this.valorUnidad;
    }
    public void calcularDescuentoSobrecosto(){
        if (this.estrato==1 || this.estrato==2){
            this.descuento = this.costo * 0.5;
            this.sobrecosto = 0;
        }else{
            if (this.estrato==3 || this.estrato==4){
                this.descuento = this.costo * 0.1;
                this.sobrecosto = 0;
            }else{
                if (this.estrato==5 || this.estrato==6){
                    this.descuento = 0;
                    this.sobrecosto = this.costo * 0.25;
                }               
            }            
        }
    }
    public void calcularImpuesto(){
        this.impuesto = this.costo * 0.01;
    }
    public void calcularTotal(){
        this.calcularCosto();
        this.calcularDescuentoSobrecosto();
        this.calcularImpuesto();
        
        this.total = this.costo - this.descuento + this.sobrecosto + this.impuesto;
    }
}
