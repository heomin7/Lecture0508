package kr.re.kitri.hello;

import kr.re.kitri.hello.service.MyBizService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-05-08.
 */
public class HelloJdbc {

    public static void main(String[] args){

        //기존 배운것 복습!

        //입력
        int firstNumber = 3; //3은 int형 literal이라고 함
        int secondNumber = 5;  //자바는 카멜 표기법을 사용함

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        intList = new ArrayList<>(); //의도적으로 비어있는 배열을 만든다.

        //RDB는 snake 표기법 사용(ex first_number)

        //처리
    //    int result = firstNumber + secondNumber;
//        int result =
//                processLogic(firstNumber, secondNumber);
//        MyBizService service = new MyBizService();
//        int result = service.processLogic(firstNumber, secondNumber);
        int resultsum = MyBizService.sumIntList(intList);
        double resultAverage = 0;
        try {
            resultAverage = MyBizService.averageIntList(intList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.printf("합은 %d이고 평균은 %.1f입니다.", resultsum, resultAverage);



        //결과
    //    System.out.println(result);

    }

//    public static int processLogic(int firstNumber, int secondNumber){
//        //todo
//        return firstNumber + secondNumber;
//    }
}
