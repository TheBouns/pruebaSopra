// *******************EJERCICIO 1**********************************
public class ejercicios3pdf2 {
     public static void main(String[] args){
       int numero;
       Scanner leer_numero = new Scanner(System.in);
       System.out.println("Dame un numerooooo");
       numero = leer_numero.nextInt();
       System.out.println("tu numero es:" +  numero);
       if(numero%2==0){
           for(int i=numero; i>=0; i-=2){
               System.out.println(i);
           }
        }else{
           for(int i=numero; i>=1; i--){
               if(i%2!=0)System.out.println(i);
           }
       }
    }
}

// *************EJERCICIO2******************************************
public class ejercicios3pdf2 {
     public static void main(String[] args){
       Personas[] arr = new Personas[50];
       int contador=0;
       int resultado;
       int contadorMujeres=0;
       int resultadoMujeres;
       for(int i=0; i<50; i++){
           int sexo = (int) (Math.random()*10);
           String mf;
           if(sexo>=5){
               mf= "Male";
           }
           else{
               mf="Female";
           }
           
           arr[i]= new Personas((int)(Math.random()*100), mf); 
       }
       
      
       
       for(int i=0; i<arr.length; i++){
               if(arr[i].edad>=18){
                   arr[i].display();
               }
        }
        for(int i=0; i<arr.length; i++){
               if(arr[i].edad<=18){
                   arr[i].display();
               }
        }
        for(int i=0; i<arr.length; i++){
               if(arr[i].edad>=18 && arr[i].sexo=="Male"){
                   arr[i].display();
               }
        }
        for(int i=0; i<arr.length; i++){
               if(arr[i].edad>=18 && arr[i].sexo=="Female"){
                   arr[i].display();
               }
        }
        
        
        for(int i=0; i<arr.length; i++){
            
               if(arr[i].edad>=18){
                   contador+=1;
               }
        }
        System.out.println(contador);
        resultado = (contador*100) / 50;
        System.out.println("El porcentaje de mayores de edad es de:"+ resultado+"%");
        for(int i=0; i<arr.length; i++){
            
               if(arr[i].sexo=="Female"){
                   contadorMujeres++;
               }
        }
        resultadoMujeres = (contadorMujeres*100) / 50;
        System.out.println("El porcentaje de Mujeres  es de:"+ resultadoMujeres+"%");
        
        
        
     }
     
}
class Personas{
        public int edad;
        public String sexo;
       
       Personas(int edad, String sexo){
         this.edad =edad;
         this.sexo = sexo;
         }
       public void display (){
           System.out.println(edad + sexo);
       }
       
       
}

// **************EJERCICIO 3****************************************************

public class ejercicios3pdf2 {
     public static void main(String[] args){
         double horasTrabajadas;
         double tarifa;
         double tarifaExtra;
         double sueldo;
         double sueldoExtra;
       Scanner leerHorasTrabajadas = new Scanner(System.in);
       Scanner leerTarifa = new Scanner(System.in);
       System.out.println("Indique las horas trabajadas:");
       horasTrabajadas = leerHorasTrabajadas.nextInt();
       System.out.println("Indique la tarifa:");
       tarifa = leerTarifa.nextInt();
       if(horasTrabajadas>40){
           
           tarifaExtra = tarifa*1.5;
           sueldoExtra = tarifaExtra * (horasTrabajadas-40);
           System.out.println("Su salario sera de: "+ (sueldoExtra+(40*tarifa)));
       }
       else{
           sueldo = tarifa*horasTrabajadas;
            System.out.println("Su salario sera de : "+ sueldo );
       }
       
       
     
    }
}