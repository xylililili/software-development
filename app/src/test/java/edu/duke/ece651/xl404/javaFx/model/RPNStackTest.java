package edu.duke.ece651.xl404.javaFx.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RPNStackTest {
  static final double EPSILON = 1E-8;
  @Test
  public void test_pushNum() {
    RPNStack rpns = new RPNStack();
    assertEquals(0, rpns.size());
    rpns.pushNum(4.1);
    assertEquals(1, rpns.size());
    assertEquals(4.1,rpns.getList().get(0), EPSILON);
    rpns.pushNum(6.2);
    assertEquals(2, rpns.size());
    assertEquals(4.1, rpns.getList().get(0), EPSILON);
    assertEquals(6.2, rpns.getList().get(1), EPSILON);
  }
  @Test
  public void test_add() {
    RPNStack rpns = new RPNStack();
    rpns.pushNum(4.1);
    rpns.pushNum(6.2);
    rpns.add();
    assertEquals(10.3, rpns.getList().get(0), EPSILON);
  }
  @Test
  public void test_sub() {
    RPNStack rpns = new RPNStack();
    rpns.pushNum(4.1);
    rpns.pushNum(6.2);
    rpns.subtract();
    assertEquals(-2.1, rpns.getList().get(0), EPSILON);
  }
  @Test
  public void test_mul() {
    RPNStack rpns = new RPNStack();
    rpns.pushNum(4.1);
    rpns.pushNum(6.2);
    rpns.times();
    assertEquals(4.1*6.2, rpns.getList().get(0), EPSILON);
  }
  @Test
  public void test_div() {
    RPNStack rpns = new RPNStack();
    rpns.pushNum(4.1);
    rpns.pushNum(6.2);
    rpns.divide();
    assertEquals(4.1/6.2, rpns.getList().get(0), EPSILON);
  }

}
