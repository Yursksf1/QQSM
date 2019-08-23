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

public class Index extends javax.swing.JFrame {

       List<Pregunta> preguntas = new ArrayList<Pregunta>();
       private DAddFaq addFaq = new DAddFaq(new javax.swing.JFrame(), true);
       private DPlay play = new DPlay(new javax.swing.JFrame(), true);
       
   
    public Index() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ejemplo");
        setIconImage(new ImageIcon(getClass().getResource("/IMG/Icono_52.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/IMG/Fondo_650x375.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        memoriaDefault();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btt4 = new javax.swing.JButton();
        bttPdf = new javax.swing.JButton();
        Btt3 = new javax.swing.JButton();
        Btt2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        Btt4.setText("Borrar");
        Btt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt4ActionPerformed(evt);
            }
        });

        bttPdf.setText("Cargar Preguntas");
        bttPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPdfActionPerformed(evt);
            }
        });

        Btt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/agregar_16.png"))); // NOI18N
        Btt3.setText(" Agregar Preguntas");
        Btt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt3ActionPerformed(evt);
            }
        });

        Btt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/play_16.png"))); // NOI18N
        Btt2.setText("Jugar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addComponent(Btt3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttPdf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttPdf)
                .addGap(18, 18, 18)
                .addComponent(Btt4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btt2)
                    .addComponent(Btt3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt4ActionPerformed
        preguntas=null;
        preguntas = new ArrayList<Pregunta>();

    }//GEN-LAST:event_Btt4ActionPerformed

    private void bttPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPdfActionPerformed
        memoriaDefault();
    }//GEN-LAST:event_bttPdfActionPerformed

    private void Btt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt3ActionPerformed
        addFaq.setPreguntas(preguntas);
        addFaq.setLocationRelativeTo(null);
        addFaq.setResizable(false);
        addFaq.setVisible(true);
    }//GEN-LAST:event_Btt3ActionPerformed

    private void Btt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt2ActionPerformed
        if(preguntas.size()==0)
        {
            JOptionPane.showMessageDialog( null, "No Hay Preguntas Disponibles", "QQSM", JOptionPane.PLAIN_MESSAGE );
        }
        else
        {
        play.setPreguntas(preguntas);
        play.nuevo();
        play.setLocationRelativeTo(null);
        play.setResizable(false);
        play.setVisible(true);
        }
    }//GEN-LAST:event_Btt2ActionPerformed

    public void memoriaDefault()
    {
    Pregunta pr;
        List<Respuesta> respuestas;
        
        String[][] lista_preguntas = { 
            {
             "¿Cuál fue la décima plaga de Egipto?", 
             "Muerte de los primogénitos", 
             "Piojos", 
             "Langostas",
             "Inundación"
            }, 
            {
             "En el libro del Genesis, ¿Quien es llamada madre de todos los vivientes?", 
             "Eva", 
             "Sara", 
             "Maria",
             "Juana"
            },  
            {
             "¿Cuál de esos personajes abrió el mar rojo?", 
             "Moisés", 
             "Noé", 
             "Josue",
             "Maria"
            },   
            {
             "¿Qué personaje bíblico se lavó las manos en público?", 
             "Pilato", 
             "Naamán", 
             "Caifás",
             "Maria Magdalena"
            },   
            {
             "¿Cual fue la primera persona a la que Cristo habló después de su resurrección?", 
             "María Magdalena", 
             "Judas", 
             "Dios",
             "Pilatos"
            }, 
        };
        
        for(String[] pregunta:lista_preguntas)
        {
             pr = new Pregunta();
             pr.setTexto(pregunta[0]);
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
    
       
    public void ImpConsola()
    {
    for(Pregunta pregunta : preguntas)
        {
            System.out.println("Pregunta: " + pregunta.getTexto());
            for(Respuesta respuesta : pregunta.getRespuestas())
            {
                System.out.println("Respuesta tex " + respuesta.getTex());
                System.out.println("Respuesta cod " + respuesta.getCod());

            }
            System.out.println("");
        }
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
    private javax.swing.JButton Btt3;
    private javax.swing.JButton Btt4;
    private javax.swing.JButton bttPdf;
    // End of variables declaration//GEN-END:variables
}
