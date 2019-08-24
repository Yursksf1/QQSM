
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
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/IMG/FondoPlay_500x300.JPG"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
    }
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

        LblFaq.setBackground(new java.awt.Color(51, 0, 102));
        LblFaq.setFont(new java.awt.Font("Lato Heavy", 0, 18)); // NOI18N
        LblFaq.setText("Pregunta");
        LblFaq.setToolTipText("");
        LblFaq.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        LblFaq.setOpaque(true);

        lblRt1.setFont(new java.awt.Font("David", 3, 14)); // NOI18N
        lblRt1.setForeground(new java.awt.Color(255, 255, 255));
        lblRt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/A.png"))); // NOI18N
        lblRt1.setText("a) Respuesta 1");
        lblRt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRt1MouseClicked(evt);
            }
        });

        lblRt3.setFont(new java.awt.Font("David", 3, 14)); // NOI18N
        lblRt3.setForeground(new java.awt.Color(255, 255, 255));
        lblRt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/C.png"))); // NOI18N
        lblRt3.setText("c) Respuesta 3");
        lblRt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRt3MouseClicked(evt);
            }
        });

        lblRt2.setFont(new java.awt.Font("David", 3, 14)); // NOI18N
        lblRt2.setForeground(new java.awt.Color(255, 255, 255));
        lblRt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/B.png"))); // NOI18N
        lblRt2.setText("b) Respuesta 2");
        lblRt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRt2MouseClicked(evt);
            }
        });

        lblRt4.setFont(new java.awt.Font("David", 3, 14)); // NOI18N
        lblRt4.setForeground(new java.awt.Color(255, 255, 255));
        lblRt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/D.png"))); // NOI18N
        lblRt4.setText("d) Respuesta 4");
        lblRt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRt4MouseClicked(evt);
            }
        });

        BttEnviar.setText("Responder");
        BttEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttEnviarActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LblCont.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        LblCont.setForeground(new java.awt.Color(204, 0, 51));
        LblCont.setText("0");

        btnHelp_1.setText("btnHelp_1");
        btnHelp_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp_1ActionPerformed(evt);
            }
        });

        btnHelp_3.setText("btnHelp_3");
        btnHelp_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp_3ActionPerformed(evt);
            }
        });

        btnHelp_2.setText("btnHelp_2");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(BttEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRt1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                    .addComponent(lblRt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRt2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                    .addComponent(lblRt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(LblFaq, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 135, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(btnHelp_1)
                .addGap(18, 18, 18)
                .addComponent(btnHelp_2)
                .addGap(18, 18, 18)
                .addComponent(btnHelp_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblCont, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHelp_2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHelp_3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHelp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblCont))
                .addGap(68, 68, 68)
                .addComponent(LblFaq, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRt1)
                    .addComponent(lblRt2))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRt4)
                    .addComponent(lblRt3))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttEnviar)
                    .addComponent(jButton1))
                .addContainerGap())
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
                JOptionPane.showMessageDialog( null, "Muy Bien", "QQSM", JOptionPane.PLAIN_MESSAGE );
                cont++;
                nuevo();
           }
           else
           {
               contError++;
               switch(k)
                    {
                    case 1: lblRt1.setForeground(new java.awt.Color(0, 153, 0));  break;
                    case 2: lblRt2.setForeground(new java.awt.Color(0, 153, 0));  break;
                    case 3: lblRt3.setForeground(new java.awt.Color(0, 153, 0));  break;
                    case 4: lblRt4.setForeground(new java.awt.Color(0, 153, 0));  break;
                    }
               if(contError>1){
                    JOptionPane.showMessageDialog( null, "Perdio", "QQSM", JOptionPane.PLAIN_MESSAGE );
                    cont=0; 
                    contError=0;
                    this.dispose();;
                } else {
                    JOptionPane.showMessageDialog( null, "Tienes otra oporunidad", "QQSM", JOptionPane.PLAIN_MESSAGE );
                     cont++;
                     nuevo();
               }
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
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/main.wav"));
            sonido.play();
        
            using_help1=true;
        }
        System.out.println("1");
    }//GEN-LAST:event_btnHelp_1ActionPerformed

    private void btnHelp_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp_3ActionPerformed
        
        if(!using_help3){
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/win.mp3"));
            sonido.play();
            System.out.println("3");
        
            using_help3=true;
        }

    }//GEN-LAST:event_btnHelp_3ActionPerformed

    private void btnHelp_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp_2ActionPerformed
        
        if(!using_help2){
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/SOUNDS/win.mp3"));
            sonido.play();
            System.out.println("2");
        
            using_help2=true;
        }

    }//GEN-LAST:event_btnHelp_2ActionPerformed

    public void nuevo()
    {
        LblCont.setText(cont+"");
        pr=preguntas.get((int) Math.round((Math.random()*(preguntas.size()-1))));
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
