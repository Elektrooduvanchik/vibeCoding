public class User {
    private String name;
    private static long all_user_id = 0;
    private long user_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        all_user_id++;
        this.name = name;
        this.user_id = all_user_id;
    }

    public void sendMessage(User user, String text) {
        Message message = new Message(name, user.getName(), text);
        user.addMessageDM(message);
        System.out.println("Сообщение отправлено пользователю под ником " + user.getName() + ": \n" + text);
    }

    private Message[] message = new Message[0];

    public void addMessageDM(Message message1) {
        Message[] buffer = new Message[message.length + 1];
        for (int i = 0; i < message.length; i++) {
            buffer[i] = message[i];
        }
        buffer[buffer.length - 1] = message1;
        message = buffer;
    }


    public void sendMessage(Group group, String text) {
        Message message = new Message(name, group.getName(), text);
        group.addMessageToGroup(message);
        System.out.println("Сообщение отправлено в группу под названием " + group.getName() + ": \n" + text);

    }

    public void sendMessage(Channel channel, String text) {
        if (channel.getOwner().getUserId() == user_id) {
            Message message = new Message(name, channel.getName(), text);
            channel.addMessageToChan(message);
            System.out.println("Сообщение отправлено в канал под названием " + channel.getName() + ": \n" + text);
        } else {
            System.out.println("Недостаточно прав, чтобы совершить действие");
        }
    }

    public long getUserId() {
        return user_id;
    }

    public void printDM(User user2) {
        System.out.println("Чат " + "пользователя" + name +" с пользователем" + user2.getName());
        for (Message m : message) {
            System.out.println(m.getFrom() + ": \n" + m.getSoobshcheniye());
        }
    }
}