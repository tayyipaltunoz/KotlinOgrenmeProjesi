package com.tayyipaltunoz.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.ln

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("merhaba kotlin")
        //val tekrar değiştirilemeyen
        //var tekrar değer atanabilen
        var a=5.5
        var b=6
        var sonuc=a+b

        println("sonuc " + sonuc)

        var yas=50

        println(yas*2)

        val x=5
        val y=9
        println(x+y)
        println(a/y)

        println("------------------Int-------------")
        //Tanımlama (defining)
        val benimIntergerim : Int

        //Başlatma, Değerini Atama (Initializing, Initialization)
        benimIntergerim=10

        var yeniInterger : Int = 20
        println(yeniInterger/benimIntergerim)
        println("------------------Long-------------")

        var benimLong : Long = 100
        benimLong = 3000000000005
        println(benimLong)

        println("------------------Double & Float-------------")

        val pi = 3.14
        println(pi*2)

        val floatPi : Float = 3.14f
        println(floatPi*3)

        val yeniDouble = 5.0
        println(yeniDouble/2)

        //String - Metin
        println("------------------String-------------")

        val myString = "Benim Yeni Metnim"
        println(myString.length)

        val isim = "tayyip"
        val soyisim = "altunöz"
        val tamisim = isim + " " + soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "20"
        println(yeniBirString + "89")

        //boolean
        println("------------------boolean-------------")

        var myBoolean =true
        myBoolean=false

        println(3==5) //false

        //Veri Tipi Dönüştürme
        println("------------------Dönüştürme-------------")
        val benimInt =  10
        val benimLogaCevrilenInt = benimInt.toLong()
        println(benimLogaCevrilenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt/2)

        //Koleksiyonlar
        //Array - dizi
        println("------------------Koleksiyonlar-------------")
        val benimDizim = arrayOf("tayyip","altunöz","zeynep","kerem","osman")
        println(benimDizim[0])
        println(benimDizim.get(4))
        benimDizim[1]="tokat"
        println(benimDizim[1])

        benimDizim.set(1,"turan")
        println(benimDizim[1])

        val numaraDizisi = arrayOf(0,1,2,3,4,5,6)
        val karisikDizi = arrayOf(0,1,"iki",3,"dört",5.1,false)
        println(karisikDizi.get(2))

        //ArrayList - Listeler
        println("------------------ArrayList-------------")

        val isimListesi = arrayListOf("Ahmet","Zeynep","Osman")
        println(isimListesi[1])
        isimListesi.add("ankara")
        println(isimListesi[3])

        val karisikArrayList = arrayListOf<Any>(1,2,"",true,4.4)
        karisikArrayList.add("ist")
        karisikArrayList.add(false)
        karisikArrayList.add(12.9)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(1)
        println(intArrayList[0])

        //Set
        println("------------------Set-------------")

        val ornekDizi = arrayOf(7,8,9,9,8,9)
        println("index 2 : " + ornekDizi[2])
        println("index 2 : ${ornekDizi[3]}")
        println(ornekDizi.size)

        val benimSet = setOf<Int>(4,5,6,8,8,8,10)
        println(benimSet.size)  //Set arrayine her bir değerden bir kez tanımlama yapılabilir toplam 5 değer var sonucu dönecek

        //For Each
        benimSet.forEach {
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Yavuz")
        digerSet.add("Yavuz")
        digerSet.add("Mustafa")
        digerSet.add("Kübra")
        digerSet.forEach {
            println(it)
        }
    }
}