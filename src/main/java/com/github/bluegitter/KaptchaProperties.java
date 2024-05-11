package com.github.bluegitter;

public class KaptchaProperties {
	/**
	 * 默认生成图形验证码宽度
	 */
	private String imageWidth = "120";

	/**
	 * 默认生成图像验证码高度
	 */
	private String imageHeight = "38";

	/**
	 * 边框颜色，合法值： r,g,b (and optional alpha) 或者 white,black,blue.
	 */
	private String colorFont = "black";

	/**
	 * 图片边框
	 */
	private String imageBorder = "no";

	/**
	 * 默认图片间隔
	 */
	private String charSpace = "5";
	/**
	 * 验证码文字大小
	 */
	private String imageFontSize = "30";

	/**
	 * 降噪颜色
	 */
	private String noiseColor = "black";

	/**
	 * 降噪实现类(com.google.code.kaptcha.impl.NoNoise)
	 */
	private String noiseImpl = "com.google.code.kaptcha.impl.DefaultNoise";
	/**
	 * 验证码实现类
	 */
	private String textproducerImplValue = "com.github.bluegitter.CustomTextCreator";

	/**
	 * 验证码长度
	 */
	private String codeLength = "5";

	/**
	 * 最大长度
	 */
	private  int maxLength = 5 ;	
	
	
	/**
	 * 最小长度
	 */
	private  int minLength = 2 ;	
	/**
	 * 图片清晰度
	 */
	private String legibility = "";
	
	public String getCodeLength() {
		return codeLength;
	}
	
	public String getLegibility() {
		CustomerLegibilityLevel customerLegibilityLevel;
	    try {
	        customerLegibilityLevel = CustomerLegibilityLevel.valueOf(this.legibility.toUpperCase());
	    } catch (IllegalArgumentException e) {
	        customerLegibilityLevel = CustomerLegibilityLevel.DEFAULT;
	    }
	    return customerLegibilityLevel.getObscurificatorImpl();

	}

	public String getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(String imageWidth) {
		this.imageWidth = imageWidth;
	}

	public String getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(String imageHeight) {
		this.imageHeight = imageHeight;
	}

	public String getColorFont() {
		return colorFont;
	}

	public void setColorFont(String colorFont) {
		this.colorFont = colorFont;
	}

	public String getImageBorder() {
		return imageBorder;
	}

	public void setImageBorder(String imageBorder) {
		this.imageBorder = imageBorder;
	}

	public String getCharSpace() {
		return charSpace;
	}

	public void setCharSpace(String charSpace) {
		this.charSpace = charSpace;
	}

	public String getImageFontSize() {
		return imageFontSize;
	}

	public void setImageFontSize(String imageFontSize) {
		this.imageFontSize = imageFontSize;
	}

	public String getNoiseColor() {
		return noiseColor;
	}

	public void setNoiseColor(String noiseColor) {
		this.noiseColor = noiseColor;
	}

	public String getNoiseImpl() {
		return noiseImpl;
	}

	public void setNoiseImpl(String noiseImpl) {
		this.noiseImpl = noiseImpl;
	}

	public String getTextproducerImplValue() {
		return textproducerImplValue;
	}

	public void setTextproducerImplValue(String textproducerImplValue) {
		this.textproducerImplValue = textproducerImplValue;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}

	public int getMinLength() {
		return minLength;
	}

	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}
}