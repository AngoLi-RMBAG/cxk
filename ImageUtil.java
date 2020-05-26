package 鸡你太美;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * 可重复的工具方法
 * @author AngoLi
 */
public class ImageUtil {
    /**
     * 根据图片的路径读取图片
     * @param path 图片的路径
     * @return 
     * @throws java.io.IOException 
     */
    public static BufferedImage getImg(String path) throws IOException{
        // 加载图片
        try{
            BufferedImage img = ImageIO.read(ImageUtil.class.getResource(path));
            return img;
        }catch(IOException e){
            // 会输出找不到的原因
            e.printStackTrace();
        }
        return null;
    }
}
