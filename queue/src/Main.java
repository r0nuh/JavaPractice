public class Main {
    public static void main(String[] args) throws Exception {

        Queue q = new Queue(3);
        try {
            q.addElement(3);
            q.addElement(4);
            System.out.println(q);
            q.removeElement();
            System.out.println(q);
            q.removeElement();
            System.out.println(q);
            q.removeElement();
            System.out.println(q);
//            q.addElement(1);
//            q.addElement(2);
//            q.addElement(3);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(q);
    }
}
