package prova_2_bim_java;

import spock.lang.Specification;

public class TestOfListsSpec extends Specification {
	TestOfLists tests
	def setup() {
		tests = new TestOfLists()
	}

	def "should retrieve unique elements of a list of String with repeated elements"() {
		when:
		def result = tests.test1(["Daniel", "Daniel", "Daniel", "Juliana", "Juliana", "Alice", "Davi"])
		
		then:
		result == ["Daniel", "Juliana", "Alice", "Davi"] 
	}
	
	def "should not add duplicated values"() {
		expect:
		result == tests.test2(value, list)
		
		where:
		result							| value			| list
		["Daniel"]						| "Daniel"		| []
		["Daniel"]						| "Daniel"		| ["Daniel"]
		["Daniel", "Alice"]				| "Alice"		| ["Daniel"]
		["Daniel", "Alice", "Davi"]		| "Davi"		| ["Daniel", "Alice"]
		["Daniel", "Alice", "Davi"]		| "Alice"		| ["Daniel", "Alice", "Davi"]
		
	}
}
