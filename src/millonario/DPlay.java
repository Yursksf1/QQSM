
package millonario;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;

// Audio
import java.applet.AudioClip;

public class DPlay extends javax.swing.JDialog {

    public DPlay(java.awt.Frame parent, boolean modal) {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ejemplo");
        setIconImage(new ImageIcon(getClass().getResource("/IMG/Icono_52.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/IMG/Portada 2.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
    }
    List [] preguntas_dificultad;
    List<Pregunta> preguntas;
    List<Respuesta> respuestas;
    Pregunta pr;
    int cont=0;
    int contError=0;
    int k;
    Respuesta rtc;
    Respuesta rt1;
    Respuesta rt2;
    Respuesta rt3;
    Respuesta rt4;
    
    boolean using_help1=false;    
    boolean using_help2=false;
    boolean using_help3=false;
    AudioClip sonido_pregunta;

    
            // TODO add your handling code here:

    Color color_violeta = new java.awt.Color(120, 0, 120);
    
    public void setPreguntas(List<Pregunta> preguntas) 
    {
        this.preguntas = preguntas;
    }

    public List<Pregunta> getPreguntas()
    {
        return preguntas;
    }
    
        
    public void setPreguntasDificultad(List [] preguntas_dificultad) 
    {
        this.preguntas_dificultad = preguntas_dificultad;
    }

    public List [] getPreguntasDificultad()
    {
        return preguntas_dificultad;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblFaq = new javax.swing.JLabel();
        lblRt1 = new javax.swing.JLabel();
        lblRt3 = new javax.swing.JLabel();
        lblRt2 = new javax.swing.JLabel();
        lblRt4 = new javax.swing.JLabel();
        BttEnviar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LblCont = new javax.swing.JLabel();
        btnHelp_1 = new javax.swing.JToggleButton();
        btnHelp_3 = new javax.swing.JToggleButton();
        btnHelp_2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.yellow);
        setIconImage(null);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(1440, 850));
        setResizable(false);

        LblFaq.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        LblFaq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblFaq.setText("Pregunta");
        LblFaq.setToolTipText("");
        LblFaq.setOpaque(true);

        lblRt1.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblRt1.setForeground(new java.awt.Color(255, 255, 255));
        lblRt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/A.png"))); // NOI18N
        lblRt1.setText("a) Respuesta 1");
        lblRt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRt1MouseClicked(evt);
            }
        });

        lblRt3.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblRt3.setForeground(new java.awt.Color(255, 255, 255));
        lblRt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/C.png"))); // NOI18N
        lblRt3.setText("c) Respuesta 3");
        lblRt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRt3MouseClicked(evt);
            }
        });

        lblRt2.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblRt2.setForeground(new java.awt.Color(255, 255, 255));
        lblRt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/B.png"))); // NOI18N
        lblRt2.setText("b) Respuesta 2");
        lblRt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRt2MouseClicked(evt);
            }
        });

        lblRt4.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblRt4.setForeground(new java.awt.Color(255, 255, 255));
        lblRt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/D.png"))); // NOI18N
        lblRt4.setText("d) Respuesta 4");
        lblRt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRt4MouseClicked(evt);
            }
        });

        BttEnviar.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        BttEnviar.setText("Responder");
        BttEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttEnviarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Cambio.jpg"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LblCont.setFont(new java.awt.Font("Bebas", 1, 30)); // NOI18N
        LblCont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCont.setText("0");

        btnHelp_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5050.jpg"))); // NOI18N
        btnHelp_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnHelp_1.setRequestFocusEnabled(false);
        btnHelp_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp_1ActionPerformed(evt);
            }
        });

        btnHelp_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Publico.jpg"))); // NOI18N
        btnHelp_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnHelp_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp_3ActionPerformed(evt);
            }
        });

        btnHelp_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Llamada.jpg"))); // NOI18N
        btnHelp_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnHelp_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRt1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRt3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRt2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRt4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BttEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(LblCont, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHelp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHelp_2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHelp_3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(LblFaq, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnHelp_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHelp_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHelp_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblCont))
                .addGap(45, 45, 45)
                .addComponent(BttEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(LblFaq, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRt1MouseClicked
      rtc=rt1;
      
      lblRt1.setForeground(new java.awt.Color(255, 153, 0));
      lblRt1.setBackground(color_violeta);
      lblRt2.setForeground(new java.awt.Color(255,255,255));
      lblRt3.setForeground(new java.awt.Color(255,255,255));
      lblRt4.setForeground(new java.awt.Color(255,255,255));
      System.out.println("Tex: " +rtc.tex);
      System.out.println("Cod: "+ rtc.cod);
    }//GEN-LAST:event_lblRt1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nuevo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblRt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRt2MouseClicked
      rtc=rt2;
      lblRt2.setForeground(new java.awt.Color(255, 153, 0));
      lblRt2.setBackground(color_violeta);
      lblRt1.setForeground(new java.awt.Color(255,255,255));
      lblRt3.setForeground(new java.awt.Color(255,255,255));
      lblRt4.setForeground(new java.awt.Color(255,255,255));
      System.out.println("Tex: " +rtc.tex);
      System.out.println("Cod: "+ rtc.cod);
      
    }//GEN-LAST:event_lblRt2MouseClicked

    private void lblRt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRt3MouseClicked
      rtc=rt3;
      
      lblRt3.setForeground(new java.awt.Color(255, 153, 0));
      lblRt3.setBackground(color_violeta);
      lblRt1.setForeground(new java.awt.Color(255,255,255));
      lblRt2.setForeground(new java.awt.Color(255,255,255));
      lblRt4.setForeground(new java.awt.Color(255,255,255));
      System.out.println("Tex: " +rtc.tex);
      System.out.println("Cod: "+ rtc.cod);
    }//GEN-LAST:event_lblRt3MouseClicked

    private void lblRt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRt4MouseClicked
      rtc=rt4;        // TODO add your handling code here:
      
      lblRt4.setForeground(new java.awt.Color(255, 153, 0));
      lblRt4.setBackground(color_violeta);
      lblRt1.setForeground(new java.awt.Color(255,255,255));
      lblRt2.setForeground(new java.awt.Color(255,255,255));
      lblRt3.setForeground(new java.awt.Color(255,255,255));        
      System.out.println("Tex: " +rtc.tex);
      System.out.println("Cod: "+ rtc.cod);
    }//GEN-LAST:event_lblRt4MouseClicked

    private void BttEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttEnviarActionPerformed
       if(rtc == null)
       {
                JOptionPane.showMessageDialog( null, "Seleccione una respuesta", "QQSM", JOptionPane.PLAIN_MESSAGE );
       }
       else
       {
           if(rtc.cod == 1)
           {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/respuesta_correcta.wav"));
                sonido.play();
                JOptionPane.showMessageDialog( null, "Muy Bien", "QQSM", JOptionPane.PLAIN_MESSAGE );
                cont++;
                if (cont>11) {
                    JOptionPane.showMessageDialog( null, "Felicidades Haz Ganado", "QQSM", JOptionPane.PLAIN_MESSAGE );
                    cont = 0;
                    preguntas = preguntas_dificultad[0];
                    contError=0; 
                } else {
                    nuevo();
                }
                
           }
           else
           {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/respuesta_incorrecta.wav"));
                sonido.play();
               contError++;
               switch(k)
                    {
                    case 1: lblRt1.setForeground(new java.awt.Color(0, 153, 0));  break;
                    case 2: lblRt2.setForeground(new java.awt.Color(0, 153, 0));  break;
                    case 3: lblRt3.setForeground(new java.awt.Color(0, 153, 0));  break;
                    case 4: lblRt4.setForeground(new java.awt.Color(0, 153, 0));  break;
                    }
               
                    JOptionPane.showMessageDialog( null, "Perdio", "QQSM", JOptionPane.PLAIN_MESSAGE );
                    cont=0; 
                    preguntas = preguntas_dificultad[0];
                    contError=0;
                    this.dispose();;

           }
           rtc=null;
           lblRt1.setForeground(new java.awt.Color(255,255,255));
           lblRt2.setForeground(new java.awt.Color(255,255,255));
           lblRt3.setForeground(new java.awt.Color(255,255,255));
           lblRt4.setForeground(new java.awt.Color(255,255,255));
       }
       
        
        
    }//GEN-LAST:event_BttEnviarActionPerformed

    private void btnHelp_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp_1ActionPerformed
        
        if(!using_help1){
        
            // DEBO BORRAR DOS PREGUNTAS INCORRECTAS
            int aleatorio, next_aleatorio;
            int i = 0;
            JLabel[] respuestas_activas = {lblRt1, lblRt2, lblRt3, lblRt4 };
            JLabel respuesta_seleccionada;
            String respuesta_correcta = pr.getRespuestas().get(0).getTex();
            JLabel[] respuestas_falsas = new JLabel[3];
            for (JLabel respuesta : respuestas_activas ){
                if (respuesta.getText().compareTo(respuesta_correcta)!=0) {
                    respuestas_falsas[i] = respuesta;
                    i ++;
                }    
            }
                
            aleatorio = (int) Math.round((Math.random()*respuestas_falsas.length));
            respuesta_seleccionada = respuestas_falsas[aleatorio];
            respuesta_seleccionada.setText("");
            next_aleatorio = aleatorio - 1;
            if(next_aleatorio < 0) {
                next_aleatorio = 2;
            } 
            respuesta_seleccionada = respuestas_falsas[next_aleatorio];
            respuesta_seleccionada.setText("");


            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/respuesta_correcta.wav"));
            sonido.play();
        
            using_help1=true;
        }
        System.out.println("1");
    }//GEN-LAST:event_btnHelp_1ActionPerformed

    private void btnHelp_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp_3ActionPerformed
        
        if(!using_help3){
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/llamada.wav"));
            sonido.play();
            System.out.println("3");
        
            using_help3=true;
        }

    }//GEN-LAST:event_btnHelp_3ActionPerformed

    private void btnHelp_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp_2ActionPerformed
        if(!using_help2){
            sonido_pregunta.stop();        
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/llamada.wav"));
            sonido.play();
            System.out.println("2");
        
            using_help2=true;
        }

    }//GEN-LAST:event_btnHelp_2ActionPerformed

    public void nuevo()
    {
        if (cont == 3 ) {
            preguntas = preguntas_dificultad[1];
        } else if ( cont == 9) {
            preguntas = preguntas_dificultad[2];
        } else if (cont == 12 ) {
        
        }
            
        LblCont.setText(cont+"");
        pr=preguntas.get((int) Math.round((Math.random()*(preguntas.size()-1))));
        preguntas.remove(pr);
        respuestas = pr.getRespuestas();
        k=1+(int) Math.round((Math.random()*3));
        switch(k)
                    {
                    case 1: 
                            rt1=respuestas.get(0);
                            rt2=respuestas.get(2);
                            rt3=respuestas.get(1);
                            rt4=respuestas.get(3);
                            break;
                    case 2: 
                            rt1=respuestas.get(1);
                            rt2=respuestas.get(0);
                            rt3=respuestas.get(3);
                            rt4=respuestas.get(2);
                            break;
                    case 3: 
                            rt1=respuestas.get(2);
                            rt2=respuestas.get(3);
                            rt3=respuestas.get(0);
                            rt4=respuestas.get(1);
                            break;
                    case 4: 
                            rt1=respuestas.get(3);
                            rt2=respuestas.get(2);
                            rt3=respuestas.get(1);
                            rt4=respuestas.get(0);
                            break;
                    default:          // TODO add your handling code here:

                        System.out.println("es default" + k);
                            rt1=respuestas.get(3);
                            rt2=respuestas.get(2);
                            rt3=respuestas.get(1);
                            rt4=respuestas.get(0);
                            break; 
                    }
                            
        rtc=null;
        LblFaq.setText(pr.texto);
        // la que tenga cod 1 es la respuesta correcta
        lblRt1.setText(rt1.getTex());
        lblRt2.setText(rt2.getTex());
        lblRt3.setText(rt3.getTex());
        lblRt4.setText(rt4.getTex());
                    
        
        sonido_pregunta = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/pregunta.wav"));
        sonido_pregunta.play();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttEnviar;
    private javax.swing.JLabel LblCont;
    private javax.swing.JLabel LblFaq;
    private javax.swing.JToggleButton btnHelp_1;
    private javax.swing.JToggleButton btnHelp_2;
    private javax.swing.JToggleButton btnHelp_3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblRt1;
    private javax.swing.JLabel lblRt2;
    private javax.swing.JLabel lblRt3;
    private javax.swing.JLabel lblRt4;
    // End of variables declaration//GEN-END:variables
}
