package com.example.sha.agro;

/**
 * Created by sha on 10-06-2019.
 */

public class Fertilizers {

public String name,discription,image;

public Fertilizers(){

}

public Fertilizers(String name,String discription,String image){
    this.name = name;
    this.discription = discription;
    this.image = image;

}

    public String getName(){return name;}

    public void setName(String name){ this.name = name;}

    public String getdiscription(){return discription;}

    public void setdiscription(String discription){ this.discription = discription;}

    public String getImage(){return image;}

    public void setImage(String image){ this.image = image;}
}


