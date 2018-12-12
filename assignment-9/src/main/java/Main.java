import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws IOException {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        Subject subject = new Subject();

        new ModObserver(subject);

        String address1  = "http://www.pja.edu.pl/";
        String address2  = "https://www.wikipedia.org/";

        System.out.println(address1);
        subject.setState(address1);
        originator.setState(address1);

        System.out.println(address2);
        subject.setState(address2);
        originator.setState(address2);

        careTaker.add(originator.saveStateToMemento());
        System.out.println("Memento: " + originator.getState());

    }

    public URL getUrl() throws MalformedURLException {

        URL url = new URL("http://www.pja.edu.pl/");
        return url;
    }

}