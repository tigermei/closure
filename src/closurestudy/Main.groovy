
package closurestudy


class Main {
    Closure configuration;
    void eat(String food){
        println "我根本不会吃，不要喂我${food}"
    }
    def cc = {
        name "hanmeimei"
        age 26
        eat"油条"
    }

    static void TestClosure(){
        Main main = new Main()
        Person person = new Person(name: "lilei", age: 14)
        println person.toString()

        main.cc.delegate = person
//        main.cc.setResolveStrategy(Closure.DELEGATE_FIRST)
        main.cc.setResolveStrategy(Closure.OWNER_FIRST)
        main.cc.call()
        println person.toString()
    }

    void android(Closure configuration) {
        this.configuration = configuration
        this.configuration.setResolveStrategy(Closure.DELEGATE_FIRST)
    }

    void AndroidClosureConfig(){
        //闭包定义
        android {
            compileSdkVersion 25
            buildToolsVersion "25.0.2"
            defaultConfig {
                minSdkVersion 15
                targetSdkVersion 25
                versionCode 1
                versionName "1.0"
            }
        }

        Android bean = new Android()
        this.configuration.delegate = bean
        this.configuration.call()

        println bean.toString()
    }
    public static void main(String[] args) {
        Main main = new Main()
        main.AndroidClosureConfig()
    }
}


