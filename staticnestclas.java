public class staticnestclas {
    static class mca{
        void display(){
            System.out.println("welcome to mca");
        }
    }
    public static void main(String args[]){
        staticnestclas.mca ob = new staticnestclas.mca();
        ob.display();
    }
}
