import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.event.*;
/*
 * Created by JFormDesigner on Tue May 04 16:13:45 AMT 2021
 */



/**
 * @author Zhanna Sargsyan
 */
public class SellProductGUI extends JFrame {


    public static void main(String[] args) {
        SellProductGUI soldProduct = new SellProductGUI();
        soldProduct.pack();
        soldProduct.setVisible(true);
    }

    public SellProductGUI(){
        initComponents();
        pack();
        nameBox.setModel(new DefaultComboBoxModel(Product.productList.toArray()));
        this.setVisible(true);


    }

    private StoreProduct getStoreProductFromInput(){
        int quantity = Integer.parseInt(textArea2.getText());
        double buyPrice = Double.parseDouble(textArea3.getText());
        double sellPrice = Double.parseDouble(textArea4.getText());
        Product product = (Product)nameBox.getSelectedItem();
        return new StoreProduct(product,quantity,buyPrice,sellPrice);
    }
    private void okButtonActionPerformed(ActionEvent e) throws ProductOutOfQuantityException, InvalidStoreProductAction, ProductNotFoundInStoreException, ProductNotFoundInStockException {
        try{
            Store.Sell(getStoreProductFromInput());
        }
        catch(ProductNotFoundInStockException ex){

        }
        catch(ProductOutOfQuantityException ex){

        }
        catch (ProductNotFoundInStoreException ex){

        }
        StoreGUI store = new StoreGUI();
        store.pack();
        store.setVisible(true);
        this.dispose();
    }


    private void CancelButtonActionPerformed(ActionEvent e) {
        StoreGUI store = new StoreGUI();
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
        textArea2 = new JTextArea();
        label3 = new JLabel();
        SellPrice = new JLabel();
        BuyPrice = new JLabel();
        textArea3 = new JTextArea();
        textArea4 = new JTextArea();
        nameBox = new JComboBox();
        buttonBar = new JPanel();
        okButton = new JButton();
        CancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(new Color(153, 153, 255));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setBackground(new Color(153, 153, 255));

                //---- label1 ----
                label1.setText("Name");
                label1.setForeground(Color.yellow);
                label1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));

                //---- label2 ----
                label2.setText("Quantity");
                label2.setForeground(Color.yellow);
                label2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));

                //---- textArea2 ----
                textArea2.setForeground(Color.black);
                textArea2.setCaretColor(Color.black);
                textArea2.setSelectedTextColor(Color.black);

                //---- label3 ----
                label3.setText("Please, enter the name and the quantity of the product");
                label3.setForeground(Color.yellow);
                label3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));

                //---- SellPrice ----
                SellPrice.setText("Sell Price");
                SellPrice.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
                SellPrice.setForeground(Color.yellow);

                //---- BuyPrice ----
                BuyPrice.setText("Buy Price");
                BuyPrice.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
                BuyPrice.setForeground(Color.yellow);

                //---- textArea3 ----
                textArea3.setForeground(Color.black);
                textArea3.setCaretColor(Color.black);
                textArea3.setSelectedTextColor(Color.black);

                //---- textArea4 ----
                textArea4.setForeground(Color.black);
                textArea4.setCaretColor(Color.black);
                textArea4.setSelectedTextColor(Color.black);



                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label3))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(label1)
                                            .addGap(18, 18, 18)
                                            .addComponent(nameBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SellPrice))
                                        .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(label2)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                            .addGap(59, 59, 59)
                                            .addComponent(BuyPrice)))
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(textArea3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea4, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(10, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(label3)
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textArea4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(SellPrice)
                                .addComponent(label1)
                                .addComponent(nameBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(BuyPrice)
                                .addComponent(textArea3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(72, 72, 72))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setBackground(new Color(153, 153, 255));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                okButton.setBackground(Color.yellow);
                okButton.addActionListener(e -> {
                    try {
                        okButtonActionPerformed(e);
                    } catch (ProductOutOfQuantityException | InvalidStoreProductAction | ProductNotFoundInStoreException | ProductNotFoundInStockException exception) {
                        exception.printStackTrace();
                    }
                });
                buttonBar.add(okButton, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- CancelButton ----
                CancelButton.setText("Cancel");
                CancelButton.setBackground(Color.yellow);
                CancelButton.addActionListener(e -> CancelButtonActionPerformed(e));
                buttonBar.add(CancelButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
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
    private JTextArea textArea2;
    private JLabel label3;
    private JLabel SellPrice;
    private JLabel BuyPrice;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JComboBox nameBox;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton CancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
