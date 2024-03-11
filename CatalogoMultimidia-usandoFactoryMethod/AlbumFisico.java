
public class AlbumFisico extends Album{
  private int estoque;
  
  public boolean setEstoque(int estoque) {
      if (estoque > 0) {
          this.estoque = estoque;
          return true;
      }
      return false;
  }
    
  
  public int getEstoque() {
      return this.estoque; 
  }
    
}
