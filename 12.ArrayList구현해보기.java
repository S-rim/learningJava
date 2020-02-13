//code.oa.gg/java8/997

// 문제 : 아래 코드가 작동하도록 해주세요.

class Main {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
        ar.add(400);
        
        ar.remove(2);
		int value = ar.get(2);
		System.out.println(value);
		
		ar.remove(0);
		value = ar.get(0);
		System.out.println(value);
		
		ar.add(78);
		value = ar.get(2);
		System.out.println(value);
	}
}

class ArrayList {
	int[] datas;
	int lastIndex = -1;
	
	ArrayList() {
		datas = new int[3];
	}
	
	void add(int data) {
		lastIndex++;
		
		if ( lastIndex >= datas.length ) {
			// 확장공사

			int[] newArr = new int[datas.length * 2];
			
			// 기존 배열을 버리기 전 새 배열로 옮기기
			for ( int i = 0; i < datas.length; i++ ) {
				newArr[i] = datas[i];
			}
			datas = newArr;
		}
		datas[lastIndex] = data;
	}
	
	int get(int index) {
		return datas[index];
	}
	
	void remove(int index) {
		for(int i = index; i < lastIndex; i++) {
			datas[i] = datas[i+1];
		}
		lastIndex--;
	}
}
