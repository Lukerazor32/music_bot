package com.example.telegram_bot.command;

import com.example.telegram_bot.service.SendBotMessageService;
import com.example.telegram_bot.state.State;
import org.telegram.telegrambots.meta.api.objects.Update;
import static com.example.telegram_bot.command.CommandName.*;

public class UnknownCommand implements State {
    public static final String UNKNOWN_MESSAGE = "Команда не распознана :(";

    private final SendBotMessageService sendBotMessageService;

    public UnknownCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void startState(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), UNKNOWN_MESSAGE);
    }

    @Override
    public void execute(Update update) {

    }

    @Override
    public String nextState() {
        return EXIT.getCommandName();
    }
}
