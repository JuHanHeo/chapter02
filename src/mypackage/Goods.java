package mypackage;

public class Goods {
	
	public static int countOfGoods;
	
	public String name;
	public int price;
	public int countStock;
	public int countSold;
	
	public Goods(){
		Goods.countOfGoods++;
	}
	public void setCountSold(int countSold){
		this.countSold = countSold;
	}
	
	public void showInfo(){
		System.out.println("이름 : "+name+", 가격 : "+price);
		
	}

}
