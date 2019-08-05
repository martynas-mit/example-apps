package lt.mm.simplevaadinapp;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;

public class TaskForm extends FormLayout {

    private final TaskService taskService = TaskService.getInstance();
    private MainView mainView;

    private TextField name = new TextField("Name");
    private DatePicker dueDate = new DatePicker("Due date");

    private Binder<Task> binder = new Binder<>(Task.class);

    private Button add = new Button("Add");


    public TaskForm(MainView mainView) {
        this.mainView = mainView;

        HorizontalLayout buttons = new HorizontalLayout(add);
        add.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        add(name, dueDate, buttons);

        binder.bindInstanceFields(this);
        binder.setBean(new Task());

        add.addClickListener(event -> add());

    }

    private void add() {
        Task task = binder.getBean();
        taskService.addTask(task);
        mainView.updateList();
        setTask(new Task());
    }

    public void setTask(Task task) {
        binder.setBean(task);
    }
}