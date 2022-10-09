package com.example.telegram_bot.command;

import com.example.telegram_bot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.example.telegram_bot.command.CommandName.*;

public class HelpCommand implements Command {
    private final SendBotMessageService sendBotMessageService;

    public final static String HELP_MESSAGE = String.format("<b>Доступные команды:</b>" +
            "\n\n" +
            "\uD83C\uDFB5 %s - начать работу бота" +
            "\n" +
            "\uD83D\uDEAB %s - остановить работу бота" +
            "\n" +
            "\uD83C\uDD98 %s - все команды бота" +
            "\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
