package com.thinkitive.dao;

import java.util.List;

import com.thinkitive.model.Dictionary;

public interface DictionaryDAO {

	public void addWord(Dictionary d);
	
	public List searchWord();
	
	public List showDictionary();
}
