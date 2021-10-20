package com.concurrency.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> questionQueue;

	public Consumer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("ANSWERED QUESTION: " + questionQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
