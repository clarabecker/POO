
public class AlbumFactory
{
    public static Album getInstance(TipoAlbumEnum tipoAlbumEnum) {
        
        switch (tipoAlbumEnum){
            case FISICO:
             AlbumFisico albumFisico = new AlbumFisico();  
             albumFisico.setPossuiDimensoesFisicas(true);;
             return albumFisico;
             
            case DIGITAL:
             AlbumDigital albumDigital = new AlbumDigital(); 
             albumDigital.setPossuiDimensoesFisicas(false);;
             return albumDigital;
             
            default: 
            throw new IllegalArgumentException("Tipo de produto não disponível");
        }
    }
    
}
