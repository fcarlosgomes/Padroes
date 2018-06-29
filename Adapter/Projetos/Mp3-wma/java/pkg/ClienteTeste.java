package pkg;

public class ClienteTeste {
	public static void main(String[] args) {
		MP3 mp3 = new MP3();
		mp3.setMusica("Roberto Carlos.mp3");
		WMA wma = new WMA("Beatles.wma");

		TocadorMP3.tocarMP3(mp3);
		TocadorMP3.tocarMP3(new MP3_2(wma));
	}
}