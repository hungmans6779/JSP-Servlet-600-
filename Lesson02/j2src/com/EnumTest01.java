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
			System.out.println("星期一");
			break;
		case Tuesday:
			System.out.println("星期二");
			break;
		case Wednesday:
			System.out.println("星期三");
			break;
		case Thursday:
			System.out.println("星期四");
			break;
		case Friday:
			System.out.println("星期五");
			break;
		case Saturday:
			System.out.println("星期六");
			break;
		case Sunday:
			System.out.println("星期日");
			break;
		default:
			System.out.println("未定義");
			break;
		}
	}

}
