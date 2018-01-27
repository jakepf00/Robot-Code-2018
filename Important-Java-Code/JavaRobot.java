package javaRobot;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class JavaRobot{
	
	private static void type(String s) throws AWTException {
		Robot him = new Robot();
		byte[] bytes = s.getBytes();
		for (byte b : bytes) {
			int code = b;
			// keycode only handles [A-Z] (which is ASCII decimal [65-90])
			if (code > 96 && code < 123)
				code = code - 32;
			him.delay(40);
			him.keyPress(code);
			him.keyRelease(code);
		}
	}
	

	public static void main(String[] args) throws AWTException{
		Robot me = new Robot();
		Random x = new Random();
		Random y = new Random();
		/*me.mouseMove(1500, 10);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200); 
		me.mouseRelease(InputEvent.BUTTON1_MASK);*/
		
		/*for(int a = 0; a < 100000; a++)
		{
			int b = x.nextInt(1500);
			int c = y.nextInt(800);
			me.mouseMove(b, c);
			
		}*/
		me.mouseMove(1500, 10);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(500);
		me.mouseMove(35, 880);
		me.delay(500);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		
		/*for(int a = 0; a < 200000; a++)
		{
			int b = x.nextInt(1500);
			int c = y.nextInt(800);
			me.mouseMove(b, c);
			
		}*/
		me.delay(500);
		type("i");
		me.delay(500);
		me.keyPress(KeyEvent.VK_ENTER);
		me.delay(2000);
		type("youtube");
		me.delay(500);
		me.keyPress(KeyEvent.VK_ENTER);
		me.delay(1000);
		me.mouseMove(200, 260);
		me.delay(400);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(2000);
		me.mouseMove(250, 140);
		me.delay(1000);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(1000);
		type("goo");
		me.delay(200);
		type("oo");
		me.delay(200);
		type(" ");
		me.delay(200);
		type("bwa");
		me.delay(200);
		type("ahh");
		me.delay(300);
		me.keyPress(KeyEvent.VK_ENTER);
		me.delay(1000);
		me.mouseMove(600, 300);
		me.delay(500);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(4000);
		me.mouseMove(35, 880);
		me.delay(200);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(200);
		type("pa");
		me.delay(200);
		me.keyPress(KeyEvent.VK_ENTER);
		me.delay(1000);
		me.mouseMove(300, 400);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(300, 500);
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.mouseMove(300, 400);
		me.delay(300);
		me.mousePress(InputEvent.BUTTON1_MASK);
		for(float a = 0; a <= 7; a++)
		{
			me.delay(50);
			me.mouseMove(300 + (Math.round(a) * 5) ,(int) (400 + (Math.pow((double) a, 2))));
		}
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(300, 500);
		me.delay(200);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(300);
		for(float a = 0; a <= 7; a++)
		{
			me.delay(50);
			me.mouseMove(300 + (Math.round(a) * 5) ,(int) (500 - (Math.pow((double) a, 2))));
		}
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(350, 400);
		me.mousePress(InputEvent.BUTTON1_MASK);
		for(int a = 0; a <= 100; a++)
		{
			me.delay(10);
			me.mouseMove(350, 400 + a);
		}
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseMove(330, 400);
		me.mousePress(InputEvent.BUTTON1_MASK);
		for(int a = 0; a <= 40; a++)
		{
			me.delay(20);
			me.mouseMove(330 + a, 400);
		}
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(330, 500);
		me.mousePress(InputEvent.BUTTON1_MASK);
		for(int a = 0; a <= 40; a++)
		{
			me.delay(20);
			me.mouseMove(330 + a, 500);
		}
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(400, 400);
		me.mousePress(InputEvent.BUTTON1_MASK);
		for(int a = 0; a <= 100; a++)
		{
			me.delay(10);
			me.mouseMove(400, 400 + a);
		}
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseMove(400, 400);
		me.mousePress(InputEvent.BUTTON1_MASK);
		for(int a = 0; a <= 40; a++)
		{
			me.delay(10);
			me.mouseMove(400 + a, 400);
		}
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseMove(400, 500);
		me.mousePress(InputEvent.BUTTON1_MASK);
		for(int a = 0; a <= 40; a++)
		{
			me.delay(10);
			me.mouseMove(400 + a, 450);
		}
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseMove(400, 500);
		me.mousePress(InputEvent.BUTTON1_MASK);
		for(int a = 0; a <= 40; a++)
		{
			me.delay(10);
			me.mouseMove(400 + a, 500);
		}
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.mouseMove(675, 160);
		me.delay(100);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.mouseMove(430, 500);
		me.delay(200);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(445, 515);
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(1000, 160);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(590, 160);
		me.delay(200);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.mouseMove(430, 510);
		me.delay(200);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(445, 540);
		me.delay(200);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(200);
		me.mouseMove(430, 165);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseMove(435, 532);
		me.delay(200);
		me.mousePress(InputEvent.BUTTON1_MASK);
		me.delay(100);
		me.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
	}

}
