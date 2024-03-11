

public class Deputado
{
   private int matricula;
   private String nome;
   private int partido;
   private String estado;
   
   private Deputado(int matricula, String nome, String estado) {
       this.matricula = matricula;
       this.nome = nome;
       this.estado = estado;
   }
   
   public boolean setPartido(int partido) {
       if (partido >= 10 && partido <= 99) {
           this.partido = partido; 
           return true;
       } 
       return false;
   }
   
   public int getMatricula() {
       return this.matricula;
   }
   
   public String getNome() {
       return this.nome;
   }
   
   public int getPartido() {
       return this.partido;
   }
   
   public String getEstado() {
       return this.estado;
   }
   
   public String toString() {
       return "Matricula: " + this.matricula + ", Nome: " + this.nome + ", Partido: " + this.partido + ", Estado: " + this.estado;
   }
   
   public static class DeputadoBuilder
    {
   private int matricula;
   private String nome;
   private int partido;
   private String estado;
   
   public DeputadoBuilder nome (String nome) {
       this.nome = nome; 
       return this; 
   }
   
   public DeputadoBuilder matricula (int matricula) {
       this.matricula = matricula;
       return this; 
   }
   
    public DeputadoBuilder estado (String estado) {
        this.estado = estado;
        return this; 
    }
   
    public Deputado deputadobuild() {
        return new Deputado(matricula, nome, estado);
    }
   
}
   
   
}
