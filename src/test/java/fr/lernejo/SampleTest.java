package fr.lernejo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class SampleTest {

    @Test
    void testFact() {
        Sample sample = new Sample();
        sample.fact(5);
    }

    @Test
    void testOp() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 1, 2)).isEqualTo(3);
    }

    @Test
    void testOp2() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 1, 2)).isEqualTo(2);
    }

    @Test
    void testFact2() {
        Sample sample = new Sample();
        Assertions.assertThatThrownBy(() -> sample.fact(-1)).isInstanceOf(IllegalArgumentException.class);
    }
}
