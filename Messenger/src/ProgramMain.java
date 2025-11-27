public class ProgramMain {
	public static void main(String[] args) {
		User punter_1 = new User("1-й понтёр");
		User banker = new User("Банкомёт");
		User punter_2 = new User("2-й понтёр");
		User punter_3 = new User("3-й понтёр");
		User punter_4 = new User("4-й понтёр");
		User knyaz = new User("Князь Звездич");
		User shprikh = new User("Шприх");

		Group group1 = new Group("Сцена первая");
		group1.addUser(punter_1);
		group1.addUser(banker);
		group1.addUser(punter_2);
		group1.addUser(punter_3);
		group1.addUser(punter_4);
		group1.addUser(knyaz_zvezdich);
		group1.addUser(knyaz);
		group1.addUser(shprikh);

		punter_1.sendMessage(group1, "Иван Ильич, позвольте мне поставить.");
		banker.sendMessage(group1, "Извольте.");
		punter_1.sendMessage(group1, "Сто рублей.");
		banker.sendMessage(group1, "Идет.");
		punter_2.sendMessage(group1, "Ну, добрый путь");
		punter_3.sendMessage(group1, "Вам надо счастие поправить,\n" +
				"А семпелями плохо…");
		punter_4.sendMessage(group1, "Надо гнуть.");
		punter_3.sendMessage(group1, "Пусти.");
		punter_2.sendMessage(group1, "На всё?.. нет, жжется!");
		punter_4.sendMessage(group1, "Послушай, милый друг, кто нынече не гнется,\n" +
				"Ни до чего тот не добьется.");
		// punter_3.sendMessage(group1, "Смотри во все глаза."); // тихо первому.
		knyaz.sendMessage(group1, "Ва-банк.");
		punter_2.sendMessage(group1, "Эй, князь,\n" +
				"Гнев только портит кровь, – играйте не сердясь.");
		knyaz.sendMessage(group1, "На этот раз оставьте хоть советы.");
		banker.sendMessage(group1, "Убита.");
		knyaz.sendMessage(group1, "Чорт возьми.");
		banker.sendMessage(group1, "Позвольте получить.");
		punter_2.sendMessage(group1, "Я вижу, вы в пылу, готовы всё спустить.\n" +
				"Что стоят ваши эполеты?");
		knyaz.sendMessage(group1, "Я с честью их достал, – и вам их не купить.");
		punter_2.sendMessage(group1, "Скромней бы надо быть\n" +
				"С таким несчастием и в ваши леты.");
		shprikh.sendMessage(group1, "Не нужно ль денег, князь… я тотчас помогу,\n" +
				"Проценты вздорные… а ждать сто лет могу.");

		group1.printUsers();
		group1.printMessages();

		User arbenin = new User("Арбенин");
		arbenin.sendMessage(knyaz, "Что, князь?.. не набрели еще на приключенье?");
		knyaz.sendMessage(knyaz, "Как быть, а целый час хожу!");

		Channel mascarad = new Channel(arbenin, "Маскарад");
		mascarad.addUser(knyaz);
		arbenin.sendMessage(mascarad, "Пусть говорят, – а нам какое дело?\n" +
				"Под маской все чины равны,\n" +
				"У маски ни души, ни званья нет, – есть тело.\n" +
				"И если маскою черты утаены,\n" +
				"То маску с чувств снимают смело.");
		mascarad.printSubscribers();
		mascarad.printMessages();
	}
}