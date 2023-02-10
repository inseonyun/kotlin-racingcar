## 요구 사항 문서

## 입력
- [x] 이름을 입력 받는다.
- [x] 시도 횟수를 입력 받는다.

### 예외 처리
#### 이름
- [x] 이름 1자 이상 5자 이하여야 한다.
- [x] 빈칸은 입력 할 수 없다.
<!-- - [ ] 쉼표를 제외한 특수문자는 입력할 수 없다. -->

#### 게임 시도 횟수
- [x] 횟수는 숫자만 입력해야 한다.
- [x] 횟수는 양의 정수여야 한다.
- [x] 빈칸은 입력 할 수 없다.

## 출력
- [x] 게임 시작 안내 문구를 출력한다.
- [x] 시도 횟수 안내 문구를 출력한다.
- [x] 라운드 결과를 출력한다.
- [x] 최종 우승자를 출력한다.

## 기능
- [x] 무작위 수를 뽑는 함수를 구현한다.
- [x] 무작위 수가 4 이상인지 확인한다.
- [x] 라운드 별 결과를 확인한다.
- [x] 우승한 자동차 이름을 반환하는 함수를 구현한다.


## 구현할 기능 목록
1. NameException 클래스
+ 이름 입력 시 발생하는 예외 처리 클래스 
- [x] checkNames - 이름들이 모두 올바른지 check
- [x] checkNameRange - 이름이 5자 초과하는지 check 
- [x] checkEmpty - 입력된 값이 빈칸인지 check
- [x] splitCarNames - 입력된 값 쉼표를 기준으로 split

2. TryCountException 클래스
+ 게임 시도 횟수 입력 시 발생하는 예외 처리 클래스
- [x] checkTryCountInteger : 시도 횟수가 숫자인지 check
- [x] checkTryCountPositive : 시도 횟수가 양의 정수인지 check

3. InputView 클래스
+ 게임 진행 시 발생하는 입력 처리 클래스
- [x] inputName : 이름을 입력 받는다 
- [x] inputTryCount : 시도 횟수를 입력 받는다

4. OutputView 클래스
+ 게임 진행 시 출력 처리 클래스
- [x] printCar : 차 이름 입력 안내 문구를 출력한다
- [x] printTryCount : 시도 횟수 안내 문구를 출력한다
- [x] printRoundResult : 라운드 결과를 출력한다
- [x] printWinner : 최종 우승자를 출력한다

5. Car 클래스
+ Car는 자동차 이름과 위치 정보를 가지는 클래스
+ String: carName, Int: position