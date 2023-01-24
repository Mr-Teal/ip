package duke.commands;

import duke.taskType.TaskList;
import duke.Ui;
import duke.Storage;

/**
 * The class for bye commands.
 */
public class Bye extends Command {
    /**
     * The explicit default constructor.
     */
    public Bye() {
    }

    /**
     * Say goodbye to the user.
     *
     * @param lst the task list to be operated
     * @param ui the UI object the program is using
     * @param storage the Storage object the program is using
     */
    public void operate(TaskList lst, Ui ui, Storage storage) {
        storage.save(lst);
        System.out.println("See you! Roarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr!");
    }

    /**
     * Override the isBye() method as this is a bye command.
     *
     * @return true
     */
    @Override
    public boolean isBye() {
        return true;
    }
}
