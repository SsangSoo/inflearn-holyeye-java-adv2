package chat.server.command;

import chat.server.Session;

import java.io.IOException;

public class DefaultCommand implements Command {
    @Override
    public void execute(String[] args, Session session) throws IOException {
        session.send("처리할 수 없는 명령어입니다: " + args);
    }
}
