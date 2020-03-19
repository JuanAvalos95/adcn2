
package abcm1;
import java.io.*;
import java.util.*;
public class Abcm1 {
static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//<<<<<<VARIABLES CLIENTES>>>>>
    static int [] IDcliente = new int [30];
    static String[] nombreCL= new String [30];
    static String[] direccionCL = new String [30];
    static String[] telefonoCL = new String [30];
    static String[] rfcCL = new String [30];
    static String[] sexoCL = new String [30];
    static String [] correoCL = new String [30];
    static int contCliente;
    //<<<<<<<VARIABLES PEDIDO>>>>>>
    static int [] IDpedido= new int [30];
    static String[] fechaPE = new String [30];
    static String[] productoP = new String [30];
    static String[] clienteP =new String [30];
    static String [] trabajadorP = new String[30];
    static int contPedido;
    //<<<<<<<<VARIABLES FACTURA>>>>>>>>>>
    static int[] IDfactura= new int [30];
    static String[] fechaFA = new String[30];
    static String[]subtotalFA =new String[30];
    static double []ivaFA= new double[30];
    static double []totalFA= new double [30];
    static double [] descuento=new double [30];
    //<<<<<<<<<VARIABLES PRODUCTO >>>>>>>
    static int [] IDproducto = new int [30];
    static String[] cantidadPRO = new String [30];
    static String [] nombrePRO = new String [30];
    static String [] precioPRO = new String [30];
    static String [] tamañoPRO = new String [30];
    static String [] tipoPRO = new String [30];
    static String [] fechaexPRO = new String [30];
    static int contPRO;
    
    //<<<<<<<VARIABLES TRABAJADOR>>>>>>>>>>>
    static int[] IDtrabajador = new int [30];
    static String [] nombreTRA = new String [30];
    static String [] direccionTRA= new String [30];
    static String [] rfcTRA =new String [30];
    static String [] sexoTRA = new String [30];
    static String [] telefonoTRA = new String[30];
    static String [] puestoTRA= new String [30];
    static int contTRA;
    
