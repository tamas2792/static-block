package staticBlock;

public class StaticBloc {
    static {
        System.out.println("Why I am not executing");
    }

    public static final int param = 20;
}

class Demo {

    public static void main(String[] args) {
        System.out.println(StaticBloc.param);
    }
}
