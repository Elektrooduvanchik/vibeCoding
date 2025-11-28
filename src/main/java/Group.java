import java.util.Arrays;

public class Group {

    public String groupName;
    public User[] listUsers;

    public Group(String groupName){
        this.groupName = groupName;
        listUsers = new User[0];
    }

    public void addUser(User user){
        listUsers = Arrays.copyOf(listUsers, listUsers.length + 1);
        listUsers[listUsers.length -1] = user;
    }

    public void printUsers(){
        System.out.println("Количество участников: " + listUsers.length);
        for (User user : listUsers){
            System.out.print(user + "  " + user.getid + "| ");
        }
    }

    public void printMessages(){
        for (Message varMessage : message){
            System.out.println(varMessage.id + " - " + varMessage.getFrom()
                    + " → " + varMessage.getTo() + ": " + varMessage.getSoobshcheniye());
        }
    }
}