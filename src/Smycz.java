
public class Smycz extends ProduktAbstractDekorator{
	public Smycz(ProduktAbstract produkt) {
		super(produkt);
	}

	@Override
	public String getNazwa() {
		return "Smycz";
	}

	@Override
	public double cena() {
		return produkt.cena()+1;
	}

}
