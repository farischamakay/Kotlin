fun main() {
    
    var dataUser = DataUser("Fariska",21);
    var (name, age) = dataUser;
    
    print("My name is $name and my age $age years old");
}

data class DataUser(val x : String, val y : Int)
