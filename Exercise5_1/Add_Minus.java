package Exercise5_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_Minus {

	private JFrame frame;
	private JTextField Int1TextField;
	private JTextField Int2TextField;
	private JTextField AnswerTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Minus window = new Add_Minus();
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
	public Add_Minus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 780, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Int1TextField = new JTextField();
		Int1TextField.setBackground(Color.WHITE);
		Int1TextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		Int1TextField.setText("35");
		Int1TextField.setBounds(144, 103, 170, 40);
		frame.getContentPane().add(Int1TextField);
		Int1TextField.setColumns(10);
		
		Int2TextField = new JTextField();
		Int2TextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		Int2TextField.setText("28");
		Int2TextField.setBounds(451, 103, 170, 40);
		frame.getContentPane().add(Int2TextField);
		Int2TextField.setColumns(10);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int x = Integer.parseInt(Int1TextField.getText());
					int y = Integer.parseInt(Int2TextField.getText());
					int answer = x + y;
					
					AnswerTextField.setText(Integer.toString(answer));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error! \nPlease try again.");
				}
			}
		});
		AddButton.setBackground(new Color(100, 149, 237));
		AddButton.setForeground(Color.BLACK);
		AddButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		AddButton.setBounds(144, 200, 170, 40);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("Minus");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int x = Integer.parseInt(Int1TextField.getText());
					int y = Integer.parseInt(Int2TextField.getText());
					int answer = x - y;
					
					AnswerTextField.setText(Integer.toString(answer));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error! \nPlease try again.");
				}
			}
		});
		MinusButton.setBackground(new Color(100, 149, 237));
		MinusButton.setForeground(Color.BLACK);
		MinusButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		MinusButton.setBounds(451, 200, 170, 40);
		frame.getContentPane().add(MinusButton);
		
		JLabel AnswerLabel = new JLabel("The Answer is");
		AnswerLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		AnswerLabel.setBounds(144, 313, 170, 40);
		frame.getContentPane().add(AnswerLabel);
		
		AnswerTextField = new JTextField();
		AnswerTextField.setBackground(Color.WHITE);
		AnswerTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		AnswerTextField.setBounds(451, 312, 170, 40);
		frame.getContentPane().add(AnswerTextField);
		AnswerTextField.setColumns(10);
	}

}
