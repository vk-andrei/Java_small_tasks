package classQueue;

public class Queue {
    char[] qArr;               // array for elements of queue
    int putIndex, getIndex;   // index for putting and extracting elements from queue

    Queue (int size) {
        qArr = new char[size];
        putIndex = getIndex = 0;
    }

    void putSymb(char c) {
        if (putIndex == qArr.length) {
            System.out.println("The queue is overflow!");
            return;
        }
        qArr[putIndex++] = c;
    }

    char getSymb(){
        if (putIndex == getIndex) {
            System.out.println("The queue is empty");
            return (char) 0;
        }
        return qArr[getIndex++];

    }

}
