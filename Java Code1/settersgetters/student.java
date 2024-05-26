package settersgetters;

public class student {
    int stdID;
    String name;
    char div;
    int year;

    public void setStdID(int ID)// setter
    {
        stdID = ID;
    }

    public void setName(String sname)// setter
    {
        name = sname;
    }

    public void setDiv(char d)// setter
    {
        div = d;
    }

    public void setYear(int y)// setter
    {
        year = y;
    }

    // getters:-
    public int getStdID() {
        return stdID;
    }

    public String getName() {
        return name;
    }

    public char getDiv() {
        return div;
    }

    public int getYear() {
        return year;
    }
}
