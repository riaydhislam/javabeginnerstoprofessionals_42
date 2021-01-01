package com.uvsoftgroup.bp.uvsoftgroupjavabp.thread;

public class ThreadImplementsRunnable implements Runnable {

	private boolean doStopThread = false;

	public synchronized void doStop() {
		this.doStopThread = true;
	}

	private synchronized boolean keepRunning() {
		return this.doStopThread == false;
	}
	
	@Override
	public void run() {
		while (keepRunning()) {
			System.out.println("Running from runnable interface UVSOFTGROUP");
			try {
				Thread.sleep(3L * 1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
