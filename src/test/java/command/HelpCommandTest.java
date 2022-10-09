package command;

import com.example.telegram_bot.command.Command;
import com.example.telegram_bot.command.HelpCommand;
import org.junit.jupiter.api.DisplayName;

import static com.example.telegram_bot.command.CommandName.HELP;
import static com.example.telegram_bot.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
