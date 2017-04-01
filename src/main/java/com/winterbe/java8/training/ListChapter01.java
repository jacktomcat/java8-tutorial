package com.winterbe.java8.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListChapter01 {
   
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("zhangsan");
		list.add("laisi");
		list.add("wangwu");
		
		String append = null; 
		list.forEach(System.out::println);//输出操作
		System.out.println("=========正序输出========");
		list.stream().sorted().forEach(System.out::println);//排序，正序输出
		System.out.println("=========倒序输出========");
		list.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);//排序，倒序输出
		Optional<String> o = list.stream().reduce((a,b)-> (a + "#" + b) );//执行reduce操作
		System.out.println("reduce================="+o.get());
		
		list.stream().map(val->{
			return val.toUpperCase();
		}).forEach(val->System.out.println("map==============="+val));//map转换为大写并输出
		
		boolean contain = list.stream().allMatch(val->val.contains("z"));  //z->false, a->true
		System.out.println("contain=========="+contain);
		
		list.stream().distinct();//去重
		list.stream().count();//数量count
		
		long count = list.parallelStream().count();//并行处理，可以提高效率
		System.out.println("count============"+count);

	}
}
