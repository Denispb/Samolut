//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Samolot [] p = {}

    }
}
    class Samolot {
        String color;
        int dlina;
        int age;

    public Samolot (String color,  int dlina,  int age) {
    this.color = color;
    this.dlina = dlina;
    this.age = age;
    }

    public void setDlina(int dlina) {
        if (dlina > 5)
         this.dlina = dlina;
    }

    @Override
    public String toString() {
        String a = "Cамолет: " + color + "длина" + dlina + "возраст" + age;
        return a;
    }
   public int getDlina() {
       System.out.println("измеряем длину Самолета");
       return dlina;
   }

        public String getColor(String color) {
            System.out.println("измеряем цвет" + this.color + "на" + color);
            this.color = color;
        }
    }
