package org.shark.IoC.chap01_xml;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // Calculator() : 디폴트 생성자
@AllArgsConstructor //
@Getter
@Setter
@ToString
public class Calculator {
  private String brand;
  private int price;
  private Adder adder;
  private Divider divider;
  private Multiplier multipler;
  private Subtractor subtractor;
}
