package operatorsAndStatements.statements;

public class SwitchExample {

    private int getSortedOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test": //literal
                return 52;
            /* case middleName:  not literal, not final
             *    id = 5;
             *    break;
             */
             case suffix: //final
              id = 0;
              break;
             /* case lastName:
             *      id = 8;
             *     break;
             *     parameter of method
             */
            /* another ones bcs we have String in our switch and we have to find case only with String
            case 5: does not compile int
            id = 7;
            break;
            case 'J': does not compile char
            id = 10;
            break;
            case java.time.DayOfWeek.SUNDAY: does not compile bcs enum
             */
        }
        return id;

    }
}
