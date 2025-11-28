import java.util.Arrays;

public class Group {

    private String groupName;
    private User[] listUsers;

    public Message[] message = new Message[0];

    public Group(String groupName) {
        this.groupName = groupName;
        listUsers = new User[0];
    }

    public void addUser(User user) {
        listUsers = Arrays.copyOf(listUsers, listUsers.length + 1);
        listUsers[listUsers.length -1] = user;
    }

    public void printUsers(){
        System.out.println("Количество участников: " + listUsers.length);
        for (User user : listUsers) {
            System.out.print(user + "  |  ");
        }
    }

    public void printMessages(){
        for (Message varMessage : message) {
            System.out.println(varMessage.id + " - " + varMessage.getFrom()
                    + " → " + varMessage.getTo() + ": " + varMessage.getSoobshcheniye());
        }
    }

    public String getName() {
        return groupName;
    }

    public void setName(String groupName) {
        this.groupName = groupName;
    }
}