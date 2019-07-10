package com.xxy.samrt_house.VO;

/**
 * Created by xiongxiaoyu
 * Data:2019/7/10
 * Des:
 */

public class ResponseVO {
	String[] time;
	float[] temperature;
	float[] humidity;

	public String[] getTime() {
		return time;
	}

	public void setTime(String[] time) {
		this.time = time;
	}

	public float[] getTemperature() {
		return temperature;
	}

	public void setTemperature(float[] temperature) {
		this.temperature = temperature;
	}

	public float[] getHumidity() {
		return humidity;
	}

	public void setHumidity(float[] humidity) {
		this.humidity = humidity;
	}
}
