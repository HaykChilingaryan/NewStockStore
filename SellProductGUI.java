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
        this.setVisible(true);


    }

    private Product getProductFromList(String name){
        Product prod = null;
        for(Product p: Product.productList){
            if(p.getProductName().equals(name)){
                prod = p;
            }
        }
        return prod;
    }

    private StoreProduct getStoreProductFromInput(){
        int quantity = Integer.parseInt(textArea2.getText());
        double buyPrice = Double.parseDouble(textArea4.getText());
        double sellPrice = Double.parseDouble(textArea3.getText());
        String name = (String)nameBox.getSelectedItem();
        Product product = getProductFromList(name);
        return new StoreProduct(product,quantity,buyPrice,sellPrice);
    }
    private void okButtonActionPerformed(ActionEvent e) throws ProductOutOfQuantityException, InvalidStoreProductAction, ProductNotFoundInStoreException, ProductNotFoundInStockException {
        try{
            Store.Sell(getStoreProductFromInput());
            StoreGUI store = new StoreGUI();
            store.pack();
            store.setVisible(true);
            this.dispose();
        }
        catch(ProductNotFoundInStoreException ex){
            this.dispose();
            SellProductStoreExceptionGUI sellProductStoreException = new SellProductStoreExceptionGUI();
            sellProductStoreException.pack();
            sellProductStoreException.setVisible(true);
        }
        catch (ProductOutOfQuantityException ex){
            this.dispose();
            SellProductQuantityExceptionGUI sellProductQuantityException = new SellProductQuantityExceptionGUI();
            sellProductQuantityException.pack();
            sellProductQuantityException.setVisible(true);
        }
        catch (NumberFormatException ex){
            this.dispose();
            NumberFormatExceptionGUI exception = new NumberFormatExceptionGUI();
            exception.pack();
            exception.setVisible(true);

        }

    }


    private void CancelButtonActionPerformed(ActionEvent e) {
        StoreGUI store = new StoreGUI();
        store.pack();
        store.setVisible(true);
        this.dispose();
    }

    private void nameBoxActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void nameBoxItemStateChanged(ItemEvent e) {
        // TODO add your code here
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
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
        nameBox = new JComboBox<>();
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
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
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

                //---- nameBox ----
                nameBox.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Macun",
                    "Sour Cream",
                    "Milk",
                    "Cheese",
                    "Orange Juice",
                    "Apple Juice",
                    "Cheesecake",
                    "Brownie",
                    "Napoleon",
                    "Cone",
                    "Eskimo",
                    "Caramel Ice Cream"
                }));
                nameBox.addActionListener(e -> nameBoxActionPerformed(e));
                nameBox.addItemListener(e -> nameBoxItemStateChanged(e));

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
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(label2)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SellPrice))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(label1)
                                            .addGap(18, 18, 18)
                                            .addComponent(nameBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(60, 60, 60)
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
                                .addComponent(label1)
                                .addComponent(nameBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(BuyPrice))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textArea3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(SellPrice))
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
                    } catch (ProductOutOfQuantityException productOutOfQuantityException) {
                        productOutOfQuantityException.printStackTrace();
                    } catch (InvalidStoreProductAction invalidStoreProductAction) {
                        invalidStoreProductAction.printStackTrace();
                    } catch (ProductNotFoundInStoreException productNotFoundInStoreException) {
                        productNotFoundInStoreException.printStackTrace();
                    } catch (ProductNotFoundInStockException productNotFoundInStockException) {
                        productNotFoundInStockException.printStackTrace();
                    }
                });
                buttonBar.add(okButton, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- CancelButton ----
                CancelButton.setText("Cancel");
                CancelButton.setBackground(Color.yellow);
                CancelButton.addActionListener(e -> CancelButtonActionPerformed(e));
                buttonBar.add(CancelButton, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
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
    // Generated using JFormDesigner Evaluation license - Zhanna Sargsyan
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
    private JComboBox<String> nameBox;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton CancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
