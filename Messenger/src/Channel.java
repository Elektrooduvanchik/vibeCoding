


import java.util.HashSet;

public class Channel {

    public String name;
    public User owner;
    public HashSet<User> listUsers;


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
    }
}

