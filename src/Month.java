public class Month {
    public static void main(String[] args) {
        int monthNumber = 6;
        int days = getDaysInMonth(monthNumber);
        if (days != -1) {
            System.out.println("Number of days in a month " + monthNumber + " = " + days);
        } else {
            System.out.println("Invalid month number");
        }
    }

    public static int getDaysInMonth(int month) {
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = -1;
                break;
        }
        return days;
    }
}

