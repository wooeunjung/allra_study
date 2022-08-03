package study;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

// 함수형 인터페이스 종류와 예제
public class FuntionalInterface {

	public static void main(String[] args) {
		/*
		 * 1. Runnable
		 * 기본적인 형태의 인터페이스, 인자와 반환값 모두 없음
		 * param ( )
		 * return void
		 */
		
		
		/*
		 * 2. Supplier<T>
		 * 인자가 없이 제너릭 타입의 반환값만 있는 인터페이스, 항상 같은 값을 반환
		 * param ( )
		 * return T
		 */

		
		/*
		 * 3. Consumer<T>
		 * 제너릭 타입의 인자만 있고 반환값이 없는 인터페이스
		 * param T
		 * return void
		 */
		Consumer<String> consumer1 = s -> System.out.println(s + " World!");
        consumer1.accept("consumer1 >");
		
		/*
		 * 4. Predicate<T>
		 * 제너릭 타입의 인자와 Boolean 타입의 반환값을 가지는 인터페이스
		 * param T
		 * return boolean
		 */
		Predicate<Integer> predicate1 = (number) -> number%2 == 0; // 인자를 전달하여 predicate1 함수를 실행하여 boolean 값을 리턴
		System.out.println("predicate1> " + predicate1.test(6));
		
		/*
		 * 5. Function<T, R>
		 * 제너릭 타입의 인자와 다른 제너릭 타입의 반환값이 같이 있는 인터페이스
		 * param T
		 * return R
		 */
		final Function<String, Integer> toInt = value -> Integer.parseInt(value); // 문자열 숫자로 변환
		System.out.println("Function1>" + toInt.apply("100"));

		/*
		 * 6. UnaryOperator<T>
		 * 같은 제너릭 타입의 인자와 반환값을 가지고 있는 인터페이스
		 * param T
		 * return T
		 */
		UnaryOperator<Integer> unaryOperator1 = n -> n * n;
        System.out.println("unaryOperator1> " + unaryOperator1.apply(10)); // 제곱계산

        UnaryOperator<Integer> func1 = n -> n * 2;
        UnaryOperator<Integer> func2 = n -> n * 3;
        Integer unaryOperator2 = func1.andThen(func2).apply(10); // func1이 실행되고 그 결과가 두번째 func2의 인자로 전달되어 계산 됨
        System.out.println("unaryOperator2> " + unaryOperator2);
		
		/*
		 * 7. Comparator<T>
		 * 같은 제너릭 타입의 인자 2개를 받고 Integer 반환값을 가지는 인터페이스, 객체간의 값을 비교하기 위한 compare 기능을 위한 인터페이스
		 * param T, T
		 * return Integer
		 */
        // 커스터마이즈(customize) 정렬에 사용됨, "비교"가 아님
        
	}

}