    public static void main(String[] args)throws IOException {
        char opc=0,opcc2=0,opct=0, opcp4=0,opcp=5,opcf=0, resp=0;
        int IdClienteModif=0, IdClienteElim=0,IDproductoM=0,IDbajaPRO=0,IDtrabajadorM=0,
                IDpedidoM=0, IDpedidob=0,IDbajaTRA=0;
        
        contCliente++;
        IDcliente[contCliente]=1;
        nombreCL[contCliente]="Ernesto Ayon Escoto";
        direccionCL[contCliente]="mariano moreno 250";
        rfcCL[contCliente]="AALJC95062Z";
        telefonoCL[contCliente]="36007824";
        correoCL[contCliente]="ernesto.ae@gmail.com";
        
        contPRO++;
        IDproducto[contPRO]=1;
        cantidadPRO[contPRO]="50";
        nombrePRO[contPRO]="Victoria";
        precioPRO[contPRO]="$45";
        tamañoPRO[contPRO]="lata de 600ml";
        tipoPRO[contPRO]="clara";
        fechaexPRO[contPRO]="25/06/2040";
        
        contTRA++;
        IDtrabajador[contTRA]=1;
        nombreTRA[contTRA]="Carlos Gomez Hernandez";
        direccionTRA[contTRA]="Bruno Mauricio de Zavala 64";
        rfcTRA[contTRA]="CCAGHLN3";
        sexoTRA[contTRA]="masculino";
        telefonoTRA[contTRA]="31448017";
        puestoTRA[contTRA]="chofer";
        
        do {
            System.out.println("Bienvenidos a GRUPO MODELO");
            System.out.println("¿A que desea ingresar?");
            System.out.println("A. Clientes");
            System.out.println("b. productos");
            System.out.println("C. trabajadores");
            System.out.println("D. pedidos");
            System.out.println("E. facturas");
            opc=bf.readLine().toUpperCase().charAt(0);
            switch (opc) {
                case 'A':
                    do {
                          System.out.println("¿Que desea realizar?");
                          System.out.println("A. Alta de cliente");
                          System.out.println("B. Modificacion de cliente");
                          System.out.println("C. consulta de Cliente");
                          System.out.println("D. baja de cliente");
                          opcc2=bf.readLine().toUpperCase().charAt(0);
                          switch (opcc2){
                              case 'A':
                                 altaCliente();
                                break;
                              case 'B':
                                 consultaCliente();
                                 System.out.println("¿Que clienbte desea modificar?");
                                 IdClienteModif=Integer.parseInt(bf.readLine());
                                 modCliente(IdClienteModif);
                                 consultaCliente();
                   
                                break;
                   
                             case 'C':
                                 consultaCliente();
                                break;
                   
                             case 'D':
                                 consultaCliente();
                                 System.out.println("¿Que cliente desea dar de baja?");
                                 IdClienteElim=Integer.parseInt(bf.readLine());
                                 bajaCliente(IdClienteElim);
                                 consultaCliente();
                                break;
                   
                             default:
                                System.out.println("opcion no valida");
                   
                       }//fin del switch cliente
                       System.out.println("¿Desea realizar otra operación? S/N");
                       resp=bf.readLine().toUpperCase().charAt(0);
                   }while(resp!='N');  
                    break;
                case 'B':
                      do {
                           System.out.println("¿Que desea realizar?");
                          System.out.println("A. Alta de producto");
                          System.out.println("B. Modificacion de producto");
                          System.out.println("C. consulta de producto");
                          System.out.println("D. baja de producto");
                          opcp=bf.readLine().toUpperCase().charAt(0);
                          switch (opcp){
                              case 'A':
                                  altaProducto();
                                  break;
                              case 'B':
                                  consultaPRO();
                                  System.out.println("¿Que producto desea modificar?");
                                  IDproductoM=Integer.parseInt(bf.readLine());
                                  modProducto(IDproductoM);
                                  consultaPRO();
                                  break;
                              case 'C':
                                  consultaPRO();
                                  break;
                              case 'D':
                                  consultaPRO();
                                  System.out.println("¿Que producto desea dar de baja?");
                                  IDbajaPRO=Integer.parseInt(bf.readLine());
                                  bajaproducto(IDbajaPRO);
                                  consultaPRO();
                                  break;
                              default:
                                  System.out.println("Opcion no valida");
                          }//fin swich productos
                         System.out.println("¿Desea realizar otra operación? S/N");
                       resp=bf.readLine().toUpperCase().charAt(0); 
                      } while(resp!='N');
                    break;
                case 'C':
                    do {
                        
                           System.out.println("¿Que desea realizar?");
                          System.out.println("A. Alta de trabajador");
                          System.out.println("B. Modificacion de trabajador");
                          System.out.println("C. consulta de tranbajador");
                          System.out.println("D. baja de trabajador");
                          opct=bf.readLine().toUpperCase().charAt(0);
                          switch (opct){
                              case'A':
                                  altaTRA();
                                  break;
                              case 'B':
                                  consultaTRA();
                                  System.out.println("¿Que trabajador desea modificar?");
                                  IDtrabajadorM=Integer.parseInt(bf.readLine());
                                  modTrabajador(IDtrabajadorM);
                                  consultaTRA();
                                  break;
                              case 'C':
                                  consultaTRA();
                                  break;
                              case 'D':
                                  consultaTRA();
                                  System.out.println("¿Que trabajador desea dar de baja?");
                                  IDbajaTRA=Integer.parseInt(bf.readLine());
                                  bajaTRA(IDbajaTRA);
                                  consultaTRA();
                                  break;
                              default:
                                  System.out.println("Opcion no valida");
                          }//fin switch trabajador
                        
                        System.out.println("¿Desea realizar otra opcion? S/N");
                        resp=bf.readLine().toUpperCase().charAt(0);
                        
                    }while (resp!='N');
                    break;
                case 'D':
                   do {
                       System.out.println("¿Que desea Realizar?");
                       System.out.println("A. alta de pedido");
                       System.out.println("B. modificacion del pedido");
                       System.out.println("C. consulta de pedido");
                       System.out.println("D. baja de pedido");
                       opcp=bf.readLine().toUpperCase().charAt(0);
                       switch(opcp) {
                           case 'A':
                               altaPedido();
                               break;
                           case 'B':
                               consultaPE();
                               System.out.println("Que pedido desea modificar");
                               IDpedidoM=Integer.parseInt(bf.readLine());
                               modPedido(IDpedidoM);
                               consultaPE();
                               break;
                           case 'C':
                               consultaPE();
                               break;
                           case 'D':
                               consultaPE();
                               System.out.println("¿Que pedido desea dar de baja?");
                                  IDpedidob=Integer.parseInt(bf.readLine());
                                  bajaPedido(IDpedidob);
                                  consultaPE();
                               break;
                           default:
                               System.out.println("opcion no valida");
                       }//fin switc pedido
                       System.out.println("¿desea realizar otra opcion?");
                       resp=bf.readLine().toUpperCase().charAt(0);
                       
                   }while (resp!='N');
                   
                    break;
                case 'E':
                    
                    break;
                default:
                    System.out.println("Opcion no valida");
            }//fin del swich principal
            System.out.println("¿Desea realizar otra operación? S/N");
            resp=bf.readLine().toUpperCase().charAt(0);
        }while (resp!='N');//fin del principal
      
    }//fin del main
    public static void altaCliente()throws IOException {
        
      contCliente++;
      IDcliente[contCliente]=contCliente;
        System.out.println("El ID del cliente es "+ contCliente);
        
        System.out.println("Dame el nombre del cliente "+contCliente);
        nombreCL[contCliente]= bf.readLine();
        
        System.out.println("Escriba la direccion de el cliente "+contCliente);
        direccionCL[contCliente]= bf .readLine();
        
        System.out.println("Escriba el telefono del cliente "+contCliente);
        telefonoCL[contCliente] = bf.readLine();
        
        System.out.println("Escriba el RFC del cliente "+contCliente);
        rfcCL[contCliente]= bf.readLine();
        
        System.out.println("Escriba el sexo del cliente "+contCliente);
        sexoCL[contCliente]=bf.readLine();
        
        System.out.println("Escriba el correo del cliente "+ contCliente);
        correoCL[contCliente]= bf.readLine();
        
    }//fin de la alta 
    public static void consultaCliente()throws IOException {
         System.out.println("Consulta de clientes");
         System.out.println("-------------------");
          for(int i=1;i<=contCliente;i++) {
              System.out.println("Cliente "+IDcliente[i]);
              System.out.println("Nombre "+nombreCL[i]);
              System.out.println("Direccion "+direccionCL[i]);
              System.out.println("telefono "+telefonoCL[i]);
              System.out.println("RFC "+rfcCL[i]);
              System.out.println("Sexo "+sexoCL[i]);
              System.out.println("Correo "+correoCL[i]);
              System.out.println("----------------------");
          }//fin for
        
    }//fin de la consulta
    
