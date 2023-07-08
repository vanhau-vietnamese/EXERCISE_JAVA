package day002;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class FormatDate {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedDateTime = currentDateTime.format(FORMATTER);
        System.out.println(formattedDateTime);
    }

}
