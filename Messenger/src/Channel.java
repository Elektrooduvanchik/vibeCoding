public class Channel {

    private String name;
    private User owner;
    private User[] listUsers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User[] getListUsers() {
        return listUsers;
    }

    public void setListUsers(User[] listUsers) {
        this.listUsers = listUsers;
    }

    public Message[] message = new Message[0];



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

