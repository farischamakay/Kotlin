/*Collections merupakan sebuah objek yang bisa menyimpan kumpulan objek lain termasuk data class.
Collections dikategorikan menjadi 2 yaitu eager/horizontal evaluation yaitu List, Set, Map, dan lazy/vertical evaluation yaitu Sequence.
Kode berikut merupakan contoh penerapan collections*/

fun main(){
    //----------------------------List-----------------------
    //list dignakan untuk menyimpan data dalam satu object
    val object1 = listOf("Mobil", "Motor", 1, "Kuda", "Meja");
    println(object1[2]); //output : 1
    
    //List bersifat immutable(tidak bisa dimanipulasi) sehingga kita dapat
    //menggunakan mutableListOf
    val object2 = mutableListOf("Mobil", "Motor", 1, "Kuda", "Meja");
    object2[2] = '3';
    println(object2[2]); //output : 3
    
    //----------------------------Set-----------------------
    //set merupakan collection yg digunakan untuk menyimpan 
    //data unik (tidak ada data yang sama)
    val object3 = setOf("Mobil", "Motor", 1, "Kuda", "Meja");
    val object4 = setOf("Mobil", "Mobil", "Motor", 1, "Kuda", "Meja");
    println("List Object 3: $object3\nList object4 : $object4"); 
    
    //Dengan menggunakan set kita juga dapat mengecek nilai set
    println("Motor" in object3); //output : true
    
    //Set juga bersifat immutable dan hanya bisa menambah dan menghapus
    // item menggunakan mutableSetOf()
    val object5 = mutableSetOf("Mobil", "Mobil", "Motor", 1, "Kuda", "Meja");
    object5.add("Sepeda");
    println(object5); //output : [Mobil, Motor, 1, Kuda, Meja, Sepeda]
    
    //--------------------------------List--------------------------------
    //Map adalah sebuah collection yang menyimpan data dengan format key-value
    
    val object6 = mapOf(
        "Indonesia" to "Jakarta",
        "Malaysia" to "Kuala Lumpur",
        "Japan" to "Tokyo",
    );
    
    //untuk mengambil key-value kita bisa menggunakan fungsi keys() dan values()
    var keys = object6.keys;
    var values = object6.values;
    println("Negara = $keys || Ibukota = $values"); //Output : Negara = [Indonesia, Malaysia, Japan] || Ibukota = [Jakarta, Kuala Lumpur, Tokyo]
    
    
    //--------------------------------Sequences--------------------------------
    /*Berikut merupakan contoh penerapan lazy/Vertical evaluation dimana proses
     * program hanya akan mengevaluasi jika benar-benar diperlukan*/
    
    //contoh apabila penggunaan eager evaluation:
    val x = (1..8000).toList();
    x.filter{it % 5 == 0}.map { it * 5}.forEach{print(it)};
    
    //apabila penggunaan lazy evaluation kita dapat menggunakan fungsi asSequence()
    x.asSequence().filter{it % 5 == 0}.map { it * 5}.forEach{print(it)};
    
    //Kita dapat membuat object sequence dengan fungsi generateSequence()
    val sequeceNum = generateSequence(3){ it + 1000};
    sequeceNum.take(10).forEach{println(it)};
    
    //--------------------------------Collection Operations--------------------------------
    //Ada beberapa operations yang bisa kita gunakan pada collections
    
    //1. Filter. Kita dapat melakukan filter data pada objek dengan fungsi filter() dan
    //filterNot(). Contoh :
 	val object7 = listOf(1,2,3,4,5,6,7,8,9)
    val filter = object7.filter{ it % 2 == 0};
    val filterNot = object7.filterNot{ it % 2 == 0};
    println(filter); //output : [2, 4, 6, 8]
    println(filterNot); // output [1, 3, 5, 7, 9]
    
    //2.map()
    // Fungsi ini dapat menyimpan collections baru dari perubahan yang kita
    // lakukan pada collections sebelumnya. Contoh:
    val nama = listOf("John", "Mathew", "Mark");
    val namaLengkap = nama.map{it + " Sugara"};
    println(namaLengkap) //output : [John Sugara, Mathew Sugara, Mark Sugara]
    
    //3. count() and sum()
    //Fungsi ini merupakan operasi dimana count akan menghitung jumlah item
    //dan sum akan menjumlahkan seluruh nilai item. Contoh:
    val number = listOf(8,2,1,34,4,5,8,8,9,2);
    println(number.count()); //output = 10
    println(number.sum()); //output = 81
    
    //4. sorted()
    //Kita dapat melakukan pengurutan data sorted() dan descrending()
    println(number.sorted());
   	println(namaLengkap.sorted());
    println(namaLengkap.sortedDescending());
    
    
    
  
  
}
