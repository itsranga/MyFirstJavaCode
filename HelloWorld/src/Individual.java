public class Individual {
    private String name;
    private Adress adress;
    public void setName(String name){ this.name = name; }
    public String getName() { return this.name;}

    public void setAdress(Adress adress){ this.adress = adress; }
    public String getAdress() { return this.adress.getAdress();}

}
class Adress {
    private String adress;
    public void setAdress(String adress){ this.adress = adress; }
    public String getAdress() { return this.adress;}
}