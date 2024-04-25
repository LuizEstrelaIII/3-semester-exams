class Main {
  public static void main(String[] args) {
    Ponto p1 = new Ponto(1,1);
    Ponto p2 = new Ponto(5,1);
    Ponto p3 = new Ponto(5,4);

    Triangulo t1 = new Triangulo(p1, p2, p3);

    System.out.println(t1.semiperimetro());
    System.out.println("A area de t1 e: " + t1.area());

    Ponto p4 = new Ponto(2,3);
    Ponto p5 = new Ponto(3,4);
    Ponto p6 = new Ponto(4,5);

    Triangulo t2 = new Triangulo(p4, p5, p6);

    System.out.println("A area de t2 e: " + t2.area());

    System.out.println(t1.linear());
    System.out.println(t2.linear());
    
  }
}