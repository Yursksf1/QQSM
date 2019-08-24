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
             //pr.setDificultad( Integer.parseInt(pregunta[5]));
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
            {"CADA JUGADOR DE AJEDREZ DISPONE DE LA SIGUIENTE CANTIDAD DE FICHAS", "16", "11", "12", "18"},
            {"¿EN QUE PAÍS FUÉ INVENTADO EL AJEDREZ?", "CHINA", "COLOMBIA", "COREA", "HAITÍ"},
            {"¿EN QUE CIUDAD DEL MUNDO FUÉ INVENTO EL BÉISBOL?", "NEW YORK", "BOGOTÁ", "CHICAGO", "TEXAS"},
            {"EL FÚTBOL SE JUEGA CON ...", "BALÓN", "RAQUETA", "FICHAS", "PISTOLA"},
            {"¿QUIÉN FUE EL CREADOR DEL PING PONG?", "JOHN JACQUES", "JHON LENOON", "MAXWELL PINZON", "DONAL JAKERS"},
            {"SI MI EQUIPO METE 3 GOLES, LUEGO 8, MÁS TARDE 6 Y NOS HACEN 1 MÁS 3, ¿CUANTOS GOLES DE VENTAJA LES LLEVARÍAMOS?", "13", "8", "14", "15"},
            {"¿CUANTOS OROS OLÍMPICOS HA GANADO USAIN BOLT?", "11", "10", "15", "12"}
        };
        loadPreguntasRespuestas(lista_preguntas, preguntas_faciles);
        preguntas_dificultad[0] = preguntas_faciles;
    }

    public void loadPreguntasMedias(){
       List<Pregunta> preguntas_medias = new ArrayList<Pregunta>();
        String[][] lista_preguntas = {
            {"¿CUÁL ES EL ANIMAL MAS RÁPIDO DEL MUNDO?", "GUEPARDO", "CANGURO", "TIGRE", "LEÓN"},
            {"¿CUÁNTAS PATAS TIENE LA ARAÑA?", "8", "3", "2", "7"},
            {"¿CUÁL ES EL AVE VOLADOR MÁS GRANDE?", "CONDOR ANDINO", "AVESTRUZ", "EMU", "ÑANDU"},
            {"¿ESPECIES MARINAS PARA LA PESCA EN ECUADOR MÁS COTIZADAS?", "ATÚN", "BALLENAS", "TIBURÓN", "PIRAÑAS"},
            {"¿QUÉ COME UN HIPOPÓTAMO?", "PASTO", "PESES", "CARNE", "PIEDRAS"},
            {"¿COMO SE LLAMAN LOS CACHORROS DEL LOBO?", "LOBEZNO", "OSEZNO", "LOBITO", "LOBATO"},
            {"¿QUÉ COMEN LOS KOALAS?", "HOJAS DE EUCALIPTO", "PASTO", "RATONES", "CULEBRAS"},
            {"¿COMO SE LLAMA LA BOLSA DE LAS MAMA CANGURO?", "MARSUPIO", "RUFUS", "PARMA", "MACROPIS"},
            {"PODEMOS CLASIFICAR EL CABALLO COMO UN ANIMAL ...", "MAMÍFERO", "ANFIBIO", "REPTIL", "OVIPARO"},
            {"¿CUÁL DE ESTAS OPCIONES ES JNA SEMEJANZAS ENTRE LEÓN Y GALLINA?", "AMBOS SON VERTEBRADOS", "AMBOS SON MAMÍFEROS", "AMBOS SON VIVIPAROS", "NO TIENEN SEMEJANZA"},
            {"¿LO MAMÍFEROS TIENEN LA SIGUIENTE CARACTERISTICA:?", "LSS CRÍAS NACEN Y MAMAN LECHE DE SU MADRE", "SU RESPIRACIÓN ES POR BRANQUIAS", "TIENEN ESCAMAS", "SON OVIPAROS"},
            {"¿QUÉ CUBRE AL CONDOR?", "PLUMAS", "PELOS", "ESCAMAS", "PIEL"},
            {"¿LAS RANAS Y LOS SAPOS FORMAN PARTE DEL GRUPO?", "ANFIBIOS", "REPTILES", "PECES", "INVERTEBRADOS"},
            {"¿CUÁL DE LOS SIGUIENTES ANIMALESNACE DE HUEVO?", "ÁGUILA", "LEÓN", "ELEFANTE", "NINGUNA DE LAS ANTERIORES"},
            {"¿CUÁL DE LOS SIGUIENTES ANIMALES ES UN MAMÍFERO?", "DELFÍN", "COCODRILO", "SAPO", "SALMON"},
            {"¿CUANTAS PATAS TIENE UN PERRO PARADO DE LADO?", "4", "2", "1", "3"},
            {"¿QUÉ HOMBRE ES CONOCIDO COMO EL PADRE DE LA FÉ?", "ENOC", "JESUS", "ABRAHAM", "JACOB"},
            {"¿QUÉ MUJER QUEDÓ CONVERTIDA EN ESTATUA DE SAL?", "LA SOBRINA DE MARDOQUEO", "LA ESPOSA DE JOB", "LA ESPOSA DEL REY DAVID", "LA HIJA DEL REY SAUL"},
            {"¿CUÁL ES EL PRIMER MANDAMIENTO CON PROMESA ESTA EN EFESIOS?", "AMA A DIOS CON TODA TUS FUERZAS Y VIVIRAS ETERNAMENTE", "AMA A TU PROJIMO COMO A TIMISMO Y TE AMARAN", "TODO LO QUE EL HOMBRE SEMBRARE ESO TAMBIEN SEGARÁ", "HONRRA A TU PADRE Y A TU MADRE Y SERAS DE LARGA VIDA SOBRE LA TIERRA"},
            {"¿CUÁL ES EL NOMBRE DEL DISCÍPULO QUE REMPLAZO A JUDAS - MATIAS?", "MATIAS", "ESTEBAN", "MATEO", "FELIPE"},
            {"¿QUÉ HOMBRE DEPUÉS DE HABERLO PERDIDO TODO NUNCA RENEGÓ A PESAR DE LA PRUEBA?", "JOB", "JONAS", "DAVID", "SALOMON"},
            {"¿CUANTOS LIBROS TIENE LA BIBLIA?", "76", "66", "54", "95"},
            {"¿CUANTOS LIBROS TIENE EL NUEVO TESTAMENTO?", "44", "21", "27", "37"},
            {"¿A QUE PERSONAJE DE LA BIBLIA DIOS LE CAMBIO SU NOMBRE POR PABLO?", "SIMON", "JOCOBO", "BERNABE", "SAULO"},
            {"¿CUANTAS SON LAS TRIBUS DE ISRRAEL?", "10", "9", "12", "13"},
            {"¿CON QUE MATO DAVID A GOLIAT?", "UNA PIEDRA", "UNA ESPADA", "UNA QUIJADA DE BURRO", "UNA HONDA"},
            {"¿CUANTOS DIAS DURO JONAS EN EL VIENTRE DEL PEZ?", "4", "3", "2", "7"},
            {"¿SOBRE QUE EDIFICA EL HOMBRE PRUDENTE SU CASA?", "ARENA", "MADERA", "LA ROCA", "ASFALTO"},
            {"¿QUIÉN ES LLAMADO PADRE DE MULTITUDES?", "ISRAEL", "JACOB", "JESUS", "ABRAHAM"},
            {"¿A QUE LE DECIMOS COMUNICACIÓN CON DIOS?", "AYUANAR", "ORAR", "LEER LA PALABRA", "VIGILAR"},
            {"¿QUÉ ES LA CERTEZA DE LO QUE SE ESPERA Y LA CONVICCIÓN DE LO QUE NO SE VE?", "PAZ", "ESPERANZA", "AMOR", "FE"},
            {"¿CUÁL ES EL TEXTO QUE DEMUESTRA EL AMOR DE DIOS HACIA LA HUMANIDAD JUAN 3:16?", "SALMOS 119:3", "ISAIAS 10:35", "JUAN 3:16", "ROMANOS 17:1"},
            {"¿EN CUANTOS DÍAS CREO DIOS AL MUNDO 6 EL 7 LO DESCANSO?", "7", "8", "6", "12"},
            {"¿QUIÉN ES EL PRINCIPIE DE ESTE SIGLO Y EL PADRE DE LA MENTIRA?", "JACOB", "EL FALSO PROFETA", "JUDAS", "SATANAS"},
            {"¿CUÁL ES EL NOMBRE DEL LUGAR QUE DIOS CREO PARA ADAN Y EVA?", "EL HUERTO DEL EDEN", "EL PARISO", "LA NUEVA JERUSALEN", "EL CIELO"},
            {"SEGÚN EL REFRAN, ¿QUIEN ES CIEGO?", "EL AMOR", "LA ESPERANZA", "EL ODIO", "LA ENVIDIA"},
            {"SEGUN EL REFRAN, EL QUE SE ACUESTA A DORMIR, ES PORQUE CRÍA:", "FAMA", "ALEGRÍA", "FLOJERA", "SUEÑO"},
            {"TECNICA QUE DESCRIBE Y REPRESENTA DETALLADAMENTE LA SUPERFICIE DE UN TERRENO:", "TOPOGRAFÍA", "EPIGRAFÍA", "SERIGRAFÍA", "HOLOGRAFÍA"},
            {"¿CUÁL ES EL IDIOMA OFICIAL DE ISRAEL?", "HEBREO", "CHINO", "JAPONES", "GRIEGO"},
            {"¿CUÁL DE LOS SIGUIENTES PAÍSES LIMITA CON FRANCIA?", "BELGICA", "HOLANDA", "SUECIA", "DINAMARCA"},
            {"EL TIMBAL ES UN INSTRUMENTO DE ...", "PERCUSION", "VIENTO METAL", "VIENTO MADERA", "CUERDA"},
            {"¿CUÁL DE LOS SIGUIENTES PAÍSES LIMITA CON FRANCIA?", "ALEMANIA", "CROACIA", "PORTUGAL", "TURQUÍA"},
            {"¿QUÉ PARTE DEL CUERPO SE EXAMINA EN UNA ENCEFALOGRAFIA?", "CRÁNEO", "OVARIOS", "PULMONES", "HÍGADO"},
            {"¿DE DÓNDE SE EXTRAE EL ALCOHOL METILICO?", "MADERA", "ANIMALES", "HUESOS", "ALUMINIO"},
            {"¿CUÁL DE LAS SIGUIENTES PALABRAS ES UNA PREPOSICIÓN?", "DE", "LA", "UNA", "SER"},
            {"¿CUÁL ES EL LUGAR MAS FRÍO DE LA TIERRA?", "ANTARTIDA", "ROMA", "ECUADOR", "NINGUNA DE LAS ANTERIORES"},
            {"¿CUÁL ES EL RIO MAS LARGO DEL MUNDO?", "AMAZONAS", "NILO", "RÍO INFINITO", "RÍO DE GIRÓN"},
            {"¿QUÉ CANTIDAD DE HUESOS TIENE UN RECIÉN NACIDO?", "300", "206", "280", "302"},
            {"¿EN QUE PAÍS EUROPEO SE ENCUENTRA LA BASÍLICA CATÓLICA DE LA SAGRADA FAMILIA?", "BARCELONA", "ALEMANIA", "EN ITALIA", "ROMA"},
            {"¿EN QUE AÑO LLEGÓ CRISTÓBAL COLÓN A AMÉRICA?", "1492", "1493", "1491", "1497"},
            {"¿CUÁL ES EL PAÍS MÁS GRANDE DEL MUNDO?", "RUSIA", "CHINA", "BRASIL", "ESTADOS UNIDOS"},
            {"¿EN QUÉ AÑO COMENZÓ LA II GUERRA MUNDIAL?", "1939", "1942", "1960", "NINGUNA DE LAS ANTERIORES"},
            {"¿EN QUE LUGAR DEL CUERPO SE PRODUCE LA INSULINA?", "PÁNCREAS", "RIÑONES", "ESTÓMAGO", "HIGADO"}
        };
        loadPreguntasRespuestas(lista_preguntas, preguntas_medias);
        preguntas_dificultad[1] = preguntas_medias;

    }

    public void loadPreguntasDificiles(){
       List<Pregunta> preguntas_dificiles = new ArrayList<Pregunta>();
        String[][] lista_preguntas = {
            {"¿CUÁL ES EL APODO DEL LEÍCESTER CITY?", "ZORROS", "CHULOS", "PAJAROS", "LOBOS"},
            {"¿CUÁL ES EL TÉCNICO ACTUAL DE LA SELECCIÓN COLOMBIA?", "CARLOS QUEIROZ", "NÉSTOR PÉKERMAN", "JAMES RODRÍGUEZ", "TINO ASPRILLA"},
            {"JAMES RODRÍGUEZ ES DEPORTISTA EN ...", "FÚTBOL", "TENIS", "BALONCESTO", "GOLF"},
            {"¿CUANTOS MUNDIALES HA GANADO BRASIL?", "5", "1", "6", "10"},
            {"¿CUANTOS TACHES TIENE UN GUAYO DE FÚTBOL?", "VARIA", "6", "8", "NINGUNO"},
            {"¿QUÉ CLUB DE FÚTBOL HA SIDO MÁS VECES CAMPEÓN LA COPA LIBERTADORES DE AMÉRICA?", "INDEPENDIENTE", "JUNIOR TU PAPA", "AMÉRICA DE CALI", "BOCA JUNIORS"},
            {"¿CUÁL NÚMERO LLEVA EN SU CAMISETA RADAMEL FALCAO GARCÍA EN LA SELECCIÓN COLOMBIA?", "9", "10", "5", "7"},
            {"A NIVEL PROFESIONAL ¿CUANTOS JUGADORES DE FÚTBOL ESTÁN HABILITADOS PARA SER TITULARES, EN UN EQUIPO?", "11", "12", "10", "5"},
            {"¿CUÁL EQUIPO DE FÚTBOL ES DE COLOR ROJO EN COLOMBIA?", "AMÉRICA DE CALI", "EQUIDAD SEGUROS", "NACIONAL", "ATLÉTICO BUCARAMANGA"},
            {"¿CUÁL JUGADOR DE FÚTBOL ES LLAMADO EL FENÓMENO?", "RONALDO", "MESSI", "EL PIBE", "FALCAO"},
            {"¿CAMPEÓN DEL MUNDIAL DE FÚTBOL EN BRASIL 2014?", "ALEMANIA", "COLOMBIA", "BRASIL", "ESPAÑA"},
            {"¿CUANTAS LIGAS EN COLOMBIA A GANADO EL ATLÉTICO BUCARAMANGA?", "NINGUNA", "2", "1", "3"},
            {"¿CUANTOS DÓLARES AL DÍA VENDE LA MARCA NIKE EN EL MUNDO?", "89 MILLONES DE DOLARES", "UNA LUCA", "45 MILLONES DE DOLARES", "85 MIL DOLARES"},
            {"¿QUIÉN INVENTO LA EXPRESIÓN 'JOGA BONITO'?", "PELE", "RONALDIÑHO", "GARINCHA", "MESSI"},
            {"¿CUÁL HA SIDO LA MAYOR GOLEADA EN EL FÚTBOL?", "46 - 0", "30 - 0", "1 - 0", "52 - 0"},
            {"¿ÚLTIMO CAMPEÓN DE LA CHAMPIONS LEAGUE?", "LIVERPOOL", "ARSENAL", "BARCELONA", "REAL MADRID"},
            {"¿CRISTIANO RONALDO JUGADOR DEL SIGUIENTE EQUIPO?", "JUVENTUS", "REAL MADRID", "ARSENAL", "MANCHESTER UNITED"},
            {"¿QUIÉN HIZO EL FAMOSO GOL DE LA MANO DE DIOS?", "MARADONA", "STERLING", "PELE", "RENE HIGUITA"},
            {"¿EXPRESIÓN DE PELIGRO DE PERDER UNA PARTIDA EN EL AJEDREZ?", "JAQUE", "MATE", "MATERILELIRELO", "CHAO PESCAO"}
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
