package ru.itgirl.projectweek15;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/day")
    
    public String day(@RequestParam(value = "day", defaultValue = "Start") String day) {
        String message = "";
        switch (day) {
            case "Monday":
                message = "Сегодня понедельник!";
                break;
            case "Tuesday":
                message = "Сегодня вторник!";
                break;
            case "Wednesday":
                message = "Сегодня среда!";
                break;
            case "Thursday":
                message = "Сегодня четверг!";
                break;
            case "Friday":
                message = "Сегодня пятница!";
                break;
            case "Saturday":
                message = "Сегодня суббота!";
                break;
            case "Sunday":
                message = "Сегодня воскресенье!";
                break;
            case "Start":
                message = "Вы еще не задали конкретный день недели";
                break;
            default:
                message = "Такого дня недели не существует";
                break;
        }
        return message;
    }
}
