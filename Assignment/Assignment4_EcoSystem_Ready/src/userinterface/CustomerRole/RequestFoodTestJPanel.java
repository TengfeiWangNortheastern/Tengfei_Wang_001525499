/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package userinterface.CustomerRole;

import Business.Enterprise.Enterprise;
import Business.Order.Food;
import Business.Order.MasterOrderList;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.RestaurantOrganization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Restaurant.ManageOrderJPanel;



/**
 *
 * @author Rushabh
 */
public class RequestFoodTestJPanel extends javax.swing.JPanel {

    /** Creates new form BrowseProducts */
    JPanel userProcessContainer;
    UserAccount userAccount;
    UserAccountDirectory supplierDirectory;
    Order currentOrder=new Order();
    private Organization org=null;
    Enterprise enterprise;
    public RequestFoodTestJPanel(JPanel userProcessContainer, UserAccount userAccount,Enterprise enterprise) {
        initComponents();
//        userProcessContainer, userAccount,ecosystem,enterprise
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        ArrayList<Organization> organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
        
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof RestaurantOrganization){
                org=organization;
                break;
            }
        }
        if(org!=null){
            this.supplierDirectory=org.getUserAccountDirectory();
            
        }
        
        polulateCombo();
        polulateProductTable();
    }

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblSupplier = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox();
        txtSearch = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        lblProductCatalogue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        lblQuantity = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        lblItemsInCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        txtNewQuantity = new javax.swing.JTextField();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        txtTotalPrice = new javax.swing.JTextField();
        lblSupplier1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 600));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSupplier.setText("Supplier:");

        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        lblProductCatalogue.setText("Product Catalog:");

        tblProductCatalog.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductCatalog);

        lblQuantity.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        lblItemsInCart.setText("Items in cart:");

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnCheckOut.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        lblSupplier1.setText("Total Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblProductCatalogue)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearchProduct))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(lblQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(171, 171, 171))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                        .addComponent(lblItemsInCart)
                        .addComponent(jScrollPane2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnModifyQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(lblSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveOrderItem)))
                    .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(395, 395, 395)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProductCatalogue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart))
                .addGap(18, 18, 18)
                .addComponent(lblItemsInCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveOrderItem)
                    .addComponent(btnModifyQuantity)
                    .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSupplier1))
                .addGap(18, 18, 18)
                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

    }// </editor-fold>//GEN-END:initComponents

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        // TODO add your handling code here:
        polulateProductTable();
        
    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        UserAccount selectedSupplier=(UserAccount)cmbSupplier.getSelectedItem();
        if(selectedSupplier==null){
            JOptionPane.showMessageDialog(this, "Please select a restaurant!!");
            return;
        }
        if(selectedSupplier.getWorkQueue().getMasterOrderList()==null){
            MasterOrderList masterOrderList=new MasterOrderList();
            selectedSupplier.getWorkQueue().setMasterOrderList(masterOrderList);
        }
        if(userAccount.getWorkQueue().getMasterOrderList()==null){
            MasterOrderList masterOrderList=new MasterOrderList();
            userAccount.getWorkQueue().setMasterOrderList(masterOrderList);
        }
       System.out.println(selectedSupplier.getWorkQueue()+"  "+selectedSupplier.getWorkQueue().getMasterOrderList());
       selectedSupplier.getWorkQueue().getMasterOrderList().addNewOrder(currentOrder); //add order to restaurant
       userAccount.getWorkQueue().getMasterOrderList().addNewOrder(currentOrder); //add order to customer
       
       requestTest(selectedSupplier);
       
       currentOrder=new Order();
       polulateCombo();
       populateCartTable();
       polulateProductTable();
       
       txtNewQuantity.setText("");
       txtSearch.setText("");
       
       spnQuantity.setValue(0);

       JOptionPane.showMessageDialog(this, "Thanks for your perchase, looking forward to see you again");
    }//GEN-LAST:event_btnCheckOutActionPerformed
// ready to be finished
    private void requestTest(UserAccount selectedSupplier) {
        
        if(currentOrder==null){
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setOrder(currentOrder);
        
        request.setSender(userAccount);
        request.setReceiver(selectedSupplier);
        request.setStatus("Sent");
        
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        selectedSupplier.getWorkQueue().getWorkRequestList().add(request);
        
        System.out.println(userAccount.getUsername());
        Organization org2 = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof RestaurantOrganization) {
                                org2 = organization;
                                break;
                            }
                    }
                if (org2 != null) {
                        org2.getWorkQueue().getWorkRequestList().add(request);
                    }

