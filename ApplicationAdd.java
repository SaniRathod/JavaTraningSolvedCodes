import java.awt.*;
import java.awt.event.*;
class AddApplication extends Frame implements ActionListener
{
	Label lblnum1,lblnum2,lbladd;
	TextField txtnum1,txtnum2,txtadd;
	Button btnadd,btnclear,btnexit;

	AddApplication()
	{
		setSize(1000,800);
		setTitle("Addition of two numbers");
		addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent we){System.exit(0);}});
		setLayout(null);
		Font f = new Font("Times new Roman",Font.BOLD,25);
		setFont(f);

		lblnum1 = new Label("First Number :" );
		lblnum1.setBounds(200,100,200,40);
		add(lblnum1);
		txtnum1 = new TextField();
		txtnum1.setBounds(450,100,240,40);
		add(txtnum1);

		lblnum2 = new Label("Second Number :" );
	    lblnum2.setBounds(200,190,200,40);
	    add(lblnum2);
		txtnum2 = new TextField();
	    txtnum2.setBounds(450,190,240,40);
		add(txtnum2);

		lbladd = new Label("Addition :" );
		lbladd.setBounds(200,280,200,40);
	    add(lbladd);
		txtadd = new TextField();
		txtadd.setBounds(450,280,240,40);
		add(txtadd);
	    txtadd.setEnabled(false);

	    btnadd = new Button("Add");
	    btnadd.setBounds(100,400,200,40);
	    add(btnadd);
	    btnadd.addActionListener(this);

	    btnclear = new Button("Clear");
	    btnclear.setBounds(320,400,200,40);
		add(btnclear);
		btnclear.addActionListener(this);

	    btnexit = new Button("Exit");
		btnexit.setBounds(540,400,200,40);
	    add(btnexit);
	    btnexit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnadd)
		{
			try
			{
				double num1 = Double.parseDouble(txtnum1.getText());
				double num2 = Double.parseDouble(txtnum2.getText());
				double sum = num1 + num2;
				txtadd.setText(""+sum);

			}catch(Exception ex)
			{
				txtadd.setText("Error in Data");
			}
		}
			else if(ae.getSource()==btnclear)
			{
				txtnum1.setText("");
				txtnum2.setText("");
			    txtadd.setText("");
			}
			else
			System.exit(0);

	}
}
		class ApplicationAdd
	    {
		public static void main(String Args[])
		{
			(new AddApplication()).setVisible(true);
		}

	}

