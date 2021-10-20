package com.jobready.threading;

public class Application {

	public static void main(String[] args) {

//		System.out.println("starting Thread 1");
//		Thread t1 = new Thread(new Task("Thread - A"));
//		t1.start();
//
//		System.out.println("starting Thread 2");
//		Thread t2 = new Thread(new Task("Thread - B"));
//		t2.start();

		Sequence sequence = new Sequence();

		Worker worker1 = new Worker(sequence);
		worker1.start();
		Worker worker2 = new Worker(sequence);
		worker2.start();
	}
}

class Worker extends Thread {
	Sequence sequence = null;

	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " got value : " + sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Task extends Thread {
	String name;

	public Task(String name) {
		this.name = name;
	}

	public void run() {

		Thread.currentThread().setName(this.name);

		for (int i = 0; i < 100; i++) {
			System.out.println("Number: " + i + " - " + Thread.currentThread().getName());

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
