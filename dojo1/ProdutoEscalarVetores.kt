package dojo1

//Você está resolvendo este problema.
//Este problema foi utilizado em 153 Dojo(s).
//Definimos dois vetores A e B de dimensão n em termos de componentes como:
//A = (a1, a2, a3, ..., an) e B = (b1, b2, b3, ..., bn)
//O produto escalar entre esses vetores é descrito como:
//A . B = a1 * b1 + a2 * b2 + a3 * b3 + ... + an * bn
//Desenvolva um programa que, dado dois vetores de dimensão n, retorne o produto escalar entre eles.

class ProdutoEscalarVetores {

    fun foo(a: List<Int>, b: List<Int>) : Int {

        var produtoEscalar = 0
        a.forEachIndexed { index, current->
            produtoEscalar += current * b.get(index)
        }
        return produtoEscalar
    }
}