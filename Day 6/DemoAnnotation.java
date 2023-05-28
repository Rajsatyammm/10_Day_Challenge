import java.lang.annotation.*;


@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
    //        int age() default 32;
    int age() default 10;
}
@CricketPlayer
class Satyam {
    int Centuries;
    @CricketPlayer
    int Matches;

    public int getCenturies() {
        return Centuries;
    }

    public void setCenturies(int centuries) {
        Centuries = centuries;
    }

    public int getMatches() {
        return Matches;
    }

    public void setMatches(int matches) {
        Matches = matches;
    }
public class DemoAnnotation {

        Satyam s = new Satyam();
        Class c= s.getClass();
//        Annotation an = c.getAnnotations(CricketPlayer.class);
    }
}
