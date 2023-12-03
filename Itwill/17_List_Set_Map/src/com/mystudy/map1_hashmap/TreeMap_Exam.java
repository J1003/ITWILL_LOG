package com.mystudy.map1_hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.mystudy.list5_list_vo.StudentVO;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Exam {

	public static void main(String[] args) {
		// Map<K,V> 인터페이스 : 키(key)-값(value) 쌍으로 데이터 저장 및 관리.
		// - 특징 : 키(key)-값(value)이다, 순서는 없음.
		// - 키(key) : 중복 안 됨(중복값 없이 유일한 데이터)
		// - 값(value) : 중복 데이터 저장 가능
		// --------------------------------------
		
		
		// >> TreeMap을 사용하면 정렬된 데이터를 사용할 수 있음. <<
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		Map<String, Integer> map = new TreeMap<String, Integer>();
		System.out.println("\n==== 입력(추가) ======");
		System.out.println("map.isEmpty() : " + map.isEmpty());
		// 입력 - Create, Insert
		map.put("홍길동", 100);
		map.put("강감찬", 88);
		map.put("김유신", 95);
		map.put("박혁거세", 95);
		map.put("황기도", 95);
		// 순서 개념은 없음. (데이터 무작위로 추출)
		System.out.println("map : " + map);
		System.out.println("데이터갯수 : " + map.size());
		// 데이터갯수 확인 .size()
		System.out.println("----");
		
		// 새로운 데이터 입력시 null 리턴받는다.
		//int returnObj = map.put("계백", 88);
		Integer returnObj = map.put("계백", 88);
		System.out.println("map.put(\"계백\", 88) 리턴값 : " + returnObj);
		
		returnObj = map.put("홍길동", 95); //동일 key값이 있으면 수정처리됨
		System.out.println("map.put(\"홍길동\", 95) 리턴값 : " + returnObj);
		System.out.println("map : " + map);
		
		
		System.out.println("\n==== 조회(검색) =======");
		// 조회(검색) - Read
		int returnValue = map.get("홍길동");
		System.out.println("map.get(\"홍길동\") : " + returnValue);
		
		// 수정 - replace
		System.out.println("\n===== 수정 =========");
		System.out.println("map.replace(\"홍길동\", 99) 리턴값 : "
				+ map.replace("홍길동", 99));
		
		System.out.println("map.replace(\"을지문덕\", 99) 리턴값 : "
				+ map.replace("을지문덕", 99));
		
		// 추가 - put
		
		// 삭제 - remove
		System.out.println("\n==== 삭제 ========");
		System.out.println("map.remove(\"홍길동\", 100) : " + map.remove("홍길동", 100));
		System.out.println("map : " + map);
		
		System.out.println("map.remove(\"홍길동\") : " + map.remove("홍길동"));
		System.out.println("map : " + map);
		
		System.out.println("\n====== 전체 데이터 처리 ========");
		System.out.println("===== keySet() 사용 ======");
		Set<String> keySet = map.keySet();
		System.out.println("keySet : " + keySet);
		
		// Iterator() 써도 되는데 개인적으로 해보기.
		for (String key : keySet) {
			System.out.println(key + "-" + map.get(key));
			// get.(key) - get에 key값을 전달해주면 value값을 얻을 수 있다.
		}
		System.out.println("-----");
		
		System.out.println("==================");
		Collection<Integer> values = map.values();
		System.out.println("values : " + values);

		for (Integer value : values) {
			System.out.println("점수 : " + value);
		}
		System.out.println("----");
		
		int sum = 0;
		for (Integer value : values) {
			sum += value;
		}
		System.out.println("::: 점수합계 : " + sum);
		
		System.out.println("===================");
		//Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		
		// entrySet에 있는 Iterator 사용!
		System.out.println("---- entrySet.iterator(); ------");
		Iterator<Entry<String, Integer>> ite = entrySet.iterator();
		//hasNext() - 데이터가 있냐
		while (ite.hasNext()) {
			Entry<String, Integer> entry = ite.next();
			System.out.println("key: " + entry.getKey() + ", "
						+ "value : " + entry.getValue());
		}
		
		
		System.out.println("\n---- 개선된 for문 사용 --------");
		//(개인적실습) entrySet 데이터 개선된(향상된) for문 사용 화면출력
		
		// TreeMap 고유기능 사용 
		//map.descendingKeySet();
		
		
		
	}
}
