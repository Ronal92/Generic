package com.jinwoo;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {10,20,30,40};
		String[] stringArray = {"��", "��", "��", "��"};
		printArray(intArray);
		printArray(stringArray);
	
	
		// ���ϵ� ī��� ����ϴ� ���׸�
		Triangle tri = new Triangle();
		Triangle tri2 = new Triangle();
		Triangle tri3 = new Triangle();
		
		Rectangle rect = new Rectangle();
		Rectangle rect2 = new Rectangle();
		Rectangle rect3 = new Rectangle();
		
		ArrayList<Triangle> shapeList = new ArrayList<>();
		shapeList.add(tri);
		shapeList.add(tri2);
		shapeList.add(tri3);
		
		draw(shapeList);	
		
		
		CR3F cr3f = new CR3F();

		CR1F cr1f = new CR1F();
		
		HeaterRun hr = new HeaterRun();
		hr.run(cr1f);
		
		
		ForAnno anno = new ForAnno();
		String anno_val = anno.getClass().getAnnotation(Annotation.class).val();
		String anno_key = anno.getClass().getAnnotation(Annotation.class).key();
		
		System.out.println("anno_key=" + anno_key + "          anno_val" + anno_val);
	
	}	
	public static void draw(List<? extends Shape> lists){
		for(Shape s: lists){
			s.drawShape();
		}
	}

	// �Լ����� ���Ǵ� ����
	public static <E> void printArray(E[] elements){
		for(E element : elements){
			System.out.println(element);
		}
	}	
	
}

@Annotation(key="xxxxxxx", val = "�̰��� val�̴�")
class ForAnno{
	
}
