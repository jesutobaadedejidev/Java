import java.util.Scanner;

public class Nokia1 {
   	 public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);
       	 String prompt = """
         Welcome to Nokia 3310
            Menu:
            1 -> Phone book
            2 -> Messages
            3 -> Chat
            4 -> Call register
            5 -> Tones
            6 -> Settings
            7 -> Call divert
            8 -> Games
            9 -> Calculator
            10 -> Reminders
            11 -> Clock
            12 -> Profiles
            13 -> Sim services
            """;
        System.out.println(prompt);

        int user = input.nextInt();
        switch (user) {

            case 1 -> {
            String phoneBook = """
                   Phone book:
                    1 -> Search
                    2 -> Service Nos
                    3 -> Add Name
                    4 -> Erase
                    5 -> Edit
                    6 -> Assign tone
                    7 -> Send b'card
                    8 -> Options
                    9 -> Speed dials
                    10 -> Voice tags
                    """;
                System.out.println(phoneBook);
                int phoneBookChoice = input.nextInt();
                switch (phoneBookChoice) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add Name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        String optionprompt = """
                            Option:
                             1 -> Type of view
                             2 -> Memory status
                            """;
                        System.out.println("option");
                        int optionChoice = input.nextInt();
                        switch (optionChoice) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                }
            }
            case 2 -> {
                String messages = """
                   Messages:
                    1 -> Write messages
                    2 -> Inbox
                    3 -> Outbox
                    4 -> Picture messages
                    5 -> Templates
                    6 -> Smileys
                    7 -> Message Settings
                    8 -> Info service
                    9 -> Voice mailbox number
                    10 -> Service command editor
                    """;
                System.out.println(messages);
                int messageChoice = input.nextInt();

                switch (messageChoice) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");

                    case 7 -> {
                        String settings = """
                           Message Settings:
                            1 -> Set
                            2 -> Common
                            """;
                        System.out.println(settings);
                        int settingsChoice = input.nextInt();

                        switch (settingsChoice) {
                            case 1 -> {
                                String set = """
                                   Set:
                                    1 -> Message centre number
                                    2 -> Messages sent as
                                    3 -> Message validity
                                    """;
                                System.out.println(set);
                                int setChoice = input.nextInt();
                                switch (setChoice) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Messages sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                            case 2 -> {
                                String common = """
                                   Common:
                                    1 -> Delivery reports
                                    2 -> Reply via same centre
                                    3 -> Character support
                                    """;
                                System.out.println(common);
                                int commonChoice = input.nextInt();
                                switch (commonChoice) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("Info service");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                }
            }
            case 3 -> System.out.println("Start Chat");
            case 4 -> {
                String callRegister = """
                   Call register:
                    1 -> Missed calls
                    2 -> Received calls
                    3 -> Dialled numbers
                    4 -> Erase recent call lists
                    5 -> Show call duration
                    6 -> Show call cost
                    7 -> Call cost setting
                    8 -> Prepaid
                    """;
                System.out.println(callRegister);
                int callRegisterChoice = input.nextInt();

                switch (callRegisterChoice) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        String showCallDuration = """
                            Show Call Duration
                            1 -> Last call duration
                            2 -> All call's duration
                            3 -> Received call's duration
                            4 -> Dialled call's duration
                            5 -> Clear timers
                            """;
                        System.out.println(showCallDuration);
                        int showCallDurationChoice = input.nextInt();
                        switch (showCallDurationChoice) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All call's duration");
                            case 3 -> System.out.println("Received call's duration");
                            case 4 -> System.out.println("Dialled call's duration");
                            case 5 -> System.out.println("Clear timers");
                        }
                    }
                    case 6 -> {
                        String showCallCost = """
                            Show Call Cost
                            1 -> Last call cost
                            2 -> All call's cost
                            3 -> Clear counters
                            """;
                        System.out.println(showCallCost);
                        int showCallCostChoice = input.nextInt();
                        switch (showCallCostChoice) {
                            case 1 -> System.out.println("Last call cost");
                            case 2 -> System.out.println("All call's cost");
                            case 3 -> System.out.println("Clear counters");
                        }
                    }
                    case 7 -> {
                        String callCostSettings = """
                            Call Cost Setting
                            1 -> Call cost limit
                            2 -> Show costs in
                            """;
                        System.out.println(callCostSettings);
                        int callCostSettingsChoice = input.nextInt();
                        switch (callCostSettingsChoice) {
                            case 1 -> System.out.println("Call cost limit");
                            case 2 -> System.out.println("Show costs in");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");
                }
            }
            case 5 -> {
                String tones = """
                   Tones:
                    1 -> Ringing tone
                    2 -> Ringing volume
                    3 -> Incoming call alert
                    4 -> Composer
                    5 -> Message alert tone
                    6 -> Keypad tones
                    7 -> Warning and game tones
                    8 -> Vibrating alert
                    9 -> Screen saver
                    """;
                System.out.println(tones);
                int tonesChoice = input.nextInt();

                switch (tonesChoice) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                }
            }
            case 6 -> {
                String settings = """
                   Settings:
                    1 -> Call settings
                    2 -> Phone settings
                    3 -> Security settings
                    4 -> Restore factory settings
                    """;
                System.out.println(settings);
                int settingsChoice = input.nextInt();

                switch (settingsChoice) {
                    case 1 -> {
                        String callSettings = """
                           Call Settings:
                            1 -> Automatic redial
                            2 -> Speed dialling
                            3 -> Call waiting option
                            4 -> Own number sending
                            5 -> Phone line in use
                            6 -> Automatic answer
                            """;
                        System.out.println(callSettings);
                        int callSettingsChoice = input.nextInt();

                        switch (callSettingsChoice) {
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialing");
                            case 3 -> System.out.println("Call waiting");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");
                        }
                    }
                    case 2 -> {
                        String phoneSettings = """
                            Phone Settings:
                            1 -> Language
                            2 -> Cell info display
                            3 -> Welcome note
                            4 -> Network selection
                            5 -> Lights
                            6 -> Confirm SIM service actions
                            """;
                        System.out.println(phoneSettings);
                        int phoneSettingsChoice = input.nextInt();

                        switch (phoneSettingsChoice) {
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell info display");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("Confirm SIM service actions");
                        }
                    }
                    case 3 -> {
                        String securitySettings = """
                           Security Settings:
                            1 -> PIN code request
                            2 -> Call barring service
                            3 -> Fixed dialling
                            4 -> Closed user group
                            5 -> Phone security
                            6 -> Change access codes
                            """;
                        System.out.println(securitySettings);
                        int securitySettingsChoice = input.nextInt();

                        switch (securitySettingsChoice) {
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dialling");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access codes");
                        }
                    }
                    case 4 -> System.out.println("Restore factory settings");
                }
            }
            case 7 -> System.out.println("Call divert");
            case 8 -> System.out.println("Games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminders");
            case 11 -> {
                String clockPrompt = """
                    Clock:
                    1 -> Alarm clock
                    2 -> Clock settings
                    3 -> Date setting
                    4 -> Stopwatch
                    5 -> Countdown timer
                    6 -> Auto update of date and time
                    """;
                System.out.println("clock");
                int clockChoice = input.nextInt();
                switch (clockChoice) {
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                }
            }
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("SIM services");
        }
    }
}