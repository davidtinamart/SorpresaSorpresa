package refactoring_guru.abstract_factory.example.checkboxes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CheckboxTest {

    @InjectMocks
    private Checkbox underTest;

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