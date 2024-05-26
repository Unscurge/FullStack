package Homework.Item;

public class item {
    String title, publisher;
    int publishYear;
    int ISBN;
    float price;

}

class book extends item {
    String Author;
    int Edition, Volume;
}

class musicCd extends item {
    String Artist;
    int vol;
}

class Software extends item {
    float version;
}
