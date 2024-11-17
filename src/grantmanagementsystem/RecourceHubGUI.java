/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grantmanagementsystem;

/**
 *
 * @author gregm
 */
public class RecourceHubGUI extends javax.swing.JFrame {

    /**
     * Creates new form RecourceHubGUI
     */
    public RecourceHubGUI() {
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

        HomePagePanel = new javax.swing.JPanel();
        ReportGeneratorLogoLabel = new javax.swing.JLabel();
        ReportGeneratorLabel = new javax.swing.JLabel();
        RecourceHubLogoLabel = new javax.swing.JLabel();
        RecourceHubLabel = new javax.swing.JLabel();
        Parent = new javax.swing.JPanel();
        ReportGenerator = new javax.swing.JPanel();
        RecourceHub = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomePagePanel.setBackground(new java.awt.Color(51, 204, 255));
        HomePagePanel.setLayout(null);

        ReportGeneratorLogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReportGeneratorLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6771589_book_education_idea_learning_school_icon.png"))); // NOI18N
        HomePagePanel.add(ReportGeneratorLogoLabel);
        ReportGeneratorLogoLabel.setBounds(10, 120, 100, 70);

        ReportGeneratorLabel.setFont(new java.awt.Font("Bauhaus 93", 1, 12)); // NOI18N
        ReportGeneratorLabel.setForeground(new java.awt.Color(255, 255, 255));
        ReportGeneratorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReportGeneratorLabel.setText("Report Generator");
        HomePagePanel.add(ReportGeneratorLabel);
        ReportGeneratorLabel.setBounds(10, 190, 100, 24);

        RecourceHubLogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RecourceHubLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7007507_analytics_chart_graph_pie_business_icon.png"))); // NOI18N
        HomePagePanel.add(RecourceHubLogoLabel);
        RecourceHubLogoLabel.setBounds(20, 290, 80, 70);

        RecourceHubLabel.setFont(new java.awt.Font("Bauhaus 93", 1, 12)); // NOI18N
        RecourceHubLabel.setForeground(new java.awt.Color(255, 255, 255));
        RecourceHubLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RecourceHubLabel.setText("Recource hub");
        HomePagePanel.add(RecourceHubLabel);
        RecourceHubLabel.setBounds(10, 370, 100, 18);

        Parent.setBackground(new java.awt.Color(255, 255, 255));
        Parent.setLayout(new java.awt.CardLayout());

        ReportGenerator.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout ReportGeneratorLayout = new javax.swing.GroupLayout(ReportGenerator);
        ReportGenerator.setLayout(ReportGeneratorLayout);
        ReportGeneratorLayout.setHorizontalGroup(
            ReportGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        ReportGeneratorLayout.setVerticalGroup(
            ReportGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        Parent.add(ReportGenerator, "card2");

        RecourceHub.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout RecourceHubLayout = new javax.swing.GroupLayout(RecourceHub);
        RecourceHub.setLayout(RecourceHubLayout);
        RecourceHubLayout.setHorizontalGroup(
            RecourceHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        RecourceHubLayout.setVerticalGroup(
            RecourceHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        Parent.add(RecourceHub, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomePagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RecourceHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecourceHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecourceHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecourceHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecourceHubGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePagePanel;
    private javax.swing.JPanel Parent;
    private javax.swing.JPanel RecourceHub;
    private javax.swing.JLabel RecourceHubLabel;
    private javax.swing.JLabel RecourceHubLogoLabel;
    private javax.swing.JPanel ReportGenerator;
    private javax.swing.JLabel ReportGeneratorLabel;
    private javax.swing.JLabel ReportGeneratorLogoLabel;
    // End of variables declaration//GEN-END:variables
}