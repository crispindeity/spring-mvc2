package hello.itemservice.web.validation.form;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ItemUpdateForm {

    @NotNull
    private Long id;

    @NotBlank
    private String itemName;

    @NotNull
    @Range(min = 1000, max = 100000)
    private Integer price;

    /**
     * 수정에서는 수량은 자유롭게 변경가능하다.
     */
    private Integer quantity;
}
