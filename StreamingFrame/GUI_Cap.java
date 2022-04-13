package com.ClewlowStudios.StreamingFrame;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import static java.awt.GraphicsDevice.WindowTranslucency.TRANSLUCENT;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.lang.reflect.Field;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HopefulSplash
 */
public class GUI_Cap extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUI_Cap() {

        initComponents();

    }

    @SuppressWarnings("unchecked")

    private static void undecorate(Frame frame) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field undecoratedField = Frame.class.getDeclaredField("undecorated");
        undecoratedField.setAccessible(true);
        undecoratedField.set(frame, true);
    }

    boolean dec = false;

    private GUI_Cap(boolean b) {
        if (b == false) {
            dec = false;
        } else {
            dec = true;
        }
        initComponents();

    }

    int widthX;
    int heightX;

    private GUI_Cap(boolean b, int height, int width) {

        widthX = width;
        heightX = height;

        if (b == false) {
            dec = false;
        } else {
            dec = true;
        }
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        this.setMinimumSize(new Dimension(300, 220));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Streaming Frame");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HopefulSplash\\Desktop\\Abie Online Class\\Java APPs\\Streaming Frame\\StreamingFrame\\src\\main\\java\\com\\ClewlowStudios\\StreamingFrame\\video-camera-icon.png"));
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(2, 2, 2));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>Cover<br>The Area<br>For Capture</center></html>");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jLabel1.setOpaque(true);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 51));
        jButton2.setText("Stealth Mode");
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);

        jButton2.setRolloverEnabled(false);
        jButton2.setFocusTraversalKeysEnabled(false);
        jButton2.setFocusTraversalPolicyProvider(false);
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }

        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 51));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setRolloverEnabled(false);
        jButton3.setFocusTraversalKeysEnabled(false);
        jButton3.setFocusTraversalPolicyProvider(false);
        jButton3.setText("Adjustment Mode");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }

            private void jButton3ActionPerformed(ActionEvent evt) {

                if (dec == false) {
                    try {

                        JFrame j2 = new GUI_Cap(true, jLabel1.getHeight(), jLabel1.getWidth());
                        j2.setSize(j1.getWidth(), j1.getHeight());
                        j2.setLocationRelativeTo(j1);
                        j2.setVisible(true);
                        j1.setVisible(false);
                        j1.dispose();
                        j1 = j2;

                    } catch (SecurityException | IllegalArgumentException ex) {
                    }
                } else {
                    try {

                        JFrame j2 = new GUI_Cap(false, jLabel1.getHeight(), jLabel1.getWidth());
                        j2.setSize(j1.getWidth(), j1.getHeight());
                        j2.setLocationRelativeTo(j1);
                        j2.setVisible(true);
                        j1.setVisible(false);
                        j1.dispose();
                        j1 = j2;

                    } catch (SecurityException | IllegalArgumentException ex) {
                    }
                }
            }

        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, widthX, Short.MAX_VALUE))
                                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, heightX, Short.MAX_VALUE)
                                .addGap(5, 5, 5)
                                .addComponent(jButton2)
                                .addGap(5, 5, 5)
                                .addComponent(jButton3)
                                .addGap(5, 5, 5))
        );

        jLabel1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.4f));

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFrame j2 = new GUI_Start(j1, jLabel1);
        j1.setVisible(false);

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        if (dec == false) {
            try {
                // TODO add your handling code here:

                undecorate(j1);
                j1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
                j1.revalidate();
                j1.validate();
                j1.repaint();
                j1.pack();

            } catch (NoSuchFieldException ex) {
            } catch (SecurityException ex) {
            } catch (IllegalArgumentException ex) {
            } catch (IllegalAccessException ex) {
            }
        } else {
            j1.setBackground(new java.awt.Color(2, 2, 2));
            j1.getContentPane().setBackground(new java.awt.Color(2, 2, 2));
            j1.revalidate();
            j1.validate();
            j1.repaint();
            j1.pack();

        }

    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Cap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Cap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Cap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Cap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        GraphicsEnvironment ge
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();

        //If translucent windows aren't supported, exit.
        if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) {
            System.err.println(
                    "Translucency is not supported");
            System.exit(0);
        }

        j1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                j1.revalidate();
                j1.validate();
                j1.repaint();
                j1.pack();
                
            }
        });

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                startMenu();

            }
        });

    }

    static void startMenu() {

        j1.setLocationRelativeTo(null);
        j1.setVisible(true);
        j1.requestFocus();

    }
    private static javax.swing.JFrame j1 = new GUI_Cap();
    public javax.swing.JButton jButton3;

    public javax.swing.JButton jButton2;

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }
    private javax.swing.JLabel jLabel1;

}
