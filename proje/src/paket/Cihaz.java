package paket;

public class Cihaz
{
    String marka;
    String model;
    int id;
    String renk;

    public Cihaz(Builder builder){


        this.marka=builder.marka;
        this.model=builder.model;
        this.id=builder.id;
        this.renk= builder.renk;

    }
    public String getMarka() {
        return marka;
    }

    public String getRenk() {
        return renk;
    }
public int getId(){
        return  id;
}
    public String getModel(){

        return model;
    }
    public static class Builder{

        String marka;
        String model;
        int id;
        String renk;
        public Builder(){



        }
        public Builder setRenk(String renk){

            this.renk=renk;
            return this;
        }
        public Builder setMarka(String marka){

            this.marka=marka;
            return this;
        }

        public Builder setModel(String model){

            this.model=model;
            return this;
        }
public  Cihaz build(){


            return new Cihaz(this);
}
    }
}
