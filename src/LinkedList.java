import java.util.Objects;
public class LinkedList {
    Node head = null;
    public LinkedList() {
        super();
        head = null;
    }
    public void initialize(Courses data) {
        head = new Node(data);
        head.next = null;
        head.next2=null;
    }
    public void add(Courses course) {
        //Bastan ekleniyor
        Node newNode = new Node(course);
        newNode.next = head;
        head = newNode;
    }
    /*  public void  addL(int data){
          Node newNode= new Node(data);
          newNode.next=null;
          Node temp = head;
          while(temp.next!=null){
              temp=temp.next;}
          temp.next=newNode;
      }*/
    public void goster() {
        System.out.println("Ders Listesi");
        Node nd = head;
        while (nd != null) {
            System.out.println(nd.data.getName());
            nd = nd.next;
        }
        System.out.println("\n");
    }
    public int size() {
        int count = 0;
        Node nd = head;
        while (nd != null) {
            if (nd.data.getisDisabled() == false) {
                count++;
            }
            nd = nd.next;
        }
        return count;
    }
    public void getByCode(String code) {
        System.out.println("\n");
        Node nd = head;

        while (nd != null) {

                    if (nd.data.getisDisabled() == true) {
                        nd.data.setDisabled(false);

                        if (nd.data.getCode()==code) {
                            System.out.println(nd.data.getName());
                            //nd.data.setDisabled(true);
                        }
                        nd.data.setDisabled(true);
                    }
                    else    if (nd.data.getisDisabled() == false&&nd.data.getCode()==code)  {
                        System.out.println(nd.data.getName());
                    }

                nd = nd.next;
            }
        }
    public void listSemesterCourses(int semester) {
        Node nd = head;
        System.out.println("semester "+ semester+" courses:" +"\n");

        while (nd != null) {
            if (Objects.equals(nd.data.getSemester(), semester)) {
                System.out.println(nd.data.getName());
            }
            nd = nd.next;
        }
        System.out.println("\n");
    }
    public void getByRange(int start_index, int last_index) {
        Node nd = head;
        for (int i = start_index; i <= last_index; i++) {
            System.out.println(start_index+"-"+last_index+"index arasındaki dersler: " + nd.data.getName());
            nd = nd.next;
        }
        System.out.println("\n");
    }
    public void NextInSemester(Courses course){
        int semester=course.getSemester();
        int temp = 0;
        Node nd = head;
        while (nd.next != null) {
            if (Objects.equals(nd.next.data.getSemester(), semester)&& Objects.equals(nd.data.getName(), course.getName())) {
                System.out.println("Aynı semesterdaki sonraki ders: " + nd.next.data.getName());
                temp=0;
            }
            else if (Objects.equals(nd.next.data.getSemester(), semester)&& !Objects.equals(nd.data.getName(), course.getName())){
                temp=1;
            }
            nd = nd.next;
        }
        if (temp==1){
            System.out.println("Bu sömestırdaki son ders zaten bu");
        }
    }
    public void Next() {
        Node nd = head;
        while (nd != null) {
            System.out.println("Next degereleri "+nd.next);
            nd = nd.next;
        }
        System.out.println("\n");
    }
    public void remove(Courses data) {
        if (data.getisDisabled() == false) {
            Node temp = head;
            if (data == head.data) {
                head = head.next;
            } else {
                while (temp != null) {
                    if (temp.next.data == data) {
                        if (temp.next.next == null) {
                            temp.next = null;
                        } else {
                            temp.next = temp.next.next;
                            break;
                        }
                    }
                    temp = temp.next;
                }
            }
        } else System.out.println("Bu derse ulaşılamıyor");
    }
    public void disable(Courses data) {
        if (data.getisDisabled() == false) {
            data.setDisabled(true);
        }
    }
    public void Enable(Courses data) {
        if (data.getisDisabled() == true) {
            data.setDisabled(false);
        }
    }
    public void showDisabled() {
        Node nd = head;
        while (nd != null) {
            if (nd.data.getisDisabled() == true) {
                nd.data.setDisabled(false);
            System.out.println("disabled courses: "+nd.data.getName());
                nd.data.setDisabled(true);
            }
            nd = nd.next;
        }
        System.out.println("\n");
    }


/////////////////////////////////////////////////
public void makeCircular() {
    Node nd = head;
    while (nd.next != null) {
        nd = nd.next;
    }
    Node temp = head;
    while (temp != null) {
        Node temp2 = temp.next;
        while (temp2 != null) {
            if (temp.data.getSemester() == temp2.data.getSemester()) {
                temp.next2 = temp2;
                temp = temp2;
            }

            temp2 = temp2.next;
        }

        Node temp3 = head;
        while (temp.next2==null) {
            if (temp.data.getSemester() == temp3.data.getSemester() ) {
                temp.next2 = temp3;  // yoksa temp3.next mi olacak???
                //temp3=temp3.next;

            }
            temp3 = temp3.next;
        }
        temp = temp.next;
    }
}
    public void gosterCircular() {
        Node nd = head;
        while (nd != null) {
            System.out.println("Next degereleri  "+nd.next);
            System.out.println("Next2 degereleri "+nd.next2);
            nd = nd.next;
        }
        System.out.println("\n");
    }
}


