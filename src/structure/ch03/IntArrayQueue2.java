package structure.ch03;

public class IntArrayQueue2 {

	private String[] array;
	private int front; // 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수

	public IntArrayQueue2(int capacity) {
		this.capacity = capacity;
		array = new String[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// todo - 1 데이터 넣기 기능 구현
	public void enqueue(String item) {
		// 코드 수정
		// [10][20][30]
		// 나머지 연산자를 활용 한다 (순환구조)
		// 1 = 1 % 5; 몫 0, 나머지 1
		// 2 = 2 % 5; 몫 0, 나머지 2
		// 3 (임시값 3)
		// 0 = 0 % 3
		// 1 = 0 + 1 % 3
		// 2 = 1 + 1 % 3
		// 0 = 2 + 1 % 3
		// 1 = 0 + 1 % 3
		// 2 = 1 + 1 % 3
		rear = (rear + 1) % capacity;
		array[rear] = item;
		size++;
	}

	// todo - 2 데이터 꺼내기
	public void dequeue() {

		if (isEmpty()) {
			System.out.println("Queue is empty.");
		}

		String item = array[front];
		// [10] [20] [30]
		front = (front + 1) % capacity;
		System.out.println(item);
	}

	// todo - 3 데이터 찾기 (peek)
	public void peek() {
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
		} else {
			// peek --> 맨 앞에 데이터를 리턴 시켜주는 기능일 뿐
			System.out.println(array[front]); // - 수정
		}
	}

	public void printAll() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// 코드 테스트
	public static void main(String[] args) {

		IntArrayQueue2 queue = new IntArrayQueue2(4);

		// 데이터 넣기
		queue.enqueue("안");
		queue.enqueue("녕");
		queue.enqueue("하");
		queue.enqueue("세"); // 안들어감
		queue.enqueue("요");
		// 400 500 300
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		// queue.printAll();

	} // end of main

} // end of class
