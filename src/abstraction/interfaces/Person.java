package abstraction.interfaces;

public class Person implements Student, YouTuber, Footballer{
    public static void main(String[] args) {

        Person person = new Person();
        person.Study();
        person.playFootball();
        person.makeVideo();
        person.editVideo();
        person.uploadVideo();

        //Object-Upcasting:
//        YouTuber youTuber = person;
//        youTuber.makeVideo();
//        youTuber.editVideo();
//        youTuber.uploadVideo();
    }

    @Override
    public void Study() {
        System.out.println("Person Is Studying.");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person Is Making Video.");
    }

    @Override
    public void playFootball() {
        System.out.println("Person Is Playing Football.");
    }

    @Override
    public void editVideo() {
        System.out.println("Person Is Editing A Video.");
    }
}
