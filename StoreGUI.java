import com.sun.tools.javac.Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue May 04 16:01:46 AMT 2021
 */



/**
 * @author Zhanna Sargsyan
 */
public class StoreGUI extends JFrame {
    public StoreGUI() {
        initComponents();
        getContentPane().setBackground(new Color(153, 153, 255));
    }

    private void SellProductActionPerformed(ActionEvent e) {
        SellProductGUI sellProduct = new SellProductGUI();
        sellProduct.pack();
        sellProduct.setVisible(true);
        dispose();
    }
    private void RequestProductActionPerformed(ActionEvent e) {
        RequestProductGUI request = new RequestProductGUI();
        request.pack();
        request.setVisible(true);
        dispose();
    }

    public static void main(String[] args) {
        StoreGUI store = new StoreGUI();
        store.setVisible(true);
    }

    private void CancelActionPerformed(ActionEvent e) {
        MainGUI main = new MainGUI();
        main.pack();
        main.setVisible(true);
        this.dispose();
    }


    private void ProductListActionPerformed(ActionEvent e) {
        StoreProductListGUI storeProductList = new StoreProductListGUI();
        storeProductList.pack();
        storeProductList.setVisible(true);
        dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hayk
        SellProductButton = new JButton();
        RequestProductButton = new JButton();
        Cancel = new JButton();
        ProductList = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();

        //---- SellProductButton ----
        SellProductButton.setText("Sell a product");
        SellProductButton.setBackground(Color.yellow);
        SellProductButton.addActionListener(e -> SellProductActionPerformed(e));

        //---- RequestProductButton ----
        RequestProductButton.setText("Request a product");
        RequestProductButton.setBackground(Color.yellow);
        RequestProductButton.addActionListener(e -> RequestProductActionPerformed(e));

        //---- Cancel ----
        Cancel.setText("Back");
        Cancel.setBackground(Color.yellow);
        Cancel.addActionListener(e -> CancelActionPerformed(e));

        //---- ProductList ----
        ProductList.setText("Product List");
        ProductList.setBackground(Color.yellow);
        ProductList.addActionListener(e -> ProductListActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(Cancel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(SellProductButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RequestProductButton, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(ProductList, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addGap(135, 135, 135))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(149, 223, Short.MAX_VALUE)
                    .addComponent(Cancel)
                    .addGap(15, 15, 15))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(SellProductButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(RequestProductButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ProductList, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(76, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hayk
    private JButton SellProductButton;
    private JButton RequestProductButton;
    private JButton Cancel;
    private JButton ProductList;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
