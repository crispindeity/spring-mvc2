package hello.itemservice.validation;

import org.junit.jupiter.api.Test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import hello.itemservice.domain.item.Item;

public class BeanValidationTest {

    @Test
    void test() {
        //given
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Item item = new Item();

        //when
        item.setItemName(" ");
        item.setPrice(0);
        item.setQuantity(10000);

        //then
        Set<ConstraintViolation<Item>> violations = validator.validate(item);

        for (ConstraintViolation<Item> violation : violations) {
            System.out.println("violation = " + violation);
            System.out.println("violation = " + violation.getMessage());
        }
    }
}
