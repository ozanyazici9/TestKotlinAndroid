package com.ozanyazici.testkotlinandroid

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestTax {

    private lateinit var tax: Tax

    //Before anotasyonu testlerden önce yapılcak işlemlerin yazıldığı yerdir. Android bu metodu genellikle setup olarak adlandırır.
    @Before
    fun setup() {
        tax = Tax()
    }

    //After anotasyonu testler bittikten sonra yapılacak işlemlerin yazıldığı yerdir. Android bu metodu genellikle teardown olarak adlandırır.
    @After
    fun teardown() {

    }

    //Test metodlarının adı genelde uzun ve açıklayıcı olur ve formülü -> Ne yapıyorum + sonuc olarak ne bekliyorum şeklinde olur.
    //Bizimki küçük ve öğrenmek için olduğundan kısa yazdık.

    @Test
    fun calculateTaxTest() {
        val tax = Tax()
        val netTax = tax.calculateTax(100.0,0.1)
        //assert(idda etmek) burda da bu buna eşitmi ona bak değilse hata ver diyoruz.
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncomeTest() {
        val tax = Tax()
        val netIncome = tax.calculateIncome(100.0,0.1)
        assertThat(netIncome).isEqualTo(90)
    }
}