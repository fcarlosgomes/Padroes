package pkg;

public class MP3_2 extends MP3 {
	WMA wma;

	public MP3_2(WMA wma) {
		this.wma = wma;
		super.setMusica(wma.som);
	}
}
