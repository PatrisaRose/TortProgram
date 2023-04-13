package program;

public class TortProgram {
    
    static Tort t1 = new Tort();
    static Tort t2 = new Tort();
    

    public static void main(String[] args) {
        TortProgram program = new TortProgram();
        program.feladat();
        
    }
    
    private void feladat(){
        t1.nevezo = 1;
        t1.szamlalo = 3;
        t1.mutat();
        
        t2.nevezo = 3;
        t2.szamlalo = 5;
        t2.mutat();
    }
}
