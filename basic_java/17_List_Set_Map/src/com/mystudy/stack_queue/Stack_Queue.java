package com.mystudy.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* 
	 * 큐 (Queue) 인터페이스 
	  		- 형태상 파이프 형태 
			- (선입선출 : FIFO - First In First Out) 
	        - offer(), poll(), peek()
	 * 스택 (Stack)클래스 
		  - 형태상 바닥이 막힌 통의 형태 
		  - (후입선출 : LIFO - Last In First Out)
		  - push(), pop(), peek()
 */

public class Stack_Queue {

	public static void main(String[] args) {
		
		// 큐(Queue) 인터페이스 - LinkedList 클래스를 큐 형태로 사용
		// List<String> list = new LinkedList<String>();
		
		// Queue) : FIFO 선입선출
		System.out.println("=== 큐 (Queue) : FIFO 선입선출 ====");
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer("1.첫째");
		queue.offer("2.둘째");
		queue.offer("3.셋째");
		queue.offer("4.넷째");
		queue.offer("5.다섯째");
		
		System.out.println("queue : " + queue);
		System.out.println("갯수 : " + queue.size());
		
		// peek() : 현재 사용할 수 있는 데이터를 확인만한다.(읽어오기, 참조, 조회)
		System.out.println("--- peek() ---");
		String data = queue.peek(); // peek(); 하면 맨 위에 있는 데이터 읽어올 수 있음.
		System.out.println("peek data : " + data);
		System.out.println("queue.peek() : " + queue.peek());
		System.out.println("갯수 : " + queue.size());
		System.out.println("queue : " + queue);
		
		// poll() : 데이터를 가져오고 읽어온 다음 삭제까지 해준다. 아예 꺼내준다.
		System.out.println("--- poll() ----");
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.poll() : " + queue.poll());
		// System.out.println("queue.remove() : " + queue.remove());
		// remove는 데이터를 삭제하는 것이지 가져오지는 못하니까 웬만하면 데이터 가져다 쓸 때 poll()을 써라.
		// 데이터가 없는데 remove처리하면 더이상 지울 수 없어서 NoSuchElement 오류가 발생.
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.poll() : " + queue.poll()); 
		// --> 데이터가 없으면 null
		
		
		System.out.println("갯수 : " + queue.size());
		System.out.println("queue : " + queue);
		System.out.println("queue.isEmpty() : " + queue.isEmpty());
		
		System.out.println("--- 큐(Queue) 전체 데이터 추출(사용) ----");
		while (!queue.isEmpty()) {  
			//!queue.isEmpty() = 비어있지 않으면(즉, 데이터가 있으면)
			// 데이터 사용하기
			System.out.println("queue.poll() : " + queue.poll());
		}
		System.out.println("갯수 : " + queue.size());
		System.out.println("queue.isEmpty() : " + queue.isEmpty());
		System.out.println();
		// ------------------------------------------------------------
		// Stack - LIFO 후입선출 형태
		System.out.println("/////////////////////////////////////////");
		System.out.println("=== 스택(Stack) : LIFO 후입선출 ======");
		Stack<String> stack = new Stack<>();
		stack.push("1.첫째"); // Stack 메소드
		stack.add("2.둘째"); // Vector 메소드
		stack.push("3.셋째");
		stack.push("4.넷째");
		
		System.out.println("stack : " + stack);
		System.out.println("stack : " + stack.size());
		System.out.println("stack : " + stack.empty());
		
		// peek() : 데이터를 확인 및 참조해서 쓸 수 있다.
		System.out.println("--- peek() : 사용할 수 있는 데이터 확인(참조) -----");
		System.out.println("stack.peek() : " + stack.peek());
		System.out.println("stack.peek() : " + stack.peek());
		System.out.println("stack.peek() : " + stack.size());
		
		// pop() : 꺼내서 쓰기.
		System.out.println("--- pop() : 꺼내쓰기 - 없으면");
		System.out.println("stack.pop() : " + stack.pop());
		System.out.println("stack.pop() : " + stack.pop());
		System.out.println("stack.pop() : " + stack.pop());
		System.out.println("stack.pop() : " + stack.pop());
		// System.out.println("stack.pop() : " + stack.pop()); 
		// 없으면 EmptyStackException
		
		System.out.println("stack : " + stack);
		System.out.println("stack.peek() : " + stack.size());
		
		// stack 전체 데이터 사용
		System.out.println("--- stack(스택) 전체 데이터 사용 ----");
		System.out.println("stack.empty() : " + stack.empty());
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		System.out.println("stack.size() : " + stack.size());
		System.out.println("stack.empty() : " + stack.empty());
	}

}
