package com.homework;

public class Point {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void move(int offsetX, int offsetY) {
		setX(offsetX);
		setY(offsetY);
	}
	public double distance(Point point) {
		return Math.sqrt(Math.pow(point.x, 2)+Math.pow(point.y,2));
	}
}
