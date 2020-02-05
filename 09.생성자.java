// 생성자, this

class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		System.out.println(a사람.나이);
		// 출력 : 20
	}
}

class 사람 {
	
  int 나이;

  사람()
  {
      this.나이 = 20;
  }
}


class Main {
	public static void main(String[] args) {
		
    사람 a사람 = new 사람();

    int a사람의_왼팔_길이 = a사람.a왼팔.길이;

		System.out.println(a사람의_왼팔_길이 + "cm");
	}
}

class 사람 {
  팔 a왼팔 = new 팔();
}

class 팔 {
  int 길이;
  팔()
  {
    this.길이 = 50;
  }
}