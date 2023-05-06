package PROG11.entornografico;

import static PROG11.conexiones.oracle.OracleConnection.*;
import static PROG11.funcionalidad.Funcionalidad.parseRStoObject;
import static PROG11.funcionalidad.Funcionalidad.setCurrentPlayerInToken;
import static PROG11.funcionalidad.FuncionalidadEntornoGrafico.*;
import PROG11.funcionalidad.modelos.Player;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ANTONIO SANZ PANS
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form EntornoGrafico
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainTitleLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mainAuthorVersion = new javax.swing.JPanel();
        mainVersionLabel = new javax.swing.JLabel();
        mainAuthorLabel = new javax.swing.JLabel();
        mainBtnPanel = new javax.swing.JPanel();
        mainStartBtn = new javax.swing.JButton();
        MainExitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setMaximumSize(new java.awt.Dimension(800, 475));
        setMinimumSize(new java.awt.Dimension(800, 475));
        setResizable(false);

        mainPanel.setMaximumSize(new java.awt.Dimension(500, 280));
        mainPanel.setMinimumSize(new java.awt.Dimension(500, 280));
        mainPanel.setPreferredSize(new java.awt.Dimension(500, 280));
        mainPanel.setLayout(null);

        mainTitleLabel.setFont(new java.awt.Font("Consolas", 0, 55)); // NOI18N
        mainTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitleLabel.setText("MONSTER CLICKER");
        mainPanel.add(mainTitleLabel);
        mainTitleLabel.setBounds(10, 90, 470, 65);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setMaximumSize(new java.awt.Dimension(850, 475));
        jPanel3.setMinimumSize(new java.awt.Dimension(850, 475));
        jPanel3.setPreferredSize(new java.awt.Dimension(850, 475));
        jPanel3.setLayout(null);

        mainAuthorVersion.setOpaque(false);
        mainAuthorVersion.setLayout(null);

        mainVersionLabel.setText("v1.0.0");
        mainAuthorVersion.add(mainVersionLabel);
        mainVersionLabel.setBounds(0, 26, 150, 20);

        mainAuthorLabel.setText("Antonio Sanz Pans");
        mainAuthorVersion.add(mainAuthorLabel);
        mainAuthorLabel.setBounds(0, 0, 173, 22);

        jPanel3.add(mainAuthorVersion);
        mainAuthorVersion.setBounds(10, 10, 110, 60);

        mainBtnPanel.setOpaque(false);
        mainBtnPanel.setLayout(null);

        mainStartBtn.setText("JUGAR");
        mainStartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainStartBtnActionPerformed(evt);
            }
        });
        mainBtnPanel.add(mainStartBtn);
        mainStartBtn.setBounds(6, 0, 200, 50);

        MainExitBtn.setText("SALIR");
        MainExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainExitBtnActionPerformed(evt);
            }
        });
        mainBtnPanel.add(MainExitBtn);
        MainExitBtn.setBounds(6, 60, 200, 50);

        jPanel3.add(mainBtnPanel);
        mainBtnPanel.setBounds(140, 150, 210, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROG11/resources/backgroud/monster_bg.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(850, 475));
        jLabel1.setMinimumSize(new java.awt.Dimension(850, 475));
        jLabel1.setPreferredSize(new java.awt.Dimension(850, 475));
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 804, 475);

        mainPanel.add(jPanel3);
        jPanel3.setBounds(0, 0, 800, 475);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainExitBtnActionPerformed
        closeApp();
    }//GEN-LAST:event_MainExitBtnActionPerformed

    private void mainStartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainStartBtnActionPerformed
        // Busco en la BBDD si hay un player con el nombre proporcionado
        try {
            String res = JOptionPane.showInputDialog(this, "Introduce tu nombre (Diferencia entre mayúsculas y minúsculas)");
            ResultSet rs = checkForPlayer(res);
            Player p = parseRStoObject(rs);

            if (p.getName() == null) {
                //Si no coincide el nombre, crea un nuevo player con ese nombre
                int resNewPlayer = JOptionPane.showConfirmDialog(this,
                        "No se ha encontrado un jugador con ese nombre. ¿Desea crear uno nuevo?",
                        "Crear nuevo jugador",
                        JOptionPane.YES_NO_OPTION);

                if (resNewPlayer == JOptionPane.YES_OPTION) {
                    Player player = new Player(res);
                    createPlayer(player);
                    setCurrentPlayerInToken(player);
                    _openGameFrame();
                }
            } else {
                //Si hay un player con ese nombre, recupera el player
                setCurrentPlayerInToken(p);
                _openGameFrame();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mainStartBtnActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainExitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mainAuthorLabel;
    private javax.swing.JPanel mainAuthorVersion;
    private javax.swing.JPanel mainBtnPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton mainStartBtn;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JLabel mainVersionLabel;
    // End of variables declaration//GEN-END:variables

    //Navegación entre frames
    
    /**
     * Abrir GameFrame
     */
    private void _openGameFrame() {
        setVisible(false);
        openGameFrame();
    }
}
