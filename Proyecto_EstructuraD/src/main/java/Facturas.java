
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lossa
 */
public class Facturas {
    String nombre;
    String Productos[]={"cepillo","collar","alimento","polvo antipulgas","aguasafe betta","tetra goldfish"};
    int[] precios={1000,1500,2500,3000,2500,4000};
  int Precioi;
  int cantidad;
  int total;
public void catalogo(){
for(int i=0;i<Productos.length;i++){
 System.out.println(Productos[i]);
 
 }
 for(int u=0;u<precios.length;u++){
 System.out.print(precios[u]+"\n");
 
 }

}
public void calcular(){
 nombre=JOptionPane.showInputDialog(null,"ingrese el nombre del producto: ");
Precioi=(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el precio del producto: ")));
cantidad=(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de producto: ")));
total=totalM(Precioi,cantidad);
JOptionPane.showMessageDialog(null, "su recibo seria "+"-->" +"producto"+"-->"+nombre+"\n"
        +"total a cancelar"+"-->"+total+"₡");
}
public int totalM(int Precioi,int cantidad){
if(cantidad==0){
return 0;

}else{
return(Precioi+totalM( Precioi, cantidad-1));
}

}
}
