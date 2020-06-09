package game.model.vo;

public class Sun extends Shapes {
	public Sun(int hp, int exp, String shapes) {
		super(hp,exp,shapes);
	}
	
	@Override
	public void appear() {
		System.out.println("해가 나타났습니다.");
	}
	public void attack() {
		System.out.println("해가 태양빛을 날립니다.");
	}
	public void hitSun() {
		System.out.println("해의 hp가 15만큼 감소합니다.");
		super.setHp(super.getHp() - 15);
		
		if(super.getHp() <= 0) {
			System.out.println("해가 쓰러집니다. 경험치가 " + super.getExp() + "만큼 상승합니다.");
		}
	}
}
