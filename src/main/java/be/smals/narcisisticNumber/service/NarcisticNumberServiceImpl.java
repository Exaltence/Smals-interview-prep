package be.smals.narcisisticNumber.service;

import be.smals.narcisisticNumber.exception.NarcisticNumberException;

import java.util.ArrayList;
import java.util.List;

public class NarcisticNumberServiceImpl implements NarcisticNumberService {

    @Override
    public boolean isNarcisisticNumber(int number) throws NarcisticNumberException {
        // count the number of digits
        int l = countDigit(number);
        int dup = number;
        int sum = 0;

        // calculates the sum of
        //digits raised to power
        while(dup > 0) {
            sum += Math.pow(dup % 10, l);
            dup /= 10;
        }
        return (number == sum);
    }

    @Override
    public List<Integer> calcNarcisisticRow(int amount) throws NarcisticNumberException {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < amount; i++) {
            int n = i;
            List<Integer> data = new ArrayList<>();
            while (n > 0) {
                data.add( n % 10 );
                n = n / 10;
            }
            int n1 = 0;
            for(Integer num : data) {
                n1 += Math.pow(num, data.size());
            }
            if(i == n1) {
                result.add(i);
            }
        }
        return result;
    }

    // function to count digits
    private int countDigit(int n) {
        if (n == 0)
            return 0;

        return 1 + countDigit(n / 10);
    }
}
