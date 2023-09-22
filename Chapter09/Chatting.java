package Chapter09;

public class Chatting {
    void startChat(String chatId) {
//        String nickName = null;
//        nickName = chatId;
        String nickName = chatId;

        Chat chat = new Chat() {
            @Override public void start() {
                for(int i=0; i<5; i++) {
//                while(true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "] " + inputData;
                    sendMessage(message);
                }
            }

            @Override public void sendMessage(String message) {
                System.out.println(message);
            }
        };

        chat.start();
    }

    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }
}
