

public class AlbumDigital extends Album{
     private int minutosouvidos;
  
  public boolean setMinutosOuvidos(int minutos) {
      if (minutos > 0) {
          this.minutosouvidos = minutos;
          return true;
      }
      return false;
  }
    
  
  public int getEstoque() {
      return this.minutosouvidos; 
  }
    
  
}
