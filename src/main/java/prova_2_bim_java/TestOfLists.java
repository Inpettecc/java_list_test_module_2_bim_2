package prova_2_bim_java;

import java.util.ArrayList;
import java.util.List;

public class TestOfLists {

	public static void main(String[] args) {
		/**
		 * (enUS) You can use the method main to test the other two methods: test1 and test2. Do not write
		 * any other kind of code here instead of methods calls.
		 * (ptBR) Você pode usar este método main somente para testar os métodos: test1 e test2. Não utilize
		 * este método para mais nada além de fazer as chamadas para os outros métodos.
		 */
	}
	/**
	* 1)
	* (enUS) The test1 method receive a list of Strings as parameter and should return a new
	* list with all the unique values, that means, all the repeated values should be excluded
	* from the new list.
	* (ptBr) O método test1 recebe uma lista de Strings e deve retornar uma nova lista com todos
	* os valores unicos contidos nela, ou seja, valores repetidos devem ser excluídos da nova
	* lista.
	*
	* OBS: Não mude em nada a assinatura do método, ou seja, não adicione novos parâmetros, não
	* troque a visibilidade (public|private|protected) e, mantenha o retorno dentro do tipo esperado.
	* 
	* Note: Do not change the method signature by adding parameters, changing the method visibility
	* (public|private|protected) and keep the return inside the expected type.
	*
	* @param: List<String> list
	* @return: List<String> newList
	*/
	public List<String> test1(List<String> list) {
		List<String> newList = new ArrayList<String>();
		return newList;
	}
	
	
	/**
	* 2)
	* (enUS) The test2 method receive a String and a List of strings as parameter. This method
	* should add the String inside the list provided as parameter, but just in case the provided
	* value is not inside the provided list already. If the provided value is inside the list, the
	* method should return the same list that 
	* (ptBR) O método test2 recebe uma String e uma Lista como parâmetros. Este método deve
	* adicionar o valor da String na lista, caso este valor ainda não exista na Lista. Caso
	* o valor informado no primeiro parâmetro exista na lista (informada como segundo parâmetro),
	* o método não deve fazer nada além de retornar a mesma lista que é recebida.
	*
	* OBS: Não mude em nada a assinatura do método, ou seja, não adicione novos parâmetros, não
	* troque a visibilidade (public|private|protected) e, mantenha o retorno dentro do tipo esperado.
	* 
	* Note: Do not change the method signature by adding parameters, changing the method visibility
	* (public|private|protected) and keep the return inside the expected type.
	*/
	public List<String> test2(String value, List<String> list) {
		return list;
	}

}
