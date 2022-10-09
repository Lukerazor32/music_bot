package command;

import com.example.telegram_bot.command.Command;
import com.example.telegram_bot.command.StatCommand;

import static com.example.telegram_bot.command.CommandName.STAT;
import static com.example.telegram_bot.command.StatCommand.STAT_MESSAGE;

public class StatCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return STAT.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return String.format(STAT_MESSAGE, 0);
    }

    @Override
    Command getCommand() {
        return new StatCommand(sendBotMessageService, telegramUserService);
    }
}
