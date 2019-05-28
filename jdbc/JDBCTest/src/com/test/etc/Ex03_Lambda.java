package com.test.etc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex03_Lambda {
	
	public static void main(String[] args) {
		
		//표준 API 함수적(형) 인터페이스
		// - 람다식에서 사용하기 위해 만들어진 인터페이스 모음
		// - JDK 1.8부터(람다식)
		// - java.util.function
		
		//표준 API 함수적 인터페이스 종류
		// - 추상 메소드 1개(******) > 그래야 람다식에서 사용할 수 있으니까
		//1. Consumer : 매개변수 O, 반환값 X
		//2. Supplier : 매개변수 X, 반환값 O
		//3. Function : 매개변수 O, 반환값 O, 주로 매개변수 값을 반환값 타입으로 변환후 반환
		//4. Operator : 매개변수 O, 반환값 O, 주로 매개변수 값을 연산 후 결과값을 반환
		//5. Predicate : 매개변수 O, 반환값 O, 주로 매개변수 값을 조사 후 논리값을 반환
		
//		m1();
//		m2();
		m3();
//		m4();
//		m5();
		
//		m6();
		
	}

	private static void m6() {
		
		//5종류의 함수형 인터페이스 + 조합
		
		//A.andThen(B)
		// - 독립적으로 존재하는 기존 메소드들을 여러 조합을 통해서 단순화하는 역할
		
		
		//A.compose(B)
		// - 
		
		
		Consumer<User> c1 = user -> System.out.println(user.getName());
		Consumer<User> c2 = user -> System.out.println(user.getAge());
		
		//요구사항] 유저객체의 이름 출력 + 나이 출력
		User u1 = new User("홍길동", 20);
		
		c1.accept(u1);
		c2.accept(u1);
		
		
		Consumer<User> c3 = c1.andThen(c2); //메소드 = 메소드 + 메소드
		c3.accept(u1);
		System.out.println();
		
		Consumer<User> c4 = c2.andThen(c1);
		c4.accept(u1);
		System.out.println();
		
		Consumer<User> c5 = user -> System.out.println(user.getName() + ":" + user.getAge());
		
		Consumer<User> c6 = c1.andThen(c2.andThen(c5));
		c6.accept(u1);
		
		
		//Function
		Function<User, Integer> f1 = user -> user.getAge();
		
		Function<Integer, String> f2 = n -> n >= 19 ? "합격" : "불합격";
		
		int age = f1.apply(u1);
		System.out.println(age);
		
		String result = f2.apply(age);
		System.out.println(result);
		
		Function<User, String> f3 = f1.andThen(f2);
		System.out.println("f3 : " + f3.apply(u1));
		System.out.println();
		
		Function<User, String> f4 = f2.compose(f1);
		System.out.println("f4 : " + f4.apply(u1));
		
		
		
//		c1.andThen(c2) : O
//		f1.andThen(f2) : O
//		c1.andThen(f1) : O
//		f1.andThen(c1) : O
		
		
		//Predicate
		// - 논리 연산자 역할
		Predicate<Integer> p1 =  n -> n % 2 == 0;
		Predicate<Integer> p2 =  n -> n % 5 == 0;
		
		int n = 4;
		if(p1.test(n)) {
			System.out.println("2의 배수");
		}
		
		if(p2.test(n)) {
			System.out.println("5의 배수");
		}
		
		if(p1.test(n) && p2.test(n)) {
			System.out.println("2와 5의 공배수");
		}
		
		Predicate<Integer> p3 = p1.and(p2);
		
		if(p3.test(n)) {
			System.out.println("2와5의 공배수");
		}
		
		
		
		
	}

	private static void m5() {
		
		//5. Predicate : 매개변수 O, 반환값 O, 주로 매개변수 값을 조사 후 논리값을 반환
		// - testXXX() 추상 메소드를 제공
		// - 매개변수값을 사용해서 조사(조건) 후 논리값을 반환한다.
		// - Function 의 서브셋
		
		//Function<Integer, Boolean> 이렇게 생겼다고 보면된다.
		Predicate<Integer> p1 = n -> n > 0;
		System.out.println(p1.test(100));
		System.out.println(p1.test(-100));
		
		Predicate<String> p2 = s -> s.equals("아무개");
		System.out.println(p2.test("아무개"));
		
		Predicate<String> p3 = s -> s.length() > 10;
		if(p3.test("안녕하세요.홍길동입니다.")) {
			System.out.println("긴 문장입니다.");
		} else {
			System.out.println("짧은 문장입니다.");
		}
		
		BiPredicate<String, String> p4 = (s1, s2) -> s1.length() > s2.length();
		if(p4.test("홍길동","길동")) {
			System.out.println("홍길동이 더 길다.");
		} else {
			System.out.println("홍길동이 더 짧다.");
		}
		
		
		
		
	}

	private static void m4() {
		
		//4. Operator : 매개변수 O, 반환값 O, 주로 매개변수 값을 연산 후 결과값을 반환
		// - applyXXX() 추상 메소드를 제공
		// - Function 하위 호환 인터페이스(서브셋)
		// - 주로 매개변수값을 연산(***)을 통해서 결과값을 만들어서 반환하는 역할
		// -  Function과 차이는 Opearator 는 매개변수의 타입과 결과타입이 동일하다. (***) Operator 의 큰 특징이다.
		
		BinaryOperator<Integer> b1 = (n1, n2) -> n1 + n2;
		System.out.println(b1.apply(10, 20));
		
		BinaryOperator<String> b2 = (s1, s2) -> s1 + s2;
		System.out.println(b2.apply("홍", "길동"));
		
		
		
		
	}

	private static void m3() {
		
		//3. Function : 매개변수 O, 반환값 O, 주로 매개변수 값을 반환값 타입으로 변환후 반환
		// - applyXXX() : 추상메소드를 제공
		
		Function<String, Integer> f1 = txt -> txt.length();
		System.out.println(f1.apply("홍길동입니다."));
		
		Function<Integer, String> f2 = num -> num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(f2.apply(3));
		System.out.println(f2.apply(4));
		
		Function<User, String> f3 = user -> user.getName();
		System.out.println(f3.apply(new User("홍길동", 20)));
		
		Function<Random, Integer> f4 = rnd -> rnd.nextInt(100);
		System.out.println(f4.apply(new Random()));
		
		
	}

	private static void m2() {
		
		//2. Supplier : 매개변수 X, 반환값 O
		// - getXXX() 추상 메소드를 제공
		// - 역할 : 데이터를 공급하는 일을 구현하는 역할
		
		Supplier<Integer> s1 = () -> 100;
		System.out.println(s1.get());
		
		Supplier<Integer> s2 = () -> {
			Calendar c = Calendar.getInstance();
			return c.get(Calendar.YEAR);
		};
		System.out.println(s2.get());
		
		Supplier<String> s3 = () -> System.getenv("JAVA_HOME");
		System.out.println(s3.get());
		
		Supplier<User> s4 = () -> new User("아무개", 32);
		System.out.println(s4.get());
		
		Supplier<ArrayList<User>> s5 = () -> {
			ArrayList<User> list = new ArrayList<User>();
			list.add(new User("홍길동", 20));
			list.add(new User("아무개", 22));
			list.add(new User("호호호", 24));
			return list;
		};
		
		for(User user : s5.get()) {
			System.out.println(user);
		}
		
		
		
		
		
	}

	private static void m1() {
		
		//1. Consumer : 매개변수 O, 반환값 X
		// - accept() 추상 메소드를 제공
		// - 역할 : 매개변수를 받아서 단순히 해당 메소드내에서 그 값을 소비하는 일을 구현하는 역할
		// - 다양한 오버로딩 제공
		
		MyConsumer my = str -> System.out.println(str);
		my.accept("헬로우");
		
		Consumer<String> my2 = str -> System.out.println(str);
		my2.accept("안녕컨슈머");
		
		Consumer<Integer> my3 = num -> {
			for (int i=0; i<num; i++) {
				System.out.println(i);
			}
		};
		my3.accept(10);
		
		Consumer<User> my4 = obj -> System.out.println(obj.getName() + ":" + obj.getAge());
		my4.accept(new User("홍길동", 20));
		
		
		BiConsumer<String, Integer> bc = (name, age) -> {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("성인 : " + ((age >= 19) ? "어른" : "아이"));
			
		};
		
		bc.accept("홍길동", 25);
		
		IntConsumer ic = num -> System.out.println(Math.pow(num, 2));
		Consumer<Integer> ic2 = num -> System.out.println(Math.pow(num, 2));
		
		ic.accept(5);
		ic2.accept(10);
		
		DoubleConsumer dc = radius -> System.out.println(radius * 2 * 3.14);
		dc.accept(20);
		
		ObjIntConsumer<User> oic = (user, num) -> {
			if (user.getAge() >= num) {
				System.out.println("통과");
			} else {
				System.out.println("거절");
			}
		};
		
		oic.accept(new User("홍길동", 25),50);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}


//함수형 인터페이스 선언
interface MyConsumer {
	void accept(String str);
}


































