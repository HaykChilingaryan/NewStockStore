import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Thu May 06 14:57:10 AMT 2021
 */



/**
 * @author Zhanna Sargsyan
 */
public class SellProductQuantityExceptionGUI extends JFrame {
    public SellProductQuantityExceptionGUI() {
        initComponents();
        pack();
        getContentPane().setBackground(new Color(255,255,153));
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SellProductQuantityExceptionGUI quantity = new SellProductQuantityExceptionGUI();
        quantity.pack();
        quantity.setVisible(true);
    }


    private void RequestButtonActionPerformed(ActionEvent e) {
        this.dispose();
        RequestProductGUI store = new RequestProductGUI();
        store.pack();
        store.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hayk
        label1 = new JLabel();
        label2 = new JLabel();
        RequestButton = new JButton();
        label3 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Not enough product");
        label1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        label1.setForeground(new Color(210, 43, 31));

        //---- label2 ----
        label2.setText("Please, buy the product");
        label2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        label2.setForeground(new Color(210, 43, 31));

        //---- RequestButton ----
        RequestButton.setText("Buy");
        RequestButton.setBackground(new Color(87, 178, 74));
        RequestButton.addActionListener(e -> RequestButtonActionPerformed(e));

        //---- label3 ----
        label3.setIcon(new ImageIcon(getClass().getResource("/icons/error-bug-stop-icon-33-B1.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addComponent(label3)
                    .addContainerGap(177, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(105, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(label1)))
                            .addGap(27, 27, 27))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(RequestButton, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label1)
                    .addGap(28, 28, 28)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                    .addComponent(RequestButton)
                    .addGap(47, 47, 47))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hayk
    private JLabel label1;
    private JLabel label2;
    private JButton RequestButton;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
