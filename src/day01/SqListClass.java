package day01;

import java.util.Arrays;

public class SqListClass<E> {
    final int initcapacity = 10;
    public E[] data;
    public int size;
    private int capacity;

    public SqListClass() {
        data = (E[]) new Object[initcapacity];
        capacity = initcapacity;
        size = 0;
    }


    // 扩容
    private void updatecapacity(int newcapacity) {
        E[] newdata = (E[]) new Object[newcapacity];
        for (int i = 0; i < size; i++) {
            newdata[i] = data[i];
        }
        capacity = newcapacity;
        data = newdata;
    }


    // 建立顺序表
    public void CreateList(E[] a) {
        size = 0;
        for (int i = 0; i < a.length; i++) {
            if (size == capacity) {
                updatecapacity(2 * size);// 扩容
            }
            data[size] = a[i];
            size++;
        }
    }


    // 添加元素到线性表末尾
    public void Add(E e) {
        if (size == capacity) {
            updatecapacity(2 * size);
        }
        data[size] = e;
        size++;
    }


    // 求线性表的长度
    public int size() {
        return size;
    }


    // 缩小线性表的长度Setsize(nlen)
    public void Setsize(int nlen) {
        if (nlen < 0 || nlen > size) {
            throw new IllegalArgumentException("参数异常");
        }
        size = nlen;
    }


    // 求线性表中序号为i的元素
    public E GetElem(int i) {
        if (i < 0 || i > size) {
            throw new IllegalArgumentException("参数异常");
        }
        return (E) data[i];
    }


    // 修改线性表中序号为i的元素SetElem(i, e)
    public void SerElem(int i, E e) {
        if (i < 0 || i > size) {
            throw new IllegalArgumentException("参数异常");
        }
        data[i] = e;
    }


    // 求线性表中第一个值为e的元素的逻辑序号GetNo(e)
    public int GetNo(E e) {
        int i = 0;
        while (i < size && !data[i].equals(e)) {
            i++;
        }
        if (i >= size) {
            return -1;
        } else {
            return i;
        }
    }


    // 交换线性表序号i和j的元素swap(i, j)
    public void swap(int i, int j) {
        E tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }


    // 在线性表中插入e作为第i个元素Insert(i, e)
    public void Insert(int i, E e) {
        if (i < 0 || i > size) {
            throw new IllegalArgumentException("参数异常");
        }
        if (size == capacity) {
            updatecapacity(2 * size);
        }
        for (int j = size; j > i; j--) {
            data[j] = data[j - 1];
        }
        data[i] = e;
        size++;
    }


    //在线性表中删除序号i位置的元素
    public void Delete(int i) {
        if (i < 0 || i > size - 1)
            throw new IllegalArgumentException("删除:位置i不在有效范围内");
        for (int j = i; j < size - 1; j++)
            data[j] = data[j + 1];
        size--;
        if (capacity > initcapacity && size == capacity / 4)
            updatecapacity(capacity / 2);
    }


    //将线性表转换为字符串
    public String toString() {
        String ans = "";
        for (int i = 0; i < size; i++)
            ans += data[i].toString() + " ";
        return ans;
    }


}
