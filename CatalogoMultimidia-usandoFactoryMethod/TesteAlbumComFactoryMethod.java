

public class TesteAlbumComFactoryMethod
{
    public static void main (String[] args) {
        Album albumFisico = AlbumFactory.getInstance(TipoAlbumEnum.DIGITAL);
        
        Album albumDigital = AlbumFactory.getInstance(TipoAlbumEnum.FISICO);
        
        System.out.println(albumFisico.toString());
        System.out.println(albumDigital.toString()); 
    }
}
