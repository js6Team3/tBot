package js6team3.tbot.constant;

/**
 * The information for bot
 * Standard messages at adaptation stage
 *
 * @author zalex14
 * @version 1.0
 */
public class ReportConstant {
    /**
     * result of an animal adaptation
     */
    public enum AdoptionsResult {
        SUCCESS, EXTENSION_14, EXTENSION_30, FAIL
    }

    /**
     * standard rules for report
     */
    public static final String WELCOME = """
            Уважаемый усыновитель, после того как Вы забрали животное из приюта, Вы обязаны в течение месяца присылать
            информацию о том, как животное чувствует себя на новом месте. Отчет нужно присылать каждый день, ограничений
            в сутках по времени сдачи отчета нет. Каждый день волонтеры отсматривают все присланные отчеты после 21:00.\s
            В ежедневный отчет входит следующая информация:\s
            Фото животного\s
            Рацион животного\s
            Общее самочувствие и привыкание к новому месту\s
            Изменение в поведении: отказ от старых привычек, приобретение новых""";


    /**
     * a report does not meet the requirements
     */
    public static final String IMPROPERLY_FILLING = """
            Дорогой усыновитель, мы заметили, что ты заполняешь отчет не так подробно, как необходимо. Пожалйста,
            подойди ответственнее к этому занятию. В противном случае, волонтеры приюта будут обязаны лично проверить
            условия содержания животного.""";

    /**
     * report does not receive
     */
    public static final String REQUEST_NOTE = """
            Уважаемый усыновитель, мы ждем от вас ежедневный отчет о питомце, содержащий информацию о рационе животного,
            общим самочувствии и првыкании к новому месту, изменениях в поведении животного и его фото.
            Отчет нужно присылать каждый день до 21.00.""";
}