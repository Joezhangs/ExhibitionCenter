package HZZX.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Customer extends JFrame implements ActionListener {

    JButton jb1, jb2, jb3, jb4, jb5;
    JPanel jp1, jp2, jp3, jp4, jp5;
    JLabel jl1;

    Customer() {

        jb1 = new JButton("会展信息查询");
        jb2 = new JButton("展馆预约");
        jb3 = new JButton("门票预定");
        jb4 = new JButton("展品采购");
        jb5 = new JButton("退出");

        jl1 = new JLabel("客户主菜单");


        Font font1 = new Font("宋体", Font.BOLD, 36);
        Font font2 = new Font("宋体", Font.BOLD, 26);
        jl1.setFont(font1);
        jb1.setFont(font2);
        jb2.setFont(font2);
        jb3.setFont(font2);
        jb4.setFont(font2);
        jb5.setFont(font2);

        jb5.addActionListener(this);


        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();

        jp1.add(jb1);
        jp1.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);

        jp4.add(jb5);

        jp3.add(jl1);

        this.add(jp3);
        this.add(jp1);
        this.add(jp2);
        this.add(jp4);

        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("会展中心管理系统");
        this.setLayout(new GridLayout(5, 1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 200, 800, 500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "退出"){
            System.exit(0);
        }
    }
}