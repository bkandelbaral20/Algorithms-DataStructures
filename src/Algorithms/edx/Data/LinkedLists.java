package Algorithms.edx.Data;

/*
Consider the following scenario: suppose we want to store the age of of all customers at Microsoft on a certain day.
 What data structure should we use?

Sure, we could just use an array.

	int[] lst = new int[100];
	lst[0] = 15;
	lst[1] = 19;
	...
But what is the problem here? What if we happen to have more than 100 customers on a day? Because array is immutable,
 we can't just "extend" an array to provide more space. What we would have to do then is to create a new array of bigger
 size and copy everything from the old array over and then the age of new customers in. This is very inefficient and
 expensive as we have to do copying every time we hit the maximum capacity and allocate new space.

Scenarios like this motivate the uses of LinkedList. Unlike array, which has a pre-determined size, linked list is a
series of elements linked together by pointers, and we can dynamically allocate more space to the linked list if we wish.
Linked List are linear data structures where the elements are not stored in contiguous locations and every element is a
 separate object with a data part and address part. The elements are linked using pointers and addresses. Each element
 is known as a node. Due to the dynamic and ease of insertions and deletions, they are preferred over the arrays.

Let's read some code to understand the idea better. Luckily, linked list is an built-in data structure in Java,
so we don't have to implement it every time we use
 */

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

//    creating a new empty linked list
    LinkedList<Integer> list = new LinkedList<Integer>();

//    now adding elements
    list.add(15);
    list.add(16);
    list.add(19);
    list.addFirst(13);
    list.addLast(14);
    System.out.println("Here you go : " + list);

//    ***************** Remove elements

        list.removeFirst(); // [15,19,21,24]
        list.removeLast(); // [15,19,21]
        System.out.println(list);

    }
}
