
class Magazyn extends ProduktAbstractDekorator {

	public Magazyn(ProduktAbstract produkt) {
		super(produkt);
	}

	@Override
	public String getNazwa() {
		return produkt.getNazwa()+"Magazyn wêdkarski ";
	}

	@Override
	public double cena() {
		return produkt.cena()+6.50;
	}
}
class Czekolada extends ProduktAbstractDekorator {

	public Czekolada(ProduktAbstract produkt) {
		super(produkt);
	}

	@Override
	public String getNazwa() {
		return produkt.getNazwa()+"Czekolada ";
	}

	@Override
	public double cena() {
		return produkt.cena()+3.50;
	}
}
class NapojGaz extends ProduktAbstractDekorator {

	public NapojGaz(ProduktAbstract produkt) {
		super(produkt);
	}

	@Override
	public String getNazwa() {
		return produkt.getNazwa()+"Napój gazowany ";
	}

	@Override
	public double cena() {
		return produkt.cena()+4.50;
	}
}
