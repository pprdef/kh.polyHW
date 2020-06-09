package game.controller;

import game.model.vo.Moon;
import game.model.vo.Shapes;
import game.model.vo.Star;
import game.model.vo.Sun;
import game.model.vo.User;

public class SSMController {
	public void start(String name) {
		
		User u = new User(name);
		
		System.out.println(u.getName() + "���� �����ϼ̽��ϴ�.");
		
		
		Shapes s1 = new Star(80, 60, "��" );
		
		s1.appear();
		
		if(s1 instanceof Star) {
			((Star) s1).attack();
		}
		
		for(int i = s1.getHp(); i>0; i-= 25) {
			if(s1 instanceof Star) {
				((Star) s1).hitStar();
			}
		}
		u.setExp(u.getExp() + s1.getExp());
		System.out.println(u);
		
		Shapes s2 = new Moon (100, 80, "��");
		
		if(s2 instanceof Moon) {
			((Moon) s2).attack();
		
		}
		
		for(int i = s2.getHp(); i>0; i-= 20) {
			if(s2 instanceof Moon) {
				((Moon) s2).hitMoon();
			}
		}
		u.setExp(u.getExp() + s2.getExp());
		//toString�̿��ؼ� �ٷΰ�����
		System.out.println(u);
		
		Shapes s3 = new Sun (120, 100, "��");
		if(s3 instanceof Sun) {
			((Sun) s3).attack();
			
		}
		
		for(int i = s3.getHp(); i>0; i-= 15) {
			if(s3 instanceof Sun) {
				((Sun) s3).hitSun();
				//Ʈ���� ĳġ�� ���� �����ؼ� �ۼ���.
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		u.setExp(u.getExp() + s3.getExp());
		//toString�̿��ؼ� �ٷΰ�����
		System.out.println(u);
		
	}
}