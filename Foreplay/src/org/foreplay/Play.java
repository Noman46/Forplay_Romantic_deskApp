package org.foreplay;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Play extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private CardLayout card;
	private JTextField text1;
	private JTextField text2;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JLabel label3;
	private JLabel label4;
	private int his;
	private int her;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Play frame = new Play();
					frame.setVisible(true);
					frame.setTitle(" FOREPLAY");
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Play() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		card= new CardLayout();
		contentPane.setLayout(card);
		
		
		//-------------------------------------------- First Pannel-----------------------------------------------
		
		JPanel first = new JPanel();
		contentPane.add(first, "first");
		first.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You wanna make love, Click below");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 442, 67);
		first.add(lblNewLabel);
		
		label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/love.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(70, 89, 330, 210);
		first.add(label);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				card.show(contentPane, "second");
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(181, 310, 89, 32);
		first.add(btnNewButton);
		
		
		//------------------------------------------- Second Pannel------------------------------------------------
		JPanel second = new JPanel();
		contentPane.add(second, "second");
		second.setLayout(null);
		
		JLabel hername = new JLabel("Enter Her name:");
		hername.setFont(new Font("Tahoma", Font.BOLD, 16));
		hername.setBounds(10, 161, 185, 31);
		second.add(hername);
		
		JLabel Hisname = new JLabel("Enter Your Name:");
		Hisname.setFont(new Font("Tahoma", Font.BOLD, 16));
		Hisname.setBounds(10, 87, 185, 31);
		second.add(Hisname);
		
		text1 = new JTextField();
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setFont(new Font("Tahoma", Font.BOLD, 14));
		text1.setBounds(212, 87, 199, 31);
		second.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setFont(new Font("Tahoma", Font.BOLD, 14));
		text2.setBounds(212, 161, 199, 31);
		second.add(text2);
		text2.setColumns(10);
		
		JButton play = new JButton("PLAY");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hubby_name = text1.getText();
				String baby_name = text2.getText();
				label3.setText(hubby_name +" Role your Dice");
				label4.setText(baby_name +" Role your Dice now");
				
				card.show(contentPane, "last");
				
				
			}
		});
		play.setForeground(Color.RED);
		play.setFont(new Font("Tahoma", Font.BOLD, 16));
		play.setBounds(179, 277, 116, 43);
		second.add(play);
		
		
		
		//--------------------------------------------last Pannel--------------------------------------------------
		JPanel last = new JPanel();
		contentPane.add(last, "last");
		last.setLayout(null);
		
		label3 = new JLabel("");
		label3.setForeground(Color.RED);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		label3.setBounds(93, 68, 313, 35);
		last.add(label3);
		
		JButton btnNewButton_1 = new JButton("Role");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    his = 1+ (int)(Math.random()*4);
				t1.setText(String.valueOf(his));
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(10, 114, 69, 40);
		last.add(btnNewButton_1);
		
		t1 = new JTextField();
		t1.setEditable(false);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("Tahoma", Font.BOLD, 14));
		t1.setBounds(107, 126, 299, 20);
		last.add(t1);
		t1.setColumns(10);
		
		label4 = new JLabel("");
		label4.setForeground(Color.RED);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		label4.setBounds(93, 184, 313, 35);
		last.add(label4);
		
		JButton btnNewButton_2 = new JButton("Role");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 her = 1+ (int)(Math.random()*4);
					t2.setText(String.valueOf(her));
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(10, 226, 69, 40);
		last.add(btnNewButton_2);
		
		t2 = new JTextField();
		t2.setEditable(false);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("Tahoma", Font.BOLD, 14));
		t2.setColumns(10);
		t2.setBounds(107, 230, 299, 20);
		last.add(t2);
		
		JButton btnNewButton_3 = new JButton("DO");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(his==1 && her==1) {
					t3.setText("Kiss on her NECK");
				}
				else if(his==1 && her==2) {
					t3.setText("Kiss on Her FORHEAD");
				}
				else if(his==1 && her==3) {
					t3.setText("Kiss on Her LIP");
				}
				else if(his==1 && her==4) {
					t3.setText("Kiss on Her NOSE");
				}
				else if(his==2 && her==1) {
					t3.setText("Hug her in a RESTAURANT");
				}
				else if(his==2 && her==2) {
					t3.setText("Hug her Very Tight");
				}
				else if(his==2 && her==3) {
					t3.setText("Hug her in a public BUS");
				}
				else if(his==2 && her==4) {
					t3.setText("Hug her In front of Your Parents");
				}
				else if(his==3 && her==1) {
					t3.setText("Take Her On Your Lap");
				}
				else if(his==3 && her==2) {
					t3.setText("Say 10 Beautiful Words To Describe Her");
				}
				else if(his==3 && her==3) {
					t3.setText("Wisper I LOVE YOU Into her ears ");
				}
				else if(his==3 && her==4) {
					t3.setText("Buy Her an Icecream");
				}
				else if(his==4 && her==1) {
					t3.setText("Pinch On Her Nose");
				}
				else if(his==4 && her==2) {
					t3.setText("Pinc At her West");
				}
				else if(his==4 && her==3) {
					t3.setText("Give Randome Kiss");
				}
				else if(his==4 && her==4) {
					t3.setText("Make Something For Her");
				}
				
				else
					t3.setText("Play Again");
			}
		});
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(10, 277, 69, 40);
		last.add(btnNewButton_3);
		
		t3 = new JTextField();
		t3.setEditable(false);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setForeground(Color.DARK_GRAY);
		t3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		t3.setColumns(10);
		t3.setBounds(107, 277, 299, 20);
		last.add(t3);
		
		JButton btnNewButton_4 = new JButton("Refresh");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setBounds(351, 322, 89, 23);
		last.add(btnNewButton_4);
	}
}
