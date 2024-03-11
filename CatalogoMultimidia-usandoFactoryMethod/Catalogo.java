import java.util.ArrayList;

public class Catalogo{
    private String colecionador;
    private ArrayList<Album> albuns;
    
    public Catalogo(String colecionador){
        this.colecionador = colecionador;
        this.albuns = new ArrayList<Album>();
    }

    public void addItem(Album umalbum){
        this.albuns.add(umalbum);
    }
    
    public String toString(){
        String texto = "Colecionador: "+this.colecionador+"\n";
        for(Album al: this.albuns){
            texto += "Titulo: "+al.getTitulo()+", "+
                    "Duracao: "+al.getDuracao()+", "+
                "Descrição: "+al.getDescricao()+ ", " +
                "Número de faixas: "+al.getFaixas() + ", " +
                "Artista: " +al.getArtista();
        }        
        return texto;
    }
}
