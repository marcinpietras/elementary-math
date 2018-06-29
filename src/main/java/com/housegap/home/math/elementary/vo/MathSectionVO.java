package com.housegap.home.math.elementary.vo;

import java.util.List;

public class MathSectionVO {
	
	private String name;
	
	private List<String> sentences;

	public MathSectionVO(String name, List<String> sentences) {
		this.name = name;
		this.sentences = sentences;
	}

	public String getName() {
		return name;
	}

	public List<String> getSentences() {
		return sentences;
	}

}
