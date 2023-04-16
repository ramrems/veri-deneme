public class Courses {
    private String code;
    private String name;

    private int semester;
    private boolean isDisabled=false;
    public void setDisabled(boolean disabled) {
        this.isDisabled = disabled;
    }

    public boolean getisDisabled() {
        return isDisabled;
    }

    public Courses(String code, String name, int semester) {
        this.code = code;
        this.name = name;
        this.semester = semester;
    }

    public String getCode() {
        if (isDisabled==false) {
            return code;
        }
        else return "Bu derse ulaşılamıyor";
    }

    public String getName() {
        if (isDisabled==false) {
        return name;}
        else return " ";
    }

    public int getSemester() {
        return semester;
    }
}