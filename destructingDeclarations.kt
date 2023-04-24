fun main() {
    
    var dataUser = DataUser("Fariska",21);
    var (name, age) = dataUser;
    
    // apabila menggunakan ComponentN
    /* 
    val name = dataUser.component1();
    val age = dataUser.component2();
    */
    
    print("My name is $name and my age $age years old");
    
    
}

data class DataUser(val x : String, val y : Int)
