import com.sun.tools.javac.Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
//import com.jgoodies.forms.factories.*;
//import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Mon May 03 22:23:27 AMT 2021
 */

/**
 * @author Zhanna Sargsyan
 */
public class StockGUI extends JFrame {
    public StockGUI() {
        initComponents();
        getContentPane().setBackground(new Color(153, 153, 255));
    }



    private void CancelButtonActionPerformed(ActionEvent e) {
        MainGUI main = new MainGUI();
        main.pack();
        main.setVisible(true);
        this.dispose();
    }

    private void ProductListButtonActionPerformed(ActionEvent e) {
        stockProductListGUI stock = new stockProductListGUI();
        stock.pack();
        stock.setVisible(true);
        dispose();    }

        private void BuyProductButtonActionPerformed(ActionEvent e) {
            AddProductGUI product = new AddProductGUI();
            product.pack();
            product.setVisible(true);
            dispose();        }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hayk
        BuyProductButton = new JButton();
        ProductListButton = new JButton();
        CancelButton = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setBackground(Color.pink);
        setForeground(Color.pink);
        var contentPane = getContentPane();

        //---- BuyProductButton ----
        BuyProductButton.setText("Buy Product");
        BuyProductButton.setBackground(Color.yellow);
        BuyProductButton.addActionListener(e -> BuyProductButtonActionPerformed(e));

        //---- ProductListButton ----
        ProductListButton.setText("Product List");
        ProductListButton.setBackground(Color.yellow);
        ProductListButton.addActionListener(e -> ProductListButtonActionPerformed(e));

        //---- CancelButton ----
        CancelButton.setText("Cancel");
        CancelButton.setBackground(Color.yellow);
        CancelButton.addActionListener(e -> CancelButtonActionPerformed(e));

        //---- label1 ----
        label1.setIcon(new ImageIcon(getClass().getResource("/icons/shopping__business__document__pencil_-512.png")));

        //---- label2 ----
        label2.setIcon(new ImageIcon(getClass().getResource("/icons/shopping__business__truck_-512.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(label2))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(ProductListButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuyProductButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(125, 125, 125))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(314, Short.MAX_VALUE)
                    .addComponent(CancelButton)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(BuyProductButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(36, 36, 36)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(ProductListButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                    .addComponent(CancelButton)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hayk
    private JButton BuyProductButton;
    private JButton ProductListButton;
    private JButton CancelButton;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
