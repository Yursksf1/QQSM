/*
 * To change this template, choose Tools | Templates
 * and open the template in the memoriaDefaulteditor.
 */
package millonario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// Audio
import java.applet.AudioClip;

public class Index extends javax.swing.JFrame {
       List[] preguntas_dificultad = new List[3];
       private DAddFaq addFaq = new DAddFaq(new javax.swing.JFrame(), true);
       private DPlay play = new DPlay(new javax.swing.JFrame(), true);
       AudioClip sonido;

    public Index() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("¿Quién Quiere Ser Millonario?");
        setIconImage(new ImageIcon(getClass().getResource("/IMG/Icono_52.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/IMG/Portada1.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        memoriaDefault();

        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/main.wav"));
        sonido.play();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btt2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setPreferredSize(new java.awt.Dimension(1440, 860));

        Btt2.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        Btt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/play_16.png"))); // NOI18N
        Btt2.setText("Jugar");
        Btt2.setIconTextGap(10);
        Btt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(Btt2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(339, 339, 339))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addComponent(Btt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt4ActionPerformed
        preguntas_dificultad=null;
        preguntas_dificultad = new List [3];
    }//GEN-LAST:event_Btt4ActionPerformed

    private void bttPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPdfActionPerformed
        memoriaDefault();
    }//GEN-LAST:event_bttPdfActionPerformed

    private void Btt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt3ActionPerformed
        addFaq.setPreguntas(preguntas_dificultad[0]);
        addFaq.setLocationRelativeTo(null);
        addFaq.setResizable(false);
        addFaq.setVisible(true);
    }//GEN-LAST:event_Btt3ActionPerformed

    private void Btt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt2ActionPerformed

        play.setPreguntasDificultad(preguntas_dificultad);
        play.setPreguntas(preguntas_dificultad[0]);
        play.nuevo();
        play.setLocationRelativeTo(null);
        play.setResizable(false);
        play.setVisible(true);

        sonido.stop();

    }//GEN-LAST:event_Btt2ActionPerformed

    public void memoriaDefault() {
        loadPreguntasFaciles();
        loadPreguntasMedias();
        loadPreguntasDificiles();
    }

    public void loadPreguntasRespuestas( String[][] lista_preguntas,  List<Pregunta> preguntas) {
        Pregunta pr;
        List<Respuesta> respuestas;
        for(String[] pregunta:lista_preguntas) {
             pr = new Pregunta();
             pr.setTexto(pregunta[0]);
             pr.setDificultad( Integer.parseInt(pregunta[5]));
             respuestas = pr.getRespuestas();

             Respuesta Rt1 = new Respuesta();
             Respuesta Rt2 = new Respuesta();
             Respuesta Rt3 = new Respuesta();
             Respuesta Rt4 = new Respuesta();

             Rt1.setCod(1);
             Rt2.setCod(2);
             Rt3.setCod(3);
             Rt4.setCod(4);

             Rt1.setTex(pregunta[1]);
             Rt2.setTex(pregunta[2]);
             Rt3.setTex(pregunta[3]);
             Rt4.setTex(pregunta[4]);

             respuestas.add(Rt1);
             respuestas.add(Rt2);
             respuestas.add(Rt3);
             respuestas.add(Rt4);

             preguntas.add(pr);
        }
    }

    public void loadPreguntasFaciles(){
        List<Pregunta> preguntas_faciles = new ArrayList<Pregunta>();

        String[][] lista_preguntas = {
            {
             "F ¿Cuál fue la décima plaga de Egipto?",
             "Muerte de los primogénitos",
             "Piojos",
             "Langostas",
             "Inundación",
             "1",
            },
            {
             "F En el libro del Genesis, ¿Quien es llamada madre de todos los vivientes?",
             "Eva",
             "Sara",
             "Maria",
             "Juana",
             "1"
            },
            {
             "F ¿Cuál de esos personajes abrió el mar rojo?",
             "Moisés",
             "Noé",
             "Josue",
             "Maria",
             "1"
            }
        };
        loadPreguntasRespuestas(lista_preguntas, preguntas_faciles);
        preguntas_dificultad[0] = preguntas_faciles;
    }

    public void loadPreguntasMedias(){
       List<Pregunta> preguntas_medias = new ArrayList<Pregunta>();
        String[][] lista_preguntas = {
            {
             "M ¿Cuál fue la décima plaga de Egipto?",
             "Muerte de los primogénitos",
             "Piojos",
             "Langostas",
             "Inundación",
             "2",
            },
            {
             "M En el libro del Genesis, ¿Quien es llamada madre de todos los vivientes?",
             "Eva",
             "Sara",
             "Maria",
             "Juana",
             "2"
            },
            {
             "M ¿Cuál de esos personajes abrió el mar rojo?",
             "Moisés",
             "Noé",
             "Josue",
             "Maria",
             "2"
            },
            {
             "M ¿Qué personaje bíblico se lavó las manos en público?",
             "Pilato",
             "Naamán",
             "Caifás",
             "Maria Magdalena",
             "2"
            },
            {
             "M ¿Cual fue la primera persona a la que Cristo habló después de su resurrección?",
             "María Magdalena",
             "Judas",
             "Dios",
             "Pilatos",
             "2"
            },
            {
             "M2 ¿Cual fue la primera persona a la que Cristo habló después de su resurrección?",
             "María Magdalena",
             "Judas",
             "Dios",
             "Pilatos",
             "2"
            },
        };
        loadPreguntasRespuestas(lista_preguntas, preguntas_medias);
        preguntas_dificultad[1] = preguntas_medias;

    }

    public void loadPreguntasDificiles(){
       List<Pregunta> preguntas_dificiles = new ArrayList<Pregunta>();
        String[][] lista_preguntas = {
            {
             "D ¿Cuál de esos personajes abrió el mar rojo?",
             "Moisés",
             "Noé",
             "Josue",
             "Maria",
             "3"
            },
            {
             "D ¿Qué personaje bíblico se lavó las manos en público?",
             "Pilato",
             "Naamán",
             "Caifás",
             "Maria Magdalena",
             "3"
            },
            {
             "D ¿Cual fue la primera persona a la que Cristo habló después de su resurrección?",
             "María Magdalena",
             "Judas",
             "Dios",
             "Pilatos",
             "3"
            },
        };
        loadPreguntasRespuestas(lista_preguntas, preguntas_dificiles);
        preguntas_dificultad[2] = preguntas_dificiles;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btt2;
    // End of variables declaration//GEN-END:variables
}
