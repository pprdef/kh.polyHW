package game.model.vo;

public class Star extends Shapes {
	public Star(int hp, int exp, String shapes) {
		super(hp,exp,shapes);
	}
	
	@Override
	public void appear() {
		System.out.println("별이 나타났습니다.");
	}
	public void attack() {
		System.out.println("별이 별조각을 날립니다.");
	}
	public void hitStar() {
		System.out.println("별의 hp가 25만큼 감소합니다.");
		super.setHp(super.getHp() - 25);
		
		if(super.getHp() <= 0) {
			System.out.println("별이 쓰러집니다. 경험치가 " + super.getExp() + "만큼 상승합니다.");
		}
	}
}
