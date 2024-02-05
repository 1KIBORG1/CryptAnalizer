import managers.ProgramManager;


public class Main {

    private static final int COMMAND_ARGUMENT_POSITION = 0;
    private static final int FILE_PATH_ARGUMENT_POSITION = 1;
    private static final int KEY_ARGUMENT_POSITION = 2;

    public static void main(String[] args) {

        switch (args.length) {
            case 3:
                ProgramManager.startProgram(args, args[COMMAND_ARGUMENT_POSITION], args[FILE_PATH_ARGUMENT_POSITION], args[KEY_ARGUMENT_POSITION]);
                break;
            case 2:
                ProgramManager.startProgram(args, args[COMMAND_ARGUMENT_POSITION], args[FILE_PATH_ARGUMENT_POSITION]);
                break;
        }


    }
}