package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Standard_Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Standard_Calculator window = new Standard_Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Standard_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 355, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(12, 23, 313, 48);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace=null;
				if(txtDisplay.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() -1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setBounds(12, 95, 69, 57);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setBounds(93, 95, 69, 57);
		frame.getContentPane().add(btnClear);
		
		JButton btnPer = new JButton("%");
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPer.setBounds(175, 95, 69, 57);
		frame.getContentPane().add(btnPer);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
			}
		});
		btnDiv.setBounds(256, 95, 69, 57);
		frame.getContentPane().add(btnDiv);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setBounds(12, 165, 69, 57);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setBounds(93, 165, 69, 57);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setBounds(175, 165, 69, 57);
		frame.getContentPane().add(btn9);
		
		JButton btnMult = new JButton("*");
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		btnMult.setBounds(256, 165, 69, 57);
		frame.getContentPane().add(btnMult);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setBounds(12, 235, 69, 57);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setBounds(93, 235, 69, 57);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setBounds(175, 235, 69, 57);
		frame.getContentPane().add(btn4);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		btnSub.setBounds(256, 235, 69, 57);
		frame.getContentPane().add(btnSub);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setBounds(12, 305, 69, 57);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setBounds(93, 305, 69, 57);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setBounds(175, 305, 69, 57);
		frame.getContentPane().add(btn1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		btnPlus.setBounds(256, 305, 69, 57);
		frame.getContentPane().add(btnPlus);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btnDot.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDot.setBounds(12, 375, 69, 57);
		frame.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setBounds(93, 375, 69, 57);
		frame.getContentPane().add(btn0);
		
		JButton btnPM = new JButton("+/-");
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setBounds(175, 375, 69, 57);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				secondnum=Double.parseDouble(txtDisplay.getText());
				if(operations=="+")
				{
					result=firstnum+secondnum;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				else if(operations=="-")
				{
					result=firstnum-secondnum;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				else if(operations=="*")
				{
					result=firstnum*secondnum;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				else if(operations=="/")
				{
					result=firstnum/secondnum;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				if(operations=="%")
				{
					result=firstnum%secondnum;
					answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
			}
		});
		btnEqual.setBounds(256, 375, 69, 57);
		frame.getContentPane().add(btnEqual);
	}
}
