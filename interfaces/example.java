package interfaces;




interface Engine {

    void start();
    void stop();
    
}

interface Gps{
    void navigate(String location) ;
}


class Bus implements Engine , Gps {
    @Override
        
        public  void start(){
            System.out.println("Bus Engine started ");
          }

     @Override 
        public void navigate(String location) {
            System.out.println("Navigating to :   "+location);

        }
    @Override
        public  void stop(){
            System.out.println("Bus Engine stopped ");
          }


}






public class example {
     public static void main(String[] args) {
        Bus bus = new Bus(); 
        bus.start();
        bus.navigate("Paris");
        bus.stop();

     }
}
