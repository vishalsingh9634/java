class mca_b{
    class mca{
        void show(){
            System.out.println("Welcome to MCA");
        }
    }
    public static void main(String args[]){
        mca_b outer = new mca_b();
        mca_b.mca inner = outer.new mca();
        inner.show();
    }
}