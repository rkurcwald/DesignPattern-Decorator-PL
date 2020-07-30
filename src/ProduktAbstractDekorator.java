
public abstract class ProduktAbstractDekorator extends ProduktAbstract{
	protected ProduktAbstract produkt;
	public ProduktAbstractDekorator(ProduktAbstract produkt) {
		this.produkt=produkt;
	}
	@Override
	public abstract String getNazwa();
}
