package pl.wiktorowski.jdbccar;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route
public class CarGui extends VerticalLayout {

    private TextField textFieldId;
    private TextField textFieldMark;
    private TextField textFieldModel;
    private TextField textFieldColour;
    private Button button;
    private CarDao carDao;

    @Autowired

    public CarGui(CarDao carDao) {
        this.textFieldId = new TextField("Id");
        this.textFieldMark = new TextField("Mark");
        this.textFieldModel = new TextField("Model");
        this.textFieldColour = new TextField("Colour");
        this.button = new Button("dodaj");
        this.carDao = carDao;

        button.addClickListener(buttonClickEvent -> {
            Car car = new Car(Long.parseLong(
                    textFieldId.getValue()),
                    textFieldMark.getValue(),
                    textFieldModel.getValue(),
                    textFieldColour.getValue());

            carDao.save(car);

        });

        add(textFieldId, textFieldMark, textFieldModel, textFieldColour, button);
    }
}


