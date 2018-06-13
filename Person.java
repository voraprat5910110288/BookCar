abstract class Person{
    protected  String name;
    protected  int rank;


    public Person(String name,int rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName(){
        return this.name;
    }

    public int getRank(){
        return this.rank;

    }
}