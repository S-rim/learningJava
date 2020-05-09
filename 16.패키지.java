// 패키지란?
// 클래스를 기능별로 묶어서 그룹 이름을 붙여 놓은 것.
// 폴더와 비슷한 개념.

// 패키지는 클래스 이름의 일부임.
// 전체 클래스 이름 = 상위패키지.하위패키지.클래스
// 클래스 명이 같다고해서 같은 클래스가 아닌거임.

// 클래스를 선언할 때 패키지가 결정됨.
// 클래스 선언 시 포함될 패키지도 선언해줘야함. 맨 첫줄에.
// 클래스 파일은 선언된 패키지와 동일한 폴더 안에서만 작동. 다르면 동작X.
package 상위패키지.하위패키지;

public class ClassName {

}


// 전부 알파벳 소문자로 작성하는 것이 관례.
// 숫자로 시작X. $,_를 제외한 특수 문자 사용금지.
// 회사 도메인의 역순으로 보통 만듦.
ex) package com.samsung.projectname


// 패키지 선언이 포함된 클래스 컴파일은
javac -d [패키지가 생성될 위치] XXX.javac
// 예시
javac -d ClassName.java -> 현태 폴더 내에 생성.
javac -d ./bin ClassName.java -> 현재 폴더와 같은 위치의 bin 폴더에 생성.


// 패키지 선언이 포함된 클래스 실행은 상위 패키지가 시작하는 곳에서 실행해줘야함.
javac parentpackage.childpackage.ClassName
// ClassName의 클래스.
// 하위패키지 childpackage.
// 상위패키지 parentpackage이므로
// parentpackage에서 실행해줘야함.