class Car{
    
    private String  kindCar;
    private String  statusCar;
    private String  register;
    private int     date;
    
    public Car(String kindCar,String statusCar,String register,int day,int mouth){
        this.kindCar   =  kindCar;
        this.statusCar =  statusCar;
        this.register  =  register;
        this.date      =  (mouth*1000)+day;
    }
    
    public  void setStatusCar(){

    }
    public String getKindCar(){
        return this.kindCar;
    }
    public String  getStatusCar(){
        return this.statusCar;
    }
    public String  getRegister(){
        return this.getStatusCar();
    }
    public int getDate(){
        return this.date;
    }

    public void print(){
        System.out.println("Kind Car  : " + this.kindCar);
        System.out.println("Status Car: " + this.statusCar);
		System.out.println("Register  : " + this.register);
    }
}