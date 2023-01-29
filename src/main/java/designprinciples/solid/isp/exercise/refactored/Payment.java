package designprinciples.solid.isp.exercise.refactored;

import java.util.List;

public interface Payment {
    Object status();
    List<Object> getPayments();

}
