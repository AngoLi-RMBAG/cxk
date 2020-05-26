package 鸡你太美;

import java.io.IOException;
import javax.swing.JFrame;

/**
 * 窗口
 * @author AngoLi
 */
public class GameFrame extends JFrame{

    public GameFrame(){
        // 设置标题 setTitle("内容")
        setTitle("鸡你太骚");
        // 设置大小 setSize(宽度， 高度)
        setSize(1024, 640);
        // 设置位置居中显示
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * Java程序的入口
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // 创建游戏窗体 格式： 类名 窗体名 = new 类名（）;
        GameFrame frame = new GameFrame();
        // 创建游戏面板 格式： 类名 面板名 = new 类名（）；
        GamePanel panel = new GamePanel();
        // 将面板加入到窗体中
        panel.action();
        frame.add(panel); 
        // 显示窗体 true 显示窗体，false 隐藏窗体
        frame.setVisible(true);
    }
}
