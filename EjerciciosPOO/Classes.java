public class Classes{
public static void main(String[] args) {

        Person person = new Person("M.Amin",(int)38, "123456789A");

        person.name =null;
        person.age = 18;
        person.id = "14013224Z";

        person.sayHello(person.name, person.age);

        person.name = "Brais Moure";
        System.out.println(person.name);

//        person.id = "123456789A";
/*
        System.out.println(person.getId());

        person.setAge(38);
        System.out.println(person.getAge());

        var person2 = new Person("MoureDev", 18, "123456789B");
        person2.sayHello(person2.name, person2.age);    
*/
        var book=new Book("El Quijote", "Miguel de Cervantes", 123456789);

        book.title = "El Quijote";
        book.autor = "Miguel de Cervantes";    
        book.isbn = 123456789;

        // Corrección: showData() no recibe parámetros; utiliza los atributos del libro.
        book.showData();
        var dog = new Dog("Woof!");
        dog.bark(dog.sound);


         // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.

        // 3. Añade un constructor a la clase Book que reciba title y author.

        // 4. Crea una clase Car con atributos brand y model y un método showData().

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
}}