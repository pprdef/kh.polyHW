package game.model.vo;

public class Moon extends Shapes {
	public Moon(int hp, int exp, String shapes) {
		super(hp,exp,shapes);
	}
	
	@Override
	public void appear() {
		System.out.println("달이 나타났습니다.");
	}
	public void attack() {
		System.out.println("달이 달조각을 날립니다.");
	}
	public void hitMoon() {
		System.out.println("달의 hp가 20만큼 감소합니다.");
		super.setHp(super.getHp() - 20);
		
		if(super.getHp() <= 0) {
			System.out.println("달이 쓰러집니다. 경험치가 " + super.getExp() + "만큼 상승합니다.");
		}
	}
}
