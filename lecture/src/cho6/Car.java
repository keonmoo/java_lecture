package cho6;

public class Car {
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxspeed = 350;
	int speed;
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas(){
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
				return;
			}
		}
	}
	
	Car(){
		
	}
	
	Car(String model){
		/*this.model = model;*/
		this(model,"����",250);
	}
	
	Car(String model, String color){
		/*this.model = model;
		this.color = color;*/
		this(model,color,250);
	}
	
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}

}
