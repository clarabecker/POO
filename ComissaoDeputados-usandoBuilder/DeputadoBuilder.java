
public class DeputadoBuilder
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
   
    //public Deputado deputadobuild() {
    //  return new Deputado(matricula, nome, estado);
    //}
   
}
