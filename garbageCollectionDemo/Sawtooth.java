package garbageCollectionDemo;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class Sawtooth {
	private static Unsafe unsafe;
	static {
		try {
			Field field = Unsafe.class.getDeclaredField("theUnsafe");
			field.setAccessible(true);
			unsafe = (Unsafe) field.get(null);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static long addressOf(Object mine) {
		Object [] array=new Object[] {mine};
		long baseOffset =unsafe.arrayBaseOffset(Object[].class);
		int  addressSize =unsafe.addressSize();
		long objectAddress;
		switch(addressSize) {
		case 4 :
		objectAddress=unsafe.getInt(array, baseOffset);
		break;
		case 8 :
		objectAddress=unsafe.getLong(array, baseOffset);
		break;
		default : 
			throw new Error("address not supported"+  addressSize);
		}
		return objectAddress;
}

	public static void main(String[] args) {
		for(int i=0;i<3200;i++) {
			Object mine=new GCMe();
			long address=addressOf(mine);
			System.out.println(address);
		}
		//this class gives information about MX bans and memory spaces
		Main.MXBeanDemo();
	}

}

class GCMe{
	long data;
	long a;
	long aa;
	long aaa;
	long aaaa;
	long aaaaa;
	long aaaaaa;
	long aaaaaaa;
	long aaaaaaaa;
	long aaaaaaaaa;
	long aaaaaaaaaa;
	long aaaaaaaaaaa;
	long aaaaaaaaaaaa;
	long aaaaaaaaaaaaa;
	long aaaaaaaaaaaaaa;
	long aaaaaaaaaaaaaaa;
	long aaaaaaaaaaaaaaaa;
}
