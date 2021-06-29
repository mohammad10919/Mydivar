package ir.mohammad.mydivar;

import androidx.recyclerview.widget.RecyclerView;

public class model {
     String name;
     String cash;
     String time;
     String img;



    public model(String name, String cash, String time, String img) {
        this.name = name;
        this.cash = cash;
        this.time = time;
        this.img= img;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
