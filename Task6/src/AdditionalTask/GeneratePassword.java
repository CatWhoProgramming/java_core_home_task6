package AdditionalTask;

public class GeneratePassword {
    private static String password;
    public static void runGeneratePassword(){
        password = String.valueOf(Generate.generateMethod());
        System.out.println(password);
    }
    static class Generate{

        static final String [] array = new String []{"q","Q","f","_","4",
         "55","r","W","T","O","7","8","0","!","@","1","2",
        "3","d","D","F","%"};

        public static StringBuffer generateMethod(){
            StringBuffer string = new StringBuffer();
            for(int i = 0; i< 8; i++){
                string.append(array[(int) (Math.random()*(array.length-1))]);
            }
            return string;
        }
    }
}
