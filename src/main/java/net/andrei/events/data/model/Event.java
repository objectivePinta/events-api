package net.andrei.events.data.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Event {

  @Id
  @GeneratedValue
  long id;

  String name;

  String text;

  String description;

  Date date;

}
