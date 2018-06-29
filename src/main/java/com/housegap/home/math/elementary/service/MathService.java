package com.housegap.home.math.elementary.service;

import java.util.List;

import com.housegap.home.math.elementary.vo.MathSectionVO;

public interface MathService {
	
	public List<MathSectionVO> getMathSentences(String gradeKey) throws IllegalArgumentException;

}
