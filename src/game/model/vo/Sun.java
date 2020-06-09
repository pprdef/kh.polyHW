package game.model.vo;

public class Sun extends Shapes {
	public Sun(int hp, int exp, String shapes) {
		super(hp,exp,shapes);
	}
	
	@Override
	public void appear() {
		System.out.println("�ذ� ��Ÿ�����ϴ�.");
	}
	public void attack() {
		System.out.println("�ذ� �¾���� �����ϴ�.");
	}
	public void hitSun() {
		System.out.println("���� hp�� 15��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 15);
		
		if(super.getHp() <= 0) {
			System.out.println("�ذ� �������ϴ�. ����ġ�� " + super.getExp() + "��ŭ ����մϴ�.");
		}
	}
}
