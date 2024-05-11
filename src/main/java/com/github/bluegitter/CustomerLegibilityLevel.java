package com.github.bluegitter;

public enum CustomerLegibilityLevel {
	HIGH("com.github.bluegitter.CustomWaterRipple"), MEDIUM("com.google.code.kaptcha.impl.ShadowGimpy"),
	LOW("com.google.code.kaptcha.impl.FishEyeGimpy"), DEFAULT("com.google.code.kaptcha.impl.WaterRipple");

	private final String obscurificatorImpl;

	CustomerLegibilityLevel(String obscurificatorImpl) {
		this.obscurificatorImpl = obscurificatorImpl;
	}

	public String getObscurificatorImpl() {
		return this.obscurificatorImpl;
	}
}