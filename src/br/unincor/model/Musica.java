package br.unincor.model;

public class Musica {
	private int id;
	private String titulo;
	private String artista;
	private String album;
	private Long duracao;
	
	public Musica(int id, String titulo, String artista, String album, Long duracao) {
		super();
		this.id = id;
		
		if(titulo.length() > 30)
			this.titulo = titulo.substring(0, 30);
		else
			this.titulo = titulo;
		
		if(artista.length() > 30)
			this.titulo = titulo.substring(0, 30);
		else
			this.artista = artista;
		
		if(album.length() > 30)
			this.album = album.substring(0, 30);
		else
			this.album = album;
		
		if(duracao >= 60 && duracao <= 600)
			this.duracao = duracao;
		else
			this.duracao = null;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if(titulo.length() > 30)
			this.titulo = titulo.substring(0, 30);
		else
			this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		if(artista.length() > 30)
			this.titulo = titulo.substring(0, 30);
		else
			this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		if(album.length() > 30)
			this.album = album.substring(0, 30);
		else
			this.album = album;
	}
	public Long getDuracao() {
		return duracao;
	}
	public void setDuracao(Long duracao) {
		if(duracao >= 60 && duracao <= 600)
			this.duracao = duracao;
		else
			this.duracao = null;
	}

	@Override
	public String toString() {
		return this.id + ";" + this.titulo + ";" + this.artista + ";" + this.album + ";" + this.duracao + "\n";
	}
	
	
	
	
}
