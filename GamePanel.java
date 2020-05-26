package 鸡你太美;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 * 鸡你太美面板
 * @author AngoLi
 */
public class GamePanel extends JPanel{
    // 定义背景图片
    BufferedImage bg;
    // BufferedImage KKbg;
    KunKun kk;
    public GamePanel() throws IOException{
        this.kk = new KunKun();
        try {
            // 2.调用读取图片的工具，读取图片
            bg = ImageUtil.getImg("/坤坤战记IMG/CXK/timg.jpg");
            // KKbg = ImageUtil.getImg("/坤坤战记IMG/CXK/21.png");
        } catch (IOException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g); 
        // 设置游戏背景图
        g.drawImage(bg,0, 0, 1024,680,null);
        
        // g.drawImage(KKbg,300, 390, KKbg.getWidth()/2,KKbg.getHeight()/2,null);
        
        // 画坤坤
        g.drawImage(kk.img, kk.x, kk.y, kk.w,kk.h,null);
    }
    /**
     * 开始游戏的方法
     */
    public void action(){
        new Thread(){
            @Override
            public void run(){
                // 让坤坤移动
                // 死循环，坤坤一直移动
                while(true){
                    kk.x-=5;
                    kk.changeImage();
                    try {
                        // 线程休眠，让坤坤移动一次，休息一次
                        Thread.sleep(200);
                        // 重新调用paint方法
                        repaint();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }
}

