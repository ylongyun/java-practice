class FamilyAccount{

	public static void main(String[] args){
		boolean isFlag = true;
		while(isFlag){
		System.out.println("----------------家庭收支记账软件-----------------\n");
		System.out.println("		    1 收支明细");
		System.out.println("	        	        2 登记收支");
		System.out.println("	        	        3 登记之初");
		System.out.println("	        	        4 退      出");
		System.out.println("	        	      请选择(1-4):");
		char selection = Utility.readMenuSelection();
		switch(selection){
		case '1':
			System.out.println("	1 收支明细");
			break;
		case '2':
			System.out.println("2 登记收支");
			break;
		case '3':
			System.out.println("	3 登记之初");
			break;
		case '4':
			isFlag = false;
			break;
			}
		}
}



}




