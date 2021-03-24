package calculadora;

import java.awt.Frame;
import java.awt.Toolkit;

public class Interface extends javax.swing.JFrame {
    
    private boolean ponto = true;
    String calculo, resultado, simbolo, coteudo;
    Double resuldado;
    
    public Interface() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BTN_C = new javax.swing.JButton();
        BTNRaizredonda = new javax.swing.JButton();
        BTNPOTENCIA = new javax.swing.JButton();
        BTN_Multiplicacao = new javax.swing.JButton();
        BTN_Divisao = new javax.swing.JButton();
        BTN_Adicao = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN9 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTNIgual = new javax.swing.JButton();
        BTN0 = new javax.swing.JButton();
        BTNPONTO = new javax.swing.JButton();
        BTNbaisobedos = new javax.swing.JButton();
        BTNPONTO1 = new javax.swing.JButton();
        BTN_Menos1 = new javax.swing.JButton();
        BTN10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 43, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/Fechar.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/MINIZAR.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 10, 10));

        txt.setBackground(new java.awt.Color(33, 43, 65));
        txt.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        txt.setForeground(java.awt.Color.white);
        txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt.setBorder(null);
        txt.setSelectedTextColor(new java.awt.Color(110, 132, 190));
        txt.setSelectionColor(new java.awt.Color(204, 204, 204));
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        jPanel1.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 320, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 140));

        jPanel2.setBackground(new java.awt.Color(46, 57, 81));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_C.setBackground(new java.awt.Color(46, 57, 81));
        BTN_C.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        BTN_C.setForeground(new java.awt.Color(255, 255, 255));
        BTN_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIAL.png"))); // NOI18N
        BTN_C.setText("C");
        BTN_C.setBorderPainted(false);
        BTN_C.setContentAreaFilled(false);
        BTN_C.setFocusPainted(false);
        BTN_C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_C.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN_C.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        BTNRaizredonda.setBackground(new java.awt.Color(46, 57, 81));
        BTNRaizredonda.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTNRaizredonda.setForeground(new java.awt.Color(255, 255, 255));
        BTNRaizredonda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIAL.png"))); // NOI18N
        BTNRaizredonda.setText("√ ");
        BTNRaizredonda.setBorderPainted(false);
        BTNRaizredonda.setContentAreaFilled(false);
        BTNRaizredonda.setFocusPainted(false);
        BTNRaizredonda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNRaizredonda.setPreferredSize(new java.awt.Dimension(70, 70));
        BTNRaizredonda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTNRaizredonda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTNRaizredonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRaizredondaActionPerformed(evt);
            }
        });
        jPanel2.add(BTNRaizredonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        BTNPOTENCIA.setBackground(new java.awt.Color(46, 57, 81));
        BTNPOTENCIA.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        BTNPOTENCIA.setForeground(new java.awt.Color(255, 255, 255));
        BTNPOTENCIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIAL.png"))); // NOI18N
        BTNPOTENCIA.setText("^");
        BTNPOTENCIA.setBorderPainted(false);
        BTNPOTENCIA.setContentAreaFilled(false);
        BTNPOTENCIA.setFocusPainted(false);
        BTNPOTENCIA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNPOTENCIA.setPreferredSize(new java.awt.Dimension(70, 70));
        BTNPOTENCIA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTNPOTENCIA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTNPOTENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPOTENCIAActionPerformed(evt);
            }
        });
        jPanel2.add(BTNPOTENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        BTN_Multiplicacao.setBackground(new java.awt.Color(46, 57, 81));
        BTN_Multiplicacao.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN_Multiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Multiplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIAL.png"))); // NOI18N
        BTN_Multiplicacao.setText("×");
        BTN_Multiplicacao.setBorderPainted(false);
        BTN_Multiplicacao.setContentAreaFilled(false);
        BTN_Multiplicacao.setFocusPainted(false);
        BTN_Multiplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Multiplicacao.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN_Multiplicacao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_Multiplicacao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_Multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MultiplicacaoActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Multiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        BTN_Divisao.setBackground(new java.awt.Color(46, 57, 81));
        BTN_Divisao.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN_Divisao.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Divisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIAL.png"))); // NOI18N
        BTN_Divisao.setText("÷");
        BTN_Divisao.setBorderPainted(false);
        BTN_Divisao.setContentAreaFilled(false);
        BTN_Divisao.setFocusPainted(false);
        BTN_Divisao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Divisao.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN_Divisao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_Divisao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_Divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DivisaoActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Divisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        BTN_Adicao.setBackground(new java.awt.Color(46, 57, 81));
        BTN_Adicao.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN_Adicao.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Adicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIAL.png"))); // NOI18N
        BTN_Adicao.setText("+");
        BTN_Adicao.setBorderPainted(false);
        BTN_Adicao.setContentAreaFilled(false);
        BTN_Adicao.setFocusPainted(false);
        BTN_Adicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Adicao.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN_Adicao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_Adicao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_Adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AdicaoActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Adicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        BTN7.setBackground(new java.awt.Color(46, 57, 81));
        BTN7.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN7.setForeground(new java.awt.Color(255, 255, 255));
        BTN7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN7.setText("7");
        BTN7.setBorderPainted(false);
        BTN7.setContentAreaFilled(false);
        BTN7.setFocusPainted(false);
        BTN7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN7.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        BTN8.setBackground(new java.awt.Color(46, 57, 81));
        BTN8.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN8.setForeground(new java.awt.Color(255, 255, 255));
        BTN8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN8.setText("8");
        BTN8.setBorderPainted(false);
        BTN8.setContentAreaFilled(false);
        BTN8.setFocusPainted(false);
        BTN8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN8.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        BTN9.setBackground(new java.awt.Color(46, 57, 81));
        BTN9.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN9.setForeground(new java.awt.Color(255, 255, 255));
        BTN9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN9.setText("9");
        BTN9.setBorderPainted(false);
        BTN9.setContentAreaFilled(false);
        BTN9.setFocusPainted(false);
        BTN9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN9.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        BTN4.setBackground(new java.awt.Color(46, 57, 81));
        BTN4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN4.setForeground(new java.awt.Color(255, 255, 255));
        BTN4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN4.setText("4");
        BTN4.setBorderPainted(false);
        BTN4.setContentAreaFilled(false);
        BTN4.setFocusPainted(false);
        BTN4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN4.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        BTN5.setBackground(new java.awt.Color(46, 57, 81));
        BTN5.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN5.setForeground(new java.awt.Color(255, 255, 255));
        BTN5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN5.setText("5");
        BTN5.setBorderPainted(false);
        BTN5.setContentAreaFilled(false);
        BTN5.setFocusPainted(false);
        BTN5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN5.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        BTN6.setBackground(new java.awt.Color(46, 57, 81));
        BTN6.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN6.setForeground(new java.awt.Color(255, 255, 255));
        BTN6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN6.setText("6");
        BTN6.setBorderPainted(false);
        BTN6.setContentAreaFilled(false);
        BTN6.setFocusPainted(false);
        BTN6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN6.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        BTN1.setBackground(new java.awt.Color(46, 57, 81));
        BTN1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN1.setForeground(new java.awt.Color(255, 255, 255));
        BTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN1.setText("1");
        BTN1.setBorderPainted(false);
        BTN1.setContentAreaFilled(false);
        BTN1.setFocusPainted(false);
        BTN1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN1.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        BTN2.setBackground(new java.awt.Color(46, 57, 81));
        BTN2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN2.setForeground(new java.awt.Color(255, 255, 255));
        BTN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN2.setText("2");
        BTN2.setBorderPainted(false);
        BTN2.setContentAreaFilled(false);
        BTN2.setFocusPainted(false);
        BTN2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN2.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        BTNIgual.setBackground(new java.awt.Color(46, 57, 81));
        BTNIgual.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTNIgual.setForeground(new java.awt.Color(255, 255, 255));
        BTNIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIAL.png"))); // NOI18N
        BTNIgual.setText("=");
        BTNIgual.setBorderPainted(false);
        BTNIgual.setContentAreaFilled(false);
        BTNIgual.setFocusPainted(false);
        BTNIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNIgual.setPreferredSize(new java.awt.Dimension(70, 70));
        BTNIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTNIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTNIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIgualActionPerformed(evt);
            }
        });
        jPanel2.add(BTNIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        BTN0.setBackground(new java.awt.Color(46, 57, 81));
        BTN0.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN0.setForeground(new java.awt.Color(255, 255, 255));
        BTN0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN0.setText("0");
        BTN0.setBorderPainted(false);
        BTN0.setContentAreaFilled(false);
        BTN0.setFocusPainted(false);
        BTN0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN0.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN0ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        BTNPONTO.setBackground(new java.awt.Color(46, 57, 81));
        BTNPONTO.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTNPONTO.setForeground(new java.awt.Color(255, 255, 255));
        BTNPONTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTNPONTO.setText(".");
        BTNPONTO.setBorderPainted(false);
        BTNPONTO.setContentAreaFilled(false);
        BTNPONTO.setFocusPainted(false);
        BTNPONTO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNPONTO.setPreferredSize(new java.awt.Dimension(70, 70));
        BTNPONTO.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTNPONTO.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTNPONTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPONTOActionPerformed(evt);
            }
        });
        jPanel2.add(BTNPONTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        BTNbaisobedos.setBackground(new java.awt.Color(46, 57, 81));
        BTNbaisobedos.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        BTNbaisobedos.setForeground(new java.awt.Color(255, 255, 255));
        BTNbaisobedos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIAL.png"))); // NOI18N
        BTNbaisobedos.setText("+/-");
        BTNbaisobedos.setBorderPainted(false);
        BTNbaisobedos.setContentAreaFilled(false);
        BTNbaisobedos.setFocusPainted(false);
        BTNbaisobedos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNbaisobedos.setPreferredSize(new java.awt.Dimension(70, 70));
        BTNbaisobedos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTNbaisobedos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTNbaisobedos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbaisobedosActionPerformed(evt);
            }
        });
        jPanel2.add(BTNbaisobedos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 70, 70));

        BTNPONTO1.setBackground(new java.awt.Color(46, 57, 81));
        BTNPONTO1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTNPONTO1.setForeground(new java.awt.Color(255, 255, 255));
        BTNPONTO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTNPONTO1.setText(".");
        BTNPONTO1.setBorderPainted(false);
        BTNPONTO1.setContentAreaFilled(false);
        BTNPONTO1.setFocusPainted(false);
        BTNPONTO1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNPONTO1.setPreferredSize(new java.awt.Dimension(70, 70));
        BTNPONTO1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTNPONTO1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTNPONTO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPONTO1ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNPONTO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        BTN_Menos1.setBackground(new java.awt.Color(46, 57, 81));
        BTN_Menos1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN_Menos1.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Menos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIAL.png"))); // NOI18N
        BTN_Menos1.setText("-");
        BTN_Menos1.setBorderPainted(false);
        BTN_Menos1.setContentAreaFilled(false);
        BTN_Menos1.setFocusPainted(false);
        BTN_Menos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Menos1.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN_Menos1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_Menos1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAOESPECIALPRESS.png"))); // NOI18N
        BTN_Menos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Menos1ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Menos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        BTN10.setBackground(new java.awt.Color(46, 57, 81));
        BTN10.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BTN10.setForeground(new java.awt.Color(255, 255, 255));
        BTN10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO.png"))); // NOI18N
        BTN10.setText("3");
        BTN10.setBorderPainted(false);
        BTN10.setContentAreaFilled(false);
        BTN10.setFocusPainted(false);
        BTN10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN10.setPreferredSize(new java.awt.Dimension(70, 70));
        BTN10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/BOTAO-NUMERICO-PRESS.png"))); // NOI18N
        BTN10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN10ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 330, 450));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void BTN_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CActionPerformed
      
        txt.setText("");
        
    }//GEN-LAST:event_BTN_CActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        
        txt.setText(txt.getText()+"7");
        
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        
        txt.setText(txt.getText()+"8");
        
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
        
       txt.setText(txt.getText()+"9"); 
        
    }//GEN-LAST:event_BTN9ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        
       txt.setText(txt.getText()+"4");
        
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        
      txt.setText(txt.getText()+"5");
        
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        
        txt.setText(txt.getText()+"6");
        
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        
      txt.setText(txt.getText()+"1"); 
        
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        
       txt.setText(txt.getText()+"2");
        
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTNIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIgualActionPerformed
        
      String resultadototal;
      resultado = txt.getText();
      if(!resultado.equals("")){
          
          resultadototal = operacoes(calculo, resultado, simbolo);  
          
          txt.setText(resultadototal);
          
      }
        
    }//GEN-LAST:event_BTNIgualActionPerformed

    private void BTN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN0ActionPerformed
        
        txt.setText(txt.getText()+"0");
        
    }//GEN-LAST:event_BTN0ActionPerformed

    private void BTNPONTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPONTOActionPerformed
        
        coteudo = txt.getText();
        
        if(coteudo.length()<=0){
            
            txt.setText("0.");
            
        }else{
            
            if(txt.getText().contains(".")){
                                           
            }else{
                
                txt.setText(txt.getText()+".");
                ponto = false;
                
            }
            
        }
                    
    }//GEN-LAST:event_BTNPONTOActionPerformed

    private void BTNRaizredondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRaizredondaActionPerformed
        
           coteudo = txt.getText();
           
           if(coteudo.length()>0){
               
                resuldado = Math.sqrt(Double.parseDouble(coteudo));
                txt.setText(resuldado.toString());
                
           }
        
    }//GEN-LAST:event_BTNRaizredondaActionPerformed

    private void BTNPOTENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPOTENCIAActionPerformed
    
        if(!txt.getText().equals("")){
            
            calculo = txt.getText();
            simbolo = "x^y";
            txt.setText("" );
        
        }     
            
    }//GEN-LAST:event_BTNPOTENCIAActionPerformed

    private void BTN_MultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MultiplicacaoActionPerformed
        
        if(!txt.getText().equals("")){
            
            calculo = txt.getText();
            simbolo = "*";
            txt.setText("" );
       
        }
        
    }//GEN-LAST:event_BTN_MultiplicacaoActionPerformed

    private void BTN_DivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DivisaoActionPerformed
        
        if(!txt.getText().equals("")){
            
            calculo = txt.getText();
            simbolo = "/";
            txt.setText("" );
      
        }
            
    }//GEN-LAST:event_BTN_DivisaoActionPerformed

    private void BTN_AdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AdicaoActionPerformed
        
        if(!txt.getText().equals("")){
            
            calculo = txt.getText();
            simbolo = "+";
            txt.setText("" );
           
        }
        
    }//GEN-LAST:event_BTN_AdicaoActionPerformed

    private void BTNPONTO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPONTO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNPONTO1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
        this.dispose();
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        this.setState(Frame.ICONIFIED);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

        public static String operacoes(String calculo,String resultado, String simbolo){
            
            Double resultadocalc = 0.0;
            String resposta;
            
            if(simbolo.equals("+")){
                
                resultadocalc = Double.parseDouble(calculo) + Double.parseDouble(resultado);
                
            }else if(simbolo.equals("-")){
                
                resultadocalc = Double.parseDouble(calculo) - Double.parseDouble(resultado);
                
            }else if(simbolo.equals("*")){
                
                resultadocalc = Double.parseDouble(calculo) * Double.parseDouble(resultado);
                
            }else if(simbolo.equals("/")){
                
                resultadocalc = Double.parseDouble(calculo) / Double.parseDouble(resultado);
                
            }else if(simbolo.equals("x^y")){
                
                 resultadocalc = Math.pow(Double.parseDouble(calculo), Double.parseDouble(resultado));
                
            }
            
            resposta = resultadocalc.toString();
            return resposta;
            
        }
        
    private void BTNbaisobedosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbaisobedosActionPerformed

        coteudo = txt.getText();
        
        if(coteudo.length()>0){
            
            resuldado = (-1) *Double.parseDouble(coteudo);
            
            txt.setText(resuldado.toString());
            
        }

    }//GEN-LAST:event_BTNbaisobedosActionPerformed

    private void BTN_Menos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Menos1ActionPerformed
     
        if(!txt.getText().equals("")){
            
            calculo = txt.getText();
            simbolo = "-";
            txt.setText("" );
        
        }
            
    }//GEN-LAST:event_BTN_Menos1ActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void BTN10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN10ActionPerformed
        
        txt.setText(txt.getText()+"3");
        
    }//GEN-LAST:event_BTN10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    
   
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN0;
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN10;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTN9;
    private javax.swing.JButton BTNIgual;
    private javax.swing.JButton BTNPONTO;
    private javax.swing.JButton BTNPONTO1;
    private javax.swing.JButton BTNPOTENCIA;
    private javax.swing.JButton BTNRaizredonda;
    private javax.swing.JButton BTN_Adicao;
    private javax.swing.JButton BTN_C;
    private javax.swing.JButton BTN_Divisao;
    private javax.swing.JButton BTN_Menos1;
    private javax.swing.JButton BTN_Multiplicacao;
    private javax.swing.JButton BTNbaisobedos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }
}
