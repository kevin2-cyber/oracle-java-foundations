package duke.choice;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public  class ItemList implements Handler {

    Clothing[] items;
    public ItemList(Clothing[] items) {
        this.items = items;
    }

    public void accept(ServerRequest req, ServerResponse resp) {
        resp.status(Http.Status.OK_200);

        resp.headers().put("Content-Type",
                "text/plain; charset=utf-8");
        StringBuilder result = new StringBuilder();
        for (Clothing item : items) {
            result.append(item).append("\n");
        }
        resp.send(result);
    }
}
