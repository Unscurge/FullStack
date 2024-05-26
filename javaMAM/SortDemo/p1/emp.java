package SortDemo.p1;

public class emp {
    private int id;
    private String name;
    private String city;
    public emp() {
        super();
    }
    public emp(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "emp [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
    // @Override
    // public int compareTo(emp e) {
    //     if(this.id>e.id)
    //     {
    //         return 1;
    //     }
    //     else if(this.id<e.id)
    //     {
    //         return -1;
    //     }
    //     else{
    //         return 0;
    //     }
    // } need implement comparable<emp>
    

}
