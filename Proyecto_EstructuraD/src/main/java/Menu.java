
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Yostin Arias
 */
public class Menu {

    int op = 0; //principal
    int op1 = 0;
    int op2 = 0;
    int op3 = 0;
    int op4 = 0;
    int op5 = 0;
    int op6 = 0;
    int op7= 0;
    ListaAgendaC ldc = new ListaAgendaC();
    ListaFacturacion fact = new ListaFacturacion();
    ListaAgendaC lag = new ListaAgendaC();
    MetodoRegistro p = new MetodoRegistro();
Agendarcita y=new Agendarcita();
       Facturas pi=new Facturas();
    public void mostrarMenu() { //inicio de menú principal

        while (op != 7) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal Veterinaria\n"
                    + "1. \n"
                    + "2. Registro Animal/Cliente\n"
                    + "3. Administración de Datos Animal-Cliente\n"
                    + "4. Registrar Empleado y clientes frecuentes\n"
                    + "5. Agendar cita\n"
                    + "6. Realizar venta\n"
                    + "7.salir"
                    + "Digite su opción: ", "Menu Principal Veterinaria\n", JOptionPane.QUESTION_MESSAGE));
            switch (op) {
                case 1:  //Menú principal Agenda de citas

                    while (op1 != 3) {
                        op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Registro de Animales y Clientes\n"
                                + "1. Agendar\n"
                                + "2. Eliminar "
                                + "3. Salir\n"
                                + "Digite su opción: ", "Registro de Animales y Clientes\n", JOptionPane.QUESTION_MESSAGE));
                        switch (op1) {
                            case 1:
                                ldc.insertar1();
                                ldc.insertar2();
                                ldc.mostrarElementosInversa();
                                ldc.mostrarElementosInversa2();
                                break;
                            case 2:
                                ldc.extraer1();
                                ldc.extraer2();
                                break;
                            case 3:

                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Error, opción invalida");
                        }
                    }
                    break;

//--------------------------------------------------------------------------------
                case 2: // Menú de registro de Animales y Clientes
                    while (op1 != 5) {
                        op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Registro de Animales y Clientes\n"
                                + "1. Registro\n"
                                + "2. Eliminar registro"
                                + "3. Facturación\n"
                                + "4. Eliminar Factura\n"
                                + "5. Salir\n"
                                + "Digite su opción: ", "Registro de Animales y Clientes\n", JOptionPane.QUESTION_MESSAGE));
                        switch (op1) {
                            case 1:
                                ldc.insertar1();
                                ldc.insertar2();
                                ldc.mostrarElementosInversa();
                                ldc.mostrarElementosInversa2();
                                break;
                            case 2:
                                ldc.extraer1();
                                ldc.extraer2();
                                break;
                            case 3:
                                fact.encolarFac();
                                fact.encolarDA();
                                fact.encolarDP();
                                break;
                            case 4:
                                fact.desencolarFac();
                                fact.desencolarDA();
                                fact.desencolarDP();
                                break;
                            case 5:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error, opción invalida");
                        }
                    }
                    break;
//--------------------------------------------------------------------------------
                case 3: //Menú principal Administración de Datos Animal-Cliente
                    while (op2 != 4) {
                        op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Administración de Datos Animal-Cliente\n"
                                + "1. Agregar animal-cliente\n"
                                + "2. Eliminar animal-cliente\n"
                                + "3. Limpiar lista animal-cliente\n"
                                + "4. Salir\n"
                                + "Digite su opción: ", "Administración de Datos Animal-Cliente\n", JOptionPane.QUESTION_MESSAGE));
                        switch (op2) {
                            case 1:  // Opción Agregar
                                ldc.insertar1();
                                ldc.insertar2();
                                break;
                            case 2: //Opción eliminar
                                ldc.extraer1();
                                ldc.extraer2();
                                break;

                            case 3: //Opción Limpiar lista

                                break;
                            case 5:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error, opción invalida");
                        }
                    }

                    break;

//--------------------------------------------------------------------------------
                case 4: // menú principal Administración de datos Empleado

                    while (op3 != 5) {
                        op3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Administración de datos Empleado y Clientes frecuentes\n"
                                + "1. Agregar Empleado\n"
                                + "2. Eliminar Empleado\n"
                                + "3. Cliente frecuente\n"
                                + "4. Limpiar lista Empleado\n"
                                + "5. Salir\n"
                                + "Digite su opción: ", "Administración de datos Empleado\n", JOptionPane.QUESTION_MESSAGE));

                        switch (op3) {
                            case 1:// Opción Agregar
                                p.agregarEmpleado();

                                break;

                            case 2: //Opción eliminar
                                p.agregarcliente();

                                break;
                            case 3: //Opción Buscar
                                p.mostrarcliente();

                                break;
                            case 4: //Opción Limpiar lista
                                p.mostrarEmpleados();
                                break;
                            case 5: //salir
                                
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error, opción invalida");
                        }
                    }

                    break;
//--------------------------------------------------------------------------------
                case 5:
                    while(op5!=4){
                    op5=Integer.parseInt(JOptionPane.showInputDialog(null, "Administracion de citas\n"+
                            "1.agendar cita\n"
                            +"2.monstrar citas\n"
                            +"3.eliminar citas\n"
                            +"4.salir"
                            + "Digite su opción: ", "\n", JOptionPane.QUESTION_MESSAGE));
                    switch(op5){
                        case 1:
                            y.apilarCita();
                            break;
                        case 2:
                            y.toString();
                            break;
                        case 3:
                            y.Eliminarcita();
                        case 4:
                            break;
                    
                    }
                    }
                    
                case 6:
                    while(op7!=3){
                    op7=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese su opcion\n"
                            +"1.ver catalogo\n"
                            +"2.calcular venta\n"
                            +"3. salir","\n",JOptionPane.QUESTION_MESSAGE));
                       switch(op7){
                           case 1:
                               pi.catalogo();
                              break;
                           case 2:
                               pi.calcular();
                               break;
                       
                       }      
                       
                    }
                   
                    
                    
                    
                case 7: //menú principal Salir
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, opción invalida");
            }
        }
    }
}