    public static void modCliente(int IdClienteModif)throws IOException {
        System.out.println("Cliente a modificar "+IDcliente[IdClienteModif]);
        System.out.println("Nuevo Nombre: ");
        nombreCL[IdClienteModif]= bf.readLine();
        System.out.println("Nueva direccion del cliente: ");
        direccionCL[IdClienteModif]=bf.readLine();
        System.out.println("Nuevo telefono del cliente: ");
        telefonoCL[IdClienteModif]=bf.readLine();
        System.out.println("Nueva RFC del cliente: ");
        rfcCL[IdClienteModif]=bf.readLine();
        System.out.println("Nuevo sexo del cliente: ");
        sexoCL[IdClienteModif]=bf.readLine();
        
        System.out.println("Cliente modificado con exito!!");
    }// fin modificacion cliente
    
    public static void bajaCliente(int IdClienteElim) throws IOException {
       for (int i=IdClienteElim;i<=contCliente; i++ ) {
           nombreCL[i]=nombreCL[i+1];
           direccionCL[i]=direccionCL[i+1];
           telefonoCL[i]=telefonoCL[i+1];
           rfcCL[i]=rfcCL[i+1];
           sexoCL[i]=sexoCL[i+1];
           
       }//fin for baja
        contCliente--;
    }//fin de la baja
    
