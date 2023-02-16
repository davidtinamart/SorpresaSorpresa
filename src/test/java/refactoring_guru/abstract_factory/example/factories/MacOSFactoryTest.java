package refactoring_guru.abstract_factory.example.factories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MacOSFactoryTest {

    @InjectMocks
    private MacOSFactory underTest;

    @Test
    void createButton() {
    }

    @Test
    void createCheckbox() {
    }

    @Nested
    class WhenCreatingButton {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenCreatingCheckbox {
        @BeforeEach
        void setup() {
        }
    }
}