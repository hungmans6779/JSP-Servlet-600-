package com;

public class EnumTest01 {

	public enum week {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//weekSel(week.Thursday);
		
		week [] weekArray=week.values();
		for(week w:weekArray){
		  weekSel(w);	
		}
	}

	public static void weekSel(week w) {
		switch (w) {
		case Monday:
			System.out.println("�P���@");
			break;
		case Tuesday:
			System.out.println("�P���G");
			break;
		case Wednesday:
			System.out.println("�P���T");
			break;
		case Thursday:
			System.out.println("�P���|");
			break;
		case Friday:
			System.out.println("�P����");
			break;
		case Saturday:
			System.out.println("�P����");
			break;
		case Sunday:
			System.out.println("�P����");
			break;
		default:
			System.out.println("���w�q");
			break;
		}
	}

}
