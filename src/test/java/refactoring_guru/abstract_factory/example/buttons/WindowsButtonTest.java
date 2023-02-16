package refactoring_guru.abstract_factory.example.buttons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class WindowsButtonTest {

    @InjectMocks
    private WindowsButton underTest;

    @Test
    void paint() {
    }

    @Nested
    class WhenPainting {
        @BeforeEach
        void setup() {
        }
    }
}