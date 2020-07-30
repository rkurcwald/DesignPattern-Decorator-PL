import java.math.BigDecimal;

public class Rabat extends ProduktAbstractDekorator{
	final int znizka;

	public Rabat(int znizka,ProduktAbstract produkt) {
		super(produkt);
		this.znizka=znizka;
	}

	@Override
	public String getNazwa() {
		return "Rabat: "+znizka+" PLN ";
	}

	@Override
	public double cena() {
	double cena=produkt.cena()-znizka;
		if(cena<=0) {
			cena=0;
		}
		return cena;
	}
}
