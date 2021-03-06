package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //indica para o Spring que essa classe tera um correspondente no banco de dados
@Table(name = "tb_artista")
public class Artista {

		@Id // primary key
		@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremento
		@Column(name="id")
		private int id;
		
		@Column(name="nomeArtistico", length=40)
		private String nomeArtistico;
		
		@Column(name="nacionalidade", length=20)
		private String nacionalidade;

		
		@Override
		public String toString() {
			return "Artista [id=" + id + ", nomeArtistico=" + nomeArtistico + ", nacionalidade=" + nacionalidade + "]";
		}

		public Artista() {
			super();
		}

		public Artista(int id, String nomeArtistico, String nacionalidade) {
			super();
			this.id = id;
			this.nomeArtistico = nomeArtistico;
			this.nacionalidade = nacionalidade;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNomeArtistico() {
			return nomeArtistico;
		}
		public void setNomeArtistico(String nomeArtistico) {
			this.nomeArtistico = nomeArtistico;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		
		

		
}
		
		
	