import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    @DisplayName("Testa os cenarios da Portaria")
    fun testPortaria() {
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(15, "", ""), "Negado.")},
            { Assertions.assertEquals(portaria(20, "", ""), "Negado.")},
            {Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.")},
            {Assertions.assertEquals(portaria(25, "comum", "xt"), "Welcome.")},
            {Assertions.assertEquals(portaria(25, "comum", "xl"), "Negado.")},
            {Assertions.assertEquals(portaria(25, "premium", "xl"), "Welcome.")},
            {Assertions.assertEquals(portaria(25, "luxo", "xl"), "Welcome.")}
        )
    }

}