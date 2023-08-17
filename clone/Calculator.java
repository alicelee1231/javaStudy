package com.cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Calculator extends JFrame {
    public JTextField inputSpace = new JTextField();
    public GridBagLayout grid = new GridBagLayout();

    public Calculator(){
        setLayout(null);

        //값입력하는 공간 설정
        inputSpace = new JTextField();
        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.WHITE);
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);
        inputSpace.setFont(new Font("Times", Font.BOLD,50));
        inputSpace.setBounds(8,10,270,70); //x:8, y:10 위치 270*70크기

        //버튼 공간 설정
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4,10,10));
        buttonPanel.setBounds(8,90,270,235); //x:8, y:90 위치 270*235크기

        //버튼에 들어갈 글자 배열
        String button_names[] = {"C", "+","+","=","7","8","9","x","4","5","6","-","1","2","3","0"};

        JButton buttons[] = new JButton[button_names.length];

        for(int i =0; i<button_names.length; i++){
            buttons[i] = new JButton(button_names[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD,20));

            //버튼 색상 지정
            if(button_names[i] == "C"){buttons[i].setBackground(Color.red);}
            else if((i>=4 && i<=6) || (i >=8 && i <=10) || (i >=12 && i <=14)){
                buttons[i].setBackground(Color.black);
            }else{buttons[i].setBackground(Color.gray);}

            buttons[i].setForeground(Color.white);
            buttons[i].setBorderPainted(false);

            buttonPanel.add(buttons[i]);
            buttons[i].setOpaque(true);//맥에서 배경색이 먹지 않는것을 해결
        }

        //JFrame에 추가
        add(inputSpace);
        add(buttonPanel);

        setTitle("계산기");
        setVisible(true);
        setSize(300,370);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창을 닫을 때 실행중인 프로그램도 종료
    }

    public static void main(String[]args){
        new Calculator();
    }
}