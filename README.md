## Geometric Series
In this application, you are given a geometric series with **x**, **y**, and **n** variables. The series is (x+ 2^0 * y), (x+ 2^0 * y + 2^1 * y), ..., (x+ 2^0 * y + ... + 2^n-1 * y). The application will receive how the number of queries and x, y, n values for each query.

One of the key points in this application is to use of Math class. **Java doesn't recognize the "^" symbol as a power operator [1]**. Instead use "Math.pow(2, n)". 

---

## Input
3

1 2 3

54 98 10

6 45 5

## Output
3 7 15 

152 348 740 1524 3092 6228 12500 25044 50132 100308 

51 141 321 681 1401

---

## Reference

1. Lee, X. (n.d.). Java: The Power Function. Retrieved from http://xahlee.info/java-a-day/power_operator.html.
