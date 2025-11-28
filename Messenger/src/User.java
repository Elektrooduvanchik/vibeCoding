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
        all_user_id ++;
        this.name = name;
        this.user_id = all_user_id;
    }

    public void sendMessage(User user, String text) {
        Message message = new Message(name, user.getName(), text);
        System.out.println("Сообщение отправлено пользователю под ником " + user.getName() + ": \n" + text);
    }

    public void sendMessage(Group group, String text) {
        Message message = new Message(name, group.getName(), text);
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

    public long getUserId(){
        return user_id;
    }
}