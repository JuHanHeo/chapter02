package chapter02;

import mypackage.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400000;
		camera.countStock = 30;
		camera.countSold = 50;
		

		System.out.println(camera);
		System.out.println("이름 : " + camera.name + ", 가격 : " + camera.price);

	}

}
