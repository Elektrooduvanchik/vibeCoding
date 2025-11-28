import java.util.ArrayList;

public class Channel {
    public Channel chanel;
    public String name;
    public User owner;
    public User[] listUsers;

    public Message[] message = new Message[0];


    public void printHistory() {
        System.out.println("История сообщений канала \"" + name + "\":");
        System.out.println("--------------------------------------");

        if (message.length == 0) {
            System.out.println("История пуста.");
            return;
        }

        for (Message m : message) {
            System.out.println(m.getFrom() + ": " + m.getSoobshcheniye());
        }

        System.out.println("--------------------------------------");
    }

    public Channel(User owner, String name) {
        this.name = name;
        this.owner = owner;
        this.listUsers = new User[0];
    }

    public void addUser(User user) {
        User[] newArr = new User[listUsers.length+1];
        for (int i=0;i<listUsers.length;i++){
            newArr[i]=listUsers[i];
        }
        newArr[newArr.length-1]=user;
        listUsers = newArr;
    }

    public void printSubscribers() {
        System.out.println("Количество подписчиков" + listUsers.length);
        for (User u : listUsers) {
            System.out.print(u);
        }
        System.out.println();
    }

    public void printMessages() {
        for (Message m : message){
                System.out.println(m.getFrom() + ": " + m.getSoobshcheniye()) ;
    }


    }
}

