/*
* generated by Xtext
*/
package org.xtext.example.mydsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SubGrLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/example/mydsl/parser/antlr/internal/InternalSubGrLang.tokens");
	}
}