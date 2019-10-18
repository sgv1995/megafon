package service;

import ru.itpark.ModemsRoutersTablets;
import ru.itpark.OtherTariffs;
import ru.itpark.TurnOn;

public class Main {
    public static void main(String[] args) {
        TurnOn turnOnWatch = new TurnOn(
                1,
                "Включайся! Смотри",
                "Кино и сериалы в МегаФон ТВ",
                "Безлимитный интернет",
                650,
                1200,
                300,
                30);

        ModemsRoutersTablets yourSixMonthUnlimited = new ModemsRoutersTablets(
                1,
                "Твой безлимит на 6 месяцев",
                "Трафик без ограничений для использования дома и в поездках по России",
                "Безлимитный интернет",
                3100);

        OtherTariffs goToZero = new OtherTariffs(
                1,
                "Переходи на НОЛЬ",
                "Тариф без абонентской платы для выгодных звонков",
                "Нет",
                0,
                "Поминутная тарификация");

        System.out.println(turnOnWatch);
        System.out.println(yourSixMonthUnlimited);
        System.out.println(goToZero);
    }
}

