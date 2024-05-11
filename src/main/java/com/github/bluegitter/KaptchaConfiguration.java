package com.github.bluegitter;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;


import java.util.Properties;


public class KaptchaConfiguration {

	// 图片边框，合法值：yes , no
	private static final String KAPTCHA_BORDER = "kaptcha.border";
	// 字体颜色，合法值： r,g,b 或者 white,black,blue
	private static final String KAPTCHA_TEXTPRODUCER_FONT_COLOR = "kaptcha.textproducer.font.color";
	// 文字间隔
	private static final String KAPTCHA_TEXTPRODUCER_CHAR_SPACE = "kaptcha.textproducer.char.space";
	// 图片宽
	private static final String KAPTCHA_IMAGE_WIDTH = "kaptcha.image.width";
	// 图片高
	private static final String KAPTCHA_IMAGE_HEIGHT = "kaptcha.image.height";
	// 验证码长度
	private static final String KAPTCHA_TEXTPRODUCER_CHAR_LENGTH = "kaptcha.textproducer.char.length";
	// 字体大小
	private static final Object KAPTCHA_IMAGE_FONT_SIZE = "kaptcha.textproducer.font.size";
	// 降噪颜色
	private static final String KAPTCHA_NOISE_COLOR = "kaptcha.noise.color";
	// 降噪实现类
	private static final String KAPTCHA_NOISE_IMPL = "kaptcha.noise.impl";
	// 文本实现类
	private static final String KAPTCHA_TEXTPRODUCER_IMPL = "kaptcha.textproducer.impl";
	
	private static final String KAPTCHA_OBSCURIFICATOR_IMPL="kaptcha.obscurificator.impl" ;
	
	public DefaultKaptcha producer(KaptchaProperties kaptchaProperties) {
		Properties properties = new Properties();
		// 图片边框，合法值：yes , no
		properties.put(KAPTCHA_BORDER, kaptchaProperties.getImageBorder());
		// 字体颜色，合法值： r,g,b 或者 white,black,blue
		properties.put(KAPTCHA_TEXTPRODUCER_FONT_COLOR, kaptchaProperties.getColorFont());
		// 文字间隔
		properties.put(KAPTCHA_TEXTPRODUCER_CHAR_SPACE, kaptchaProperties.getCharSpace());
		// 图片宽
		properties.put(KAPTCHA_IMAGE_WIDTH, kaptchaProperties.getImageWidth());
		// 图片高
		properties.put(KAPTCHA_IMAGE_HEIGHT, kaptchaProperties.getImageHeight());
		// 字体大小
		properties.put(KAPTCHA_IMAGE_FONT_SIZE, kaptchaProperties.getImageFontSize());
		// 验证码长度
		properties.put(KAPTCHA_TEXTPRODUCER_CHAR_LENGTH, kaptchaProperties.getCodeLength());
		// 文本实现类
		properties.put(KAPTCHA_TEXTPRODUCER_IMPL, kaptchaProperties.getTextproducerImplValue());
		// 降噪颜色
		properties.put(KAPTCHA_NOISE_COLOR, kaptchaProperties.getNoiseColor());
		// 降噪实现类
		properties.put(KAPTCHA_NOISE_IMPL, kaptchaProperties.getNoiseImpl());
		//图片样式
		properties.put(KAPTCHA_OBSCURIFICATOR_IMPL, kaptchaProperties.getLegibility());
		Config config = new Config(properties);
		DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
		defaultKaptcha.setConfig(config);
		return defaultKaptcha;
	}
}
