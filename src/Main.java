public class Main {
    public static void main(String[] args) {

        LinkedList liste = new LinkedList();
        LinkedList listeCircular = new LinkedList();

        Courses Math1 = new Courses("MAT1085","Matematik 1",1);
        Courses LinearAlg = new Courses("MAT1087","Lineer Cebir", 1);
        Courses Algorithm = new Courses( "BLM1003","Algoritma ve Prog. Giriş", 1);
        Courses ComputerEng = new Courses("BLM1001","Bilgisayar Müh. Giriş",1);
        Courses Physics1 = new Courses("FZK1071","Fizik 1",1);
        Courses Math2 = new Courses( "MAT1086","Matematik 2", 2);
        Courses BilProg1 = new Courses( "BLM1002", "Bilgisayar Programlama 1",2);
        Courses Hardware = new Courses("BLM1004","Bilgisayar Donanımı", 2);
        Courses ISG = new Courses( "ISG1081","İş Sağlığı ve güvenliği",2);
        Courses Physics2 = new Courses("FZK1072","Fizik 2",  2);
        Courses LogicGate = new Courses( "BLM2007","Mantık Devreleri", 3);
        Courses DiscreteMath = new Courses( "MAT2019","Ayrık Matematik", 3);
        Courses Diff = new Courses( "MAT2085","Diferansiyel Denklemler", 3);
        Courses OOP = new Courses( "BLM2005","Nesne Yönelimli Programlama", 3);
        Courses DataStructures = new Courses( "BLM2002","Veri Yapıları ve Algoritmalar", 4);
        Courses CompNetwork = new Courses( "BLM2006","Bilgisayar Ağlarına Giriş", 4);
        Courses ElectroCircuit = new Courses( "BLM2010","Elektronik Devrelere Giriş", 4);
        Courses statics = new Courses( "IST3045","Mühendisler için İstatistik", 4);
        Courses Micro = new Courses( "BLM2008","Mikroişlemciler", 4);
        Courses NumericAnalyz = new Courses( "MAT2086","Sayısal Analiz", 4);
        Courses DialogueInterpreting = new Courses( "IMT2128","Special Topics in Translation", 8);

        liste.initialize(Math1);


        liste.add(LinearAlg);
        liste.add(Algorithm);
        liste.add(ComputerEng);
        liste.add(Physics1);
        liste.add(Math2);
        liste.add(BilProg1);
        liste.add(Hardware);
        liste.add(ISG);
        liste.add(Physics2);
        liste.add(LogicGate);
        liste.add(DiscreteMath);
        liste.add(Diff);
        liste.add(OOP);
        liste.add(DataStructures);
        liste.add(statics);
        liste.add(CompNetwork);
        liste.add(ElectroCircuit);
        liste.add(Micro);
        liste.add(NumericAnalyz);
        liste.add(DialogueInterpreting);



        liste.goster();
        liste.Next();
        System.out.println("size:"+liste.size());
        liste.getByCode("MAT101");
        liste.listSemesterCourses(1);
        liste.getByRange(0,3);

        liste.remove(Math1);
        liste.goster();
        System.out.println("size:"+liste.size());

        liste.disable(Math2);
        System.out.println("disabled size:"+liste.size());
        System.out.println(Math2.getCode());

        liste.Enable(Math2);
        System.out.println("abled size:"+liste.size());

        liste.disable(Physics1);
        liste.disable(Physics2);
        liste.showDisabled();
        liste.goster();
        liste.listSemesterCourses(1);

        liste.NextInSemester(Math1);
        liste.NextInSemester(Algorithm);

        liste.getByCode("ISG1081");
        liste.getByCode("ISG181");
        liste.getByCode("FZK1071");
        //*********************************************
        System.out.println("*****************************");

        listeCircular.initialize(Math1); //1
        listeCircular.add(Algorithm);    //1
        listeCircular.add(ComputerEng);  //1
        listeCircular.add(Hardware);  //2
        listeCircular.add(ISG);      //2

        listeCircular.makeCircular();

        System.out.println("Liste 2:");
        listeCircular.gosterCircular();

    }

}

