
package millonario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAddFaq extends javax.swing.JDialog {
List<Pregunta> preguntas;

    public void setPreguntas(List<Pregunta> preguntas) 
    {
        this.preguntas = preguntas;
    }

    public List<Pregunta> getPreguntas()
    {
            return preguntas;
    }


    public DAddFaq(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtR4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtR2 = new javax.swing.JTextField();
        TxtR3 = new javax.swing.JTextField();
        lblPregunta = new javax.swing.JLabel();
        Btt2 = new javax.swing.JButton();
        Btt1 = new javax.swing.JButton();
        lblRespC = new javax.swing.JLabel();
        TxtR1 = new javax.swing.JTextField();
        TxtFaq = new javax.swing.JTextField();
        lblPregunta1 = new javax.swing.JLabel();
        TxtFaqDificultad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Respuesta Incorrecta:");

        jLabel3.setText("Respuesta Incorrecta:");

        jLabel4.setText("Respuesta Incorrecta:");

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Agregar Nueva Pregunta");

        lblPregunta.setText("Pregunta:");

        Btt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Finalizar_16.png"))); // NOI18N
        Btt2.setText(" Finalizar");
        Btt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt2ActionPerformed(evt);
            }
        });

        Btt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/agregar_16.png"))); // NOI18N
        Btt1.setText(" Agregar");
        Btt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt1ActionPerformed(evt);
            }
        });

        lblRespC.setText("Respuesta Correcta:");

        TxtR1.setToolTipText("");

        lblPregunta1.setText("Dificultad: (1, 2, 3)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtFaq))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Btt1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                    .addComponent(Btt2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblRespC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtR2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(TxtR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(TxtR3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(TxtR4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(TxtFaqDificultad, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPregunta)
                    .addComponent(TxtFaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPregunta1)
                    .addComponent(TxtFaqDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRespC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btt2)
                    .addComponent(Btt1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt2ActionPerformed
       this.dispose();;
    }//GEN-LAST:event_Btt2ActionPerformed

    private void Btt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt1ActionPerformed
    if((this.TxtFaq.getText().trim().isEmpty()) || (this.TxtR1.getText().trim().isEmpty()) || (this.TxtR2.getText().trim().isEmpty())|| (this.TxtR3.getText().trim().isEmpty()) || (this.TxtR4.getText().trim().isEmpty()))
    {
    JOptionPane.showMessageDialog( null, "Para Agregar la Pregunta debe tener llenar los campos de Pregunta, y Respuestas", "QQSM", JOptionPane.PLAIN_MESSAGE );
    }
    else
    {
         Pregunta pr = new Pregunta();
         List<Respuesta> respuestas;
         pr.setTexto(this.TxtFaq.getText().trim());
         pr.setDificultad(Integer.parseInt(this.TxtFaqDificultad.getText().trim()));
         respuestas = pr.getRespuestas();
         
         Respuesta Rt1 = new Respuesta();
         Respuesta Rt2 = new Respuesta();
         Respuesta Rt3 = new Respuesta();
         Respuesta Rt4 = new Respuesta();
         
         Rt1.setCod(1);
         Rt2.setCod(2);
         Rt3.setCod(3);
         Rt4.setCod(4);
         
         Rt1.setTex(this.TxtR1.getText().trim());
         Rt2.setTex(this.TxtR2.getText().trim());
         Rt3.setTex(this.TxtR3.getText().trim());
         Rt4.setTex(this.TxtR4.getText().trim());
         
         respuestas.add(Rt1);
         respuestas.add(Rt2);
         respuestas.add(Rt3);
         respuestas.add(Rt4);
         
         preguntas.add(pr);
         JOptionPane.showMessageDialog( null, "Se a Agregado Pregunta con Exito", "QQSM", JOptionPane.PLAIN_MESSAGE );
         
         this.TxtFaq.setText(null);
         this.TxtFaqDificultad.setText(null);
         this.TxtR1.setText(null);
         this.TxtR2.setText(null);
         this.TxtR3.setText(null);
         this.TxtR4.setText(null);
    }
    
        
        
        
        
    }//GEN-LAST:event_Btt1ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btt1;
    private javax.swing.JButton Btt2;
    private javax.swing.JTextField TxtFaq;
    private javax.swing.JTextField TxtFaqDificultad;
    private javax.swing.JTextField TxtR1;
    private javax.swing.JTextField TxtR2;
    private javax.swing.JTextField TxtR3;
    private javax.swing.JTextField TxtR4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPregunta1;
    private javax.swing.JLabel lblRespC;
    // End of variables declaration//GEN-END:variables
}
