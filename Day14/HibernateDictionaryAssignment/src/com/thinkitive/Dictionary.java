package com.thinkitive;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demodictonary")
public class Dictionary {

	@Id
	//@GeneratedValue
	@Column(name = "word")
	private String word;
	
	@Column(name = "meaning")
	private String meaning;
	
	public Dictionary() {
		// TODO Auto-generated constructor stub
	}

	public Dictionary(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}

	public String getWord() {
		return word;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionary other = (Dictionary) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", meaning=" + meaning + "]";
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	
}
