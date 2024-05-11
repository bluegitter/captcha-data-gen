package com.github.bluegitter;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 请添加类的描述信息.
 *
 * @author bluegitter
 * @history 2024/5/12 13:00 bluegitter 新建
 * @since JDK1.8
 */
public class Main {
    private static final String JPEG = "jpeg";

    public static void main(String[] args) throws IOException {
        KaptchaConfiguration configuration = new KaptchaConfiguration();
        DefaultKaptcha producer  =  new DefaultKaptcha();

        KaptchaProperties properties = new KaptchaProperties();
        DefaultKaptcha config  = configuration.producer(properties);
        producer.setConfig(config.getConfig());

        for (int i = 0; i< 10; i++) {
            String text = producer.createText();
            BufferedImage image = producer.createImage(text);

            // 转换流信息写出
            FileOutputStream os = new FileOutputStream("./data/" + text + ".jpeg");
            try {
                ImageIO.write(image, JPEG, os);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                os.close();
            }

            if (i % 1000 == 0)
                System.out.println(i);
        }
    }
}
