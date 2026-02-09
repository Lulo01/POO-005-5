package calculadora;

public class Calculadora {
    public int x1, x2;
     
    
    //Constructor
    public Calculadora (int a, int b){
           x1= a;
           x2= b; 
    }
    public int add () {
       return x1 +x2; 
}
    
    public int mul () {
        return x1 * x2; 
    }
    
    public int div () {
        return x1/x2; 
    }
    
    public int subs(){
        return x1-x2;
    }
    //Metodo principal
    public static void main(String[] args) {
   
        Calculadora m = new Calculadora (3, 3);
         Calculadora n = new Calculadora (4, 2);
        //Sobre el objeto hay varias operaciones y asume esos atributos
  
        System.out.println("La suma con m es: "+ m.add());
        System.out.println("\tLa suma con n es: "+ n.add());
        System.out.println("La resta con m es : " + m.subs());
        System.out.println("\tLa resta con n es : " + n.subs());
        System.out.println("La multiplicacion con m es: " +m.mul());
        System.out.println("\tLa multiplicacion con n es: " +n.mul());
        System.out.println("La division con m es: " +m.div());
        System.out.println("\tLa division con n es: " +n.div());
        
 
        
    }
    
}
