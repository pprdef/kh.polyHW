package game.model.vo;

public class Moon extends Shapes {
	public Moon(int hp, int exp, String shapes) {
		super(hp,exp,shapes);
	}
	
	@Override
	public void appear() {
		System.out.println("���� ��Ÿ�����ϴ�.");
	}
	public void attack() {
		System.out.println("���� �������� �����ϴ�.");
	}
	public void hitMoon() {
		System.out.println("���� hp�� 20��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 20);
		
		if(super.getHp() <= 0) {
			System.out.println("���� �������ϴ�. ����ġ�� " + super.getExp() + "��ŭ ����մϴ�.");
		}
	}
}
