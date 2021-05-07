import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Thu May 06 15:24:07 AMT 2021
 */



/**
 * @author Zhanna Sargsyan
 */
public class RequestProductQuantityExceptionGUI extends JFrame {
    public RequestProductQuantityExceptionGUI() {
        initComponents();
        getContentPane().setBackground(new Color(255,255,153));
        pack();
        this.setVisible(true);
    }
    public static void main(String[] args) {
        RequestProductQuantityExceptionGUI quantity = new RequestProductQuantityExceptionGUI();
        quantity.pack();
        quantity.setVisible(true);
    }

    private void BuyButtonActionPerformed(ActionEvent e) {
        AddProductGUI stock = new AddProductGUI();
        stock.pack();
        stock.setVisible(true);
        this.dispose();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
        label1 = new JLabel();
        label2 = new JLabel();
        BuyButton = new JButton();
        label3 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Not enough product");
        label1.setForeground(new Color(210, 43, 31));
        label1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));

        //---- label2 ----
        label2.setText("Please, buy the product");
        label2.setForeground(new Color(210, 43, 31));
        label2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));

        //---- BuyButton ----
        BuyButton.setText("Buy");
        BuyButton.setBackground(new Color(87, 178, 74));
        BuyButton.addActionListener(e -> BuyButtonActionPerformed(e));

        //---- label3 ----
        label3.setIcon(new ImageIcon(getClass().getResource("/icons/error-bug-stop-icon-33-B1.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(label1))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(label3)))
                    .addContainerGap(113, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(BuyButton, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label1)
                    .addGap(27, 27, 27)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                    .addComponent(BuyButton)
                    .addGap(48, 48, 48))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
    private JLabel label1;
    private JLabel label2;
    private JButton BuyButton;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
