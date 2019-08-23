
package millonario;

import java.util.ArrayList;
import java.util.List;

public class Pregunta 
{
    String texto;
    List<Respuesta> respuestas = new ArrayList<Respuesta>();
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
    
    public void setRespuesta(Respuesta respuestas) {
        this.respuestas.add(respuestas);
    }
    
}
