package duke.choice;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class ItemList implements Handler {

    private Employee[] employees;

    public ItemList(Employee[] employees) {
        this.employees = employees;
    }

    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);

        res.headers().put("Content-Type",
                "text/plain; charset=utf-8");

        StringBuilder result = new StringBuilder();
        for (Employee employee : employees) {
            result.append(employee).append("\n");
        }
        res.send(result);
    }
}
