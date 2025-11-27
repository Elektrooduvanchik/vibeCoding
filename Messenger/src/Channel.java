import java.util.HashSet;

public class Channel {
    public Channel chanel;
    public String name;
    public User owner;
    public HashSet<User> listUsers;
    public


    public Channel(User owner,String name){
        this.name=name;
        this.owner=owner;
        this.listUsers=new HashSet<>();
    }

    public void addUser(User user){
        listUsers.add(user);
    }
    public void printSubscribers(){
        System.out.println("Количество подписчиков" + listUsers.size());
        for (User u : listUsers){
            System.out.println(u);
        }
    }
    public void printMessages(){
        for (Message m : message){
            System.out.println(m.getFrom()+": "+m.getSoobshcheniye());
        }

    }
}

