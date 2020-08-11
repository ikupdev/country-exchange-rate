package ru.kuper.countryexchangerate.model.obj;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table()
@Data
@NoArgsConstructor
@ToString(of={"countryName", "countryCurrency"})
@EqualsAndHashCode(of= {"id"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Country {

    @ApiModelProperty(notes = "Primary Key")
    @Id
    @GeneratedValue
    private UUID id;

    @ApiModelProperty(notes = "Название страны")
    private String countryName;

    @ApiModelProperty(notes = "Валюта страны")
    private String countryCurrency;

    @ApiModelProperty(notes = "Буквенное обозначение валюты")
    private String charCode;

    @ApiModelProperty(notes = "Текущее значение в выбранной валюте")
    private String currentCost;

}
