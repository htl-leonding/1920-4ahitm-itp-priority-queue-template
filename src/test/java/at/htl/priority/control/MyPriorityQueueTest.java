package at.htl.priority.control;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class MyPriorityQueueTest {

    MyPriorityQueue priorityQueue;

    @BeforeEach
    private void setupEach() {
        priorityQueue = new MyPriorityQueue();
    }

    /**
     * Fügen Sie ein Element ein, entfernen Sie es wieder
     * und kontrollieren Sie die Entnahme
     *
     * <empty>
     * 5 (chillen)
     * <empty>
     *
     */
    @Test
    void test010_insertOneElement() {
        fail("not yet implemented");
    }

    @Test
    void test020_checkIsNull() {
        fail("not yet implemented");

    }

    /**
     *
     * Fügen Sie die Elemente in folgender Reihenfolge in die queue ein und entfernen
     * Sie diese wieder in der richtigen Reihenfolge.
     * Überprüfen sie mit assertThat, das die ausgelesenen Daten in der korrekten Reihenfolge erfolgen
     *
     * <empty>
     * 80 (lernen)
     * 80 (lernen)  5 (chillen)
     * 80 (lernen)  15 (bingen)  5 (chillen)
     * 90 (sporteln)  80 (lernen)  15 (bingen)  5 (chillen)
     * 90 (sporteln)  80 (lernen)  15 (bingen)  5 (chillen)  2 (whatsappen)
     * 80 (lernen)  15 (bingen)  5 (chillen)  2 (whatsappen)
     * 15 (bingen)  5 (chillen)  2 (whatsappen)
     * 5 (chillen)  2 (whatsappen)
     * 2 (whatsappen)
     * <empty>
     */
    @Test
    void test030_insertFiveElements() {
        fail("not yet implemented");

    }

    /**
     *
     * Fügen Sie die Elemente in folgender Reihenfolge in die queue ein und entfernen
     * Sie diese wieder in der richtigen Reihenfolge.
     * Überprüfen sie mit assertThat, das die ausgelesenen Daten in der korrekten Reihenfolge erfolgen
     *
     * <empty>
     * 80 (lernen)
     * 80 (lernen)  5 (chillen)
     * 80 (lernen)  5 (chillen)  5 (bingen)
     * 90 (sporteln)  80 (lernen)  5 (chillen)  5 (bingen)
     * 90 (sporteln)  80 (lernen)  5 (chillen)  5 (bingen)  2 (whatsappen)
     * 80 (lernen)  5 (chillen)  5 (bingen)  2 (whatsappen)
     * 5 (chillen)  5 (bingen)  2 (whatsappen)
     * 5 (bingen)  2 (whatsappen)
     * 2 (whatsappen)
     * <empty>
     */
    @Test
    void test040_insertFiveElementsWithSamePriorities() {
        fail("not yet implemented");

    }

    @Test
    void test050_removeFromEmptyList() {
        fail("not yet implemented");

    }

    /**
     * Hier müssen Sie indirekt die korrekte Funktionsweise sicherstellen
     *
     * <empty>
     * 1 (priorität 1)
     * 1 (priorität 1)  0 (priorität 120 -> 0)
     * 0 (priorität 120 -> 0)
     * <empty>
     */
    @Test
    void test060_PriorityTooHigh() {
        fail("not yet implemented");

    }

    /**
     * Hier müssen Sie indirekt die korrekte Funktionsweise sicherstellen
     *
     * <empty>
     * 1 (priorität 1)
     * 1 (priorität 1)  0 (priorität 10 -> 0)
     * 0 (priorität 10 -> 0)
     * <empty>
     */
    @Test
    void test070_PriorityTooLow() {
        fail("not yet implemented");

    }


}