package Streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileBufferTest {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		String s="";
		byte[] data=new byte[1200];
		FileInputStream fs=new FileInputStream("D:/Virtusa/Nikki.txt");
		BufferedInputStream bs=new BufferedInputStream(fs);
		while(bs.available()>0)
		{
			//System.out.print((char)bs.read());
			s +=(char)bs.read();
		}
		data=s.getBytes();
		String str=new String(data);
		System.out.print("The Content of the file read using BufferedInputStream: "+str);
	}


}
