public class Main {
    public static void main(String[] args) {

        try {
            Methods.credential("JJJJJJJJJJ20000000000002", "KKKKKKKK8888", "KKKKKKKK8888");
        } catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }catch (WrongLoginException e  ){
            System.out.println(e.getMessage());
        }

    }
}
