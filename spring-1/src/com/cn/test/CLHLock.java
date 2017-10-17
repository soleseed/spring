package com.cn.test;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public class CLHLock {

	public static class CLHNode {
		private volatile Thread isLocked;
	}

	public CLHLock() {
		// TODO Auto-generated constructor stub
	}

	private volatile CLHNode tail;

	private static final ThreadLocal<CLHNode> LOCAL = new ThreadLocal<CLHNode>();

	private static final AtomicReferenceFieldUpdater<CLHLock, CLHNode> UPDATER = AtomicReferenceFieldUpdater
			.newUpdater(CLHLock.class, CLHNode.class, "tail");

	public void lock(){
		CLHNode node = new CLHNode();
		LOCAL.set(node);
		CLHNode preNode = UPDATER.getAndSet(this, node);
		if(preNode != null){
			preNode.isLocked = Thread.currentThread();
			LockSupport.park(this);
			preNode = null;
			LOCAL.set(node);
		}
	}

	public void unlock() {
		CLHNode node = LOCAL.get();
		if (UPDATER.compareAndSet(this, node, null)) {
			System.out.println("unlock\t" + node.isLocked.getName());
			LockSupport.unpark(node.isLocked);
		}
		node = null;
	}

}
