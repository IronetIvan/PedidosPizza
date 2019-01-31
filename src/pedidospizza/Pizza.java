/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidospizza;

/**
 *
 * @author irone
 */
public class Pizza {
  private static int totPedidas = 0;
  private static int totServidas = 0;
  private String tamano;
  private String tipo;
  private String estado;
  
  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estado = "pedida";
    Pizza.totPedidas++;
  }
  
  public String toString() {
    return "Pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
  }
  
  public static int getTotalPedidas() {
    return Pizza.totPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizza.totServidas;
  }

  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totServidas++;
    } else {
      System.out.println("Esa pizza ya se ha servido");
    }
  }
}
