
public class TesteDeputadoBuilder
{
    public static void main (String[] args) {
        Deputado deputado = new Deputado.DeputadoBuilder()
                            .nome("Clara") 
                            .matricula(144444) 
                            .estado("RS")
                            .deputadobuild(); 
                            
        System.out.println(deputado);
    }
}
