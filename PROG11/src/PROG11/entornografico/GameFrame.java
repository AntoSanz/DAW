/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.Texts to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PROG11.entornografico;

import static PROG11.conexiones.oracle.OracleConnextion.deletePlayer;
import static PROG11.funcionalidad.FuncionalidadGameFrame.*;
import PROG11.funcionalidad.modelos.Token;
import javax.swing.JOptionPane;

/**
 *
 * @author ANTONIO SANZ PANS
 */
public class GameFrame extends javax.swing.JFrame {

    /**
     * Creates new form GameFrame
     */
    public GameFrame() {
        initComponents();
        updateValuesWhitToken();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gameBackBtn = new javax.swing.JButton();
        gameShowPowers = new javax.swing.JButton();
        gamePowersLabel = new javax.swing.JPanel();
        gameAddPowerPanel = new javax.swing.JPanel();
        gameAddPowerBtn = new javax.swing.JButton();
        gameAddPowerLabel = new javax.swing.JLabel();
        gameAddPowerCountLabel = new javax.swing.JLabel();
        gameAddClicksCdPanel = new javax.swing.JPanel();
        gameAddClicksCdBtn = new javax.swing.JButton();
        gameAddClicksCdLabel = new javax.swing.JLabel();
        gameAddClicksCdCountLabel = new javax.swing.JLabel();
        gameAddMulticlickPanel = new javax.swing.JPanel();
        gameAddMulticlickBtn = new javax.swing.JButton();
        gameAddMulticlickLabel = new javax.swing.JLabel();
        gameAddMulticlickCountLabel = new javax.swing.JLabel();
        gameMonsterBtn = new javax.swing.JButton();
        gameCoinIconLabel = new javax.swing.JLabel();
        gameCoinNumberLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        gameSaveProgress = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gameDeleteAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(850, 600));
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(850, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        gameBackBtn.setText("Volver");
        gameBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameBackBtnActionPerformed(evt);
            }
        });

        gameShowPowers.setText("Mostrar mejoras");
        gameShowPowers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameShowPowersActionPerformed(evt);
            }
        });

        gamePowersLabel.setBackground(new java.awt.Color(255, 204, 204));
        gamePowersLabel.setOpaque(false);

        gameAddPowerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROG11/utils/icons/arrow-up-20.png"))); // NOI18N
        gameAddPowerBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        gameAddPowerBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        gameAddPowerBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        gameAddPowerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameAddPowerBtnActionPerformed(evt);
            }
        });

        gameAddPowerLabel.setText("Monedas ganadas");

        gameAddPowerCountLabel.setText("0");

        javax.swing.GroupLayout gameAddPowerPanelLayout = new javax.swing.GroupLayout(gameAddPowerPanel);
        gameAddPowerPanel.setLayout(gameAddPowerPanelLayout);
        gameAddPowerPanelLayout.setHorizontalGroup(
            gameAddPowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameAddPowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameAddPowerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameAddPowerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gameAddPowerCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gameAddPowerPanelLayout.setVerticalGroup(
            gameAddPowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameAddPowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameAddPowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameAddPowerCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameAddPowerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameAddPowerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gameAddClicksCdBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROG11/utils/icons/arrow-up-20.png"))); // NOI18N
        gameAddClicksCdBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        gameAddClicksCdBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        gameAddClicksCdBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        gameAddClicksCdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameAddClicksCdBtnActionPerformed(evt);
            }
        });

        gameAddClicksCdLabel.setText("Tiempo entre clicks");

        gameAddClicksCdCountLabel.setText("0");

        javax.swing.GroupLayout gameAddClicksCdPanelLayout = new javax.swing.GroupLayout(gameAddClicksCdPanel);
        gameAddClicksCdPanel.setLayout(gameAddClicksCdPanelLayout);
        gameAddClicksCdPanelLayout.setHorizontalGroup(
            gameAddClicksCdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameAddClicksCdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameAddClicksCdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameAddClicksCdLabel)
                .addGap(18, 18, 18)
                .addComponent(gameAddClicksCdCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gameAddClicksCdPanelLayout.setVerticalGroup(
            gameAddClicksCdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameAddClicksCdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameAddClicksCdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameAddClicksCdCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameAddClicksCdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameAddClicksCdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gameAddMulticlickBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROG11/utils/icons/arrow-up-20.png"))); // NOI18N
        gameAddMulticlickBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        gameAddMulticlickBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        gameAddMulticlickBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        gameAddMulticlickBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameAddMulticlickBtnActionPerformed(evt);
            }
        });

        gameAddMulticlickLabel.setText("Click simultaneo");

        gameAddMulticlickCountLabel.setText("0");
        gameAddMulticlickCountLabel.setMaximumSize(new java.awt.Dimension(35, 16));
        gameAddMulticlickCountLabel.setMinimumSize(new java.awt.Dimension(35, 16));
        gameAddMulticlickCountLabel.setPreferredSize(new java.awt.Dimension(35, 16));

        javax.swing.GroupLayout gameAddMulticlickPanelLayout = new javax.swing.GroupLayout(gameAddMulticlickPanel);
        gameAddMulticlickPanel.setLayout(gameAddMulticlickPanelLayout);
        gameAddMulticlickPanelLayout.setHorizontalGroup(
            gameAddMulticlickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameAddMulticlickPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameAddMulticlickBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameAddMulticlickLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gameAddMulticlickCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gameAddMulticlickPanelLayout.setVerticalGroup(
            gameAddMulticlickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameAddMulticlickPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameAddMulticlickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameAddMulticlickCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameAddMulticlickLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameAddMulticlickBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout gamePowersLabelLayout = new javax.swing.GroupLayout(gamePowersLabel);
        gamePowersLabel.setLayout(gamePowersLabelLayout);
        gamePowersLabelLayout.setHorizontalGroup(
            gamePowersLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePowersLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePowersLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameAddPowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameAddClicksCdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameAddMulticlickPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        gamePowersLabelLayout.setVerticalGroup(
            gamePowersLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePowersLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameAddPowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameAddClicksCdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameAddMulticlickPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        gameMonsterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROG11/utils/img/pinkslime/frame-1.png"))); // NOI18N
        gameMonsterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameMonsterBtnActionPerformed(evt);
            }
        });

        gameCoinIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROG11/utils/img/coin/Coin1.png"))); // NOI18N

        gameCoinNumberLabel.setFont(new java.awt.Font("Consolas", 0, 21)); // NOI18N
        gameCoinNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gameCoinNumberLabel.setText("0");

        versionLabel.setText("v" + PROG11.funcionalidad.modelos.Texts.VERSION);

        gameSaveProgress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gameSaveProgress.setForeground(new java.awt.Color(0, 204, 51));
        gameSaveProgress.setText("GUARDAR PROGRESO");
        gameSaveProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameSaveProgressActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Haz click en el monstruo!");

        gameDeleteAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gameDeleteAccount.setForeground(new java.awt.Color(255, 51, 51));
        gameDeleteAccount.setText("BORRAR CUENTA");
        gameDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameDeleteAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gameMonsterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gameBackBtn)
                        .addGap(88, 88, 88)
                        .addComponent(gameCoinIconLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gameCoinNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(168, 168, 168)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gameShowPowers)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(gamePowersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(versionLabel))
                    .addComponent(gameSaveProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameDeleteAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gameBackBtn)
                        .addComponent(gameCoinIconLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gameCoinNumberLabel)
                        .addComponent(gameShowPowers)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gameMonsterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gamePowersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gameSaveProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gameDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(versionLabel)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameBackBtnActionPerformed
        int resNewPlayer = JOptionPane.showConfirmDialog(this,
                "AVISO: ¡Recuerde guardar su progreso! "
                + "\n En la próxima sesión el contador de monedas comenzará de cero, pero las mejoras que haya obtenido y guardado, serán cargadas.",
                "Confirmar acción: Volver a la pantalla de inicio",
                JOptionPane.YES_NO_OPTION);

        if (resNewPlayer == JOptionPane.YES_OPTION) {
            setVisible(false);
            openMainFrame();
        }
    }//GEN-LAST:event_gameBackBtnActionPerformed

    private void gameMonsterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameMonsterBtnActionPerformed
        clickInMonster();
        addCoins();
    }//GEN-LAST:event_gameMonsterBtnActionPerformed

    private void gameAddPowerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameAddPowerBtnActionPerformed
        levelUpPower();
    }//GEN-LAST:event_gameAddPowerBtnActionPerformed

    private void gameAddClicksCdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameAddClicksCdBtnActionPerformed
        levelUpClickCooldown();
    }//GEN-LAST:event_gameAddClicksCdBtnActionPerformed

    private void gameAddMulticlickBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameAddMulticlickBtnActionPerformed
        levelUpMulticlick();
    }//GEN-LAST:event_gameAddMulticlickBtnActionPerformed

    private void gameShowPowersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameShowPowersActionPerformed
        tooglePowersups();
    }//GEN-LAST:event_gameShowPowersActionPerformed

    private void gameSaveProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameSaveProgressActionPerformed
        saveProgress();
    }//GEN-LAST:event_gameSaveProgressActionPerformed

    private void gameDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameDeleteAccountActionPerformed
        int resNewPlayer = JOptionPane.showConfirmDialog(this,
                "¿Seguro que desea borrar esta cuenta?",
                "Confirmar acción: Borrado de cuenta",
                JOptionPane.YES_NO_OPTION);

        if (resNewPlayer == JOptionPane.YES_OPTION) {

            deletePlayer(Token.currentPlayer);
            setVisible(false);
            openMainFrame();
        }
    }//GEN-LAST:event_gameDeleteAccountActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gameAddClicksCdBtn;
    public static javax.swing.JLabel gameAddClicksCdCountLabel;
    private javax.swing.JLabel gameAddClicksCdLabel;
    private javax.swing.JPanel gameAddClicksCdPanel;
    private javax.swing.JButton gameAddMulticlickBtn;
    public static javax.swing.JLabel gameAddMulticlickCountLabel;
    private javax.swing.JLabel gameAddMulticlickLabel;
    private javax.swing.JPanel gameAddMulticlickPanel;
    private javax.swing.JButton gameAddPowerBtn;
    public static javax.swing.JLabel gameAddPowerCountLabel;
    private javax.swing.JLabel gameAddPowerLabel;
    private javax.swing.JPanel gameAddPowerPanel;
    private javax.swing.JButton gameBackBtn;
    private javax.swing.JLabel gameCoinIconLabel;
    public static javax.swing.JLabel gameCoinNumberLabel;
    private javax.swing.JButton gameDeleteAccount;
    public static javax.swing.JButton gameMonsterBtn;
    public static javax.swing.JPanel gamePowersLabel;
    private javax.swing.JButton gameSaveProgress;
    private javax.swing.JButton gameShowPowers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables
}
