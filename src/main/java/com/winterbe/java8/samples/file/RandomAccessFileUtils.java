package com.winterbe.java8.samples.file;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * 2017.03.07 12:51 
 * @author zhuhh
 *
 */
public class RandomAccessFileUtils {
    
	public static void main(String[] args) throws Exception {
		try {
			File file = new File("d:\\spark.mp4");
			RandomAccessFile raf = new RandomAccessFile(file,"rw");
			raf.setLength(100*1024*1024L);//设置文件初始化大小为100M，类似断点下载
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
