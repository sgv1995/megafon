package service;

import ru.itpark.ModemRouterTabletTariff;
import ru.itpark.OtherTariff;
import ru.itpark.TurnOnTariff;

public class Main {
    public static void main(String[] args) {
        TurnOnTariff turnOnWatch = new TurnOnTariff(
                1,
                "Включайся! Смотри",
                "Кино и сериалы в МегаФон ТВ",
                "Безлимитный интернет",
                650,
                1200,
                300,
                30);

        ModemRouterTabletTariff yourSixMonthUnlimited = new ModemRouterTabletTariff(
                1,
                "Твой безлимит на 6 месяцев",
                "Трафик без ограничений для использования дома и в поездках по России",
                "Безлимитный интернет",
                3100);

        OtherTariff goToZero = new OtherTariff(
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

