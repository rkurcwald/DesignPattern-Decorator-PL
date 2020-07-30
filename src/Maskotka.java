
public class Maskotka extends ProduktAbstractDekorator{

	public Maskotka(ProduktAbstract produkt) {
		super(produkt);
	}

	@Override
	public String getNazwa() {
		return "Maskotka";
	}

	@Override
	public double cena() {
		return produkt.cena()+0;
	}

}
