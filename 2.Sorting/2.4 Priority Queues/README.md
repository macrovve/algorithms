## 2.4.1 
R R P O T Y I I U Q E U


## 2.4.2
如果采用栈或者队列来记录已插入的最大元素，考虑一种情况，栈中有三个元素分别是9-8-7
。此时在插入6，栈中是不会有任何记录的。本来是可以执行四次取出最大值的操作，现在只能
执行三次，元素6丢失。队列无法实现加入一个新的元素，队列头部是最大元素。


## 2.4.4
是

## 2.4.5
U T Y S Q N E A S I O E


## 2.4.6
插入P   P
插入R   RP
插入I   RPI
插入O   RPIO
删除    POI
插入R   RPIO
删除    POI
删除    OI
插入I   OII
删除    II
插入T   TII
删除    II
插入Y   YII
删除    II
删除    I
删除
插入Q   Q
插入U   UQ
插入E   UQE
删除    QE
删除    E
删除
插入U   U
删除
插入E   E


## 2.4.9
ABCDE可以构造出来的所有堆
* EDABC
* EDACB
* EDBAC
* EDBCA
* EDCAB
* EDCBA
* EADBC
* EADCB
* EBDAC
* EBDCA
* ECDAB
* ECDBA

AAABB可以构造出来的所有堆
* BBAAA
* BABAA

## 2.4.10

pq[k]的父节点为pq[(k+1)/2-1](向下取整）
pq[k]的子节点为pq[(k+1)*2],pq[(k+1)*2-1]

##
