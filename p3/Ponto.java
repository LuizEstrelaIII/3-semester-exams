public class Ponto{
  public double x, y;

  public Ponto(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distancia(Ponto p){
    double xdif, ydif;

    xdif = x - p.x;
    ydif = y - p.y;

    double dist;

    dist = Math.pow(xdif, 2) + Math.pow(ydif, 2);
    
    dist = Math.sqrt(dist);
    
    return dist;
  }
}