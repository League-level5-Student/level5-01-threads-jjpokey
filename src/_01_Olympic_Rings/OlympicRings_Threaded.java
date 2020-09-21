package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot a = new Robot(400, 500);
	Robot b = new Robot(500, 500);
	Robot c = new Robot(600, 500);
	Robot d = new Robot(450, 450);
	Robot e = new Robot(550, 450);
	
	a.setSpeed(10);
	b.setSpeed(10);
	c.setSpeed(10);
	d.setSpeed(10);
	e.setSpeed(10);
	
	a.penDown();
	b.penDown();
	c.penDown();
	d.penDown();
	e.penDown();
	
	Thread r1 = new Thread(()-> {
		for(int i = 0; i < 360; i++) {
			a.move(1);
			a.turn(1);
		}
		a.hide();
	});
	
	Thread r2 = new Thread(()-> {
		for(int i = 0; i < 360; i++) {
			b.move(1);
			b.turn(1);
		}
		b.hide();
	});
	
	Thread r3 = new Thread(()-> {
		for(int i = 0; i < 360; i++) {
			c.move(1);
			c.turn(1);
		}
		c.hide();
	});
	
	Thread r4 = new Thread(()-> {
		for(int i = 0; i < 360; i++) {
			d.move(1);
			d.turn(1);
		}
		d.hide();
	});
	
	Thread r5 = new Thread(()-> {
		for(int i = 0; i < 360; i++) {
			e.move(1);
			e.turn(1);
		}
		e.hide();
	});
	
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
}
}

