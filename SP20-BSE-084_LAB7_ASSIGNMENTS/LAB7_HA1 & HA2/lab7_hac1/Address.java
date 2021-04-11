
package lab7_hac1;


public class Address {
    private int streetno;
    private int houseno;
    private String city;
    private int postal_Code;
    
    Address(int street,int house,String City,int code){
        streetno=street;
        houseno=house;
        city=City;
        postal_Code=code; 
    }

   
    public int getStreetno() {
        return streetno;
    }

  
    public void setStreetno(int streetno) {
        this.streetno = streetno;
    }

 
    public int getHouseno() {
        return houseno;
    }

   
    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public int getPostal_Code() {
        return postal_Code;
    }

    public void setPostal_Code(int postal_Code) {
        this.postal_Code = postal_Code;
    }
    
    @Override
    public String toString(){
        return String.format("street No= [%d] , House no = [%d] , City = [%s] , Postal Code = [%d]  ",streetno,houseno,city,postal_Code);
    }
}
