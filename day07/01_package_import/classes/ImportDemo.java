// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ImportDemo.java

import java.io.PrintStream;
import java.util.Arrays;

public class ImportDemo
{

	public ImportDemo()
	{
	}

	public static void main(String args[])
	{
		int ai[] = {
			4, 1, 8, 2, 1, 5, 7
		};
		String s = Arrays.toString(ai);
		System.out.println(s);
		Arrays.sort(ai);
		s = Arrays.toString(ai);
		System.out.println(s);
	}
}
