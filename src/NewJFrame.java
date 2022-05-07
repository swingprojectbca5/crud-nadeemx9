
import com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame
{

    static Connection con;

    ResultSet result;
    PreparedStatement pst;
    Statement st;

    public NewJFrame()
    {
	initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNm = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtDesig = new javax.swing.JTextField();
        btnUpdt = new javax.swing.JButton();
        btnDlt = new javax.swing.JButton();
        btnInsrt = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CRUD OPERATION");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("City :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Designation :");

        txtId.setEditable(false);
        txtId.setFocusAccelerator('1');
        txtId.setFocusCycleRoot(true);
        txtId.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                txtIdMouseClicked(evt);
            }
        });

        txtNm.setFocusCycleRoot(true);

        btnUpdt.setBackground(new java.awt.Color(51, 102, 255));
        btnUpdt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdt.setText("UPDATE");
        btnUpdt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpdtActionPerformed(evt);
            }
        });

        btnDlt.setBackground(new java.awt.Color(255, 51, 51));
        btnDlt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDlt.setText("DELETE");
        btnDlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDlt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDltActionPerformed(evt);
            }
        });

        btnInsrt.setBackground(new java.awt.Color(102, 255, 102));
        btnInsrt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInsrt.setText("INSERT");
        btnInsrt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsrt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInsrtActionPerformed(evt);
            }
        });

        btnRetrieve.setBackground(new java.awt.Color(255, 255, 51));
        btnRetrieve.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRetrieve.setText("RETRIEVE");
        btnRetrieve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetrieve.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRetrieveActionPerformed(evt);
            }
        });

        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "ID", "Name", "City", "Designation"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        JTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                JTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsrt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(64, 64, 64)
                        .addComponent(txtNm, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDesig, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRetrieve, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInsrt)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdt)
                        .addComponent(txtNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDlt)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnRetrieve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        btnUpdt.getAccessibleContext().setAccessibleName("");
        btnDlt.getAccessibleContext().setAccessibleName("");
        btnRetrieve.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsrtActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInsrtActionPerformed
    {//GEN-HEADEREND:event_btnInsrtActionPerformed
	if (isIdEmpty())

	{
	    JOptionPane.showMessageDialog(null, "ID Field is Empty!");
	    txtId.grabFocus();
	}
	else if (isIdExist())
	{
	    JOptionPane.showMessageDialog(null, "ID Already Exist", "INVALID CREDENTIALS", JOptionPane.INFORMATION_MESSAGE);
	    txtId.grabFocus();
	    txtId.selectAll();

	}

	else if (isNameEmpty())
	{
	    JOptionPane.showMessageDialog(null, "Name Field is Empty!");
	    txtNm.grabFocus();
	}
	else if (isCityEmpty())
	{
	    JOptionPane.showMessageDialog(null, "City Field is Empty!");
	    txtCity.grabFocus();
	}
	else if (isDesignationEmpty())
	{
	    JOptionPane.showMessageDialog(null, "Designation Field is Empty!");
	    txtDesig.grabFocus();
	}
	else
	{
	    try
	    {
		String query = "insert into crud values(?, ?, ?, ?)";
		pst = con.prepareStatement(query);
		pst.setInt(1, Integer.parseInt(txtId.getText()));
		pst.setString(2, txtNm.getText());
		pst.setString(3, txtCity.getText());
		pst.setString(4, txtDesig.getText());

		int r = pst.executeUpdate();
		if (r > 0)
		{
		    JOptionPane.showMessageDialog(null, "1 Record Inserted Successfully!");
		    clearFields();
		    txtNm.grabFocus();
		}

	    }
	    catch (SQLException e)
	    {
		JOptionPane.showMessageDialog(null, e.getMessage());
	    }
	}

	bindData();
	autoGenerateId();
    }//GEN-LAST:event_btnInsrtActionPerformed

    private void btnUpdtActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpdtActionPerformed
    {//GEN-HEADEREND:event_btnUpdtActionPerformed
	if (isIdEmpty())
	{
	    JOptionPane.showMessageDialog(null, "ID Field is Empty!");
	    txtId.grabFocus();
	}
	else if (!isIdExist())
	{
	    JOptionPane.showMessageDialog(null, "ID does not Exist", "INVALID CREDENTIALS", JOptionPane.INFORMATION_MESSAGE);
	    txtId.grabFocus();
	    txtId.selectAll();
	}
	else
	{
	    try
	    {
		String query = "update crud set nm = ?, city = ?, desig = ? where id = ?";
		pst = con.prepareStatement(query);
		pst.setString(1, txtNm.getText());
		pst.setString(2, txtCity.getText());
		pst.setString(3, txtDesig.getText());
		pst.setString(4, txtId.getText());

		int r = pst.executeUpdate();
		if (r > 0)
		{
		    JOptionPane.showMessageDialog(null, "1 Record Updated Successfully!");
		    bindData();
		    autoGenerateId();
		}
	    }
	    catch (Exception e)
	    {
		JOptionPane.showMessageDialog(null, e.getMessage());
		System.exit(0);
	    }
	}

    }//GEN-LAST:event_btnUpdtActionPerformed

    private void btnDltActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDltActionPerformed
    {//GEN-HEADEREND:event_btnDltActionPerformed
	if (isIdEmpty())
	{
	    JOptionPane.showMessageDialog(null, "ID Field is Empty!");
	    txtId.grabFocus();
	}
	else if (!isIdExist())
	{
	    JOptionPane.showMessageDialog(null, "ID does not Exist", "INVALID CREDENTIALS", JOptionPane.INFORMATION_MESSAGE);
	    txtId.grabFocus();
	    txtId.selectAll();
	}
	else
	{
	    try
	    {
		String query = "delete from crud where id = ?";
		pst = con.prepareStatement(query);
		pst.setString(1, txtId.getText());

		int r = pst.executeUpdate();
		if (r > 0)
		{
		    JOptionPane.showMessageDialog(null, "1 Record Deleted Successfully!");
		}
	    }
	    catch (Exception e)
	    {
		JOptionPane.showMessageDialog(null, e.getMessage());
	    }
	}

	bindData();
    }//GEN-LAST:event_btnDltActionPerformed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRetrieveActionPerformed
    {//GEN-HEADEREND:event_btnRetrieveActionPerformed
	if (isIdEmpty())
	{
	    JOptionPane.showMessageDialog(null, "ID Field is Empty!");
	    txtId.grabFocus();
	}
	else if (!isIdExist())
	{
	    JOptionPane.showMessageDialog(null, "ID does not Exist", "INVALID CREDENTIALS", JOptionPane.INFORMATION_MESSAGE);
	    txtId.grabFocus();
	    txtId.selectAll();
	}
	else
	{
	    String query = "select * from crud where id = '" + txtId.getText() + "'";
	    try
	    {
		st = con.createStatement();
		result = st.executeQuery(query);
		if (result.next())
		{
		    txtId.setText(result.getString(1));
		    txtNm.setText(result.getString(2));
		    txtCity.setText(result.getString(3));
		    txtDesig.setText(result.getString(4));
		    autoGenerateId();
		}
		else
		{
		    JOptionPane.showMessageDialog(null, "ID does not Exist", "INVALID CREDENTIALS", JOptionPane.INFORMATION_MESSAGE);
		}
	    }
	    catch (Exception e)
	    {
		JOptionPane.showMessageDialog(null, e.getMessage());
		System.exit(0);
	    }
	}
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
	bindData();
	autoGenerateId();
    }//GEN-LAST:event_formWindowOpened

    private void JTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_JTableMouseClicked
    {//GEN-HEADEREND:event_JTableMouseClicked
	DefaultTableModel model = (DefaultTableModel) JTable.getModel();
	int rowIndex = JTable.getSelectedRow();
	txtId.setText(model.getValueAt(rowIndex, 0).toString());
	txtNm.setText(model.getValueAt(rowIndex, 1).toString());
	txtCity.setText(model.getValueAt(rowIndex, 2).toString());
	txtDesig.setText(model.getValueAt(rowIndex, 3).toString());

    }//GEN-LAST:event_JTableMouseClicked

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtIdMouseClicked
    {//GEN-HEADEREND:event_txtIdMouseClicked
	clearFields();
	autoGenerateId();
    }//GEN-LAST:event_txtIdMouseClicked

    public static void main(String args[])
    {

	if (isDriverLoaded() == false)
	{
	    JOptionPane.showMessageDialog(null, "Failed to Load MySql Driver.", "UNABLE TO LOAD DRIVER!", JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
	}
	else if (isConnected() == false)
	{
	    JOptionPane.showMessageDialog(null, "Failed to Establish Connection.", "DATABASE CONNECTION FAILED", JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
	}
	else
	{
	    try
	    {
		UIManager.setLookAndFeel(new FlatSolarizedDarkIJTheme());
	    }
	    catch (UnsupportedLookAndFeelException ex)
	    {
		System.out.println(ex);
	    }
	}

	java.awt.EventQueue.invokeLater(new Runnable()
	{
	    public void run()
	    {
		new NewJFrame().setVisible(true);
	    }
	});
    }

    // Custom Methods....
    static boolean isConnected()
    {
	try
	{
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nedjdbc", "root", "");
	    return true;
	}
	catch (Exception e)
	{
	    return false;
	}
    }

    static boolean isDriverLoaded()
    {
	try
	{
	    Class.forName(
		    "com.mysql.jdbc.Driver");
	    return true;
	}
	catch (Exception e)
	{
	    return false;
	}
    }

    boolean isIdEmpty()
    {
	if (txtId.getText().equals(""))
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }

    boolean isNameEmpty()
    {
	if (txtNm.getText().equals(""))
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }

    boolean isCityEmpty()
    {
	if (txtCity.getText().equals(""))
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }

    boolean isDesignationEmpty()
    {
	if (txtDesig.getText().equals(""))
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }

    void clearFields()
    {
	txtId.setText("");
	txtNm.setText("");
	txtCity.setText("");
	txtDesig.setText("");
    }

    boolean isIdExist()
    {
	String query = "select * from crud where id = '" + txtId.getText() + "'";
	try
	{
	    st = con.createStatement();
	    result = st.executeQuery(query);
	    if (result.next())
	    {
		return true;
	    }
	    else
	    {
		return false;
	    }
	}
	catch (Exception e)
	{
	    return false;
	}

    }

    void bindData()
    {
	try
	{
	    String id, nm, city, desig;
	    String query = "select * from crud";

	    pst = con.prepareStatement(query);
	    result = pst.executeQuery();

	    DefaultTableModel table = (DefaultTableModel) JTable.getModel();
	    table.setRowCount(0);

	    while (result.next())
	    {
		id = result.getString(1);
		nm = result.getString(2);
		city = result.getString(3);
		desig = result.getString(4);

		String[] rows =
		{
		    id, nm, city, desig
		};

		table.addRow(rows);
	    }
	}
	catch (Exception e)
	{
	    JOptionPane.showMessageDialog(null, e.getMessage());
	}
    }

    void autoGenerateId()
    {

	try
	{
	    // select MAX(CAST(id AS Int)) FROM crud
	    String query = "Select MAX(id) from crud";
	    st = con.createStatement();
	    result = st.executeQuery(query);
	    if (result.next())
	    {
		int id = result.getInt(1) + 1;
		txtId.setText(Integer.toString(id));
	    }
	    else
	    {
		txtId.setText("1");
	    }
	}
	catch (Exception e)
	{
	    JOptionPane.showMessageDialog(null, e.getMessage());
	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btnDlt;
    private javax.swing.JButton btnInsrt;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JButton btnUpdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDesig;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNm;
    // End of variables declaration//GEN-END:variables
}
