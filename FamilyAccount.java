class FamilyAccount{

	public static void main(String[] args){
		boolean isFlag = true;
		while(isFlag){
		System.out.println("----------------��ͥ��֧�������-----------------\n");
		System.out.println("		    1 ��֧��ϸ");
		System.out.println("	        	        2 �Ǽ���֧");
		System.out.println("	        	        3 �Ǽ�֮��");
		System.out.println("	        	        4 ��      ��");
		System.out.println("	        	      ��ѡ��(1-4):");
		char selection = Utility.readMenuSelection();
		switch(selection){
		case '1':
			System.out.println("	1 ��֧��ϸ");
			break;
		case '2':
			System.out.println("2 �Ǽ���֧");
			break;
		case '3':
			System.out.println("	3 �Ǽ�֮��");
			break;
		case '4':
			isFlag = false;
			break;
			}
		}
}



}




