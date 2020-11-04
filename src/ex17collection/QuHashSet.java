package ex17collection;

import java.util.HashSet;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}

	/*
	 객체에게 부여된 주소값(참조값)을 숫자형태로 반환해주는 메소드
	 */
	@Override
	public int hashCode() {
		int hc1=name.hashCode();
		int hc2=heroName.hashCode();
		int hc3=weapon.hashCode();
		System.out.println(hc1+" "+hc2+" "+hc3);
		/*
		 해당 객체가 보유한 모든 멤버변수를 이용해서 해시값을 구하고
		 연산(사칙연산 뭐든지..)하여 결과를 반환하면 된다.
		 */
		return hc1+hc2+hc3;
	}
	/*
	 객체의 내용을 비교하여 동일한지 여부를 판단하는 메소드
	 */
	@Override
	public boolean equals(Object obj) {
		Avengers avengers=(Avengers)obj;
		if (this.heroName.equals(avengers.heroName)
				&&this.name.equals(avengers.name)
				&&this.weapon.equals(avengers.weapon)) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
	}
}
