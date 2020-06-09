package game.model.vo;

public class Shapes {
	private int hp;
	private int exp;
	private String shapes;
	
	public Shapes() {}
	
	public Shapes(int hp, int exp, String shapes) {
		super();
		this.hp = hp;
		this.exp = exp;
		this.shapes = shapes;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getShapes() {
		return shapes;
	}

	public void setShapes(String shapes) {
		this.shapes = shapes;
	}
	
	public void appear() {
		System.out.println("이(가) 산산조각 났습니다.");
	}
}
