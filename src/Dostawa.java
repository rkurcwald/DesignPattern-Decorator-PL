import java.math.BigDecimal;

public class Dostawa extends ProduktAbstractDekorator{
	final int koszt;

	public Dostawa(int koszt,ProduktAbstract produkt) {
		super(produkt);
		this.koszt=koszt;
	}

	@Override
	public String getNazwa() {
		return "Dostawa: "+koszt+" PLN ";
	}

	@Override
	public double cena() {
		return produkt.cena()+koszt;
	}
}
