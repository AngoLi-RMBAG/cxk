package 鸡你太美;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 坤坤的行为
 * @author AngoLi
 */
public class KunKun {
    BufferedImage img;
    int x; // 坤坤的横坐标
    int y; // 坤坤的纵坐标
    int w; // 坤坤的宽度
    int h; // 坤坤的高度
    private int index = 0;
    // 定义一个数组，用来存放所有的移动动画图片的数组
    BufferedImage[] all = new BufferedImage[49];
    /**
     * 构造方法
     * @throws java.io.IOException
     */
    public KunKun() throws IOException{
        // 加载坤坤的动画图片
        for(int i=0; i < all.length; i++){
            all[i] = ImageUtil.getImg("/坤坤战记IMG/CXK/"+(i+1)+".png");
        }
        // 读取坤坤的图片
        img = ImageUtil.getImg("/坤坤战记IMG/CXK/1.png");
        // 规定游戏开始时，坤坤显示的位置
        x = 800;
        y = 200;
        // 规定游戏开始时，坤坤的大小
        w = img.getWidth()*3/4;
        h = img.getHeight()*3/4;
    }
    public void changeImage(){
        index++;
        img = all[index%49];
        }
    }  