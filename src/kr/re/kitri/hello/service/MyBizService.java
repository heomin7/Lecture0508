package kr.re.kitri.hello.service;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by danawacomputer on 2017-05-08.
 */
public class MyBizService {

    public int processLogic(int firstNumber, int secondNumber){
        //todo
        return firstNumber + secondNumber;
    }

    public static int sumIntList(List<Integer> intList) {
//        int sum = 0;
//
//        for(int e: intList){
//            sum += e;
//        }
        return intList.stream().mapToInt(x -> x.intValue()).sum();
    }

    public static double averageIntList(List<Integer> intList) throws Exception {
        int average = 0;
        int sum = 0;

//        for(Integer e: intList){
//            sum += e;
//        }
//
//        return (sum/intList.size());

        OptionalDouble result = intList.stream()
                .mapToInt(x -> x.intValue())
                .average();

        if(result.isPresent()){
            return result.getAsDouble();
        }else{
            throw new Exception("데이터가 없어서 평균을 구할 수 없어요");
        }

    }
}
