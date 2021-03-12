package closurestudy;

class Person {
    String name
    int age

    void eat(String food) {
        println("你喂的${food}真难吃")
    }

    @Override
    void setProperty(String propertyName, Object newValue) {
        super.setProperty(propertyName, newValue)
    }

    void name(String name){
        this.name = name
    }

    void age(int age){
        this.age = age;
    }

    @Override
    String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'
    }
}