    public static void altaProducto()throws IOException {
        
      contPRO++;
      IDcliente[contPRO]=contPRO;
        System.out.println("El ID del producto es "+ contPRO);
        
        System.out.println("Dame el nombre del producto "+contPRO);
        nombrePRO[contPRO]= bf.readLine();
        
        System.out.println("Escriba la cantidad del producto "+contPRO);
        cantidadPRO[contPRO]= bf .readLine();
        
        System.out.println("Escriba el prercio del producto "+contPRO);
        precioPRO[contPRO] = bf.readLine();
        
        System.out.println("Escriba el tamaño del producto "+contPRO);
        tamañoPRO[contPRO]= bf.readLine();
        
        System.out.println("Escriba el tipo del producto "+contPRO);
        tipoPRO[contPRO]=bf.readLine();
        
        System.out.println("Escriba la fecha de expiracion del producto "+contPRO);
        fechaexPRO[contPRO]=bf.readLine();
    }// fin alta producto
    
    public static void consultaPRO()throws IOException {
         System.out.println("Consulta de productos");
         System.out.println("-------------------");
          for(int i=1;i<=contPRO;i++) {
              System.out.println("Producto "+IDproducto[i]);
              System.out.println("Nombre "+nombrePRO[i]);
              System.out.println("Prescio "+precioPRO[i]);
              System.out.println("Tamaño "+tamañoPRO[i]);
              System.out.println("Tipo "+tipoPRO[i]);
              System.out.println("Fecha de expiracion "+fechaexPRO[i]);
              System.out.println("Cantidad "+cantidadPRO[i]);
              System.out.println("----------------------");
          }//fin for
        
    }//fin fin consulta producto
    
    public static void modProducto(int IDproductoM)throws IOException {
      System.out.println("Producto a modificar a modificar "+IDproducto[IDproductoM]);
        System.out.println("Nuevo Nombre: ");
        nombrePRO[IDproductoM]= bf.readLine();
        System.out.println("Nuevo precio del producto: ");
        precioPRO[IDproductoM]=bf.readLine();
        System.out.println("Nuevo tamaño del producto: ");
        tamañoPRO[IDproductoM]=bf.readLine();
        System.out.println("Nuevo tipo del producto: ");
        tipoPRO[IDproductoM]=bf.readLine();
        System.out.println("Nueva fecha de expiracion: ");
        fechaexPRO[IDproductoM]=bf.readLine();
        System.out.println("Nueva cantidad del producto: ");
        cantidadPRO[IDproductoM]=bf.readLine();
        
        System.out.println("Cliente modificado con exito!!");
        
    } //fin de la modificacion del producto
    
    public static void bajaproducto(int IDbajaPRO)throws IOException{
          for (int i=IDbajaPRO;i<=contPRO; i++ ) {
           nombrePRO[i]=nombrePRO[i+1];
           precioPRO[i]=precioPRO[i+1];
           tamañoPRO[i]=tamañoPRO[i+1];
           tipoPRO[i]=tipoPRO[i+1];
           fechaexPRO[i]=fechaexPRO[i+1];
           cantidadPRO[i]=cantidadPRO[i+1];
           
       }//fin for baja
        contPRO--;
    }//fin de la baja del producto
    
    public static void altaTRA()throws IOException {
        contTRA++;
      IDcliente[contCliente]=contCliente;
        System.out.println("El ID del trabajador  es "+ contTRA);
        
        System.out.println("Dame el nombre del trabajador "+contTRA);
        nombreTRA[contTRA]= bf.readLine();
        
        System.out.println("Escriba la direccion de el tranajador "+contTRA);
        direccionTRA[contTRA]= bf .readLine();
        
        System.out.println("Escriba el telefono del trabajador "+contTRA);
        telefonoTRA[contTRA] = bf.readLine();
        
        System.out.println("Escriba el RFC del trabajador "+contTRA);
        rfcTRA[contTRA]= bf.readLine();
        
        System.out.println("Escriba el sexo del trabajador "+contTRA);
        sexoTRA[contTRA]=bf.readLine();
        
        System.out.println("Escriba el puesto  del trabajador "+ contTRA);
        puestoTRA[contTRA]= bf.readLine();
        
    }//fin de la alta trabajador
    
    public static void consultaTRA()throws IOException {
       System.out.println("Consulta de trabajadores");
         System.out.println("-------------------");
          for(int i=1;i<=contTRA;i++) {
              System.out.println("trabajador "+IDtrabajador[i]);
              System.out.println("Nombre "+nombreTRA[i]);
              System.out.println("Direccion "+direccionTRA[i]);
              System.out.println("telefono "+telefonoTRA[i]);
              System.out.println("RFC "+rfcTRA[i]);
              System.out.println("Sexo "+sexoTRA[i]);
              System.out.println("Puesto "+puestoTRA);
              System.out.println("----------------------");
          }//fin for  
    }//fin de la consulta
    
