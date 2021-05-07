import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Tue May 04 14:11:45 AMT 2021
 */

/**
 * @author Zhanna Sargsyan
 */

public class AddProductGUI extends JFrame {

    public static void main(String[] args) {
        AddProductGUI product = new AddProductGUI();
        product.pack();
        product.setVisible(true);
    }

    public AddProductGUI() {

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
        int quantity = Integer.parseInt(QuantityTextArea.getText());
        double buyPrice = Double.parseDouble(BuyPriceTextArea.getText());
        double sellPrice = Double.parseDouble(SellPriceTextArea.getText());
        String name = (String)NewProductComboBox.getSelectedItem();
        Product product = getProductFromList(name);
        return new StoreProduct(product,quantity,buyPrice,sellPrice);
    }

    private void okButtonActionPerformed(ActionEvent e) throws ProductOutOfQuantityException, InvalidStoreProductAction {
        try{
            Stock.Buy(getStoreProductFromInput());
            StockGUI stock = new StockGUI();
            stock.pack();
            stock.setVisible(true);
            dispose();
        }
        catch (NumberFormatException ex){
            this.dispose();
            NumberFormatExceptionGUI exception = new NumberFormatExceptionGUI();
            exception.pack();
            exception.setVisible(true);

        }

    }





    private void CancelActionPerformed(ActionEvent e) {
        this.dispose();
        StockGUI stock = new StockGUI();
        stock.pack();
        stock.setVisible(true);

    }

    private void NewProductComboBoxActionPerformed(ActionEvent e) {

    }

    private void label2PropertyChange(PropertyChangeEvent e) {
        // TODO add your code here
    }

    private void label1PropertyChange(PropertyChangeEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hayk
        dialogPane = new JPanel();
        buttonBar = new JPanel();
        contentPanel = new JPanel();
        ProductNameLabel = new JLabel();
        QuantityLabel = new JLabel();
        ProductSellPriceLabel = new JLabel();
        textField5 = new JTextField();
        ProductBuyPriceLabel = new JLabel();
        QuantityTextArea = new JTextArea();
        SellPriceTextArea = new JTextArea();
        BuyPriceTextArea = new JTextArea();
        NewProductComboBox = new JComboBox<>();
        okButton = new JButton();
        Cancel = new JButton();
        PageLabel = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(new Color(153, 153, 255));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder( )) )
            ; dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            dialogPane.setLayout(new BorderLayout());

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setBackground(new Color(153, 153, 255));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //======== contentPanel ========
                {
                    contentPanel.setBackground(new Color(153, 153, 255));

                    //---- ProductNameLabel ----
                    ProductNameLabel.setText("Name");
                    ProductNameLabel.setForeground(Color.yellow);
                    ProductNameLabel.setBackground(Color.white);
                    ProductNameLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 12));
                    ProductNameLabel.addPropertyChangeListener(e -> label2PropertyChange(e));

                    //---- QuantityLabel ----
                    QuantityLabel.setText("Quantity");
                    QuantityLabel.setForeground(Color.yellow);
                    QuantityLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 12));

                    //---- ProductSellPriceLabel ----
                    ProductSellPriceLabel.setText("Sell Price");
                    ProductSellPriceLabel.setForeground(Color.yellow);
                    ProductSellPriceLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 12));

                    //---- ProductBuyPriceLabel ----
                    ProductBuyPriceLabel.setText("Buy Price");
                    ProductBuyPriceLabel.setForeground(Color.yellow);
                    ProductBuyPriceLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 12));

                    //---- NewProductComboBox ----
                    NewProductComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
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
                    NewProductComboBox.addActionListener(e -> NewProductComboBoxActionPerformed(e));

                    GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                    contentPanel.setLayout(contentPanelLayout);
                    contentPanelLayout.setHorizontalGroup(
                        contentPanelLayout.createParallelGroup()
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGap(276, 276, 276)
                                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(QuantityLabel, GroupLayout.Alignment.LEADING)
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addComponent(ProductNameLabel)
                                                .addGap(16, 16, 16)))
                                        .addGap(12, 12, 12)
                                        .addGroup(contentPanelLayout.createParallelGroup()
                                            .addComponent(QuantityTextArea, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NewProductComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addComponent(ProductSellPriceLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SellPriceTextArea, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addComponent(ProductBuyPriceLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BuyPriceTextArea))))))
                    );
                    contentPanelLayout.setVerticalGroup(
                        contentPanelLayout.createParallelGroup()
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(ProductNameLabel)
                                            .addComponent(BuyPriceTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductBuyPriceLabel))
                                        .addGap(25, 25, 25)
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(QuantityLabel)
                                            .addComponent(QuantityTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductSellPriceLabel)
                                            .addComponent(SellPriceTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NewProductComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    );
                }
                buttonBar.add(contentPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- okButton ----
                okButton.setText("OK");
                okButton.addActionListener(e -> {
                    try {
                        okButtonActionPerformed(e);
                    } catch (ProductOutOfQuantityException | InvalidStoreProductAction productOutOfQuantityException) {
                        productOutOfQuantityException.printStackTrace();
                    }
                });
                buttonBar.add(okButton, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- Cancel ----
                Cancel.setText("Cancel");
                Cancel.addActionListener(e -> CancelActionPerformed(e));
                buttonBar.add(Cancel, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //---- PageLabel ----
            PageLabel.setText("Add new product preferences");
            PageLabel.setForeground(Color.yellow);
            PageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            PageLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
            PageLabel.setBackground(new Color(153, 153, 255));
            PageLabel.addPropertyChangeListener(e -> {
			label1PropertyChange(e);
			label1PropertyChange(e);
			label1PropertyChange(e);
		});
            dialogPane.add(PageLabel, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hayk
    private JPanel dialogPane;
    private JPanel buttonBar;
    private JPanel contentPanel;
    private JLabel ProductNameLabel;
    private JLabel QuantityLabel;
    private JLabel ProductSellPriceLabel;
    private JTextField textField5;
    private JLabel ProductBuyPriceLabel;
    private JTextArea QuantityTextArea;
    private JTextArea SellPriceTextArea;
    private JTextArea BuyPriceTextArea;
    private JComboBox<String> NewProductComboBox;
    private JButton okButton;
    private JButton Cancel;
    private JLabel PageLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
