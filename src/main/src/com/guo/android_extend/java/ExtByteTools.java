package com.guo.android_extend.java;

/**
 * Created by gqj3375 on 2017/4/28.
 */

public class ExtByteTools {

	public static byte[] convert_from_int(int val) {
		byte[] size = new byte[4];
		size[0] = (byte)(val >> 24);
		size[1] = (byte)(val >> 16);
		size[2] = (byte)(val >> 8);
		size[3] = (byte)(val >> 0);
		return size;
	}
	public static int convert_to_int(byte[] val) {
		int size = 0;
		if (val.length >= 4) {
			size |= ((int) val[0] << 24);
			size |= ((int) val[1] << 16);
			size |= ((int) val[2] << 8);
			size |= ((int) val[3] << 0);
		}
		return size;
	}
}