    public static void modTrabajador(int IDtrabajadorM)throws IOException {
        System.out.println("Trabajador  a modificar "+IDtrabajador[IDtrabajadorM]);
        System.out.println("Nuevo Nombre: ");
        nombreTRA[IDtrabajadorM]= bf.readLine();
        System.out.println("Nueva direccion del trabajador: ");
        direccionCL[IDtrabajadorM]=bf.readLine();
        System.out.println("Nuevo telefono del trabajador: ");
        telefonoTRA[IDtrabajadorM]=bf.readLine();
        System.out.println("Nueva RFC del trabajador: ");
        rfcTRA[IDtrabajadorM]=bf.readLine();
        System.out.println("Nuevo sexo del trabajador: ");
        sexoTRA[IDtrabajadorM]=bf.readLine();
        System.out.println("NUevo puesto del trabajador: ");
        puestoTRA[IDtrabajadorM]=bf.readLine();
        
        System.out.println("Cliente modificado con exito!!");
    }// fin de la modificacion del trabajador
    
    public static void bajaTRA(int IDbajaTRA)throws IOException {
         for (int i=IDbajaTRA;i<=contTRA; i++ ) {
           nombreTRA[i]=nombreTRA[i+1];
           direccionTRA[i]=direccionTRA[i+1];
           telefonoTRA[i]=telefonoTRA[i+1];
           rfcTRA[i]=rfcTRA[i+1];
           sexoTRA[i]=sexoTRA[i+1];
           puestoTRA[i]=puestoTRA[i+1];
           
       }//fin for baja
        contTRA--;
    }//fin del baja del trabajador
    
    public static void altaPedido()throws IOException{
        contPedido++;
        IDpedido[contPedido]=contPedido;
        System.out.println("El pedido "+contPedido);
        System.out.println("¿Cual es la fecha del pedido?");
        fechaPE[contPedido]=bf.readLine();
        consultaPRO();
        System.out.println("Seleccione un producto");
        productoP[contPedido]=bf.readLine();
        consultaCliente();
        System.out.println("Seleccione un Cliente");
        clienteP[contPedido]=bf.readLine();
        consultaTRA();
        System.out.println("Seleccione un trabajador");
        trabajadorP[contPedido]=bf.readLine();
        System.out.println("El pedido se realizo con exito");
    }//fin alta pedido
    
    public static void consultaPE()throws IOException{
         System.out.println("Consulta de pedidos");
         System.out.println("-------------------");
          for(int i=1;i<=contPedido;i++) {
              System.out.println("Pedido "+IDpedido[i]);
              System.out.println("Fecha "+fechaPE[i]);
              System.out.println("Producto "+nombrePRO[i]);
              System.out.println("Cliente "+nombreCL[i]);
              System.out.println("Trabajado "+nombreTRA[i]);
              System.out.println("----------------------");
          }//fin for  
    }//fin de la consulta
    
    public static void modPedido(int IDpedidoM)throws IOException{
        System.out.println("Pedido a modificar "+IDpedido[IDpedidoM]);
        System.out.println("Nueva fecha del pedido");
        fechaPE[IDpedidoM]=bf.readLine();
        consultaPRO();
        System.out.println("Seleccione un nuevo producto");
        productoP[contPedido]=bf.readLine();
        consultaCliente();
        System.out.println("Seleccione un Cliente nuevo");
        clienteP[contPedido]=bf.readLine();
        consultaTRA();
        System.out.println("Seleccione un  trabajador nuevo");
        trabajadorP[contPedido]=bf.readLine();
    }//fin modificar pedido
    public static void bajaPedido(int IDpedidob)throws IOException{
       for (int i=IDpedidob;i<=contPedido; i++ ) {
           fechaPE[i]=fechaPE[i+1];
           productoP[i]=productoP[i+1];
           clienteP[i]=clienteP[i+1];
           trabajadorP[i]=trabajadorP[i+1];
           
           
       }//fin for baja
        contPedido--;   
    }//fin de la baja pedido
    
}//fin de la clase
