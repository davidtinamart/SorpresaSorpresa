package refactoring_guru.abstract_factory.example.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ApplicationTest {

    @Mock
    private Button button;
    @Mock
    private Checkbox checkbox;
    @InjectMocks
    private Application underTest;

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