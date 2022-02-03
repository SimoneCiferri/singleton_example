package ciferri.singleton_example.signleton;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass(){}

    public static synchronized SingletonClass getSingletonInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }

    public String getMyToken(String caller){
        String token = "NO_TOKEN";
        if(caller != null){
            if((caller.length() % 2)==0){
                token = generatePersonalToken(caller);
            }else{
                token = generatePersonalTokenPremium(caller);
            }
        }
        return token;
    }

    private String generatePersonalToken(String caller){
        String token = "";
        if(caller.length() % 2 == 0){
            token = "FreeToken" + (caller.length() + 122);
        }else{
            token = "FreeToken" + 0 + (caller.length() + 123);

        }
        return token;
    }

    private String generatePersonalTokenPremium(String caller){
        String token = "PremiumUserToken";
        if(caller.length() % 2 == 0){
            token = token + "_Serial_" + (caller.length() + 777);
        }else{
            token = token + "_Serial_"  + 0 + (caller.length() + 777);
        }
        return token;
    }
}
