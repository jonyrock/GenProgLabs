/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.example.mydsl.subGrLang.Person
import org.xtext.example.mydsl.subGrLang.FollowRecord

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SubGrLangGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(
			resource.URI.lastSegment + '.xml',
			compile(resource)
		)
	}

	def compile(Resource resource) {
		'''<?xml version="1.0"?>''' + "\n" +
		'''<persons>''' + "\n" + 
		resource.allContents.filter(Person).map[compile].join('\n') + "\n" + 
		'''</persons>'''
	}

	def compile(Person p) {
		'''  <person name="«p.name»">'''+
		p.following.map[compile].join('') + "\n" +
		'''  <person>'''
	}
	
	def compile(FollowRecord r) {
		"\n" + '''    <follow person="«r.person.name»"/>'''		
	}

}
