public class FormasGeometrica {

    public static void main(String[] args) {
        
    }

    public class quadrado {
    double lado;
    double area;
    double perimetro;

    //metodos
    //metodo construtor
      quadrado(double lado) {
       this.lado = lado;
       this.area = lado * lado;
       this.perimetro = lado * 4;
 
     


    }
    void calculararea(){
        this.area = lado * lado;
 

    }
    void cacularperimetro(){
        this.perimetro = lado * 4;
 
    }

    
    void imprimir(){
        System.out.println("\n-----------quadrado------------");
        System.out.println("lado = " + lado);
        System.out.println("perimetro = " + perimetro);
        System.out.println("area = " + area);
    }

    
public class retangulo {
    double altura;
    double cumprimento;
    double area;
    double base;

    //metodos
    //metodo construtor
      retangulo(double base) {
       this.area = area;
       this.cumprimento = base * base;
       this.altura = altura * 4;
       this.base = base;
 
     


    }
    void calculararea(){
        this.area = base * cumprimento;
 

    }
    void cacularcumprimento(){
        this.cumprimento = cumprimento * 4;
 
    }
    void cacularaltura(){
        this.altura = base * cumprimento;

    }
    void imprimir(){
         System.out.println("\n-----------retangulo------------");
        System.out.println("area = " + area);
         System.out.println("cumprimento = " + cumprimento);
          System.out.println("altura = " + altura);
    }


}




}
    
}
