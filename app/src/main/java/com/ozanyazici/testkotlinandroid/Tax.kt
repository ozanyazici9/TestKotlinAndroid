package com.ozanyazici.testkotlinandroid

class Tax {

    //TDD - Test Driven Development: Teste dayalı geliştirme, geliştirme yaptıkça test etmeyi öneren bir yaklaşım.
    //Test - Development - Test - Development konsepri önce testi yazıp daha sonra asıl kodu yapmayı amaçlıyor.
    //Sebebi, geliştirmeyi önce testi sonra yapınca psikolojik olarak testi kendini doğrulayacak şekilde yapabilirsin.
    //Buna engel olmak için önce testi sonra developmentı yap der bu yaklaşım.

    fun calculateTax(grossIncome: Double, taxRate: Double): Double {
        return grossIncome * taxRate
    }

    fun calculateIncome(grossIncome: Double, taxRate: Double): Double {
        return grossIncome - (grossIncome * taxRate)
    }
}