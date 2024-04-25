public class Triangulo{
  public Ponto p1;
  public Ponto p2;
  public Ponto p3;

  public Triangulo(Ponto p1, Ponto p2, Ponto p3){
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  public double semiperimetro(){
    double lado1, lado2, lado3;
    double semip;

    
    lado1 = p1.distancia(p2);
    lado2 = p2.distancia(p3);
    lado3 = p3.distancia(p1);

    semip = lado1 + lado2 + lado3;
    
    return semip;
  }

  public double area(){
    double det;

    det = (p1.x * p2.y * 1) + (p1.y * 1 * p3.x) + (1 * p2.x * p3.y) - (p3.x * p2.y * 1) - (p3.y * 1 * p1.x) - (1 * p2.x * p1.y);

    det = Math.abs(det);

    double a = det / 2;
    
    return a;
  }

  public boolean linear(){
    double a;

    a = area();

    if(a == 0){
      return true;
    }else{
      return false;
    }
    
  }
  
}