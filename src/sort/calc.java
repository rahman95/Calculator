package sort;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc frame = new calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 438);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 387, 79);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 101, 89, 63);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("4");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(10, 175, 89, 63);
		contentPane.add(button);
		
		JButton button_1 = new JButton("1");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(10, 249, 89, 63);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(109, 101, 89, 63);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(208, 101, 89, 63);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(109, 175, 89, 63);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(208, 175, 89, 63);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(109, 249, 89, 63);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(208, 249, 89, 63);
		contentPane.add(button_7);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(308, 101, 89, 43);
		contentPane.add(btnNewButton_1);
		
		JButton button_8 = new JButton("-");
		button_8.setForeground(Color.RED);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_8.setBounds(307, 158, 89, 43);
		contentPane.add(button_8);
		
		JButton btnX = new JButton("x");
		btnX.setForeground(Color.RED);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnX.setBounds(307, 215, 89, 43);
		contentPane.add(btnX);
		
		JButton button_9 = new JButton("/");
		button_9.setForeground(Color.RED);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_9.setBounds(307, 269, 89, 43);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.setBounds(10, 323, 89, 63);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton(".");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_11.setBounds(109, 323, 89, 63);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.setForeground(Color.BLUE);
		button_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_12.setBounds(208, 323, 189, 63);
		contentPane.add(button_12);
	}
}
