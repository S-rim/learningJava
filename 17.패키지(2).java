// import문
// 패키지 내에 같이 포함된 클래스는 클래스 이름으로 사용 가능.
// 만약 A class와 B class가 같은 패키지 안에 있다면 그냥 아래 처럼 사용 가능.
class A {
    B b;
}

// 만약 패키지가 다른 클래스를 사용해야 한다면
1. 패키지명이 포함된 전체 클래스 이름으로 사용
package com.mycompany;

public class Car {
    com.hankook.Tire tire = new com.hankook.Tire();
}

2. import문으로 패캐지를 지정하고 사용
package com.mycompany;

import com.hankook.Tire;
or
import com.hankook.*;

public class Car {
    Tire tire = new Tire();
}