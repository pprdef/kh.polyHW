package game.model.vo;

public class Star extends Shapes {
	public Star(int hp, int exp, String shapes) {
		super(hp,exp,shapes);
	}
	
	@Override
	public void appear() {
		System.out.println("���� ��Ÿ�����ϴ�.");
	}
	public void attack() {
		System.out.println("���� �������� �����ϴ�.");
	}
	public void hitStar() {
		System.out.println("���� hp�� 25��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 25);
		
		if(super.getHp() <= 0) {
			System.out.println("���� �������ϴ�. ����ġ�� " + super.getExp() + "��ŭ ����մϴ�.");
		}
	}
}
