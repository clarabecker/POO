
import java.util.ArrayList;

public class Comissao
{
   private String titulo; 
   private ArrayList<Deputado> deputados;
   
   public Comissao(String titulo) {
       this.titulo = titulo; 
       this.deputados = new ArrayList<Deputado>();
   }
   
   public boolean setTitulo(String titulo) {
       if (! titulo.isEmpty() ) {
           this.titulo = titulo;
           return true;
       }
       
       return false;
   }
   
   public void addDeputado(Deputado dep) {
       this.deputados.add(dep);
   }
   
   public String getTitulo() {
       return this.titulo; 
   }
   
   public void imprimirDeputados() {
       for (int i = 0; i < this.deputados.size(); i++) {
           Deputado umDep = this.deputados.get(i);
           
           System.out.println( umDep.getMatricula() );
       }
       
       // for each (para cada) perde o indice (posição) 
       // for (Deputado umDep : this.deputados) {
           // System.out.println ( umDep.toString() ); 
       // }
       }
       
   public void imprimirDeputados(int partido){
        for (int i = 0; i < this.deputados.size(); i++) {
           Deputado umDep = this.deputados.get(i);
           
           if (umDep.getPartido() == partido) {
           System.out.println( umDep.toString() );
         }
       }       
   }
   
   public void imprimirDeputados(String estado) {
       for (int i = 0; i < this.deputados.size(); i++) {
           Deputado umDep = this.deputados.get(i);
           
           if (umDep.getEstado().equalsIgnoreCase(estado)) {
           System.out.println( umDep.toString() );
         }
       }        
   }
   
   public void imprimirQtdPorPartido(){
       //tarefa 
   }
   }
   
   

