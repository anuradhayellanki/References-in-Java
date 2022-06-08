/**
 * com.cashapona.oops.reference on 06-jun-2022
 */
package com.cashapona.references.jun06;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
/**
 * @author Anuradha
 */
public class ReferenceRunner {
	/*
	 * create one String variable status
	 */
	private String status=" Hi my name is Anuradha";
	/**
	 * @return the status
	 */
	@SuppressWarnings("unused")
	private String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	@SuppressWarnings("unused")
	private void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ReferenceRunner [status=" + status + "]";
	}
	/*
	 * create strong reference variable
	 */
	public void strongReference() {
		ReferenceRunner strongRef=new ReferenceRunner();
		System.out.println(strongRef);
	}
	public void softReference() {
		SoftReference<ReferenceRunner> softRef=new SoftReference<ReferenceRunner>(getReference());
		System.out.println("SoftReference : "+softRef.get());
	}
	private ReferenceRunner getReference() {
		return new ReferenceRunner();
	}
	public void weakReference() {
		int count=0;
		WeakReference<ReferenceRunner> weakRef=new WeakReference<ReferenceRunner>(getReference());
		while(weakRef.get()!=null) {
			count++;
			System.gc();
			System.out.println("Weak reference : "+count+weakRef.get());
		}
	}
	@SuppressWarnings("unused")
	public void phantomReference () throws InterruptedException {
		@SuppressWarnings("rawtypes")
		final ReferenceQueue queue=new ReferenceQueue();
		@SuppressWarnings("unchecked")
		PhantomReference <ReferenceRunner> phantomRef=new PhantomReference <ReferenceRunner>(getReference(), queue);
		System.gc();
		queue.remove();
		System.out.println("Phantom Reference deleted");
	}
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args)  {
		ReferenceRunner ref=new ReferenceRunner();
		ref.strongReference();
		ref.weakReference();
		ref.softReference();
		try {
			ref.phantomReference();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
