package com.housegap.home.math.elementary.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.housegap.home.math.elementary.vo.MathSectionVO;

@Component
public class DocumentGeneratorService {
	
	public String generateDocument(String header, List<MathSectionVO> sentences) {
		StringBuilder document = new StringBuilder();
		document.append("<html><body>");
		document.append("<h3>");
		document.append(header);
		document.append("</h3>");
		document.append("<table style=\"width:100%\">");
		
		for (MathSectionVO section : sentences) {
			document.append(generateSection(section.getName(), section.getSentences()));
		}

		document.append("</table>");
		document.append("</body></html>");
		return document.toString();
	}
	
	private String generateSection(String sectionName, List<String> sentences) {
		StringBuilder section = new StringBuilder();	
		section.append("<tr><td>");
		section.append("-----------------------------------------");
		section.append("</td><td></td></tr>");
		section.append("<tr><td>");
		section.append(sectionName);
		section.append("</td><td></td></tr>");
		int index = 0;
		while (index + 1 < sentences.size()) {
			section.append(generateRow(sentences.get(index++), sentences.get(index++)));
		}
		if (index < sentences.size()) {
			section.append(generateRow(sentences.get(index), ""));
		}
		return section.toString();
	}
	
	private String generateRow(String column1, String column2) {
		StringBuilder row = new StringBuilder();
		row.append("<tr><td>");
		row.append(column1);
		row.append("</td><td>");
		row.append(column2);
		row.append("</td></tr>");
		return row.toString();
	}

}
