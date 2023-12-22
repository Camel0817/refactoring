package Chapter0;

public class WhatIsRefactoring {
    /* 리팩토링이란..
    *   외부에서 보는 프로젝트 동작은 바꾸지 않고 프로그램의 내부 구조를 개선하는 것
    *
    *   목적
    *       1. 버그를 발견하기 쉽게 만든다.
    *       2. 기능을 추가하기 쉽게 만든다.
    *       3. 리뷰하기 쉽게 만든다.
    *   한계
    *       1. 프로그램이 동작하지 않을때
    *       2. 시간이 너무 촉발할 때
    *
    *   악취란 무엇인가..
    *       1. 이해하기 어려운 부분..
    *       2. 수정하기 어려운 부분..
    *       3. 확장하기 어려운 부분..
    *
    *       <리팩토링:코드 품질을 개선하는 객체지향 사고법>> 22가지 악취 - P.33
    *   악취를 나타내는 말
    *       1. 겹치잖아!
    *           중복코드가 발견 시 내는 악취
    *           메서드 추출, 클래스 추출 리팩토링
    *           null 확인이 이곳 저곳에 존재한다면 널 객체 도입
    *           에러 확인이 많다면 에러 코드를 예외로 치환
    *       2. 너무 길어!
    *           너무 긴 메서드가 내는 악취
    *           메서드 추출 리팩토링
    *           클래스에 너무 많은 메서드 시
    *           클래스 추출 리팩토링
    *
    *           너무 길다면 짧게, 너무 크다면 작게.
    *       3. 너무 많아!
    *           클래스가 방대하다고 너무 잘개 쪼갤 시 너무 많은 클래스..
    *           중개자 제거 리팩토링 or 클래스 인라인화, 메서드 인라인화 리팩토링..
    *       4. 이름이 안 맞잖아!
    *           적절한 이름이 아닐시 발생하는 악취
    *           메서드 추출 or 메서드명 변경 리팩토링
    *           설명용 변수 도입, 임시 변수 분리
    *       5. 너무 공개적이잖아!
    *           public일시 이 메서드 어디에서 쓰고있겟지? 라고 생각할수 있음
    *           메서드 뿐 아니라 필드도 마찬가지
    *           필드 캡슐화..
    *           클래스명은 변경하기 어려움
    *           그럴땐 생성자를 팩토리 메서드로 치환 클래스 명을 숨길수있음
    *       6. 객체 지향답지 않아!
    *            switch문이나 if문으로 처리를 분기한다
    *            instanceof로 객체가 속한 클래스를 조사할뿐임
    *            int만 쓰고 전용 클래스를 만들지 않음
    *            다형성을 사용합시다..
    *
    *
    *       가장 중요한것.. 객체 지향답지 않은 코드가 있다고 반드시 리팩토링해야 한다고 단정하지 않는 것
    *
    *   리팩토링 카탈로그 (http://www.refactoring.com)
    *
    *   리팩토링 에센스
    *       1. Step by Step (한번에 하나씩)
    *             1. 되돌리기 편함
    *             2. 단계마다 확인
    *             3. 오래된 걸 새로운 걸로 바꿈
    *
    * */



}
