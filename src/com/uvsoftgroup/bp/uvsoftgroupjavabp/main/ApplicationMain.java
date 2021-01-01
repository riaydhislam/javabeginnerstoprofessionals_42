package com.uvsoftgroup.bp.uvsoftgroupjavabp.main;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.thread.ThreadExtendsThreadImpl;
import com.uvsoftgroup.bp.uvsoftgroupjavabp.thread.ThreadImplementsRunnable;

public class ApplicationMain {

	public static void main(String[] args) {
		// System.out.println("Hello World!");
	
	
		ThreadExtendsThreadImpl threadImpl=new ThreadExtendsThreadImpl();
		threadImpl.start();
		
		Runnable runnable = new ThreadImplementsRunnable();

		Thread thread = new Thread(runnable);
		thread.start();
	

	}

}
