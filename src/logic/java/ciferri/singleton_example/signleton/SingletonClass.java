package ciferri.singleton_example.signleton;

public class SingletonClass {

    public static SingletonClass instance;

    private SingletonClass(){}

    public static synchronized SingletonClass getSingletonInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }

    public String getMyToken(String caller){
        if(caller != null){
            if((caller.length() % 2)==0){
                return "TokenExample" + caller.length();
            }else{
                return "TokenExample2" + caller.length() + "00" + (caller.length() + 10);
            }
        }else{
            return "NO_TOKEN";
        }
    }
}
