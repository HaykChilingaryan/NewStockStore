import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Thu May 06 14:28:21 AMT 2021
 */



/**
 * @author Zhanna Sargsyan
 */
public class SellProductStoreExceptionGUI extends JFrame {
    public SellProductStoreExceptionGUI() {
        initComponents();
        pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SellProductStoreExceptionGUI soldProduct = new SellProductStoreExceptionGUI();
        soldProduct.pack();
        soldProduct.setVisible(true);
    }

    private void okButtonActionPerformed(ActionEvent e) {
        RequestProductGUI store = new RequestProductGUI();
        store.pack();
        store.setVisible(true);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hayk
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        okButton = new JButton();
        label3 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(new Color(255, 255, 153));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
            javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax
            . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
            . awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
            . Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .
            PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .
            equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setBackground(new Color(255, 255, 153));

                //---- label1 ----
                label1.setText("No such product in store");
                label1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
                label1.setForeground(new Color(210, 43, 31));

                //---- label2 ----
                label2.setText("Please, request the product ");
                label2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
                label2.setForeground(new Color(210, 43, 31));

                //---- okButton ----
                okButton.setText("Request");
                okButton.setBackground(new Color(87, 178, 74));
                okButton.addActionListener(e -> okButtonActionPerformed(e));

                //---- label3 ----
                label3.setIcon(new ImageIcon(getClass().getResource("/icons/error-bug-stop-icon-33-B1.png")));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addContainerGap(76, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addGap(80, 80, 80))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
                                    .addGap(45, 45, 45))))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addGap(0, 163, Short.MAX_VALUE)
                            .addComponent(label3)
                            .addGap(161, 161, 161))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(label3)
                            .addGap(18, 18, 18)
                            .addComponent(label1)
                            .addGap(30, 30, 30)
                            .addComponent(label2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                            .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hayk
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JLabel label2;
    private JButton okButton;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
