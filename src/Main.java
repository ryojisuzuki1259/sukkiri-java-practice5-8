
public class Main {
	public static double calcTriangleArea(double bottom, double height) {
		double x = (bottom * height) /2;
		return x;

	}

	public static double calcCircleArea(double radius) {
		double y = radius * radius * 3.14;
		return y;
	}

	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double x = calcTriangleArea(bottom, height);

		double radius = 5.0;
		double y = calcCircleArea(radius);

		System.out.println("三角形の底辺の長さが" + bottom +
				"㎝、高さが" + height + "㎝の場合、面積は" + x + "㎠");
		System.out.println("円の半径が" + radius + "㎝の場合、面積は" + y + "㎠");
	}

}