//        JOptionPane.showMessageDialog(null, "Request message sent");
//        messageJTextField.setText("");
    }
    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        int selectedRowIndex=tblCart.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the order item");
            return;
        }
        OrderItem item= (OrderItem) this.tblCart.getValueAt(selectedRowIndex, 0);
        int quant=0;
        
        try{
         quant=Integer.parseInt(txtNewQuantity.getText());

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please check modified quantity first.");
            return;
        }
           
        int oldQuant=item.getQuantity();
        if((item.getProduct().getAvail()+oldQuant)<quant){
             JOptionPane.showMessageDialog(this, "Please check product availability");
            return;
        }
            item.getProduct().setAvail(item.getProduct().getAvail()+oldQuant-quant);
            item.setQuantity(quant);
             populateCartTable();
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        String productName=txtSearch.getText();
        polulateProductTable(productName);

    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int selectedRowIndex=tblCart.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the order item");
            return;
        }
        OrderItem item= (OrderItem) this.tblCart.getValueAt(selectedRowIndex, 0);
        int quant=0;
          
                int oldQuant=item.getQuantity();
            if(item.getProduct().getAvail()+oldQuant<quant){
                 JOptionPane.showMessageDialog(this, "Please check product availability");
                return;
            }
            item.getProduct().setAvail(item.getProduct().getAvail()+item.getQuantity());
            currentOrder.deleteItem(item);
            populateCartTable();
            polulateProductTable();
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
              
        int selectedRowIndex=tblProductCatalog.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a product row");
            return;
        }
        Food product= (Food) this.tblProductCatalog.getValueAt(selectedRowIndex, 0);
        double salesPrice=product.getPrice();
        int quant=0;
        
        try{
            
            quant=(Integer)spnQuantity.getValue();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please check the price and quantity field.");
            return;
        }
        if(salesPrice<product.getPrice()){
            JOptionPane.showMessageDialog(this, "Price should be more than it is set in the price.");
            return;
        }
        // what is currentOrder???
//        currentOrder.addNewOrderItem(product, product.getPrice(), product.getAvail());
        OrderItem item=currentOrder.findProduct(product);
        if(item==null){
            if(product.getAvail()>=quant){
                currentOrder.addNewOrderItem(product, salesPrice, quant);
                product.setAvail(product.getAvail()-quant);
                
                
            }else{
                JOptionPane.showMessageDialog(this, "Please check product availability");
                return;
            }
        }else{
            int oldQuant=item.getQuantity();
            if(item.getProduct().getAvail()+oldQuant<quant){
                 JOptionPane.showMessageDialog(this, "Please check product availability");
                return;
            }
            item.getProduct().setAvail(item.getProduct().getAvail()+oldQuant-quant);
            item.setQuantity(quant);
        }
        polulateProductTable();
        populateCartTable();
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JComboBox cmbSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblItemsInCart;
    private javax.swing.JLabel lblProductCatalogue;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblSupplier1;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables

    private void polulateCombo() {
        cmbSupplier.removeAllItems();
        for(UserAccount s:supplierDirectory.getUserAccountList()){
            cmbSupplier.addItem(s);
        }
    }

    private void polulateProductTable() {
        UserAccount selectedSupplier=(UserAccount)cmbSupplier.getSelectedItem();
        if(selectedSupplier==null){
            return;
        }
                DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        model.setRowCount(0);

        for (Food p : selectedSupplier.getWorkQueue().getFoodCatalog().getProductcatalog()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3]=p.getAvail();
            model.addRow(row);
        }
    }
        private void polulateProductTable(String keyword) {
            
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        model.setRowCount(0);

        for(UserAccount s:supplierDirectory.getUserAccountList()){
        
        for (Food p : s.getWorkQueue().getFoodCatalog().getProductcatalog()) {
            if(p.getProdName().equalsIgnoreCase(keyword)){
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3]=p.getAvail();
            model.addRow(row);
        }}
    }
        }

    private void populateCartTable() {
        int TotalPrice=0;
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);

        for (OrderItem oi:currentOrder.getOrderItemList()) {
            Object row[] = new Object[4];
            row[0] = oi;
            row[1] = oi.getSalesPrice();
            row[2] = oi.getQuantity();
            row[3]=oi.getQuantity()*oi.getSalesPrice();
            TotalPrice+=oi.getQuantity()*oi.getSalesPrice();
            model.addRow(row);
        }
        txtTotalPrice.setText(String.valueOf(TotalPrice));
        currentOrder.setTotalPrice(TotalPrice);
    }

}
