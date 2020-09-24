public class testException {
    public static void main(String[] args){
        try{
            throw new EmptyTextException("文本为空!");
        }catch(EmptyTextException e){
            e.printStackTrace();
        }
    }
}
