package study0412;

public class p425_7 {
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
	void startChat(String chatId) {
		String nickName=null;
		chatId = nickName;

		Chat chat=new Chat() {
			void start() {
				while(true) {
					String inputData="안녕하세요";
					String message="["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
}