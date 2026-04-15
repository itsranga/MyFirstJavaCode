abstract class AppAbstract {
    abstract void PrintAbMsg(String parStr);
}



public class App extends AppAbstract {
    public static void main(String[] args) throws Exception {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
        App tst = new App();
        tst.PrintMessaage("Ranga");
        tst.PrintAbMsg("Abstract Ranga");
        
        App.PrintSM("SRanga");
        tst.TestSetNGet("Ranga Reddy","Nellore");

    }

    public void TestSetNGet(String name,String addr) {
        Individual ind = new Individual();
        ind.setName("Ranga Reddy");
        Adress caddr = new Adress();
        caddr.setAdress(addr);
        ind.setAdress(caddr);
        System.out.println("Set & Get Person Name: " + ind.getName());
        System.out.println("Set & Get Person adress: " + ind.getAdress());
    }

    @Override
    void PrintAbMsg(String parStr)
    {
        System.out.println("Hello Abstract Method " + parStr);
    }

    public void PrintMessaage(String parStr)
    {
        System.out.println("Hello Method " + parStr);
    }

     static void PrintSM(String parStr)
    {
        System.out.println("Hello Static Method " + parStr);
    }
}
