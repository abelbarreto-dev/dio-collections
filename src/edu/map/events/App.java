package edu.map.events;

import edu.map.events.core.EventSchedule;
import edu.map.events.core.EventScheduleInterface;

import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        try {
            EventScheduleInterface events = new EventSchedule();

            events.addNewEvent(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
            events.addNewEvent(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
            events.addNewEvent(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
            events.addNewEvent(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
            events.addNewEvent(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

            events.showSchedule();

            events.addNewEvent(
                LocalDate.of(2026, Month.APRIL, 14),
                "Aprendendo Java",
            "Bootcamp de Java do básico ao avançado"
            );

            events.showSchedule();

            events.getNextEvent();
        }
        catch (RuntimeException re) {
            System.err.println(re.getMessage());
        }
    }
}
