public class Album
{
    private String titulo;
    private double duracao;
    private String descricao;
    private String artista;
    private int faixas;
    private boolean possuiDimensoesFisicas; 
    
    public boolean setPossuiDimensoesFisicas(boolean possui) {
        this.possuiDimensoesFisicas = possui;
        return true;
    }
    
    public boolean getPossuiDimensoesFisicas() {
        return this.possuiDimensoesFisicas;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public boolean setTitulo(String titulo) {
        if ( !titulo.isEmpty() ){
            this.titulo = titulo;
            return true;
        }else{
            return false;
        }
    }
    
    public double getDuracao() {
        return this.duracao;
    }

    public boolean setDuracao(double duracao) {
        if (duracao >= 0){
            this.duracao = duracao;
            return true;
        }else{
            return false;
        }
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean setComentario(String comentario) {
        if (!comentario.isEmpty()){
            this.descricao = descricao;
            return true;
        }else{
            return false;
        }
    }
    
    public String getArtista() {
        return artista;
    }

    public boolean setArtista(String artista) {
        if (!artista.isEmpty()){
            this.artista = artista;
            return true;
        }else{
            return false;
        }
    }

    public int getFaixas() {
        return faixas;
    }

    public boolean setFaixas(int faixas) {
        if (faixas > 0){
            this.faixas = faixas;
            return true;
        }else{
            return false;
        }
    }
    
    public String toString() {
        return "Tipo de Album: " + this.getPossuiDimensoesFisicas();
    }
}
