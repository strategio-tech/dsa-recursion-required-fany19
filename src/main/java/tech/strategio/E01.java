package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        if(n==1 || n==0)
            return 0;
        if(n==2)
            return 1;
        if(n<1)
            return n;

        return getNthFib(n-1)+getNthFib(n-2);
    }

}
