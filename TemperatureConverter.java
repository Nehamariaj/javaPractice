package lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener{
	private JTextField CelsiusTextField;   //TextField is the place where you input values.Declaring text field
	private JTextField FahrenheitTextField;
	TemperatureConverter(){
		//setting frame properties
		setTitle("Temperature Coverter");  //to set title of the window
		setSize(300,150); //to set the size of window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to set an 'X' which when pressed closes the window
		
		//Create JPanel
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3,2)); //to create a grid of 3 rows and 2 columns
		
		//Create and add Components
		JLabel celsiusLabel=new JLabel(" Celsius");
		CelsiusTextField =new JTextField();   //creating TextField
		JLabel fahrenheitLabel=new JLabel(" Fahrenheit");
		FahrenheitTextField =new JTextField();
		FahrenheitTextField.setEditable(false);//we cannot write into this text field only output will be shown
		JButton convertButton=new JButton("Convert");//creating button
		
		//Register the button with actionListner
		convertButton.addActionListener(this);
		
		//adding all components to panel
		panel.add(celsiusLabel);//position- 1st row 1st column
		panel.add(CelsiusTextField);//position- 1st row 2nd column
		panel.add(fahrenheitLabel);//position- 2nd row 1st column
		panel.add(FahrenheitTextField);//position- 2nd row 2nd column
		panel.add(new JLabel()); //to create a blank space at position 3rd row 1st column
		panel.add(convertButton);//position- 3rd row 2nd column
		
		add(panel); //to add all the above components to a panel
	}
	public static void main(String [] args) {
		TemperatureConverter converter=new TemperatureConverter();
		converter.setVisible(true);  //to make the panel visible
	}
	
	public void actionPerformed(ActionEvent e) {
		double celsius=Double.parseDouble(CelsiusTextField.getText());//since the input is in string form we convert it to double
		double Fahrenheit=(celsius*9/5)+32;
		FahrenheitTextField.setText(String.format("%.2f",Fahrenheit));
	}
}
