package algorithm;



public class Test {
	
	
	public String test() {
		
		
		try {
			Thread.sleep(2000);
			
			System.out.println("시작");
			while(true) {
				int a = 2;
				
				if(a == 1) {
					
					// return하면 method를 빠져 나간다.
					return "while문 return으로 종료";
				}
				
				System.out.println("실행");
				return "return";
						
				
			}
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		return "ㅎㅇ";
				
		
	}
	
	
	
	

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.test());
		
	}
	
}
