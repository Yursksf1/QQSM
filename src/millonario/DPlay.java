
package millonario;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.yellow);
        setIconImage(null);
        setIconImages(null);
        setResizable(false);

        LblFaq.setBackground(new java.awt.Color(51, 0, 102));
        LblFaq.setFont(new java.awt.Font("Lato Heavy", 0, 18)); // NOI18N
        LblFaq.setForeground(new java.awt.Color(0, 0, 0));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRt1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRt3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRt4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRt2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblFaq, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblCont, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(BttEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblFaq, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCont))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRt1)
                    .addComponent(lblRt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRt4)
                    .addComponent(lblRt3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
      rtc=rt4;
      
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
                    default:  
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblRt1;
    private javax.swing.JLabel lblRt2;
    private javax.swing.JLabel lblRt3;
    private javax.swing.JLabel lblRt4;
    // End of variables declaration//GEN-END:variables
}
