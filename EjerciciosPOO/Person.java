public class Person {
	    // Atributos 
		int  age;
        String name,id;
        // Constructor *Obliga a meterle cada atributo a Person al crearla      
        public Person(String name, int  age, String id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }
        // METODOS Y ACCIONES 
        public void sayHello(String name, int age) {
            System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        }

	}

