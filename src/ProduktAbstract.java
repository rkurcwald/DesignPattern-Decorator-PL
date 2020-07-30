import java.awt.List;

public abstract class ProduktAbstract {
	
	protected String nazwa;
	public String getNazwa() {
		return nazwa;
	}
	public abstract double cena();
	
	public String toString() {
		return cena()+" "+"z³"+" "+"-"+getNazwa();
	}
}
