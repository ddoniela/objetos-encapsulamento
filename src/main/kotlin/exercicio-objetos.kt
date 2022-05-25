/*

Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
e pelo menos mais duas opções de construtores conforme sua percepção, com os atributos:
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.

 */

fun main() {
    while (true) {
        println("Digite o nome do cliente: ")
        var nome = readln()

        println("Digite o endereço: ")
        var endereco = readln()

        println("Digite o telefone: ")
        var telefone = readln()



        try {
            val cliente = Cliente(nome, endereco, telefone)

            while (true) {
                println("\nMenu\n")

                println("1 - Adicionar Compras")
                println("2 - Remover Compras")
                println("3 - Listar Compras")
                println("4 - Sair\n")

                println("Opção: ")
                val opc = readln().toInt()

                when (opc) {

                    1 -> {
                        println("Digite um item para adicionar: ")
                        val compra = readln()
                        cliente.adicionar(compra)
                    }

                    2 -> {
                        println("Digite um item para remover: ")
                        val compra = readln()
                        cliente.remover(compra)
                    }

                    3 -> {
                        cliente.mostrarLista()
                    }

                    4 -> break

                    else -> println("Valor Inválido")

                }

            }
            break
        } catch (e: Exception) {
            println(e.message)
        }
    }
}