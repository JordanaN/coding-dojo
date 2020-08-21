package dojo1

import dojo1.ProdutoEscalarVetores
import org.junit.*
import kotlin.test.assertEquals

//Você está resolvendo este problema.
//Este problema foi utilizado em 153 Dojo(s).
//Definimos dois vetores A e B de dimensão n em termos de componentes como:
//A = (a1, a2, a3, ..., an) e B = (b1, b2, b3, ..., bn)
//O produto escalar entre esses vetores é descrito como:
//A . B = a1 * b1 + a2 * b2 + a3 * b3 + ... + an * bn
//Desenvolva um programa que, dado dois vetores de dimensão n, retorne o produto escalar entre eles.

class ProdutoEscalarVetoresTest{

    @Test
    fun `test a potato`(){
        val a = listOf(2,2)
        val b = listOf(3,4)
        val produtoEscalarVetores = ProdutoEscalarVetores()

        val result = produtoEscalarVetores.foo(a, b)

        assertEquals(14, result)
    }

    @Test
    fun `returns vector escalar product`(){
        val a = listOf(3,2)
        val b = listOf(3,4)
        val produtoEscalarVetores = ProdutoEscalarVetores()

        val result = produtoEscalarVetores.foo(a, b)

        assertEquals(17, result)
    }
}

