package jfv.challenge.price.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
@Data
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class Price {
    @Id
    @GeneratedValue
    final Long priceId;
    final Integer brandId;
    @JsonSerialize( using = LocalDateTimeSerializer.class)
	@JsonDeserialize( using = LocalDateTimeDeserializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
    final LocalDateTime startDate, endDate;
    final Integer priceList;
    final Long productId;
    final Short priority;
    final Double price;
    @Column(name = "CURR")
    final String currency;
}
