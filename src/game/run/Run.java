package game.run;

import java.util.Scanner;

import game.controller.SSMController;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SSMController SC = new SSMController();
		
		System.out.println("�̸���  �Է��ϼ��� :");
		String name = sc.nextLine();
		SC.start(name);
	}

}
