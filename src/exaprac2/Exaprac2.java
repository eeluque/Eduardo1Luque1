/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exaprac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        String[] nombres = new String[20];
        double[] salario = new double[20];
        double[] horas = new double[20];
        int contador = 0;
        double acumuladorSalario = 0;
        
        
       do { 
       opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a la opcion del menu. 1: Agregar empleado, 2: Calcular planilla, 3: Salir"));
       
       
       if(opcion==1){
           
           nombres[contador] = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
           salario[contador] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora"));
           horas[contador] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
           acumuladorSalario += salario[contador] * horas [contador] * 0.90;
           contador++;
           
       }
       
       if(opcion==2){
          
               
               String mensaje = "";
               String resultado = "El total en planilla es: $"+ Double.toString(acumuladorSalario);
               
               for(int i=0;i<contador;i++){
                   
                   mensaje += "Nombre: " + nombres[i]+
                           " Salario liquido: $"+ (salario[i]*horas[i]*0.90)+
                           "\n"
                        ;
               }
               JOptionPane.showMessageDialog(null, mensaje + resultado);
       }
       
        }while(opcion != 3)
