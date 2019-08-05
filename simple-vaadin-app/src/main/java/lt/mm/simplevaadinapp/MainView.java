package lt.mm.simplevaadinapp;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;


@Route
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class MainView extends VerticalLayout {

    private TaskService service = TaskService.getInstance();
    private Grid<Task> grid = new Grid<>(Task.class);

    private TaskForm form = new TaskForm(this);

    public MainView() {
        updateList();

        grid.setColumns("name", "dueDate");

        HorizontalLayout mainContent = new HorizontalLayout(form, grid);
        mainContent.setSizeFull();
        grid.setSizeFull();

        add(mainContent);
    }

    public void updateList() {
        grid.setItems(service.findAll());
    }

}