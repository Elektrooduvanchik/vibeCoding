import java.util.ArrayList;

public class Channel {
    public Channel chanel;
    public String name;
    public User owner;
    public ArrayList<User> listUsers;


    public Channel(User owner, String name) {
        this.name = name;
        this.owner = owner;
        this.listUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        listUsers.add(user);
    }

    public void printSubscribers() {
        System.out.println("Количество подписчиков" + listUsers.size());
        for (User u : listUsers) {
            System.out.print(u);
        }
        System.out.println();
    }

    public void printMessages() {
        for (Message m : message) {
            System.out.println(m.getFrom() + ": " + m.getSoobshcheniye());
        }


    }
}

