package oop.basic.chap05;

import java.text.SimpleDateFormat;

public class ShopCustomerTest {

	public static void main(String[] args) {
		ShopCustomer c = new ShopCustomer();
		c.name = "김지한";
		c.addr = "서울";
		c.age = 29;
		c.nickName = "IsKJH";
		c.gender = "male";
		System.out.println("이름: " + c.name);
		System.out.println("주소: " + c.addr);
		System.out.println("나이: " + c.age);
		System.out.println("별명: " + c.nickName);
		System.out.println("성별: " + c.gender);

	}

}
