package com.my.package13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.List;

public class test1 extends JFrame {
    public test1() {
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("邮箱模拟器");

        Container c = getContentPane();
        c.setLayout(new BorderLayout());            //采用边界布局
        JPanel j1 = new JPanel();                   //创建面板JPanel
        j1.setPreferredSize(new Dimension(0, 70));//设置j1面板的高度，0代表最大
        JPanel j2 = new JPanel();
        JPanel j3 = new JPanel();
        j3.setPreferredSize(new Dimension(200, 0));//设置j3面板的宽度
        j1.setBackground(Color.LIGHT_GRAY);
        j2.setBackground(Color.WHITE);
        j3.setBackground(Color.WHITE);
        c.add(j1, BorderLayout.NORTH);//j1放北侧
        c.add(j2);
        c.add(j3, BorderLayout.EAST);//j3放东侧



        /*
        * j1区域
        * */
        j1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 7));//采用流布局
        j1.setBorder(BorderFactory.createLineBorder(Color.gray));//添加边框颜色
        JButton btn1 = new JButton("发送");
        btn1.setPreferredSize(new Dimension(55, 55));//设置按钮大小
        btn1.setFont(new Font("黑体", Font.PLAIN, 12));//按钮字体，加粗，大小
        btn1.setMargin(new Insets(0,0,0,0));//按钮中字体的边距
        JButton btn2 = new JButton("保存草稿");
        btn2.setPreferredSize(new Dimension(55, 55));
        btn2.setFont(new Font("黑体", Font.PLAIN, 12));
        btn2.setMargin(new Insets(0,0,0,0));
        JButton btn3 = new JButton("切换用户");
        btn3.setPreferredSize(new Dimension(55, 55));
        btn3.setFont(new Font("黑体", Font.PLAIN, 12));
        btn3.setMargin(new Insets(0,0,0,0));
        btn3.addActionListener(new ActionListener() {//实例化dialog类，点击切换用户按钮弹出登录界面
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog ddd = new dialog(test1.this);//传入参数为上级（类的对象）
            }
        });

        /*
        * j3区域
        * */
        j3.setLayout(new BorderLayout());//采用边界布局
        JPanel j3_j1 = new JPanel();//北部创建面板放置便签“联系人”，可添加背景色
        JLabel label1 = new JLabel("联系人");
        label1.setFont(new Font("宋体",Font.BOLD,15));
        label1.setForeground(Color.CYAN);//设置前景颜色，即字体颜色
        j3_j1.add(label1);
        j3_j1.setBackground(Color.LIGHT_GRAY);//背景颜色
        j3_j1.setBorder(BorderFactory.createLineBorder(Color.gray));//边框设置即颜色
        j3.add(j3_j1,BorderLayout.NORTH);

        JList<String> list = new JList<>();//创建列表框JList存放联系人账号
        String items[] = {"4006751066@qq.com","zhangsan@163.com","mingrisoft@mingrisoft.com","admin@qq.com","xiaoqiang@163.com"};
        DefaultListModel<String> modellist = new DefaultListModel<>();//创建列表的数据模型
        for (String tmp:items){
            modellist.addElement(tmp);//向模型循环添加元素
        }
        list.setModel(modellist);//列表框加载模型
        JScrollPane js1 = new JScrollPane(list);//为列表框添加滑动窗口
        j3.add(js1);//将滑动窗口及列表框载入容器

        JButton j3_tbn1 = new JButton("确认");
        j3.add(j3_tbn1,BorderLayout.SOUTH);//185行添加监听，将联系人添加到收件人




        /*
        * j2区域
        * */
        j2.setLayout(null);//使用绝对布局
        JLabel j2_label1 = new JLabel("发件人:");
        j2_label1.setForeground(Color.CYAN);
        j2_label1.setBounds(15,10,50,20);
        j2.add(j2_label1);

        JLabel j2_label2 = new JLabel("98765432@XXX.com");//默认发件人
        j2_label2.setBounds(70,10,150,20);
        j2.add(j2_label2);

        JLabel j2_label3 = new JLabel("收件人:");
        j2_label3.setForeground(Color.CYAN);
        j2_label3.setBounds(15,35,50,20);
        j2.add(j2_label3);

        JTextField j2_tf1 = new JTextField();//用于输入收件人账号
        j2_tf1.setBounds(70,35,600,20);
        j2.add(j2_tf1);

        JLabel j2_label4 = new JLabel("主    题:");
        j2_label4.setBounds(15,60,50,20);
        j2.add(j2_label4);

        JTextField j2_tf2 = new JTextField();//用于输入主题
        j2_tf2.setBounds(70,60,600,20);
        j2.add(j2_tf2);


        JComboBox<String> cbx = new JComboBox<>();//下拉列表框选择字体
        String[] items2 = {"宋体","黑体","楷体"};
        ComboBoxModel<String> model2 = new DefaultComboBoxModel<>(items2);
        cbx.setModel(model2);
        cbx.setBounds(70,100,75,25);

        j2.add(cbx);


        JButton j2_btn1 = new JButton();//添加监听应用字体 （监听位于行数：172)
        j2_btn1.setText("应用");
        j2_btn1.setMargin(new Insets(0,0,0,0));//设置按钮字边距
        j2_btn1.setBounds(160,100,70,25);
        j2.add(j2_btn1);

        JCheckBox cbx1 =new JCheckBox("普通邮件");//复选按钮
        cbx1.setFont(new Font("宋体",Font.PLAIN,12));
        JCheckBox cbx2 =new JCheckBox("紧急邮件");
        cbx2.setFont(new Font("宋体",Font.PLAIN,12));
        JCheckBox cbx3 =new JCheckBox("阅读回执");
        cbx3.setFont(new Font("宋体",Font.PLAIN,12));
        cbx1.setBounds(400,85,90,25);
        cbx2.setBounds(500,85,90,25);
        cbx3.setBounds(600,85,90,25);
        j2.add(cbx1);
        j2.add(cbx2);
        j2.add(cbx3);


        JRadioButton rbn1 = new JRadioButton("普通发送");//单选按钮
        rbn1.setFont(new Font("宋体",Font.PLAIN,12));
        JRadioButton rbn2 = new JRadioButton("加密发送");
        rbn2.setFont(new Font("宋体",Font.PLAIN,12));
        rbn1.setBounds(500,110,90,25);
        rbn2.setBounds(600,110,90,25);
        ButtonGroup group = new ButtonGroup();//创建按钮组限制为单选
        group.add(rbn1);//添加按钮
        group.add(rbn2);
        j2.add(rbn1);
        j2.add(rbn2);



        JLabel j2_label5 = new JLabel("内   容：");
        j2_label5.setBounds(15,280,50,20);
        j2.add(j2_label5);

        JTextArea taa = new JTextArea();//文本域
        JScrollPane js11 = new JScrollPane(taa);//为文本域添加滑动窗口
        js11.setBorder(BorderFactory.createLineBorder(Color.GRAY));//设置边框及颜色
        js11.setBounds(70,140,600,300);//存在滑动窗口时，要设置滑动窗口，而非文本域
        j2.add(js11);

        j2_btn1.addActionListener(new ActionListener() {//创建监听
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbx.getSelectedItem().equals("宋体")){
                    taa.setFont(new Font("宋体",Font.PLAIN,13));//根据下拉框选项来设置文本域的字体
                }else if (cbx.getSelectedItem().equals("楷体")){
                    taa.setFont(new Font("楷体",Font.PLAIN,13));
                }else if (cbx.getSelectedItem().equals("黑体")){
                    taa.setFont(new Font("黑体",Font.PLAIN,13));
                }

            }
        });

        j3_tbn1.addActionListener(new ActionListener() {//创建监听
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String> str = list.getSelectedValuesList();//获取列表框选中的内容
                String sum = "" ;
                for (String tmp:str){
                    sum = sum+tmp+";";
                    j2_tf1.setText(sum);//拼接多选内容为字符创并传至收件人
                }
            }
        });

        j1.add(btn1);
        j1.add(btn2);
        j1.add(btn3);

        setVisible(true);//显示窗体
    }

    public static void main(String[] args) {
        new test1();//实例化对象
    }
}
class dialog extends JDialog{

    public dialog(JFrame owner) {
        super(owner,"切换用户（正确账号/密码）",true);//继承父类，true锁定对话窗口
        setSize(300,200);
        setLocationRelativeTo(null);

        Container c = getContentPane();//获取窗体容器
        c.setLayout(null);
        JLabel label1 = new JLabel("账号：");
        label1.setBounds(30,50,40,20);
        c.add(label1);

        JTextField txt1 = new JTextField("账号");
        txt1.setBounds(80,50,180,20);
        txt1.addFocusListener(new FocusListener() {//添加焦点（光标）事件监听
            @Override
            public void focusGained(FocusEvent e) {
                txt1.setText("");
            }//获取焦点时，清空文本框

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        c.add(txt1);

        JLabel label2 = new JLabel("密码：");
        label2.setBounds(30,80,40,20);
        c.add(label2);

        JPasswordField pass = new JPasswordField();//添加密码框
        pass.setBounds(80,80,180,20);
        c.add(pass);

        JButton btn1 = new JButton("确认");
        btn1.setBounds(80,120,60,25);
        c.add(btn1);
        JButton btn2 = new JButton("取消");
        btn2.setBounds(150,120,60,25);
        c.add(btn2);


        setVisible(true);
    }

}
