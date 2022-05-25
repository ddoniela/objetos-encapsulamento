
/*

Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
e pelo menos mais duas opções de construtores conforme sua percepção, com os atributos:
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.

 */



data class Cliente (
    private var nome: String, private var endereco: String
        ){

   private var telefone = ""
   var listaDeCompras = mutableListOf<String>()

    init {
        if (nome == ""){
            throw Exception("O nome é obrigatório.")
        }
    }

    constructor(
        nome: String, endereco: String,
        telefone: String
    ):this(nome, endereco){
        this.telefone = telefone
    }

    constructor(
        nome: String, endereco: String,
        telefone: String, listaDeCompras: MutableList<String>
    ):this(nome, endereco, telefone){
        this.listaDeCompras = listaDeCompras
    }

    fun adicionar(item: String){
        if(item != ""){
            listaDeCompras.add(item)
            println("O item foi adicionado com sucesso.")
        }else{
            println("O item não pode ser vazio.")
        }

    }

    fun remover(item: String){
        if(listaDeCompras.contains(item)){
            listaDeCompras.remove(item)
            println("O item foi removido com sucesso.")
        }else{
            println("O item não está na lista.")
        }

    }

    fun mostrarLista(){
        listaDeCompras.forEach{
            println(it)
        }
    }
}


