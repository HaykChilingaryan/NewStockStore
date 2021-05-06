import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.event.*;
/*
 * Created by JFormDesigner on Tue May 04 16:13:45 AMT 2021
 */


/**
 * @author Zhanna Sargsyan
 */
public class RequestProductGUI extends JFrame {

    public static void main(String[] args) {
        RequestProductGUI soldProduct = new RequestProductGUI();
        soldProduct.pack();
        soldProduct.setVisible(true);
    }

    public RequestProductGUI() {
        initComponents();
        pack();
        ProductComboBox.setModel(new DefaultComboBoxModel(Product.productList.toArray()));
        this.setVisible(true);
    }

    private StoreProduct getStoreProductFromInput(){
        int quantity = Integer.parseInt(QuantityTextArea.getText());
        double buyPrice = Double.parseDouble(BuyPriceTextArea.getText());
        double sellPrice = Double.parseDouble(SellPriceTextArea.getText());
        Product product = (Product)ProductComboBox.getSelectedItem();
        return new StoreProduct(product,quantity,buyPrice,sellPrice);
    }
    private void okButtonActionPerformed(ActionEvent e) throws ProductOutOfQuantityException, InvalidStoreProductAction, ProductNotFoundInStoreException, ProductNotFoundInStockException {
        try{
            Store.RequestProductFromStock(getStoreProductFromInput());
            StoreGUI store = new StoreGUI();
            store.pack();
            store.setVisible(true);
            this.dispose();
        }
        catch(ProductOutOfQuantityException ex){

        }
        catch(ProductNotFoundInStockException ex){

        }
        catch (ProductNotFoundInStoreException ex){

        }

    }



    private void button1ActionPerformed(ActionEvent e) {
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
        NameLabel = new JLabel();
        QuantityLabel = new JLabel();
        QuantityTextArea = new JTextArea();
        PageTextArea = new JLabel();
        SellPriceLabel = new JLabel();
        ProductComboBox = new JComboBox();
        BuyPriceLabel = new JLabel();
        SellPriceTextArea = new JTextArea();
        BuyPriceTextArea = new JTextArea();
        buttonBar = new JPanel();
        okButton = new JButton();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(new Color(153, 153, 255));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder( 0
            , 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,
            dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setBackground(new Color(153, 153, 255));
                contentPanel.setForeground(Color.yellow);

                //---- NameLabel ----
                NameLabel.setText("Name");
                NameLabel.setForeground(Color.yellow);
                NameLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));

                //---- QuantityLabel ----
                QuantityLabel.setText("Quantity");
                QuantityLabel.setForeground(Color.yellow);
                QuantityLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));

                //---- QuantityTextArea ----
                QuantityTextArea.setForeground(Color.black);
                QuantityTextArea.setCaretColor(Color.black);
                QuantityTextArea.setSelectedTextColor(Color.black);

                //---- PageTextArea ----
                PageTextArea.setText("Please choos a product and preferences");
                PageTextArea.setForeground(Color.yellow);
                PageTextArea.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));

                //---- SellPriceLabel ----
                SellPriceLabel.setText("Sell Price");
                SellPriceLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
                SellPriceLabel.setForeground(Color.yellow);

                //---- BuyPriceLabel ----
                BuyPriceLabel.setText("Buy Price");
                BuyPriceLabel.setForeground(Color.yellow);
                BuyPriceLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(NameLabel)
                                .addComponent(QuantityLabel))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(ProductComboBox, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                .addComponent(QuantityTextArea, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(BuyPriceLabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                .addComponent(SellPriceLabel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(SellPriceTextArea, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(BuyPriceTextArea, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                            .addContainerGap(45, Short.MAX_VALUE))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(PageTextArea)
                            .addContainerGap(69, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(PageTextArea)
                            .addGap(30, 30, 30)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(NameLabel)
                                    .addComponent(ProductComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(SellPriceTextArea, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SellPriceLabel)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(QuantityLabel)
                                .addComponent(QuantityTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(BuyPriceTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(BuyPriceLabel))
                            .addGap(76, 76, 76))
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

                //---- button1 ----
                button1.setText("Cancel");
                button1.setBackground(Color.yellow);
                button1.addActionListener(e -> button1ActionPerformed(e));
                buttonBar.add(button1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
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
    private JLabel NameLabel;
    private JLabel QuantityLabel;
    private JTextArea QuantityTextArea;
    private JLabel PageTextArea;
    private JLabel SellPriceLabel;
    private JComboBox ProductComboBox;
    private JLabel BuyPriceLabel;
    private JTextArea SellPriceTextArea;
    private JTextArea BuyPriceTextArea;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
