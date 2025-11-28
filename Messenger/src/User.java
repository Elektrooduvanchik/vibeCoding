public class User {
	private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(User user, String text) {
        Message message = new Message(name, user.getName(), text);
        System.out.println("Сообщение отправлено");
    }

    public void sendMessage(Group group, String text) {
        Message message = new Message(name, group.getName(), text);
        System.out.println("Сообщение отправлено");
    }

    public void sendMessage(Channel channel, String text) {
        if (channel.getOwner.equals(user)) {
            Message message = new Message(name, channel.getName(), text);
            System.out.println("Сообщение отправлено");
        } else {
            System.out.println("Недостаточно прав");
        }
    }
}