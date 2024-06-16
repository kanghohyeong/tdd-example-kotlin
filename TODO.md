### 다중 통화 지원
> 테스트 주도 개발의 다중 통화 예제 by 켄트 벡

- $5 + 10CHF = $10 
  - 통화가 다른 두 금액을 더해서 주어진 환율에 맞게 변한 금액을 결과로 얻을 수 있어야 한다
- ~~$5 * 2 = $10~~
  - 어떤 금액(주가)을 어떤 수(주식의 수)에 곱한 금액을 결과로 얻을 수 있어야 한다.
- amount를 private 로 만들기
- ~~Dollar 사이드 이팩트?~~
  - 연산(times)를 수행하면 Dollar 내부 상태 값(amount)이 바뀐다. 
  - 5 달러로 생성한 Dollar 객체는 연산을 하는 순간 5달러가 아니게 된다. 
- Money 반올림?
- ~~equals()~~
  - Dollar 객체는 값 객체이므로 동등성을 보장하는 로직이 있어야함
- hashCode()
  - 해시 테이블의 키로 쓰려면 구현해야함
- equal null
- equal object

## 교훈
- 설계를 어떻게 할지 떠오르지 않는다면 삼각측량 사용
- 우리의 디자인 패턴(값 객체)이 하나의 또 다른 오퍼레이션을 암시한다