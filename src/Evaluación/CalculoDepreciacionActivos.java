package Evaluación;
import java.util.*;
public class CalculoDepreciacionActivos {
		
		static Scanner s = new Scanner(System.in);
		 
	  

		 public static void main(String[] args) {
		
	  
	  System.out.println("Programa que que realize los metodos de depreciacion :");
	  System.out.println("Que metodo desea comprobar ?");
	  System.out.println("1.Metodo de linea recta");
	  System.out.println("2.Metodo de la suma de los digitos por años");
	  System.out.println("3.Metodo de las unidades producidas");
	  System.out.println("4.Metodo de reduccion de saldo");
	  System.out.println("5.Option Final");
	 
	  int depreciacion=s.nextInt();
	  
	  double ValorResidual;
	switch(depreciacion) {
	  
	  case 1:
		  System.out.println("----Metodo de linea recta----");
		  double  Costodelactivointangible,CuotadeAmortizaciónAnual;
		  int vidautil,vidautil2;
		  double  CuotadeAmortizaciónMensual,Costodelactivointangible2;
		  System.out.println("Digite el costo del activo intangible :");
		  Costodelactivointangible=s.nextDouble();
		  System.out.println("Digite la vida util :");
		  vidautil=s.nextInt();
		  System.out.println("Digite el costo del activo intangible :");
		  Costodelactivointangible2=s.nextDouble();
		  System.out.println("Digite la vida util :");
		  vidautil2=s.nextInt();
		  System.out.println("Cuota de mortización Anual");
		  CuotadeAmortizaciónAnual=Costodelactivointangible/vidautil;
		  
		  System.out.println("La cuota de amortizacion es igual a : C$ " +  CuotadeAmortizaciónAnual);
		  
		  System.out.println("Cuota de mortización Mensual");
		  
		  CuotadeAmortizaciónMensual=Costodelactivointangible2/vidautil2;
		  
		  System.out.println("La cuota de amortizacion es igual a :  C$" +  CuotadeAmortizaciónMensual);
		  int vidaUtil ;
		  double costoDelActivo,ValorDesecho ;
		  double depreciacionAnual;          
		  System.out.println("Ingrese el costo del activo :");
		  costoDelActivo =s.nextDouble();
		  System.out.println("Ingrese el valor de desecho :");
		  ValorDesecho=s.nextDouble();
		  System.out.println("Ingrese el valor de la vida util :");
		  vidaUtil=s.nextInt();
		 
		 
		 
		  depreciacionAnual=costoDelActivo-ValorDesecho;
		  
		  System.out.println("La depreciacion Anual es igual a :" +  (depreciacionAnual/vidaUtil));
		  
		 
		  
	     break;
	     
	  case 2:
		  System.out.println("----Metodo de la suma de los digitos por años----");
		  int denominador=0;
		     System.out.println("Introduzca la cantidad de años a sumar :");
		     int n=s.nextInt();
		     for (int i = 0; i < n; i++) {
		    	 System.out.println("Ingrese un año :");
		    	 int año=s.nextInt();
		    	  denominador=denominador+año;
		    	 
				
			}
			  System.out.println("La suma de los digitos de los anos es :" + denominador );
			  
		  double PrecioDeCosto;
		  double Danual;
		  double VDesecho,Porcentaje=33.33;
		  System.out.println("Ingrese el precio del costo :");
		   PrecioDeCosto=s.nextDouble();
		  System.out.println("Ingrese el Valor de desecho :");
		   VDesecho=s.nextDouble();
		   
		    Danual=(PrecioDeCosto-VDesecho)*Porcentaje;
		     
		   System.out.println("La depreciacion anual es = $ " + Danual);
		
		   
		   
		         
	     break;
	     
	  case 3:
		  System.out.println("----Metodo de las unidades producidas----");
		  //Equipo de reparto
		  double DepreciacionAnual,costoActivo, DepreciacionA = 0;
		  double vidautilUnidades=640000.00,valordesecho;
		  System.out.println("Ingrese el costo del activo :");
		  costoActivo=s.nextDouble();
		  System.out.println("Ingrese el valor de desechos :");
		  valordesecho=s.nextDouble();
		  
		  DepreciacionAnual=(costoActivo-valordesecho)/vidautilUnidades;
		  System.out.println("Depreciacion por unidad de produccion igual a : " +  DepreciacionAnual );
		  
		         System.out.println("Equipo de reparto" 
		         + " Primer anio " +"Segundo anio"+ " Tercer anio " 
		        		 + " Cuartoanio " + "Quinto anio");
		          double pa=144000.00,sa=192000.00,ta=160000.00,ca=96000.00,qa=48000.00;
		    	  DepreciacionA=DepreciacionAnual*pa;
		    	  System.out.println("La depreciacion anual es :" +  DepreciacionA);
		    	  DepreciacionA=DepreciacionAnual*sa;
		    	  System.out.println("La depreciacion anual es :" +  DepreciacionA);
		    	  DepreciacionA=DepreciacionAnual*ta;
		    	  System.out.println("La depreciacion anual es :" +  DepreciacionA);
		    	  DepreciacionA=DepreciacionAnual*ca;
		    	  System.out.println("La depreciacion anual es :" +  DepreciacionA);
		    	  DepreciacionA=DepreciacionAnual*qa; 
		    	  System.out.println("La depreciacion anual es :" +  DepreciacionA);
		     
	     break;
	     
	  case 4:
		  System.out.println("----Metodo de reduccion de saldos----");
		     int vUtil;
		     int VLibros;
		     Double TazaD,num;
		     
		     System.out.println("Digite un numero para la taza de depreciacion :");
		     num=s.nextDouble();
		     System.out.println("Digite la vida util :");
		     vUtil=s.nextInt();
		   
		      TazaD = num/vUtil*2;
		      System.out.println("La taza de depreciacion es :" + TazaD);
		    
		      System.out.println("Ingrese el valor en libros :");
		      VLibros=s.nextInt();
		   
		      
		      depreciacionAnual=TazaD*VLibros;
		      
		      System.out.println("La depreciacion anual es  : " + depreciacionAnual);
		      
		     
	     break;
	 
	  case 5:
		  System.out.println("-*-*-*Fin del programa Gracias Por Utilizar La Aplicacion-*-*-*");
		  break;
		  
		  
	  }
	  
	     
		 }
	
}



