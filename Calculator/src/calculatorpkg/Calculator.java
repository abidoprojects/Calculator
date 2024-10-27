package calculatorpkg;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;





public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Cpanel;
	private JTextField ResultField;
	private JButton btn_reversearrow; // private variable buttons for they should know each other so it is out of the class
	private JButton btn_arrow;

	
	String checkString; // Checking for the ResultField is empty or not
	int math;
	float number1;
	float number2;
	float resultnumber; // Result of the operation
	boolean checkOp = false; // Checking for the pressing = without pressing any (+,-,/,x), example: (10+2=12,pressing = again and again result will be 12+2 means (complete result + number2))
	boolean checkComma = false; // Checking if . added to the result field, example: (2.5,3.1)
	boolean checkComplexOp = false;
	
	/*
	 * Running Stuff
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Creating Frame and Other stuff
	 */
	
	public Calculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/images/icon-2.png")));
		setTitle("Abido's Calculator");
		setResizable(false);
		setForeground(SystemColor.activeCaption);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(720, 320, 400, 600);
		
		
		// Creating Panel and Settings
		Cpanel = new JPanel();
		
		Cpanel.setBackground(new Color(106, 90, 205)); 
		Cpanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Cpanel);
		Cpanel.setLayout(null);
		
		// Area of the math results shown
		ResultField = new JTextField();
		ResultField.setForeground(new Color(255, 255, 255));
		ResultField.setEditable(false);
		ResultField.setBackground(Color.decode("#2F3C7E")); 
	
		
		ResultField.setFont(new Font("Cambria", Font.BOLD, 18));
		ResultField.setHorizontalAlignment(SwingConstants.RIGHT);
		ResultField.setBounds(10, 11, 363, 61);
		
		Cpanel.add(ResultField);
		ResultField.setColumns(10);
		
		// !Starting from here adding all buttons and Settings
		
		JButton btn7 = new JButton("7");
		btn7.setHorizontalTextPosition(SwingConstants.CENTER);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn7.getText());
				
			}
		});
		btn7.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn7.setBounds(10, 187, 70, 70);
		Cpanel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn8.getText());
				
			}
		});
		btn8.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn8.setBounds(106, 187, 70, 70);
		Cpanel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn9.getText());
				
			}
		});
		btn9.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn9.setBounds(202, 187, 70, 70);
		Cpanel.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn4.getText());
				
			}
		});
		btn4.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn4.setBounds(10, 284, 70, 70);
		Cpanel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn5.getText());
				
			}
		});
		btn5.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn5.setBounds(106, 284, 70, 70);
		Cpanel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn6.getText());
				
			}
		});
		btn6.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn6.setBounds(202, 284, 70, 70);
		Cpanel.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn1.getText());
				
			}
		});
		btn1.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn1.setBounds(10, 380, 70, 70);
		Cpanel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn2.getText());
				
			}
		});
		btn2.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn2.setBounds(106, 380, 70, 70);
		Cpanel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn3.getText());
				
			}
		});
		btn3.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn3.setBounds(202, 380, 70, 70);
		Cpanel.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText(ResultField.getText() + btn0.getText());
				
			}
		});
		btn0.setFont(new Font("SansSerif", Font.BOLD, 21));
		btn0.setBounds(106, 471, 70, 70);
		Cpanel.add(btn0);
		
		// Clear method and button
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultField.setText("");
				checkComma = false;
				
			}
		});
		btn_clear.setFont(new Font("SansSerif", Font.BOLD, 19));
		btn_clear.setBounds(202, 91, 70, 70);
		Cpanel.add(btn_clear);
		
		
		// Diving method and button 
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 math = 1;
				 checkString = ResultField.getText();
					
					if (checkString.isEmpty() == false) { //!! Checking if it's empty or not, fixing some bugs
						
						number1 = Float.parseFloat(ResultField.getText());
						ResultField.setText("");
						checkOp = true;
						checkComma = false;
					}
					
					else {
						
					}
				
			}
		});
		btn_divide.setFont(new Font("SansSerif", Font.BOLD, 20));
		btn_divide.setBounds(293, 91, 70, 70);
		Cpanel.add(btn_divide);
		
		// Multiplication method and button

		JButton btn_multiplication = new JButton("X");
		btn_multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				math = 2;
				checkString = ResultField.getText();
				
				if (checkString.isEmpty() == false) { //!! Checking if it's empty or not, fixing some bugs
					
					number1 = Float.parseFloat(ResultField.getText());
					ResultField.setText("");
					checkOp = true;
					checkComma = false;
				}
				
				else {
					
				}
				
			}
		});
		
		
		btn_multiplication.setFont(new Font("SansSerif", Font.BOLD, 18));
		btn_multiplication.setBounds(293, 187, 70, 70);
		Cpanel.add(btn_multiplication);
		
		// Subtraction method and button
		
		JButton btn_substract = new JButton("-");
		btn_substract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				math = 3;
				checkString = ResultField.getText();
				
				if (checkString.isEmpty() == false) {  //!! Checking if it's empty or not, fixing some bugs
					
					number1 = Float.parseFloat(ResultField.getText());
					ResultField.setText("");
					checkOp = true;
					checkComma = false;
				}
				
				else {
					
				}
				
			}
		});
		btn_substract.setFont(new Font("SansSerif", Font.BOLD, 20));
		btn_substract.setBounds(293, 284, 70, 70);
		Cpanel.add(btn_substract);
		
		
		// Adding method and button
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				math = 4;
				checkString = ResultField.getText();
				
				if (checkString.isEmpty() == false) { //!! Checking if it's empty or not, fixing some bugs
					
					number1 = Float.parseFloat(ResultField.getText());
					ResultField.setText("");
					checkOp = true;
					checkComma = false;
					
				}
				
				else {
					
				}

			}
		});
		
		
		btn_add.setFont(new Font("SansSerif", Font.BOLD, 20));
		btn_add.setBounds(293, 380, 70, 70);
		Cpanel.add(btn_add);
		
		// Logarithm Method and button
		
		JButton btn_log = new JButton("Log");
		btn_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				math = 5;
				checkString = ResultField.getText();
				
				if (checkString.isEmpty() == false) {
					
					number1 = Float.parseFloat(ResultField.getText());
					ResultField.setText("");
					checkOp = true;
					checkComma = false;
					
				}
				
				
			}
		});
		btn_log.setVisible(false);
		btn_log.setFont(new Font("SansSerif", Font.BOLD, 18));
		btn_log.setBounds(293, 91, 70, 70);
		Cpanel.add(btn_log);
		
		
		// Getting Square method and button
		
		JButton btn_root = new JButton("√x");
		btn_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkString = ResultField.getText();
				
				if (checkString.isEmpty() == false) {
					
					number1 = Float.parseFloat(ResultField.getText());
					
					resultnumber = (float) Math.sqrt(number1);
					
					ResultField.setText(String.valueOf(resultnumber));
					
					
				}
				
			}
		});
		btn_root.setVisible(false);
		btn_root.setFont(new Font("SansSerif", Font.BOLD, 22));
		btn_root.setBounds(293, 187, 70, 70);
		Cpanel.add(btn_root);
		
		
		
		// Changing to Basic Mode
		
		btn_reversearrow = new JButton("ModB");
		btn_reversearrow.setVisible(false);
	
		btn_reversearrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				checkComplexOp = false;
				
				if (checkComplexOp == false) {
					btn_reversearrow.setVisible(false);
					btn_arrow.setVisible(true);
					
					btn_divide.setVisible(true);
					btn_log.setVisible(false);
					
					btn_multiplication.setVisible(true);
					btn_root.setVisible(false);
					
				}
				
			}
		});
		btn_reversearrow.setFont(new Font("SansSerif", Font.BOLD, 13));
		btn_reversearrow.setBounds(106, 91, 70, 70);
		Cpanel.add(btn_reversearrow);
		
		
		
		
		// Changing to Complex Mode
		
		btn_arrow = new JButton("ModC");
		btn_arrow.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				checkComplexOp = true;
				if (checkComplexOp == true) {
					btn_arrow.setVisible(false);
					btn_reversearrow.setVisible(true);
					
					btn_divide.setVisible(false);
					btn_log.setVisible(true);
					
					btn_multiplication.setVisible(false);
					btn_root.setVisible(true);
					
				}
				
			}
		});
		btn_arrow.setFont(new Font("SansSerif", Font.BOLD, 13));
		btn_arrow.setBounds(10, 91, 70, 70);
		Cpanel.add(btn_arrow);
		
		
		
		// Classic usage of point example (2.1920 + 3.1 = 5.2920)
		
		JButton btn_point = new JButton(".");
		btn_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkString = ResultField.getText();
				
				if (checkString.isEmpty() == false && checkComma == false) { //!! Checking if it's empty or not, fixing some bugs
					
					ResultField.setText(ResultField.getText() + ".");
					checkComma = true;
					
				}
				
				else {
					
				}
				
			}
		});
		btn_point.setFont(new Font("SansSerif", Font.BOLD, 25));
		btn_point.setBounds(202, 471, 70, 70);
		Cpanel.add(btn_point);
		
		// Operating Result and Showing Method
		
		JButton btn_result = new JButton("=");
		btn_result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkString = ResultField.getText();
				
				if (checkString.isEmpty() == false) { //!! Checking if it's empty or not, fixing some bugs
					
					if (math == 1) {
						
						if (checkOp == true) {
							number2 = Float.parseFloat(ResultField.getText());
							resultnumber = (number1 / number2); 
							ResultField.setText(String.valueOf(resultnumber));
							checkOp = false;
							checkComma = true;
						}
						
						else {
							
							resultnumber = Float.parseFloat(ResultField.getText());
							float reresult = resultnumber / number2;
							ResultField.setText(String.valueOf(reresult));
							
							
						}
						
					}
					
					if (math == 2) {
						
						if (checkOp == true) {
							number2 = Float.parseFloat(ResultField.getText());
							resultnumber = (number1 * number2); 
							ResultField.setText(String.valueOf(resultnumber));
							checkOp = false;
							checkComma = true;
						}
						
						else {
							
							resultnumber = Float.parseFloat(ResultField.getText());
							float reresult = resultnumber * number2;
							ResultField.setText(String.valueOf(reresult));
							
						}
						
					}
					
					if (math == 3) {
						
						if (checkOp == true) {
							number2 = Float.parseFloat(ResultField.getText());
							resultnumber = (number1 - number2); 
							ResultField.setText(String.valueOf(resultnumber));
							checkOp = false;
							checkComma = true;
						}
						
						else {
							
							resultnumber = Float.parseFloat(ResultField.getText());
							float reresult = resultnumber - number2;
							ResultField.setText(String.valueOf(reresult));
							
						}
						
					}
					
					if (math == 4) {
						
						if (checkOp == true) {
							number2 = Float.parseFloat(ResultField.getText());
							resultnumber = (number1 + number2); 
							ResultField.setText(String.valueOf(resultnumber));
							checkOp = false;
							checkComma = true;
						}
						
						else {
							
							resultnumber = Float.parseFloat(ResultField.getText());
							float reresult = resultnumber + number2;
							ResultField.setText(String.valueOf(reresult));
							
						}
						
						
						
					}
					
					if (math == 5) {
						
							number2 = Float.parseFloat(ResultField.getText());
							double logX = Math.log(number2);
							double logB = Math.log(number1);
							
							resultnumber = (float) (logX / logB);
							ResultField.setText(String.valueOf(resultnumber));
							
							checkComma = true;
							
						
					}
					
				}
				
				else { 
					
					
				}
				
			}
		});
		btn_result.setFont(new Font("SansSerif", Font.BOLD, 20));
		btn_result.setBounds(293, 476, 70, 61);
		Cpanel.add(btn_result);
		
		
	}
}
