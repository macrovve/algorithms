## 2.1.2
一个元素最多被交换2次。平均会被交换1次

## 2.1.3
8 7 6 5 4 3 2 1

## 2.1.5
1 2 3 4 5 6 7 8

## 2.1.6
插入排序更快，插入排序内循环一次都不会进行。

## 2.1.7
选择排序更快。对于长度为N的数组。
* 选择排序需要N/2次交换，(1+N-1)*(N-1)/2次比较。
* 插入排序需要(1+N-1)*(N-1)/2次交换，(1+N-1)*(N-1)/2次比较。

## 2.1.10
选择排序在h变小之后，不会利用数组已经部分有序的特性。之前实现的h有序不会为后来h变小后带来什么效果

## [2.1.11](ex_2_1_11.java)

## [2.1.12](ex_2_1_12.java)

## 2.1.15
选择排序，应该要保证交换的次数尽可能的少，选择排序的交换次数时线性阶的

## 2.1.16
```java
public static boolean check(Comparable[] a){
    Comparable[] b=a.clone();
    sort(a);
    Arrays.sort(b);
    return Arrays.equals(a,b);
}
```
## 2.1.17 : [Selection](ex_2_1_17_Selection.java) | [Insertion](ex_2_1_17_Insertion.java)

## 2.1.18 : [Selection](ex_2_1_18_Selection.java) | [Insertion](ex_2_1_18_Insertion.java)




