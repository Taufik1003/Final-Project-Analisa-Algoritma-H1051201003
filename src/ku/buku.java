package ku;

public class buku {
	String idbuku, judul, penerbit, Jenis; 
	int tahun, jumlah;

	public buku(String id, String jd, String pn, String jn, int thn, int jml) {
		this.idbuku = id;
		this.judul = jd;
		this.penerbit = pn;
		this.Jenis = jn;
		this.tahun = thn;
		this.jumlah = jml;
		
	}

	public String getIdbuku() {
		return idbuku;
	}

	public void setIdbuku(String idbuku) {
		this.idbuku = idbuku;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getPenerbit() {
		return penerbit;
	}

	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}

	public String getJenis() {
		return Jenis;
	}

	public void setJenis(String jenis) {
		Jenis = jenis;
	}

	public int getTahun() {
		return tahun;
	}

	public void setTahun(int tahun) {
		this.tahun = tahun;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}
	
	
}
